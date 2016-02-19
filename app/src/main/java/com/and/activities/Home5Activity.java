package com.and.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.and.R;
import com.and.widget.TitleBar;

/**
 * Created by root on 16-2-2.
 */
public class Home5Activity extends AppCompatActivity implements View.OnClickListener {
    private TitleBar titleBar;
    private Button bt_right;
    private Button bt_left;
    private Button bt_center;
    private TextView tv_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home5);
        titleBar= (TitleBar) findViewById(R.id.title_bar);

        bt_right= (Button) findViewById(R.id.bt_right);
        bt_left= (Button) findViewById(R.id.bt_left);
        bt_center= (Button) findViewById(R.id.bt_center);
        tv_content= (TextView) findViewById(R.id.tv_content);

        bt_left.setOnClickListener(this);
        bt_center.setOnClickListener(this);
        bt_right.setOnClickListener(this);

        titleBar.setTitleBarBackgroundColor(0x44000000);
        titleBar.initTitleBarInfo(null,-1,-1,"< 返回",null);
        titleBar.setLeftContainerClickAble(true);
        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {
                Home5Activity.this.finish();
            }

            @Override
            public void onRightButtonClick(View v) {

            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_left:
                bt_left.setTextColor(0xffff0000);
                bt_center.setTextColor(0x44000000);
                bt_right.setTextColor(0x44000000);
                tv_content.setTextColor(0xff000000);
                break;
            case R.id.bt_center:
                bt_center.setTextColor(0xffff0000);
                bt_left.setTextColor(0x44000000);
                bt_right.setTextColor(0x44000000);
                tv_content.setTextColor(0xF0CA8D0A);
                break;
            case R.id.bt_right:
                bt_right.setTextColor(0xffff0000);
                bt_left.setTextColor(0x44000000);
                bt_center.setTextColor(0x44000000);
                tv_content.setTextColor(0xFF1AB72C);
                break;
        }
    }
}
