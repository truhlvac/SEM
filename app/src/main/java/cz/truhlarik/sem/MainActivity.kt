package cz.truhlarik.sem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cz.truhlarik.sem.databinding.ActivityMainBinding
import cz.truhlarik.sem.games.HangmanActivity
import cz.truhlarik.sem.games.PairsActivity
import cz.truhlarik.sem.games.TictacActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.buttonSettings.setOnClickListener {
            var explicitIntent = Intent(MainActivity@this, SettingsActivity::class.java)
            startActivity(explicitIntent)
        }

        binding.buttonGallows.setOnClickListener {
            var explicitIntent = Intent(MainActivity@this, HangmanActivity::class.java)
            startActivity(explicitIntent)
        }

        binding.buttonPairs.setOnClickListener {
            var explicitIntent = Intent(MainActivity@this, PairsActivity::class.java)
            startActivity(explicitIntent)
        }

        binding.buttonTictac.setOnClickListener {
            var explicitIntent = Intent(MainActivity@this, TictacActivity::class.java)
            startActivity(explicitIntent)
        }
    }
}