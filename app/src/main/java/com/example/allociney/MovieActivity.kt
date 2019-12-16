package com.example.allociney

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.allociney.model.Movie
import com.example.allociney.network.UrlBuilder
import com.example.allociney.network.data.MovieData
import kotlinx.android.synthetic.main.activity_movie.*

class MovieActivity : AppCompatActivity() {

    companion object {
        private const val MOVIE_EXTRA = "movie_extra"

        fun createIntent(context: Context, movie: MovieData): Intent {
            val intent = Intent(context, MovieActivity::class.java)
            intent.putExtra(MOVIE_EXTRA, movie)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val movie = intent.getParcelableExtra<MovieData>(MOVIE_EXTRA)
        if (movie is MovieData) {
            movieDetailTitle.text = movie.title
            movieDetailDirector.text = if (movie.adult) "For adults" else "For adults & childrens"
            movieDetailReleaseYear.text = movie.releaseDate
            movieDetailSummaryViewText.text = movie.overview

            Glide.with(this).load(UrlBuilder.createLargeUrl(movie.posterPath)).into(movieDetailPosterImageView)
        }
    }
}
