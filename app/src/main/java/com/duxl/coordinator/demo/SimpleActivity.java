package com.duxl.coordinator.demo;

import android.view.MotionEvent;
import android.view.View;

import com.duxl.coordinator.BaseActivity;

import butterknife.OnTouch;

/**
 * 简单事例
 * create by duxl 2020/6/28
 */
public class SimpleActivity extends BaseActivity {

    private float x, y;


    @Override
    public int getLayoutResId() {
        return R.layout.activity_simple;
    }

    @OnTouch(R.id.tv1)
    public boolean onTouchView(View v, MotionEvent e) {
        if (e.getAction() == MotionEvent.ACTION_DOWN) {
            x = v.getX() - e.getRawX();
            y = v.getY() - e.getRawY();

        } else if (e.getAction() == MotionEvent.ACTION_MOVE) {
            v.setX(x + e.getRawX());
            v.setY(y + e.getRawY());
        }
        return true;
    }
}
