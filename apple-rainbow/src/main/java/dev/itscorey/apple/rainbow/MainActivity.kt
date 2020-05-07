package dev.itscorey.apple.rainbow

import android.graphics.drawable.Animatable
import android.graphics.drawable.Animatable2
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.vectordrawable.graphics.drawable.Animatable2Compat
import kotlinx.android.synthetic.main.main.*

class MainActivity : AppCompatActivity(R.layout.main) {
    override fun onResume() {
        super.onResume()
        /* (R.integer.rainbow_start_delay_anim_time = 500) + 100) */
        /* This ensure that the fade starts to takes effect when the morphing starts */
        /* Remember that the morphing will have a start delay of 500ms */
        rainbow.animate().setDuration(600).alpha(1F).start()

        val rainbowDrawable = rainbow.drawable as Animatable2Compat
        rainbowDrawable.start()
    }
}