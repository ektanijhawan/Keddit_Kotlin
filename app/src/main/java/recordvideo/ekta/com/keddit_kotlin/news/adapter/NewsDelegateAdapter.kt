package recordvideo.ekta.com.keddit_kotlin.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kotlinx.android.synthetic.main.news_item.view.*
import recordvideo.ekta.com.keddit_kotlin.R
import recordvideo.ekta.com.keddit_kotlin.R.id.img_thumbnail
import recordvideo.ekta.com.keddit_kotlin.ViewType
import recordvideo.ekta.com.keddit_kotlin.common.*

/**
 * Created by Ekta on 06-06-2017.
 */
class NewsDelegateAdapter(val viewActions: onViewSelectedListener) : ViewTypeDelegateAdapter {

  public  interface onViewSelectedListener {
        fun onItemSelected(url: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return NewsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as NewsViewHolder
        holder.bind(item as RedditNewsItem)//To change body of created functions use File | Settings | File Templates.
    }

    inner class NewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //        Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)

            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()

            super.itemView.setOnClickListener { viewActions.onItemSelected(item.url) }
        }
    }
}