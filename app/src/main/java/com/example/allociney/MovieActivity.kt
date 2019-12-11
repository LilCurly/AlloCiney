package com.example.allociney

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.allociney.model.Movie
import kotlinx.android.synthetic.main.activity_movie.*

class MovieActivity : AppCompatActivity() {

    companion object {
        private const val MOVIE_EXTRA = "movie_extra"

        fun createIntent(context: Context, movie: Movie): Intent {
            val intent = Intent(context, MovieActivity::class.java)
            intent.putExtra(MOVIE_EXTRA, movie)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val movie = intent.getParcelableExtra<Movie>(MOVIE_EXTRA)
        if (movie is Movie) {
            movieDetailTitle.text = movie.title
            movieDetailDirector.text = movie.director
            movieDetailReleaseYear.text = movie.releaseYear.toString()
        }
    }
}
