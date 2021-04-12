package cz.truhlarik.sem.games

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import cz.truhlarik.sem.R
import kotlinx.android.synthetic.main.activity_pairs.*

class PairsActivity : AppCompatActivity(){

    var p_fliped : Array<Array<Boolean>> = arrayOf(
        arrayOf(false, false, false),
        arrayOf(false, false, false),
        arrayOf(false, false, false)
    )

    var p_done : Array<Array<Boolean>> = arrayOf(
        arrayOf(false, false, false),
        arrayOf(false, false, false),
        arrayOf(false, false, false)
    )

    var numberFlips = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pairs)

        numberFlips = 0

        pair_0_0.setOnClickListener {
            flip(pair_0_0, 0, 0)
        }
        pair_0_1.setOnClickListener {
            flip(pair_0_1, 0, 1)
        }
        pair_0_2.setOnClickListener {
            flip(pair_0_2, 0, 2)
        }

        pair_1_0.setOnClickListener {
            flip(pair_1_0, 1, 0)
        }
        pair_1_1.setOnClickListener {
            flip(pair_1_1, 1, 1)
        }
        pair_1_2.setOnClickListener {
            flip(pair_1_2, 1, 2)
        }

        pair_2_0.setOnClickListener {
            flip(pair_2_0, 2, 0)
        }
        pair_2_1.setOnClickListener {
            flip(pair_2_1, 2, 1)
        }
        pair_2_2.setOnClickListener {
            flip(pair_2_2, 2, 2)
        }

    }

    fun flip(pic : ImageView, pos1 : Int, pos2 : Int) {
        numberFlips = numberFlips + 1
        pairsFlips.setText(numberFlips.toString())

        if (p_fliped[pos1][pos2]) {
            pic.setImageResource(R.drawable.apple)
            p_fliped[pos1][pos2] = false
        }
        else {
            pic.setImageResource(R.drawable.orange)
            p_fliped[pos1][pos2] = true
        }


    }
}