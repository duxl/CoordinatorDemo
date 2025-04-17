package com.duxl.coordinator.knowledge;

import android.text.Html;
import android.widget.TextView;

import com.duxl.coordinator.BaseActivity;
import com.duxl.coordinator.demo.R;

import butterknife.BindView;

/**
 * CollapsingToolBar的一些知识
 */
public class CollapsingToolBarLayoutDescribeActivity extends BaseActivity {

    @BindView(R.id.text)
    TextView mTextView;

    @Override
    public int getLayoutResId() {
        return R.layout.activity_collapsing_toolbar_describe;
    }

    @Override
    public void initView() {
        super.initView();
        mTextView.setText(Html.fromHtml(getString(R.string.collapsing_toolbar_describe)));
    }
}
