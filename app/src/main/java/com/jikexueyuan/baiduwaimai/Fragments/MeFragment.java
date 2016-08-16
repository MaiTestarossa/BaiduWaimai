package com.jikexueyuan.baiduwaimai.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jikexueyuan.baiduwaimai.Adapters.MeListAdapter;
import com.jikexueyuan.baiduwaimai.R;


public class MeFragment extends Fragment {

    private ListView listView;
    private MeListAdapter meListAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        listView = (ListView) view.findViewById(R.id.lv_me);

        //添加头部view（登录区域）
        listView.addHeaderView(inflater.inflate(R.layout.me_list_header, null));
        //添加底部view（客服电话）
        listView.addFooterView(inflater.inflate(R.layout.me_list_footer, null));

        meListAdapter = new MeListAdapter(getContext());
        listView.setAdapter(meListAdapter);
        return view;
    }

}
