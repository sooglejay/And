package com.and.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.and.R;
import com.and.widget.TitleBar;

/**
 * Created by root on 16-2-2.
 */
public class Home4Activity extends AppCompatActivity implements View.OnClickListener {
    private TitleBar titleBar;
    private GridView gv1;
    private GridView gv2;
    private TextView tv_data1;
    private TextView tv_data2;
    private TextView tv_data3;
    private TextView tv_data4;
    private TextView tv_data5;
    private TextView tv_data6;
    private TextView tv_data7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home4);
        titleBar= (TitleBar) findViewById(R.id.title_bar);
        gv1= (GridView) findViewById(R.id.gv1);
        gv2= (GridView) findViewById(R.id.gv2);

        gv1.setAdapter(new MyAdapter());
        gv2.setAdapter(new MyAdapter());
        tv_data1= (TextView) findViewById(R.id.tv_data1);
        tv_data2= (TextView) findViewById(R.id.tv_data2);
        tv_data3= (TextView) findViewById(R.id.tv_data3);
        tv_data4= (TextView) findViewById(R.id.tv_data4);
        tv_data5= (TextView) findViewById(R.id.tv_data5);
        tv_data6= (TextView) findViewById(R.id.tv_data6);
        tv_data7= (TextView) findViewById(R.id.tv_data7);

        tv_data1.setOnClickListener(this);
        tv_data2.setOnClickListener(this);
        tv_data3.setOnClickListener(this);
        tv_data4.setOnClickListener(this);
        tv_data5.setOnClickListener(this);
        tv_data6.setOnClickListener(this);
        tv_data7.setOnClickListener(this);
        titleBar.setTitleBarBackgroundColor(0x44000000);
//        titleBar.initTitleBarInfo(null,-1,R.drawable.u11,null,"X 取消");
        titleBar.initTitleBarInfo("医药导购",-1,-1,"< 返回",null);
        titleBar.setLeftContainerClickAble(true);
        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {
                Home4Activity.this.finish();
            }

            @Override
            public void onRightButtonClick(View v) {

            }
        });
    }
    private class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 5;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = View.inflate(Home4Activity.this, R.layout.item_keshi, null);
            return view;
        }
        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_data1://中西医药
                tv_data1.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                break;
            case R.id.tv_data2://营养保健
                tv_data2.setTextColor(0xffff0000);
                tv_data1.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                break;
            case R.id.tv_data3://维生素钙
                tv_data3.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                break;
            case R.id.tv_data4://医疗器械
                tv_data4.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                break;
            case R.id.tv_data5://个人护理
                tv_data5.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                break;
            case R.id.tv_data6://生活用品
                tv_data6.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                break;
            case R.id.tv_data7://公益申领
                tv_data7.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                break;

        }
    }
}
