package recordvideo.ekta.com.keddit_kotlin.common

import recordvideo.ekta.com.keddit_kotlin.ViewType
import recordvideo.ekta.com.keddit_kotlin.news.adapter.AdapterConstants

/**
 * Created by Ekta on 06-06-2017.
 */
data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {

    override fun getViewType() = AdapterConstants.NEWS
}