package com.fingerth.swipbackdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.gyf.barlibrary.ImmersionBar;
import com.jude.swipbackhelper.activity.SwipeBaseActivity;


public class SwipBackDemoActivity extends SwipeBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swip_back_demo);

        ImmersionBar.with(this)
                .titleBar(R.id.toolbar)
                .navigationBarColor(R.color.colorPrimary)
                .init();

        TextView tv = (TextView) findViewById(R.id.tv);

        tv.setText("右滑動返回");
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SwipBackDemoActivity.this, SwipBackDemoActivity.class));
            }
        });
    }
}
