package com.jikexueyuan.baiduwaimai.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.jikexueyuan.baiduwaimai.Beans.BeansFactory;
import com.jikexueyuan.baiduwaimai.Beans.ShopBean;
import com.jikexueyuan.baiduwaimai.R;

/**
 * 首页商家内容适配器
 */
public class HomeListAdapter extends BaseAdapter {
    private Context context;

    public HomeListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return BeansFactory.shopBeans.length;
    }

    @Override
    public Object getItem(int i) {
        return BeansFactory.shopBeans[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ShopBean shopBean = (ShopBean) getItem(i);
        ViewHolder viewHolder;

        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.home_list_cell, null);
            viewHolder.ivShop = (ImageView) view.findViewById(R.id.ivShop);
            viewHolder.ivNewdian = (ImageView) view.findViewById(R.id.ivNewShop);
            viewHolder.tvShopname = (TextView) view.findViewById(R.id.tvShopName);
            viewHolder.tvQuan = (TextView) view.findViewById(R.id.tvQuan);
            viewHolder.tvPiao = (TextView) view.findViewById(R.id.tvPiao);
            viewHolder.tvFu = (TextView) view.findViewById(R.id.tvFu);
            viewHolder.tvPei = (TextView) view.findViewById(R.id.tvPei);
            viewHolder.ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);
            viewHolder.tvSales = (TextView) view.findViewById(R.id.tvSales);
            viewHolder.tvDistance = (TextView) view.findViewById(R.id.tvDistance);
            viewHolder.tvStartingPrice = (TextView) view.findViewById(R.id.tvStartingPrice);
            viewHolder.tvShipingPrice = (TextView) view.findViewById(R.id.tvShipingPrice);
            viewHolder.tvTime = (TextView) view.findViewById(R.id.tvTime);
            viewHolder.tvJian = (TextView) view.findViewById(R.id.tvJian);
            viewHolder.tvMian = (TextView) view.findViewById(R.id.tvMian);
            viewHolder.layoutJian = view.findViewById(R.id.layoutJian);
            viewHolder.layoutMian = view.findViewById(R.id.layoutMian);

            view.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.ivShop.setImageResource(shopBean.getImageResID());
        if (!shopBean.isNewdian()) {
            viewHolder.ivNewdian.setVisibility(View.GONE);
        } else {
            viewHolder.ivNewdian.setVisibility(View.VISIBLE);
        }
        viewHolder.tvShopname.setText(shopBean.getShopName());
        if (!shopBean.isQuan()) {
            viewHolder.tvQuan.setVisibility(View.GONE);
        } else {
            viewHolder.tvQuan.setVisibility(View.VISIBLE);
        }
        if (!shopBean.isPiao()) {
            viewHolder.tvPiao.setVisibility(View.GONE);
        } else {
            viewHolder.tvPiao.setVisibility(View.VISIBLE);
        }
        if (!shopBean.isFu()) {
            viewHolder.tvFu.setVisibility(View.GONE);
        } else {
            viewHolder.tvFu.setVisibility(View.VISIBLE);
        }
        if (!shopBean.isPei()) {
            viewHolder.tvPei.setVisibility(View.GONE);
        } else {
            viewHolder.tvPei.setVisibility(View.VISIBLE);
        }
        viewHolder.ratingBar.setRating(shopBean.getRatingBar());


        viewHolder.tvSales.setText("已售" + shopBean.getSales() + "份");
        viewHolder.tvDistance.setText(shopBean.getDistance());
        viewHolder.tvStartingPrice.setText("启送￥" + shopBean.getStartingPrice());
        viewHolder.tvShipingPrice.setText("配送￥" + shopBean.getShipingPrice());
        viewHolder.tvTime.setText("平均" + shopBean.getTime() + "分钟");
        viewHolder.tvJian.setText(shopBean.getJian());
        viewHolder.tvMian.setText(shopBean.getMian());

        if (shopBean.getJian().isEmpty()) {
            viewHolder.layoutJian.setVisibility(View.GONE);
        } else {
            viewHolder.layoutJian.setVisibility(View.VISIBLE);
        }
        if (shopBean.getMian().isEmpty()) {
            viewHolder.layoutMian.setVisibility(View.GONE);
        } else {
            viewHolder.layoutMian.setVisibility(View.VISIBLE);
        }

        return view;
    }

    class ViewHolder {
        ImageView ivShop;
        ImageView ivNewdian;
        TextView tvShopname, tvQuan, tvPiao, tvFu, tvPei;
        RatingBar ratingBar;
        TextView tvSales, tvDistance;
        TextView tvStartingPrice, tvShipingPrice, tvTime;
        TextView tvJian, tvMian;
        View layoutJian, layoutMian;
    }
}
