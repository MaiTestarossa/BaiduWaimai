package com.jikexueyuan.baiduwaimai.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jikexueyuan.baiduwaimai.Adapters.CategoryAdapter;
import com.jikexueyuan.baiduwaimai.Adapters.HomeListAdapter;
import com.jikexueyuan.baiduwaimai.R;


public class HomeFragment extends Fragment {
    private CategoryAdapter categoryAdapter;
    private HomeListAdapter homeListAdapter;
    private ListView listView;
    private RecyclerView rvCategory;
    private View headerView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        /*
        * 用RecyclerView呈现首页分类内容
        * */
        headerView = inflater.inflate(R.layout.home_list_header,null);
        rvCategory = (RecyclerView) headerView.findViewById(R.id.rvCategory);
        rvCategory.setLayoutManager(new GridLayoutManager(getContext(),4,GridLayoutManager.VERTICAL,false));
        categoryAdapter = new CategoryAdapter();
        rvCategory.setAdapter(categoryAdapter);

        listView = (ListView) view.findViewById(R.id.lvHome);
        listView.addHeaderView(headerView);
        homeListAdapter = new HomeListAdapter(getContext());
        listView.setAdapter(homeListAdapter);

        return view;
    }

}
