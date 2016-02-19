package com.and.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.and.R;
import com.and.widget.TitleBar;


/**
 * 我的-主框架-tab3
 */
public class GovernFragment extends BaseFragment {

    private TitleBar titleBar;


    private Activity context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_4, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        titleBar = (TitleBar) view.findViewById(R.id.title_bar);
        titleBar.initTitleBarInfo("关艾",-1,-1,"", "确定");

        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {
                Toast.makeText(getContext(),"取消点击了按钮",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRightButtonClick(View v) {
                Toast.makeText(getContext(),"确定点击了按钮",Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
