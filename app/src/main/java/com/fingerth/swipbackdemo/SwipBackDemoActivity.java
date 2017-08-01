package com.fingerth.swipbackdemo;

import android.os.Bundle;
import android.widget.TextView;

import com.gyf.barlibrary.ImmersionBar;

import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;


public class SwipBackDemoActivity extends SwipeBackActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swip_back_demo);
        SwipeBackLayout mSwipeBackLayout = getSwipeBackLayout();
        //SwipeBackLayout.EDGE_LEFT 右滑結束
        //SwipeBackLayout.EDGE_RIGHT 左滑結束
        //SwipeBackLayout.EDGE_BOTTOM 向上滑結束
        //SwipeBackLayout.EDGE_ALL 左右向上滑結束
        //SwipeBackLayout.EDGE_ALL 左右向上滑結束
        mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_ALL);

        ImmersionBar.with(this)
                .titleBar(R.id.toolbar)
                .navigationBarColor(R.color.colorPrimary)
                .init();

        TextView tv = (TextView) findViewById(R.id.tv);

        tv.setText("右滑動返回");
    }
}
