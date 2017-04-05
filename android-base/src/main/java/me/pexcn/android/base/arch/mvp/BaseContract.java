package me.pexcn.android.base.arch.mvp;

/**
 * Created by pexcn on 2016-10-25.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public interface BaseContract {
    /**
     * Presenter 层基础接口
     */
    interface Presenter<V extends BaseContract.View, M extends BaseContract.Model> {
        /**
         * 创建 P 层的时候调用
         */
        void start();

        /**
         * 销毁 P 层的时候调用
         */
        void onDestroy();
    }

    /**
     * View 层基础接口
     */
    interface View<P extends BaseContract.Presenter> {

    }

    /**
     * Model 层基础接口
     */
    interface Model {

    }
}
