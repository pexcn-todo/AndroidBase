package me.pexcn.android.base.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pexcn on 2016-10-27.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public abstract class BaseRecyclerViewAdapter<T, H extends BaseRecyclerViewHolder>
        extends RecyclerView.Adapter<H> implements BaseAdapter<T>, View.OnClickListener, View.OnLongClickListener {
    private Context mContext;
    private List<T> mData;

    @LayoutRes
    private int mLayoutResId;

    public BaseRecyclerViewAdapter(List<T> data) {
        this(0, data);
    }

    public BaseRecyclerViewAdapter(@LayoutRes int layoutResId, List<T> data) {
        this.mData = data == null ? new ArrayList<T>() : data;
        if (layoutResId != 0) {
            this.mLayoutResId = layoutResId;
        }
    }

    @Override
    public H onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(mLayoutResId, parent, false);
        return (H) new BaseRecyclerViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    public Context getContext() {
        return mContext;
    }

    public abstract void onBindViewHolder(H holder, int position);

    private OnItemClickListener mOnClick;
    private OnItemLongClickListener mOnLongClick;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnClick = listener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener listener) {
        this.mOnLongClick = listener;
    }

    @Override
    public void onClick(View v) {
        if (mOnClick != null) {
            mOnClick.onClick(v);
        }
    }

    @Override
    public boolean onLongClick(View v) {
        return mOnLongClick != null && mOnLongClick.onLongClick(v);
    }

    public interface OnItemClickListener extends View.OnClickListener {
    }

    public interface OnItemLongClickListener extends View.OnLongClickListener {
    }
}
