package me.pexcn.android.base.samples.demo;

import android.content.Context;
import android.util.Log;

import me.pexcn.android.base.arch.mvp.BaseModel;

/**
 * Created by pexcn on 2017-11-02.
 */
public class DemoModel extends BaseModel implements DemoContract.Model {
    public DemoModel(Context context) {
        super(context);
        Log.d(DemoModel.class.getSimpleName(), "DemoModel()");
    }
}
