package me.pexcn.android.base.listener;

import android.support.annotation.NonNull;

/**
 * Created by pexcn on 2017-03-03.
 */
@SuppressWarnings("unused")
public interface OnCallbackListener<T> {
    void callback(@NonNull T data);
}
