package com.jikexueyuan.baiduwaimai.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.jikexueyuan.baiduwaimai.CustomViews.CustomTabView;
import com.jikexueyuan.baiduwaimai.Fragments.DingdanFragment;
import com.jikexueyuan.baiduwaimai.Fragments.HomeFragment;
import com.jikexueyuan.baiduwaimai.Fragments.MeFragment;
import com.jikexueyuan.baiduwaimai.R;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private FragmentPagerAdapter fragmentPagerAdapter;
    private TabLayout tabLayout;
    private TabLayout.Tab tabHome, tabDingdan, tabMe;
    private CustomTabView customTabViewHome, customTabViewDingdan, customTabViewMe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        initViews();
        initEvents();
    }

    /**
     * 使用了TabLayout+ViewPager实现底部Tab布局
     */
    private void initViews() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new HomeFragment();
                    case 1:
                        return new DingdanFragment();
                    case 2:
                        return new MeFragment();
                }
                return null;
            }
        };

        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        /*
        * 将定制的view（图标+文字）装载入TabLayout
        * */
        tabHome = tabLayout.getTabAt(0);
        tabDingdan = tabLayout.getTabAt(1);
        tabMe = tabLayout.getTabAt(2);

        customTabViewHome = new CustomTabView(this, R.drawable.tab_icon_home, R.string.home);
        customTabViewDingdan = new CustomTabView(this, R.drawable.tab_icon_dingdan, R.string.dingdan);
        customTabViewMe = new CustomTabView(this, R.drawable.tab_icon_me, R.string.me);

        tabHome.setCustomView(customTabViewHome);
        tabDingdan.setCustomView(customTabViewDingdan);
        tabMe.setCustomView(customTabViewMe);

        customTabViewHome.setSelected(MainActivity.this, R.drawable.tab_icon_home_selected);
    }


    /**
     * 初始化监听事件，处理tab上被选中状态和未选中的颜色、图案
     */
    private void initEvents() {
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        customTabViewHome.setSelected(MainActivity.this, R.drawable.tab_icon_home_selected);
                        break;
                    case 1:
                        customTabViewDingdan.setSelected(MainActivity.this, R.drawable.tab_icon_dingdan_selected);
                        break;
                    case 2:
                        customTabViewMe.setSelected(MainActivity.this, R.drawable.tab_icon_me_selected);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        customTabViewHome.setUnselected(MainActivity.this);
                        break;
                    case 1:
                        customTabViewDingdan.setUnselected(MainActivity.this);
                        break;
                    case 2:
                        customTabViewMe.setUnselected(MainActivity.this);
                        break;
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}
