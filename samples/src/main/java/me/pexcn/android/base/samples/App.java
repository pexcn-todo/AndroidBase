package me.pexcn.android.base.samples;

import android.app.Application;

import me.pexcn.android.utils.Utils;

/**
 * Created by pexcn on 2017-04-19.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
