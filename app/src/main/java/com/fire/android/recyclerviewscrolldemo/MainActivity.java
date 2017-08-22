package com.fire.android.recyclerviewscrolldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mMMonRecyclerView;
    private RecyclerView mAfterRecyclerView;
    private RecyclerView mEnvRecyclerView;
    private ContentBean mContentBean;

    private List<ContentBean.DetailsBean.MorningRecipeSetBean> morningRecipeSet = new ArrayList<>();
    private List<ContentBean.DetailsBean.MorningRecipeSetBean> noonRecipeSet = new ArrayList<>();
    private List<ContentBean.DetailsBean.MorningRecipeSetBean> eveningRecipeSet = new ArrayList<>();
    private TestAdapter mAdapter1;
    private TestAdapter mAdapter3;
    private TestAdapter mAdapter2;
    private ActivitysDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        mMMonRecyclerView = find(R.id.mMonRecyclerView);
        mAfterRecyclerView = find(R.id.mAfterRecyclerView);
        mEnvRecyclerView = find(R.id.mEnvRecyclerView);

        GridLayoutManager layoutManager = new GridLayoutManager(this,3);
        GridLayoutManager layoutManager1 = new GridLayoutManager(this,3);
        GridLayoutManager layoutManager2 = new GridLayoutManager(this,3);

        mMMonRecyclerView.setLayoutManager(layoutManager);
        mAfterRecyclerView.setLayoutManager(layoutManager1);
        mEnvRecyclerView.setLayoutManager(layoutManager2);

        mAdapter1 = new TestAdapter(morningRecipeSet);
        mAdapter2 = new TestAdapter(noonRecipeSet);
        mAdapter3 = new TestAdapter(eveningRecipeSet);

        mMMonRecyclerView.setAdapter(mAdapter1);
        mAfterRecyclerView.setAdapter(mAdapter2);
        mEnvRecyclerView.setAdapter(mAdapter3);

        dialog = new ActivitysDialog(this);
    }

    private void initData() {
        /**
         * id : 1
         * name : 鱼香茄子
         * description : 这是鱼香茄子是是把鱼做成茄子的造型
         * imageUrl : http://172.16.101.154:8083/1.jpg
         * https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=1005496155,992054030&fm=58&u_exp_0=438462540,658748620&fm_exp_0=86&bpow=950&bpoh=1425
         * category : 素菜
         */
        ContentBean.DetailsBean.MorningRecipeSetBean morningRecipeSetBean = new ContentBean.DetailsBean.MorningRecipeSetBean();
        morningRecipeSetBean.setName("鱼香茄子");
        morningRecipeSetBean.setCategory("素菜");
        morningRecipeSetBean.setDescription("这是鱼香茄子是是把鱼做成茄子的造型");
        morningRecipeSetBean.setImageUrl("https://ss0.baidu.com/6ONWsjip0QIZ8tyhnq/it/u=1005496155,992054030&fm=58&u_exp_0=438462540,658748620&fm_exp_0=86&bpow=950&bpoh=1425");
        morningRecipeSetBean.setId(1);


        morningRecipeSet.add(morningRecipeSetBean);
        morningRecipeSet.add(morningRecipeSetBean);
        morningRecipeSet.add(morningRecipeSetBean);

        noonRecipeSet.add(morningRecipeSetBean);
        noonRecipeSet.add(morningRecipeSetBean);
        eveningRecipeSet.add(morningRecipeSetBean);
        eveningRecipeSet.add(morningRecipeSetBean);

        ContentBean.DetailsBean detailsBean = new ContentBean.DetailsBean();
        detailsBean.setEveningRecipeSet(eveningRecipeSet);
        detailsBean.setMorningRecipeSet(morningRecipeSet);
        detailsBean.setNoonRecipeSet(noonRecipeSet);

        mContentBean = new ContentBean();
        mContentBean.setDetails(detailsBean);
        mContentBean.setDate("2017-08-21");
        mContentBean.setDayOfWeek("星期一");

        mAdapter1.notifyDataSetChanged();
        mAdapter3.notifyDataSetChanged();
        mAdapter2.notifyDataSetChanged();
    }


    public <T extends View> T find(int resourceId){
        return (T) findViewById(resourceId);
    }

    public void testOnClick(View view) {
        if (dialog == null) {
            dialog = new ActivitysDialog(this);
        }
        if (dialog.isShowing()) {
            return;
        }
        dialog.show();
    }
}
