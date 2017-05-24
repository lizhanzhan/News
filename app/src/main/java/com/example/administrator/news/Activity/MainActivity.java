package com.example.administrator.news.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.administrator.news.Fragment.TabFour;
import com.example.administrator.news.Fragment.TabOne;
import com.example.administrator.news.Fragment.TabThree;
import com.example.administrator.news.Fragment.TabTwo;
import com.example.administrator.news.Adapter.NewsPageAdapter;
import com.example.administrator.news.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private NewsPageAdapter mPageAdapter;
    private List<Fragment> fragments;
    private ArrayList<String> mTitleList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initFragments();
        initTitleList();

        mTabLayout = (TabLayout) findViewById(R.id.mTabLayout);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);

        mPageAdapter  = new NewsPageAdapter(getSupportFragmentManager(),
                fragments,mTitleList);
        mViewPager.setAdapter(mPageAdapter);
        mTabLayout.setupWithViewPager(mViewPager);


    }



    private void initTitleList() {
        mTitleList.add("头条");
        mTitleList.add("体育");
        mTitleList.add("科技");
        mTitleList.add("娱乐");
    }

    private void initFragments() {
        fragments = new ArrayList<>();
        fragments.add(new TabOne());
        fragments.add(new TabTwo());
        fragments.add(new TabThree());
        fragments.add(new TabFour());
    }
}
