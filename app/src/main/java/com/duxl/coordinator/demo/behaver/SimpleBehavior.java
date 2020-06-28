package com.duxl.coordinator.demo.behaver;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.duxl.coordinator.demo.R;

/**
 * 简单示例
 * create by duxl 2020/6/28
 */
public class SimpleBehavior extends CoordinatorLayout.Behavior<TextView> {

    public SimpleBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(@NonNull CoordinatorLayout parent, @NonNull TextView child, @NonNull View dependency) {
        return dependency.getId() == R.id.tv1;
    }

    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent, @NonNull TextView child, @NonNull View dependency) {
        child.setX(dependency.getX());
        child.setY(dependency.getY() - dependency.getMeasuredHeight() - 50);
        return true;
    }
}
