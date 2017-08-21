package com.jude.swipbackhelper.activity;

import android.os.Bundle;
import android.support.annotation.CallSuper;

import com.jude.swipbackhelper.SwipeBackHelper;

/**
 * ======================================================
 * Created by Administrator able_fingerth on 2017/8/21.
 * <p/>
 * 版权所有，违者必究！
 * <详情描述/>
 */
public abstract class SwipeMainActivity extends SwipeBaseActivity {
    @Override
    @CallSuper
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SwipeBackHelper.getCurrentPage(this).setSwipeBackEnable(false);
        SwipeBackHelper.getCurrentPage(this).setDisallowInterceptTouchEvent(true);
    }
}
