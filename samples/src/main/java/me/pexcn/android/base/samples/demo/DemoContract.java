package me.pexcn.android.base.samples.demo;

import me.pexcn.android.base.arch.mvp.BaseContract;

/**
 * Created by pexcn on 2017-11-02.
 */
public interface DemoContract extends BaseContract {
    interface View extends BaseContract.View<DemoContract.Presenter> {
        void showDialog();
    }

    interface Presenter extends BaseContract.Presenter<DemoContract.View, DemoContract.Model> {

    }

    interface Model extends BaseContract.Model {

    }
}
