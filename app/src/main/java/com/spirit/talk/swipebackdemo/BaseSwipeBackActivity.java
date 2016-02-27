package com.spirit.talk.swipebackdemo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;

/**
 * Created by spiritTalk on 2015/5/5.
 */
public class BaseSwipeBackActivity extends FragmentActivity {
    SwipeBackLayout swipeBackLayout;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        swipeBackLayout = (SwipeBackLayout) LayoutInflater.from(this).inflate(R.layout.swipe_back_layout, null);
        swipeBackLayout.attachToActivity(this);
    }

}
