package com.security.news.pager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

import com.security.news.util.LogUtil;


/**
 * 设置中心
 */
public class SettingPager extends BasePager {
    private Context context;

    public SettingPager(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public void initData() {
        super.initData();
        LogUtil.i(simpleName);
        //1、设置标题;
        tv_title.setText("设置");
        //2.联网请求，得到数据，创建视图
        TextView textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        textView.setTextSize(25);
        //3.把子视图添加到BasePager的FrameLayout中
        fl_content.addView(textView);
        //4.绑定数据
        textView.setText("设置");
    }
}
