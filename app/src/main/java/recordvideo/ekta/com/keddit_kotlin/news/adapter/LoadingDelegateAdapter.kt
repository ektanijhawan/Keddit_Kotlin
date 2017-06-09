package recordvideo.ekta.com.keddit_kotlin.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import recordvideo.ekta.com.keddit_kotlin.R
import recordvideo.ekta.com.keddit_kotlin.ViewType
import recordvideo.ekta.com.keddit_kotlin.common.ViewTypeDelegateAdapter
import recordvideo.ekta.com.keddit_kotlin.common.inflate

/**
 * Created by Ekta on 06-06-2017.
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup) = LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }
    class LoadingViewHolder(parent : ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.news_item_loading))
}