package com.example.allociney.viewholder

import android.view.View
import com.example.allociney.R
import com.example.allociney.item.MovieItem
import com.mikepenz.fastadapter.FastAdapter
import kotlinx.android.synthetic.main.row_movie.view.*

class MovieViewHolder (itemView: View) : FastAdapter.ViewHolder<MovieItem>(itemView) {

    override fun bindView(item: MovieItem, payloads: MutableList<Any>) {
        val movie = item.movie
        val titleFormat = itemView.context.getString(R.string.movie_title_format, movie.title)

        itemView.movieRowTitleTextView.text = titleFormat
        itemView.movieRowDirectorTextView.text = movie.director
        itemView.movieRowReleaseYearTextView.text = movie.releaseYear.toString()
    }

    override fun unbindView(item: MovieItem) {
        itemView.movieRowTitleTextView.text = null
        itemView.movieRowDirectorTextView.text = null
        itemView.movieRowReleaseYearTextView.text = null
    }
}
