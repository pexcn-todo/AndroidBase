package me.pexcn.android.base.ui;

import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import me.pexcn.android.base.R;

/**
 * Created by pexcn on 2016-09-24.
 */
@SuppressWarnings("unused")
public abstract class BaseActivity extends AppCompatActivity {
    @CallSuper
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        if (isSubActivity()) {
            final ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
            }
        }

        init();
    }

    /**
     * 获取布局 ID
     */
    protected abstract int getLayoutId();

    /**
     * 初始化数据
     */
    protected abstract void init();

    /**
     * 是否为某个 Activity 的子 Activity
     */
    protected boolean isSubActivity() {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (isSubActivity() && item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
