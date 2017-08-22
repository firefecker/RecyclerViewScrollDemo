package com.fire.android.recyclerviewscrolldemo;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
/**
 * Created by utf on 2017/3/29.
 */

public class ActivitysDialog extends Dialog {



    public ActivitysDialog(@NonNull Context context) {
        this(context,R.style.activity_dialog);
    }

    public ActivitysDialog(@NonNull Context context, @StyleRes int themeResId) {
        super(context, themeResId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_activitys);


    }

}
