package com.example.mina.frgmentscourse;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by Mai Hassen on 10/3/2015.
 */
public class StartTabsFragmentAdpter extends FragmentPagerAdapter {

    public StartTabsFragmentAdpter(FragmentManager fm)
    {
        super(fm);
    }

    // set data on every fragment
    @Override
    public Fragment getItem(int index) {
        Log.d("index", "" + index);
        // TODO Auto-generated method stub
        if (index == 0)
            return new Java();
        if (index == 1)
            return new Android();
        if (index == 2)
            return new Ios();


        return null;
    }

    // fragments(tabs) num
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3;
    }


}