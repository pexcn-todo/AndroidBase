package me.pexcn.android.base.samples.demo;

import android.util.Log;

import me.pexcn.android.base.arch.mvp.BasePresenter;

/**
 * Created by pexcn on 2017-11-02.
 */
public class DemoPresenter extends BasePresenter<DemoContract.View, DemoContract.Model> implements DemoContract.Presenter {
    public DemoPresenter(DemoFragment view) {
        super(view);
        Log.d(DemoPresenter.class.getSimpleName(), "DemoPresenter()");
    }

    @Override
    public void start() {
        Log.d(DemoPresenter.class.getSimpleName(), "start");
    }

    @Override
    public DemoModel createModel() {
        Log.d(DemoPresenter.class.getSimpleName(), "createModel");
        return new DemoModel(getContext());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(DemoPresenter.class.getSimpleName(), "onDestroy");
    }
}
