package me.pexcn.android.base.adapter;

import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * Created by pexcn on 2016-10-27.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class BaseRecyclerViewHolder extends RecyclerView.ViewHolder implements BaseViewHolder {
    private final SparseArray<View> views;
    private View convertView;

    public BaseRecyclerViewHolder(View itemView) {
        super(itemView);
        this.views = new SparseArray<>();
        this.convertView = itemView;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <V extends View> V getView(@IdRes int id) {
        View view = views.get(id);
        if (view == null) {
            view = convertView.findViewById(id);
            views.put(id, view);
        }
        return (V) view;
    }

    @Override
    public View getConvertView() {
        return convertView;
    }
}
