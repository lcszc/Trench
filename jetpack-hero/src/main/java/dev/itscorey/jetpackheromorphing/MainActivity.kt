package dev.itscorey.jetpackheromorphing

import android.graphics.drawable.Animatable
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.vectordrawable.graphics.drawable.Animatable2Compat

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            imageHero.run {
                (drawable as Animatable).start()
            }
        }, 500)
    }
}