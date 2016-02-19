package com.and.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.and.R;


import com.and.widget.TitleBar;


/**
 * 我的-主框架-tab3
 */
public class MeFragment extends BaseFragment {

    private TitleBar titleBar;


    private Activity context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_5, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        setUp(view, savedInstanceState);
    }


    private void setUp(View view, Bundle savedInstanceState) {
        context = this.getActivity();

        titleBar = (TitleBar) view.findViewById(R.id.title_bar);
        titleBar.initTitleBarInfo("个人中心", -1, -1, "", "");


        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {

            }

            @Override
            public void onRightButtonClick(View v) {
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
