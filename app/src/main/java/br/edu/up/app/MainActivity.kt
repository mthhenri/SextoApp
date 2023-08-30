package br.edu.up.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.commit
import androidx.fragment.app.replace


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showConstraint(view: View) {
        supportFragmentManager.commit {
            replace<ConstraintFragment>(R.id.fragmentsCON)
        }
    }
    fun showFrame(view: View) {
        supportFragmentManager.commit {
            replace<FrameFragment>(R.id.fragmentsCON)
        }
    }
    fun showLinear(view: View) {
        supportFragmentManager.commit {
            replace<LinearFragment>(R.id.fragmentsCON)
        }
    }
}