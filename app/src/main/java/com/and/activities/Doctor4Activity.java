package com.and.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.and.R;
import com.and.widget.TitleBar;

/**
 * Created by root on 16-2-2.
 */
public class Doctor4Activity extends AppCompatActivity{
    private TitleBar titleBar;
    private ListView lv_doctor4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor4);
        titleBar= (TitleBar) findViewById(R.id.title_bar);
        lv_doctor4= (ListView) findViewById(R.id.lv_doctor4);

        titleBar.setTitleBarBackgroundColor(0x44000000);
//        titleBar.initTitleBarInfo(null,-1,R.drawable.u11,null,"X 取消");
        titleBar.initTitleBarInfo("心理咨询",-1,R.drawable.u22,"< 返回",null);
        titleBar.setRightContainerClickAble(true);
        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {
                Doctor4Activity.this.finish();
            }

            @Override
            public void onRightButtonClick(View v) {
                Toast.makeText(Doctor4Activity.this,"点击了搜索",Toast.LENGTH_SHORT).show();
            }
        });

        lv_doctor4.setAdapter(new Doctor4Adapter());
    }

    /**
     * GridView的适配器
     */
    private class Doctor4Adapter extends BaseAdapter {
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
                view=View.inflate(Doctor4Activity.this,R.layout.item_xinli,null);
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
