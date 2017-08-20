package com.ragdroid.dahaka.activity.home;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;

import com.ragdroid.dahaka.R;
import com.ragdroid.dahaka.activity.home.moves.MovesFragment;
import com.ragdroid.dahaka.activity.home.profile.ProfileFragment;
import com.ragdroid.dahaka.activity.home.stats.StatsFragment;
import com.ragdroid.dahaka.activity.items.ItemsActivity;
import com.ragdroid.dahaka.databinding.ActivityHomeBinding;
import com.ragdroid.dahaka.user.BaseUserActivity;

import javax.inject.Inject;

public class HomeActivity extends BaseUserActivity<HomeContract.Presenter> {


    @Inject ProfileFragment profileFragment;
    @Inject StatsFragment statsFragment;
    @Inject MovesFragment movesFragment;

    private ActivityHomeBinding viewDataBinding;

    private BottomNavigationView.OnNavigationItemSelectedListener navigationListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int itemId = item.getItemId();
            if (viewDataBinding.bottomNavigation.getSelectedItemId() == itemId) {
                //do nothing if reselected
                return true;
            }
            return openFragment(itemId);
        }

    };

    private boolean openFragment(int itemId) {
        Fragment fragment = null;
        switch (itemId) {
            case R.id.action_profile:
                fragment = profileFragment;
                break;
            case R.id.action_moves:
                fragment = movesFragment;
                break;
            case R.id.action_stats:
                fragment = statsFragment;
                break;
        }

        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        viewDataBinding.bottomNavigation.setOnNavigationItemSelectedListener(navigationListener);
        viewDataBinding.bottomNavigation.setSelectedItemId(R.id.action_profile);
        openFragment(R.id.action_profile);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_log_out) {
            logoutUser();
            return true;
        } else if (item.getItemId() == R.id.action_items) {
            openItemsActivity();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openItemsActivity() {
        Intent intent = new Intent(this, ItemsActivity.class);
        startActivity(intent);
    }


}
