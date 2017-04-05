package me.pexcn.android.base.adapter;

import android.support.annotation.IdRes;
import android.view.View;

/**
 * Created by pexcn on 2016-10-27.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public interface BaseViewHolder {
    <V extends View> V getView(@IdRes int id);

    View getConvertView();
}
