package com.fire.android.recyclerviewscrolldemo;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseViewHolder;
import java.util.List;

/**
 * Created by Administrator on 2017/8/22.
 * Auther：Administrator
 * Email：1606561454@qq.com
 * Description：
 */

public class TestAdapter extends BaseMutRecyclerAdapter<ContentBean.DetailsBean.MorningRecipeSetBean>{

    public TestAdapter(List<ContentBean.DetailsBean.MorningRecipeSetBean> data) {
        super(data);
        addItemType(1,R.layout.item_one);
    }

    @Override
    protected void convert(BaseViewHolder holder, ContentBean.DetailsBean.MorningRecipeSetBean entity) {
        switch (entity.getItemType()) {
            case 1:
                setData(holder, entity);
                break;
            default:
                setData(holder, entity);
                break;
        }
    }

    private void setData(BaseViewHolder holder,
            ContentBean.DetailsBean.MorningRecipeSetBean entity) {
        ImageView imgPic = holder.setText(R.id.tv_name, entity.getName())
                .getView(R.id.img_pic);
        Glide.with(mContext)
                .load(entity.getImageUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imgPic);
    }
}
