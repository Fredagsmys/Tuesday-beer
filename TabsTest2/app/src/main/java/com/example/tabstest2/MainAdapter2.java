package com.example.tabstest2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter2 extends RecyclerView.Adapter<MainAdapter2.ViewHolder> {
    int[] layouts;
    Context context;

    public MainAdapter2(int[] layouts, Context context){
        this.layouts = layouts;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_main2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter2.ViewHolder holder, int position) {
        holder.linearLayout.addView(new layout1(context));
    }

    @Override
    public int getItemCount() {
        return layouts.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
