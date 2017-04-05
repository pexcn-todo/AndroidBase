package me.pexcn.android.base.arch.mvp;

import android.content.Context;

/**
 * Created by pexcn on 2016-10-25.
 */
@SuppressWarnings("unused")
public class BaseModel implements BaseContract.Model {
    private Context mContext;

    public BaseModel(Context context) {
        this.mContext = context;
    }

    /**
     * 获取 Context
     */
    public Context getContext() {
        return mContext;
    }
}
