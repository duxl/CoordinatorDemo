package com.duxl.coordinator.demo.behaver;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.appbar.AppBarLayout;

/**
 * Android解决CoordinatorLayout折叠布局RecyclerView最后一条数据显示不全问题
 * https://blog.csdn.net/qq_33722930/article/details/106491699
 * create by duxl 2020/7/15
 */
public class FixScrollingBehavior extends AppBarLayout.ScrollingViewBehavior {

    private AppBarLayout appBarLayout;

    public FixScrollingBehavior() {
        super();
    }

    public FixScrollingBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {

        if (appBarLayout == null) {
            appBarLayout = (AppBarLayout) dependency;
        }

        final boolean result = super.onDependentViewChanged(parent, child, dependency);
        final int bottomPadding = calculateBottomPadding(appBarLayout);
        final boolean paddingChanged = bottomPadding != child.getPaddingBottom();
        if (paddingChanged) {
            child.setPadding(child.getPaddingLeft(), child.getPaddingTop(), child.getPaddingRight(), bottomPadding);
        }
        return paddingChanged || result;
    }

    private int calculateBottomPadding(AppBarLayout dependency) {
        final int totalScrollRange = dependency.getTotalScrollRange();
        return totalScrollRange + dependency.getTop();
    }
}
