package com.kevin.baselibrary;

import android.app.Application;
import android.content.Context;

/**
 * 作者：bailiangjin  bailiangjin@gmail.com
 * 创建时间：15/9/8 00:09
 */
public class AApplication extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
    }


    public static Context getContext() {
        return context;
    }



}
