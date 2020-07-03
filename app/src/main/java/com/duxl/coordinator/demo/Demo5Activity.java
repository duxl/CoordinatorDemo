package com.duxl.coordinator.demo;

/**
 * create by duxl 2020/7/2
 */
public class Demo5Activity extends BaseActivity {

    @Override
    public int getLayoutResId() {
        return R.layout.activity_demo5;
    }

    @Override
    public void initView() {
        hideActionBar(true);
    }
}
