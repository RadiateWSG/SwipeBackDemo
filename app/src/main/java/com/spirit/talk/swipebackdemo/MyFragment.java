package com.spirit.talk.swipebackdemo;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by spiritTalk on 2015/5/5.
 */
public class MyFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, null);
        initViews(view);
        return view;
    }

    /*@Override
    public View createContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, null);
        initViews(view);
        return view;
    }*/

    private void initViews(View view) {
        getActivity().getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(Utils.getColorRId())));
        getActivity().getActionBar().setTitle(getResources().getString(R.string.fragment_title));
        view.findViewById(R.id.btnStartActivity).setOnClickListener(this);
        view.findViewById(R.id.btnStartFragment).setOnClickListener(this);
        ListView mListView = (ListView) view.findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1, Utils.getDataList(20));
        mListView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnStartActivity) {
            startActivity(new Intent(getActivity(), MainActivity.class));
        } else if (v.getId() == R.id.btnStartFragment) {
            Intent intent = new Intent(getActivity(), FragmentContainerActivity.class);
            intent.putExtra("fragment", com.spirit.talk.swipebackdemo.MyFragment.class.getName());
            startActivity(intent);
        }
    }

}
