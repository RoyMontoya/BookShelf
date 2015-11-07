package com.example.roy.bookshelf;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import it.neokree.materialtabs.MaterialTab;
import it.neokree.materialtabs.MaterialTabHost;
import it.neokree.materialtabs.MaterialTabListener;

public class MainActivity extends AppCompatActivity implements MaterialTabListener, BookListFragment.OnFragmentInteractionListener {

    private ViewPager mPager;
    private BookListFragment mBookListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        MaterialTabHost tabHost = (MaterialTabHost)findViewById(R.id.tab_host);
        tabHost.addTab(tabHost.newTab().setIcon(getResources().getDrawable(R.drawable.ic_books))
        .setTabListener(this));

        mBookListFragment = (BookListFragment)getSupportFragmentManager()
                .findFragmentById(R.id.main_frame);
        if(mBookListFragment == null){
            mBookListFragment = new BookListFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.main_frame, mBookListFragment)
                    .commit();
        }



    }

    @Override
    public void onTabSelected(MaterialTab tab) {

    }

    @Override
    public void onTabReselected(MaterialTab tab) {

    }

    @Override
    public void onTabUnselected(MaterialTab tab) {

    }

    @Override
    public void onFragmentInteraction(String id) {

    }
}
