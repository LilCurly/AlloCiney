package com.example.allociney.item

import android.view.View
import com.example.allociney.R
import com.example.allociney.model.Movie
import com.example.allociney.network.data.MovieData
import com.example.allociney.viewholder.MovieViewHolder
import com.mikepenz.fastadapter.items.AbstractItem

class MovieItem(val movie: Movie): AbstractItem<MovieViewHolder>() {

    override val layoutRes: Int
        get() = R.layout.row_movie

    override val type: Int
        get() = R.id.movieRowTitleTextView

    override fun getViewHolder(v: View): MovieViewHolder {
        return MovieViewHolder(v)
    }
}