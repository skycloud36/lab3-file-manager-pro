package com.michaldabski.filemanager;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Samble1Activity extends Activity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useful_web);
        setupActionBar();

        findViewById(R.id.btngit).setOnClickListener(this);
        findViewById(R.id.btngoogle).setOnClickListener(this);
        findViewById(R.id.btnbaidu).setOnClickListener(this);
        findViewById(R.id.btnnju).setOnClickListener(this);
    }

    private void setupActionBar()
    {
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case android.R.id.home:
                this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btngit:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/")));
                break;

            case R.id.btngoogle:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")));
                break;

            case R.id.btnbaidu:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.baidu.com")));
                break;

            case R.id.btnnju:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nju.edu.cn")));
                break;
        }
    }
}