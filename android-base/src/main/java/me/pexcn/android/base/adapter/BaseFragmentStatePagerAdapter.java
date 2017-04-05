package me.pexcn.android.base.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.SparseArray;

/**
 * Created by pexcn on 2017-03-09.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public abstract class BaseFragmentStatePagerAdapter extends FragmentStatePagerAdapter {
    private SparseArray<String> mTitles;
    private SparseArray<Fragment> mFragments;

    public BaseFragmentStatePagerAdapter(FragmentManager fm) {
        super(fm);
        mTitles = new SparseArray<>();
        mFragments = new SparseArray<>();
    }

    @Override
    public int getCount() {
        if (mTitles != null && mFragments != null) {
            return mTitles.size();
        }
        return 0;
    }

    @Override
    public Fragment getItem(int position) {
        if (mFragments != null) {
            return mFragments.valueAt(position);
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (mTitles != null) {
            return mTitles.valueAt(position);
        }
        return super.getPageTitle(position);
    }

    public SparseArray<String> getTitles() {
        return mTitles;
    }

    public SparseArray<Fragment> getFragments() {
        return mFragments;
    }

    public void setTitles(SparseArray<String> titles) {
        mTitles = titles;
    }

    public void setFragments(SparseArray<Fragment> fragments) {
        mFragments = fragments;
    }
}
