package com.fingerth.swipbackdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jude.swipbackhelper.SwipeBackHelper;
import com.jude.swipbackhelper.activity.SwipeBaseActivity;
import com.jude.swipbackhelper.activity.SwipeMainActivity;

public class MainActivity extends SwipeMainActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick1(View view) {

        startActivity(new Intent(this, SwipBackDemoActivity.class));
    }

}
