package com.and.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.and.R;
import com.and.widget.TitleBar;

/**
 * Created by root on 16-2-2.
 */
public class Home3Activity extends AppCompatActivity{
    private TitleBar titleBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home3);
        titleBar= (TitleBar) findViewById(R.id.title_bar);
        titleBar.setTitleBarBackgroundColor(0x44000000);
//        titleBar.initTitleBarInfo(null,-1,R.drawable.u11,null,"X 取消");
        titleBar.initTitleBarInfo("用药",-1,-1,"< 返回",null);
        titleBar.setLeftContainerClickAble(true);
        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {
                Home3Activity.this.finish();
            }

            @Override
            public void onRightButtonClick(View v) {

            }
        });
    }
}
