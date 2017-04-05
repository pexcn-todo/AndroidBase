package me.pexcn.android.base.adapter;

/**
 * Created by pexcn on 2016-10-27.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public interface BaseAdapter<T> {
    void add(T data);

    void add(int position, T data);

    void remove(int position);
}
