package com.example.allociney.viewholder

import android.view.View
import com.bumptech.glide.Glide
import com.example.allociney.R
import com.example.allociney.item.MovieItem
import com.example.allociney.network.UrlBuilder
import com.mikepenz.fastadapter.FastAdapter
import kotlinx.android.synthetic.main.row_movie.view.*

class MovieViewHolder (itemView: View) : FastAdapter.ViewHolder<MovieItem>(itemView) {

    override fun bindView(item: MovieItem, payloads: MutableList<Any>) {
        val movie = item.movie
        val titleFormat = itemView.context.getString(R.string.movie_title_format, movie.title)

        itemView.movieRowTitleTextView.text = titleFormat
        itemView.movieRowDirectorTextView.text = if (movie.adult) "For adults" else "For adults & childrens"
        itemView.movieRowReleaseYearTextView.text = movie.releaseDate

        Glide.with(itemView).load(UrlBuilder.createThumbnailUrl(item.movie.posterPath)).into(itemView.moviePosterImageView)
    }

    override fun unbindView(item: MovieItem) {
        itemView.movieRowTitleTextView.text = null
        itemView.movieRowDirectorTextView.text = null
        itemView.movieRowReleaseYearTextView.text = null
        itemView.moviePosterImageView.setImageDrawable(null)
    }
}
