package com.jikexueyuan.baiduwaimai.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jikexueyuan.baiduwaimai.Beans.BeansFactory;
import com.jikexueyuan.baiduwaimai.R;

/**
 * 首页头部分类选项，用RecyclerView实现
 */
public class CategoryAdapter extends RecyclerView.Adapter {

    class ViewHolder extends RecyclerView.ViewHolder {

        private View root;

        private TextView tvCate;

        private ImageView ivCate;

        public ViewHolder(View root) {
            super(root);

            tvCate = (TextView) root.findViewById(R.id.tvCate);
            ivCate = (ImageView) root.findViewById(R.id.ivCate);
        }

        public ImageView getIvCate() {
            return ivCate;
        }

        public TextView getTvCate() {
            return tvCate;
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_category_cell, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder vh = (ViewHolder) holder;
        vh.getIvCate().setImageResource(BeansFactory.categoryCellBeens[position].ivResId);
        vh.getTvCate().setText(BeansFactory.categoryCellBeens[position].tvContent);
    }

    @Override
    public int getItemCount() {
        return BeansFactory.categoryCellBeens.length;
    }


}
