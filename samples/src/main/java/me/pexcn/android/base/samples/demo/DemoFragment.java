package me.pexcn.android.base.samples.demo;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.pexcn.android.base.arch.mvp.BaseFragment;
import me.pexcn.android.base.samples.R;

/**
 * Created by pexcn on 2017-11-02.
 */
public class DemoFragment extends BaseFragment<DemoContract.Presenter> implements DemoContract.View {
    @Override
    protected DemoPresenter createPresenter() {
        Log.d(DemoFragment.class.getSimpleName(), "createPresenter");
        return new DemoPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initView(@NonNull View view) {
        view.findViewById(R.id.button).setOnClickListener(view1 -> showDialog());
    }

    @Override
    protected void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(DemoFragment.class.getSimpleName(), "onDestroy");
    }

    @Override
    public void showDialog() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_dialog, (ViewGroup) getRootView(), false);
        new AlertDialog.Builder(getContext())
                .setView(view)
                .show();
    }
}
