package com.ragdroid.dahaka.activity.home

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.Menu
import android.view.MenuItem

import com.ragdroid.dahaka.R
import com.ragdroid.dahaka.activity.home.moves.MovesFragment
import com.ragdroid.dahaka.activity.home.profile.ProfileFragment
import com.ragdroid.dahaka.activity.home.stats.StatsFragment
import com.ragdroid.dahaka.activity.items.ItemsActivity
import com.ragdroid.dahaka.databinding.ActivityHomeBinding
import com.ragdroid.dahaka.user.BaseUserActivity
import com.ragdroid.dahaka.user.UserComponent

class HomeActivity : BaseUserActivity<HomeContract.Presenter>() {


    var homeComponent: HomeComponent? = null
        private set

    private var viewDataBinding: ActivityHomeBinding? = null

    private val navigationListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val itemId = item.itemId
        if (viewDataBinding!!.bottomNavigation.selectedItemId == itemId) {
            //do nothing if reselected
            true
        } else openFragment(itemId)
    }

    private fun openFragment(itemId: Int): Boolean {
        var fragment: Fragment? = null
        when (itemId) {
            R.id.action_profile -> fragment = ProfileFragment()
            R.id.action_moves -> fragment = MovesFragment()
            R.id.action_stats -> fragment = StatsFragment()
        }

        if (fragment != null) {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit()
            return true
        }
        return false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        viewDataBinding!!.bottomNavigation.setOnNavigationItemSelectedListener(navigationListener)
        viewDataBinding!!.bottomNavigation.selectedItemId = R.id.action_profile
        openFragment(R.id.action_profile)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_log_out) {
            logoutUser()
            return true
        } else if (item.itemId == R.id.action_items) {
            openItemsActivity()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun openItemsActivity() {
        val intent = Intent(this, ItemsActivity::class.java)
        startActivity(intent)
    }


    override fun inject(userComponent: UserComponent) {
        homeComponent = userComponent.homeComponentBuilder()
                .activity(this)
                .build()
        homeComponent!!.inject(this)
    }

}
