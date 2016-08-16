package com.jikexueyuan.baiduwaimai.CustomViews;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.jikexueyuan.baiduwaimai.R;

/**
 * 底部选项卡定制视图
 */
public class CustomTabView extends FrameLayout {

    private TextView textView;
    private ImageView imageView;
    private int unselectResID; //用于保存初始化时未选中状态图标资源ID

    public CustomTabView(Context context, int tabIcon, int tabText) {
        super(context);
        initView(context, tabIcon, tabText);
    }

    private void initView(Context context, int tabIcon, int tabText) {
        LayoutInflater.from(context).inflate(R.layout.tab_item, this);
        textView = (TextView) findViewById(R.id.tab_textView);
        imageView = (ImageView) findViewById(R.id.tab_imageView);
        textView.setText(tabText);
        imageView.setImageResource(tabIcon);
        unselectResID = tabIcon;
    }


    public void setSelected(Context context, int tabIcon) {
        textView.setTextColor(ContextCompat.getColor(context, R.color.colorSelecttab));
        imageView.setImageResource(tabIcon);
    }

    public void setUnselected(Context context) {
        textView.setTextColor(ContextCompat.getColor(context, android.R.color.primary_text_light));
        imageView.setImageResource(unselectResID);
    }
}
