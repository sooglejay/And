package com.and.activities;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.and.R;
import com.and.widget.TitleBar;

/**
 * Created by root on 16-2-2.
 */
public class Home6Activity extends AppCompatActivity{
    private TitleBar titleBar;
    private Button bt_right;
    private Button bt_left;
    private TextView tv_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home6);
        titleBar= (TitleBar) findViewById(R.id.title_bar);
        bt_right= (Button) findViewById(R.id.bt_right);
        bt_left= (Button) findViewById(R.id.bt_left);
        tv_content= (TextView) findViewById(R.id.tv_content);

        titleBar.setTitleBarBackgroundColor(0x44000000);
//        titleBar.initTitleBarInfo(null,-1,R.drawable.u11,null,"X 取消");
        titleBar.initTitleBarInfo(null,-1,-1,"< 返回",null);
        titleBar.setLeftContainerClickAble(true);
        titleBar.setOnTitleBarClickListener(new TitleBar.OnTitleBarClickListener() {
            @Override
            public void onLeftButtonClick(View v) {
                Home6Activity.this.finish();
            }

            @Override
            public void onRightButtonClick(View v) {

            }
        });
    }

    public void right(View v){
        bt_right.setTextColor(0xffff0000);
        bt_left.setTextColor(0x44000000);
//        bt_right.setBackground(getResources().getDrawable(R.drawable.anniu2_u13_selected,null));
//        bt_left.setBackground(getResources().getDrawable(R.drawable.anniu2_u13_selected, null));
        tv_content.setText("表现为：\n" +
"1.副作用 药物在治疗剂量时出现的与治疗目的无关的作用。可能给病人带来不舒适甚至痛苦，一般较轻微，是可以恢复的功能性变化。产生副作用的原因是药物作用的选择性低，作用范围广，当其中某一作用被用来作为治疗目的时，其他作用就可能成为副作用。由于副作用是药物本身所固有的，所以可以预料到，也可以通过合并用药避免或减轻，例如麻黄碱在解除支气管哮喘时，也兴奋中枢神经系统，引起失眠，可同时给予巴比妥类药物，以对抗其兴奋中枢的作用。\n" +
"2.毒性反应 指用药剂量过大或用药时间过长，或机体对药物过于敏感而产生的对机体有损害的反应，一般较严重。大多是可以预知的。控制用药剂量或给药间隔时间及剂量的个体化是防止毒性反应的主要措施，必要时可停药或改用他药。");
    }
    public void left(View v){
        bt_left.setTextColor(0xffff0000);
        bt_right.setTextColor(0x44000000);
//        bt_left.setBackground(getDrawable(R.drawable.anniu2_u13_selected));
//        bt_right.setBackground(getDrawable(R.drawable.anniu2_u13));
        tv_content.setText("依从性：艾滋病抗病毒治疗成功的关键\n" +
                "抗逆转录病毒治疗艾滋病中的依从性\n" +
                "　　艾滋病进行抗逆转录病毒治疗是一个需要长期坚持的过程，病人服药的依从性对于治疗效果具有决定性的作用，如果不规律或不按时服药，产生耐药性的危险很高，因为体内的抗逆转录病毒在药物水平较低时，会大量繁殖。因此，良好的依从性可以减少耐药的出现，使药物抗病毒的作用具有持久性，从而达到更好的疗效。\n" +
                "　　依从性是治疗成功的关键\n" +
                "　　抗病毒的依从性是治疗艾滋病成功的关键因素，医学家对治疗依从性的研究显示：“药物依从性水平高者，就有明显的艾滋病病毒下降的结果和较好的临床疗效。");
    }


}
