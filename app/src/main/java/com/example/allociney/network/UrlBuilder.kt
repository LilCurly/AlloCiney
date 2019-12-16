package com.example.allociney.network

class UrlBuilder {
    companion object {
        fun createThumbnailUrl(posterPath: String?): String {
            if(posterPath is String) {
                return "https://image.tmdb.org/t/p/w200$posterPath"
            }

            return ""
        }

        fun createLargeUrl (posterPath: String?): String {
            if(posterPath is String) {
                return "https://image.tmdb.org/t/p/w500$posterPath"
            }

            return ""
        }
    }
}