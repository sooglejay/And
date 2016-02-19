package com.and.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.and.R;
import com.and.widget.TitleBar;

/**
 * Created by root on 16-2-2.
 */
public class DataActivity extends AppCompatActivity implements View.OnClickListener {
    private TitleBar titleBar;
    private LinearLayout lv_data1;
    private LinearLayout lv_data2;
    private TextView tv_data1;
    private TextView tv_data2;
    private TextView tv_data3;
    private TextView tv_data4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        titleBar= (TitleBar) findViewById(R.id.title_bar);
        lv_data1= (LinearLayout) findViewById(R.id.lv_data1);
        lv_data2= (LinearLayout) findViewById(R.id.lv_data2);
        tv_data1= (TextView) findViewById(R.id.tv_data1);
        tv_data2= (TextView) findViewById(R.id.tv_data2);
        tv_data3= (TextView) findViewById(R.id.tv_data3);
        tv_data4= (TextView) findViewById(R.id.tv_data4);

        tv_data1.setOnClickListener(this);
        tv_data2.setOnClickListener(this);
        tv_data3.setOnClickListener(this);
        tv_data4.setOnClickListener(this);
        titleBar.setTitleBarBackgroundColor(0x44000000);
//        titleBar.initTitleBarInfo(null,-1,R.drawable.u11,null,"X 取消");
        titleBar.initTitleBarInfo("",-1,-1,"< 返回","保存");
        titleBar.setLeftContainerClickAble(true);
        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {
                DataActivity.this.finish();
            }

            @Override
            public void onRightButtonClick(View v) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_data1://CD4
                tv_data1.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                lv_data1.setVisibility(View.VISIBLE);
                lv_data2.setVisibility(View.GONE);
                break;
            case R.id.tv_data2://病毒载重
                tv_data2.setTextColor(0xffff0000);
                tv_data1.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                lv_data1.setVisibility(View.VISIBLE);
                lv_data2.setVisibility(View.GONE);
                break;
            case R.id.tv_data3://体重
                tv_data3.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                lv_data1.setVisibility(View.VISIBLE);
                lv_data2.setVisibility(View.GONE);
                break;
            case R.id.tv_data4://并发症
                tv_data4.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                lv_data2.setVisibility(View.VISIBLE);
                lv_data1.setVisibility(View.GONE);
                break;
        }
    }
}
