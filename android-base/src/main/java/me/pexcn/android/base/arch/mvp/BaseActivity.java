package me.pexcn.android.base.arch.mvp;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;

/**
 * Created by pexcn on 2016-09-24.
 */
@SuppressWarnings("unused")
public abstract class BaseActivity<P extends BaseContract.Presenter>
        extends me.pexcn.android.base.ui.BaseActivity implements BaseContract.View<P> {
    private P mPresenter;

    @CallSuper
    @Override
    protected void init(@Nullable Bundle savedInstanceState) {
        mPresenter = createPresenter();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDestroy();
        super.onDestroy();
    }

    /**
     * 获取 Presenter 层
     */
    public P getPresenter() {
        return mPresenter;
    }

    /**
     * 创建 Presenter 层
     */
    protected abstract P createPresenter();
}
