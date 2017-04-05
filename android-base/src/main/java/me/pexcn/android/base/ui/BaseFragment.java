package me.pexcn.android.base.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by pexcn on 2016-09-24.
 */
@SuppressWarnings("unused")
public abstract class BaseFragment extends Fragment {
    private View mRootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mRootView == null) {
            mRootView = inflater.inflate(getLayoutId(), container, false);
        }
        return mRootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initView(view);
        initData(savedInstanceState);
    }

    /**
     * 获取布局 ID
     */
    protected abstract int getLayoutId();

    /**
     * 获取 Fragment 根视图
     */
    public View getRootView() {
        return mRootView;
    }

    /**
     * 初始化有关 View 的操作
     */
    protected abstract void initView(View view);

    /**
     * 初始化有关数据的操作
     */
    protected abstract void initData(@Nullable Bundle savedInstanceState);
}
