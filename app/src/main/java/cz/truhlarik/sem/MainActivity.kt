package cz.truhlarik.sem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cz.truhlarik.sem.games.HangmanActivity
import cz.truhlarik.sem.games.PairsActivity
import cz.truhlarik.sem.games.TictacActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_settings.setOnClickListener {
            var explicitIntent = Intent(MainActivity@this, SettingsActivity::class.java)
            startActivity(explicitIntent)
        }

        button_gallows.setOnClickListener {
            var explicitIntent = Intent(MainActivity@this, HangmanActivity::class.java)
            startActivity(explicitIntent)
        }

        button_pairs.setOnClickListener {
            var explicitIntent = Intent(MainActivity@this, PairsActivity::class.java)
            startActivity(explicitIntent)
        }

        button_tictac.setOnClickListener {
            var explicitIntent = Intent(MainActivity@this, TictacActivity::class.java)
            startActivity(explicitIntent)
        }
    }
}