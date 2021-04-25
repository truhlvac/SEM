package cz.truhlarik.sem.games

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.loader.app.LoaderManager
import androidx.loader.content.AsyncTaskLoader
import androidx.loader.content.Loader
import cz.truhlarik.sem.R

class HangmanActivity : AppCompatActivity(), LoaderManager.LoaderCallbacks<String> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hangman)
    }

    override fun onCreateLoader(id: Int, args: Bundle?): AsyncTaskLoader<String?> {
        return object : AsyncTaskLoader<String?>(this) {
            override fun loadInBackground(): String? {
                return "work done!"
            }

            override fun onStartLoading() {
                forceLoad()
            }
        }
    }

    override fun onLoadFinished(loader: Loader<String>, data: String?) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show()
    }

    override fun onLoaderReset(loader: Loader<String>) {
        TODO("Not yet implemented")
    }
}