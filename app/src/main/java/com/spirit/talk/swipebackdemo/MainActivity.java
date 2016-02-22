package com.spirit.talk.swipebackdemo;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by spiritTalk on 2015/5/5.
 */
public class MainActivity extends BaseSwipeBackActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(Utils.getColorRId())));
        initViews();
    }

    private void initViews() {
        findViewById(R.id.btnStartActivity).setOnClickListener(this);
        findViewById(R.id.btnStartFragment).setOnClickListener(this);
        ListView mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, Utils.getDataList(20));
        mListView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnStartActivity) {
            startActivity(new Intent(MainActivity.this, MainActivity.class));
            overridePendingTransition(R.anim.slide_in_right, 0);
        } else if (v.getId() == R.id.btnStartFragment) {
            Intent intent = new Intent(MainActivity.this, FragmentContainerActivity.class);
            intent.putExtra("fragment", com.spirit.talk.swipebackdemo.MyFragment.class.getName());
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, 0);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(Utils.getArticleUrl()));
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
