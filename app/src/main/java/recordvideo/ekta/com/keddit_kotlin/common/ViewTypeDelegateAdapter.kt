package recordvideo.ekta.com.keddit_kotlin.common

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import recordvideo.ekta.com.keddit_kotlin.ViewType

/**
 * Created by Ekta on 06-06-2017.
 */
interface ViewTypeDelegateAdapter {

    fun onCreateViewHolder(parent : ViewGroup) : RecyclerView.ViewHolder

    fun onBindViewHolder(holder :RecyclerView.ViewHolder,item : ViewType)

}