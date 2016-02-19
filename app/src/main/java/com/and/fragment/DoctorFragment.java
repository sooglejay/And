package com.and.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.and.R;
import com.and.activities.Doctor1Activity;
import com.and.activities.Doctor2Activity;
import com.and.activities.Doctor3Activity;
import com.and.activities.Doctor4Activity;
import com.and.utils.IntentUtils;
import com.and.widget.TitleBar;


/**
 * 买保险-主框架-tab2
 */
public class DoctorFragment extends BaseFragment implements View.OnClickListener {

    private ListView lv_doctor;
    private TitleBar titleBar;
    private Button bt_doctor1;
    private Button bt_doctor2;
    private Button bt_doctor3;
    private Button bt_doctor4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_2, container, false);
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        setUp(view, savedInstanceState);
    }

    private void setUp(View view, Bundle savedInstanceState) {
        lv_doctor= (ListView) view.findViewById(R.id.lv_doctor);
        titleBar = (TitleBar) view.findViewById(R.id.title_bar);
        bt_doctor1= (Button) view.findViewById(R.id.bt_doctor1);
        bt_doctor2= (Button) view.findViewById(R.id.bt_doctor2);
        bt_doctor3= (Button) view.findViewById(R.id.bt_doctor3);
        bt_doctor4= (Button) view.findViewById(R.id.bt_doctor4);

        bt_doctor1.setOnClickListener(this);
        bt_doctor2.setOnClickListener(this);
        bt_doctor3.setOnClickListener(this);
        bt_doctor4.setOnClickListener(this);
        titleBar.initTitleBarInfo("问医", -1, -1, "", "小喇叭");

        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {

            }

            @Override
            public void onRightButtonClick(View v) {
                Toast.makeText(getContext(), "点击了小喇叭", Toast.LENGTH_SHORT).show();
            }
        });
        lv_doctor.setAdapter(new MyAdapter());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_doctor1: //快速问医
                IntentUtils.startActivity(getActivity(), Doctor1Activity.class);
                break;
            case R.id.bt_doctor2: //我的医生
                IntentUtils.startActivity(getActivity(), Doctor2Activity.class);
                break;
            case R.id.bt_doctor3: //预约挂号
                IntentUtils.startActivity(getActivity(), Doctor3Activity.class);
                break;
            case R.id.bt_doctor4: //心理咨询
                IntentUtils.startActivity(getActivity(), Doctor4Activity.class);
                break;
        }
    }

    private class MyAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return 20;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=null;
            if(convertView!=null&&convertView instanceof RelativeLayout){
                view=convertView;
            }else{
                view=View.inflate(getContext(),R.layout.item_doctor,null);
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

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

}
