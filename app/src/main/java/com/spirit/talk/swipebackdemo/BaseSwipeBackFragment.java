package com.spirit.talk.swipebackdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by spiritTalk on 2015/5/5.
 */
public abstract class BaseSwipeBackFragment extends Fragment {
    private SwipeBackLayout swipeBackLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View childView = createContentView(inflater, container, savedInstanceState);
        swipeBackLayout = (SwipeBackLayout) inflater.inflate(R.layout.swipe_back_layout, null);
        swipeBackLayout.addView(childView);
        swipeBackLayout.setWindowAndDecorViewBackground(getActivity());
        return swipeBackLayout;
    }

    public abstract View createContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

}
