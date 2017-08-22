package com.fire.android.recyclerviewscrolldemo;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.List;

/**
 * Created by Administrator on 2017/8/22.
 * Auther：Administrator
 * Email：1606561454@qq.com
 * Description：
 */

public abstract class BaseMutRecyclerAdapter<T extends MultiItemEntity> extends BaseMultiItemQuickAdapter<T,BaseViewHolder> {
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public BaseMutRecyclerAdapter(List<T> data) {
        super(data);
    }
}
