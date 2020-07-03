package com.duxl.coordinator.demo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * create by duxl 2020/7/2
 */
public class DataRecyclerView extends RecyclerView {

    public DataRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    public DataRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        setLayoutManager(new LinearLayoutManager(context));
        addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        setAdapter(new Adapter() {
            @NonNull
            @Override
            public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = View.inflate(context, android.R.layout.simple_list_item_1, null);
                return new ViewHolder(view) {
                };
            }

            @Override
            public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
                TextView textView = holder.itemView.findViewById(android.R.id.text1);
                textView.setText("Item" + position);
            }

            @Override
            public int getItemCount() {
                return 30;
            }
        });
    }

}
