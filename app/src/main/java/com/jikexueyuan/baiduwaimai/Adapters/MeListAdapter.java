package com.jikexueyuan.baiduwaimai.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jikexueyuan.baiduwaimai.Beans.BeansFactory;
import com.jikexueyuan.baiduwaimai.Beans.SimpleImageTextCellBean;
import com.jikexueyuan.baiduwaimai.R;


/**
 * 重写了getViewTypeCount()，getItemViewType()区分view类型
 * 实现判断是否需要添加间隔（TYPE_SEPARATOR）
 */
public class MeListAdapter extends BaseAdapter {


    private static final int TYPE_ITEM = 0;
    private static final int TYPE_SEPARATOR = 1;
    private static final int TYPE_MAX_COUNT = TYPE_SEPARATOR + 1;

    private Context context;
    private SimpleImageTextCellBean[] meListCellBeans = BeansFactory.meListCellBeans;


    public MeListAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getViewTypeCount() {
        return TYPE_MAX_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        //数据中文字内容为separator时，判断view类型为间隔
        return "separator".equals(meListCellBeans[position].tvContent) ? TYPE_SEPARATOR : TYPE_ITEM;
    }

    @Override
    public int getCount() {
        return meListCellBeans.length;
    }

    @Override
    public Object getItem(int i) {
        return meListCellBeans[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        SimpleImageTextCellBean itemData = meListCellBeans[i];
        ViewHolder viewHolder;
        int type = getItemViewType(i);
        if (view == null) {
            viewHolder = new ViewHolder();
            switch (type) {
                case TYPE_ITEM:
                    view = LayoutInflater.from(context).inflate(R.layout.me_list_cell, null);
                    viewHolder.ivMeListIcon = (ImageView) view.findViewById(R.id.ivMeListIcon);
                    viewHolder.tvMeListCell = (TextView) view.findViewById(R.id.tvMeListCell);
                    break;
                case TYPE_SEPARATOR:
                    view = LayoutInflater.from(context).inflate(R.layout.me_list_separator, null);
                    viewHolder.ivMeListIcon = (ImageView) view.findViewById(R.id.ivMeListIconSeparator);
                    viewHolder.tvMeListCell = (TextView) view.findViewById(R.id.tvMeListCellSeparator);
                    break;
            }
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.ivMeListIcon.setImageResource(itemData.ivResId);
        viewHolder.tvMeListCell.setText(itemData.tvContent);

        return view;
    }

    class ViewHolder {
        ImageView ivMeListIcon;
        TextView tvMeListCell;
    }
}
