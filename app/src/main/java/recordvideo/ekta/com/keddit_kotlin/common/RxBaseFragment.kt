package recordvideo.ekta.com.keddit_kotlin.common

import android.app.Fragment
import rx.subscriptions.CompositeSubscription

/**
 * Created by Ekta on 09-06-2017.
 */
open class RxBaseFragment() : android.support.v4.app.Fragment() {

    protected var subscriptions = CompositeSubscription()

    override fun onResume() {
        super.onResume()
        subscriptions = CompositeSubscription()
    }

    override fun onPause() {
        super.onPause()
        if (!subscriptions.isUnsubscribed) {
            subscriptions.unsubscribe()
        }
        subscriptions.clear()
    }
}