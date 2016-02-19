package com.and.activities;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.and.R;
import com.and.widget.TitleBar;

/**
 * Created by root on 16-2-2.
 */
public class Doctor1Activity extends AppCompatActivity{
    private TitleBar titleBar;
    private GridView gv_doctor1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor1);
        titleBar= (TitleBar) findViewById(R.id.title_bar);
        gv_doctor1= (GridView) findViewById(R.id.gv_doctor1);

        titleBar.setTitleBarBackgroundColor(0x44000000);
//        titleBar.initTitleBarInfo(null,-1,R.drawable.u11,null,"X 取消");
        titleBar.initTitleBarInfo("快速问医",-1,-1,"< 返回",null);
        titleBar.setRightContainerClickAble(true);
        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {
                Doctor1Activity.this.finish();
            }

            @Override
            public void onRightButtonClick(View v) {

            }
        });

        gv_doctor1.setAdapter(new Doctor1Adapter());
    }

    /**
     * GridView的适配器
     */
    private class Doctor1Adapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 12;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = View.inflate(Doctor1Activity.this, R.layout.item_keshi, null);
            TextView tv_name = (TextView) view.findViewById(R.id.tv_homeitem_name);
            tv_name.setVisibility(View.GONE);
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
