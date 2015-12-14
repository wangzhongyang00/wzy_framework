package com.example.administrator.bazipaipan;

import android.app.Application;
import android.content.Context;

/**
 * Created by wangzhongyang on 2015/12/14.
 */
public class MyApplication extends Application {

    Context mContext;

    private static MyApplication instance;

    public static synchronized MyApplication getInstance() {
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
        mContext=this.getApplicationContext();

    }

    //终止应用程序对象时调用
    @Override
    public void onTerminate() {
        super.onTerminate();

    }

    public  Context getContext()
    {
        return mContext;
    }

}
