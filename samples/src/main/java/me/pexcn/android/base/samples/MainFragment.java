package me.pexcn.android.base.samples;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import me.pexcn.android.base.ui.BaseFragment;

/**
 * Created by pexcn on 2017-11-02.
 */
public class MainFragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initView(@NonNull View view) {

    }

    @Override
    protected void initData(@Nullable Bundle savedInstanceState) {

    }
}
