package com.duxl.coordinator.demo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * create by duxl 2020/6/28
 */
public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder mUnbinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        mUnbinder = ButterKnife.bind(this);
    }

    public abstract int getLayoutResId();

    @Override
    protected void onDestroy() {
        if(mUnbinder != null) {
            mUnbinder.unbind();
        }
        super.onDestroy();
    }
}
