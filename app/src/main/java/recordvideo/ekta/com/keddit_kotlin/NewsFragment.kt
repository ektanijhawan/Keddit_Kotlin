package recordvideo.ekta.com.keddit_kotlin

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import recordvideo.ekta.com.keddit_kotlin.common.inflate
import kotlinx.android.synthetic.main.fragment_news.*

class NewsFragment : android.support.v4.app.Fragment() {
    private val newsList by lazy{
        news_list
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = container?.inflate(R.layout.fragment_news);
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        newsList.setHasFixedSize(true)
        newsList.layoutManager= LinearLayoutManager(context)
    }


}
