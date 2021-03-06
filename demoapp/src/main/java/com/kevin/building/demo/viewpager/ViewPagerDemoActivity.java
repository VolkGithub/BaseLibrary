package com.kevin.building.demo.viewpager;

import android.os.Message;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.kevin.building.base.BaseActivity;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2015/12/24 10:27
 */
public class ViewPagerDemoActivity extends BaseActivity {

    private BaseViewPagerFragment fragment1;

    @Override
    protected int getLayoutResId() {
        return 0;
    }

    @Override
    protected void initView() {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(android.R.id.content, getFragment1());

        fragmentTransaction.commit();

    }

    @Override
    protected void initData() {


    }

    @Override
    protected void onViewClick(View v) {

    }

    @Override
    protected void handleMsg(Message msg) {

    }


    public BaseViewPagerFragment getFragment1() {
        if (fragment1 == null) {
            fragment1 = new BaseViewPagerFragment();
        }
        return fragment1;
    }


}
