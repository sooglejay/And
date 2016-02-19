package com.and.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.and.R;
import com.and.widget.TitleBar;


public class LifeFragment extends BaseFragment implements View.OnClickListener {
    private TitleBar titleBar;
    private ListView lv_life1;
    private LinearLayout ll_life2;
    private TextView tv_life;
    private TextView tv_data1;
    private TextView tv_data2;
    private TextView tv_data3;
    private TextView tv_data4;
    private TextView tv_data5;
    private TextView tv_data6;
    private TextView tv_data7;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_3, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        titleBar = (TitleBar) view.findViewById(R.id.title_bar);
        tv_life = (TextView) view.findViewById(R.id.tv_life);
        lv_life1 = (ListView) view.findViewById(R.id.lv_life1);
        ll_life2 = (LinearLayout) view.findViewById(R.id.lv_life2);
        tv_data1 = (TextView) view.findViewById(R.id.tv_data1);
        tv_data2 = (TextView) view.findViewById(R.id.tv_data2);
        tv_data3 = (TextView) view.findViewById(R.id.tv_data3);
        tv_data4 = (TextView) view.findViewById(R.id.tv_data4);
        tv_data5 = (TextView) view.findViewById(R.id.tv_data5);
        tv_data6 = (TextView) view.findViewById(R.id.tv_data6);
        tv_data7 = (TextView) view.findViewById(R.id.tv_data7);
        tv_data1.setOnClickListener(this);
        tv_data2.setOnClickListener(this);
        tv_data3.setOnClickListener(this);
        tv_data4.setOnClickListener(this);
        tv_data5.setOnClickListener(this);
        tv_data6.setOnClickListener(this);
        tv_data7.setOnClickListener(this);
        titleBar.initTitleBarInfo("生活", -1, -1, null, null);
        lv_life1.setAdapter(new MyAdapter());
    }

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
                return 4;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=View.inflate(getContext(),R.layout.item_life,null);
            return view;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_data1://友圈
                tv_data1.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                lv_life1.setVisibility(View.VISIBLE);
                ll_life2.setVisibility(View.GONE);
                tv_life.setVisibility(View.GONE);
                break;
            case R.id.tv_data2://饮食
                tv_data2.setTextColor(0xffff0000);
                tv_data1.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                lv_life1.setVisibility(View.GONE);
                ll_life2.setVisibility(View.GONE);
                tv_life.setVisibility(View.VISIBLE);
                tv_life.setText("饮食栏目页");
                break;
            case R.id.tv_data3://生活指导
                tv_data3.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                lv_life1.setVisibility(View.GONE);
                ll_life2.setVisibility(View.GONE);
                tv_life.setVisibility(View.VISIBLE);
                tv_life.setText("生活指导栏目页");
                break;
            case R.id.tv_data4://并发症
                tv_data4.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                lv_life1.setVisibility(View.GONE);
                ll_life2.setVisibility(View.VISIBLE);
                tv_life.setVisibility(View.GONE);
                break;
            case R.id.tv_data5://感染预防
                tv_data5.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                lv_life1.setVisibility(View.GONE);
                ll_life2.setVisibility(View.GONE);
                tv_life.setVisibility(View.VISIBLE);
                tv_life.setText("感染预防栏目页");
                break;
            case R.id.tv_data6://公益申领
                tv_data6.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                tv_data7.setTextColor(0xff000000);
                lv_life1.setVisibility(View.GONE);
                ll_life2.setVisibility(View.GONE);
                tv_life.setVisibility(View.VISIBLE);
                tv_life.setText("公益申领栏目页");
                break;
            case R.id.tv_data7://医学进展
                tv_data7.setTextColor(0xffff0000);
                tv_data2.setTextColor(0xff000000);
                tv_data3.setTextColor(0xff000000);
                tv_data1.setTextColor(0xff000000);
                tv_data5.setTextColor(0xff000000);
                tv_data6.setTextColor(0xff000000);
                tv_data4.setTextColor(0xff000000);
                lv_life1.setVisibility(View.GONE);
                ll_life2.setVisibility(View.GONE);
                tv_life.setVisibility(View.VISIBLE);
                tv_life.setText("医学进展栏目页");
                break;
        }
    }
}
