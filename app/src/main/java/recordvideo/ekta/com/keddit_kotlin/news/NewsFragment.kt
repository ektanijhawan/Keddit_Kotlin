package recordvideo.ekta.com.keddit_kotlin.news

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_news.*
import recordvideo.ekta.com.keddit_kotlin.common.inflate
import recordvideo.ekta.com.keddit_kotlin.R
import recordvideo.ekta.com.keddit_kotlin.news.adapter.NewsAdapter
import recordvideo.ekta.com.keddit_kotlin.common.RedditNewsItem;
import recordvideo.ekta.com.keddit_kotlin.news.adapter.NewsDelegateAdapter

class NewsFragment : android.support.v4.app.Fragment(),NewsDelegateAdapter.onViewSelectedListener {
    override fun onItemSelected(url: String) {
        if (url.isNullOrEmpty()) {
            Snackbar.make(news_list, "No URL assigned to this news", Snackbar.LENGTH_LONG).show()
        } else {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_news)

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)
        (news_list.layoutManager as LinearLayoutManager).setOrientation(LinearLayoutManager.VERTICAL);

        initAdapter()

        if (savedInstanceState == null) {
            val news = mutableListOf<RedditNewsItem>()
            for (i in 1..10) {
                news.add(RedditNewsItem(
                        "author$i",
                        "Title $i",
                        i, // number of comments
                        1457207701L - i * 200, // time
                        "http://lorempixel.com/200/200/technics/$i", // image url
                        "url"
                ))
            }
            (news_list.adapter as NewsAdapter).addNews(news)
        }

    }

    fun initAdapter() {
        if (news_list.adapter == null)
            news_list.adapter = NewsAdapter(this)
    }
}


