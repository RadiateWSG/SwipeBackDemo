package com.spirit.talk.swipebackdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by spiritTalk on 2015/5/5.
 */
public class FragmentContainerActivity extends BaseSwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String className = getIntent().getStringExtra("fragment");
        try {
            Fragment fragment = (Fragment) Class.forName(className).newInstance();
            Bundle bundle = getIntent().getExtras();
            fragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragment).commitAllowingStateLoss();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
