package recordvideo.ekta.com.keddit_kotlin.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Ekta on 06-06-2017.
 */


fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
    }