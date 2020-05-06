package dev.itscorey.heartbeat

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.vectordrawable.graphics.drawable.Animatable2Compat
import kotlinx.android.synthetic.main.main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        val animatable = heartBeat.drawable as Animatable2Compat

        animatable.registerAnimationCallback(object : Animatable2Compat.AnimationCallback() {
            override fun onAnimationEnd(drawable: Drawable?) {
                withLove.animate().setDuration(300L).alpha(1F).start()
            }
        })

        animatable.start()
    }
}