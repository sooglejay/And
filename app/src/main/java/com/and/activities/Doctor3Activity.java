package com.and.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.and.R;
import com.and.widget.TitleBar;

/**
 * Created by root on 16-2-2.
 */
public class Doctor3Activity extends AppCompatActivity{
    private TitleBar titleBar;
    private ListView lv_doctor3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor3);
        titleBar= (TitleBar) findViewById(R.id.title_bar);
        lv_doctor3= (ListView) findViewById(R.id.lv_doctor3);

        titleBar.setTitleBarBackgroundColor(0x44000000);
//        titleBar.initTitleBarInfo(null,-1,R.drawable.u11,null,"X 取消");
        titleBar.initTitleBarInfo("挂号预约",-1,-1,"< 返回",null);
        titleBar.setRightContainerClickAble(true);
        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {
                Doctor3Activity.this.finish();
            }

            @Override
            public void onRightButtonClick(View v) {

            }
        });

        lv_doctor3.setAdapter(new Doctor3Adapter());
    }

    /**
     * GridView的适配器
     */
    private class Doctor3Adapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 4;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=null;
            if(convertView!=null&&convertView instanceof RelativeLayout){
                view=convertView;
            }else{
                view=View.inflate(Doctor3Activity.this,R.layout.item_hospital,null);
            }
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
}
