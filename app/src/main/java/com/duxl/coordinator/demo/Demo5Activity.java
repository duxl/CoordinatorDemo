package com.duxl.coordinator.demo;

import androidx.recyclerview.widget.RecyclerView;

import com.duxl.coordinator.BaseActivity;

import butterknife.BindView;

/**
 * create by duxl 2020/7/2
 */
public class Demo5Activity extends BaseActivity {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_demo5;
    }

    @Override
    public void initView() {
        hideActionBar(true);
        // 不知道为什么，这里不设置Padding的话，列表最后显示不全
        // 不设置padding的话，将布局文件中的app:layout_behavior="@string/appbar_scrolling_view_behavior"
        // 替换成app:layout_behavior=".behaver.FixScrollingBehavior"也可以解决最后一项显示不全问题
        //mRecyclerView.post(() -> mRecyclerView.setPadding(0, 0, 0, 1));
    }
}
