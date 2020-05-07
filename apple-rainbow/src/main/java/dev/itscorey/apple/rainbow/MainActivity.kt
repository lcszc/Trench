package dev.itscorey.apple.rainbow

import android.graphics.drawable.Animatable
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main.*

class MainActivity : AppCompatActivity(R.layout.main) {
    override fun onResume() {
        super.onResume()
        Handler().postDelayed({
            rainbow.animate().setDuration(100).alpha(1f).start()
            val animatable = rainbow.drawable as Animatable
            animatable.start()
        }, 500)
    }
}