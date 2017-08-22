package com.fire.android.recyclerviewscrolldemo;

import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import java.util.List;

/**
 * Created by Administrator on 2017/8/22.
 * Auther：Administrator
 * Email：1606561454@qq.com
 * Description：
 */

public abstract class BaseRecyclerAdapter<T> extends BaseQuickAdapter<T, BaseViewHolder> {

    public BaseRecyclerAdapter(int layoutResId, List<T> data) {
        super(layoutResId, data);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder viewHolder = super.onCreateViewHolder(parent, viewType);
        return viewHolder;
    }

    @Override
    protected abstract void convert(BaseViewHolder holder, T entity);

    public void clear() {
        mData.clear();
        notifyDataSetChanged();
    }
}
