package com.duxl.coordinator.knowledge;

import android.text.Html;
import android.widget.TextView;

import com.duxl.coordinator.BaseActivity;
import com.duxl.coordinator.demo.R;

import butterknife.BindView;

/**
 * app:layout_scrollFlags简介
 * create by duxl 2020/7/21
 */
public class ScrollFlagsDescribeActivity extends BaseActivity {

    @BindView(R.id.text)
    TextView mTextView;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_scroll_flags_describe;
    }

    @Override
    public void initView() {
        mTextView.setText(Html.fromHtml(getString(R.string.scroll_flags_describe)));
    }
}
