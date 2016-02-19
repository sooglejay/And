package com.and.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.and.R;

/**
 * Created by root on 16-2-3.
 */
public class MeView extends RelativeLayout {
    private TextView tv_title;
    private String title;
    public MeView(Context context) {
        super(context);
        initView(context);
    }


    public MeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        title = attrs.getAttributeValue("http://schemas.android.com/apk/res-com.and", "MeTitle");
        System.out.println(title+"------------------------");
        initView(context);
    }

    private void initView(Context context) {
        this.addView(View.inflate(context, R.layout.view_me, null));
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_title.setText(title);
    }

}
