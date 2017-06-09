package recordvideo.ekta.com.keddit_kotlin

import android.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import recordvideo.ekta.com.keddit_kotlin.news.NewsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            changeFragment(NewsFragment())
        }
    }


    fun changeFragment(f: android.support.v4.app.Fragment, cleanStack: Boolean = false) {

        val ft = supportFragmentManager.beginTransaction();
        if (cleanStack) {
            clearBackStack()
        }
        ft.setCustomAnimations(R.anim.abc_fade_in, R.anim.abc_fade_out, R.anim.abc_popup_enter, R.anim.abc_popup_exit)
        ft.replace(R.id.activity_base_content, f)
        ft.addToBackStack(null)
        ft.commit()
    }

    fun clearBackStack() {
        val manager = supportFragmentManager
        if (manager.backStackEntryCount > 0) {
            val first = manager.getBackStackEntryAt(0)
            manager.popBackStack(first.id, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
    }

    override fun onBackPressed() {
        val fragmentManger = supportFragmentManager
        if (fragmentManger.backStackEntryCount > 0) {
            fragmentManger.popBackStack()
        } else {
            finish()
        }
    }
}
