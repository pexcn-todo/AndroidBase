package me.pexcn.android.base.arch.mvp;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

import java.lang.ref.WeakReference;

/**
 * Created by pexcn on 2016-09-24.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public abstract class BasePresenter<V extends BaseContract.View, M extends BaseContract.Model>
        implements BaseContract.Presenter<V, M> {
    private WeakReference<V> mViewRef;
    private M mModel;

    public BasePresenter(V view) {
        this.mViewRef = new WeakReference<>(view);
        this.mModel = createModel();
    }

    @Override
    public void onDestroy() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    /**
     * 创建 Model 层
     */
    public abstract M createModel();

    /**
     * 获取 View 层
     */
    public V getView() {
        return mViewRef == null ? null : mViewRef.get();
    }

    /**
     * 获取 Model 层
     */
    public M getModel() {
        return mModel;
    }

    /**
     * 获取 Context
     */
    public Context getContext() {
        Context context = null;
        if (mViewRef != null) {
            if (mViewRef.get() instanceof Activity) {
                context = (Context) mViewRef.get();
            } else if (mViewRef.get() instanceof Fragment) {
                context = ((Fragment) mViewRef.get()).getActivity();
            }
        }
        return context;
    }
}
