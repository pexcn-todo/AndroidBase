package me.pexcn.android.base.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by pexcn on 2017-03-11.
 */
@SuppressWarnings("unused")
public abstract class BaseLazyFragment extends BaseFragment {
    // 是否可见
    protected boolean mVisible;
    // 是否第一次加载
    protected boolean mFirstLoad;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (getUserVisibleHint()) {
            mVisible = true;
            lazyLoad();
        } else {
            mVisible = false;
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mFirstLoad = true;
        lazyLoad();
    }

    /**
     * 懒加载
     */
    protected void lazyLoad() {
        if (mVisible && mFirstLoad) {
            onLazyLoad();
            mFirstLoad = false;
        }
    }

    /**
     * 让子类实现懒加载
     */
    protected abstract void onLazyLoad();
}
