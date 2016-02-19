package com.and.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.and.R;
import com.and.activities.DataActivity;
import com.and.activities.Home1Activity;
import com.and.activities.Home2Activity;
import com.and.activities.Home3Activity;
import com.and.activities.Home4Activity;
import com.and.activities.Home5Activity;
import com.and.activities.Home6Activity;
import com.and.utils.IntentUtils;
import com.and.widget.TitleBar;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.view.LineChartView;

/**
 * 停保险-主框架-tab1
 */
public class MedicineFragment extends BaseFragment {
    private TitleBar titleBar;
    private GridView gv_medicine;
    private TextView tv_data;

    private static final String[] names = {"健康评估", "医药分发", "用药提醒",
            "医药导购", "依从教育", "不良反应"};
    private static int[] icons = {
            R.drawable.u21, R.drawable.u21, R.drawable.u21,
            R.drawable.u21, R.drawable.u21, R.drawable.u21};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        titleBar = (TitleBar) view.findViewById(R.id.title_bar);
        gv_medicine = (GridView) view.findViewById(R.id.gv_medicine);
        tv_data = (TextView) view.findViewById(R.id.tv_data);

        tv_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentUtils.startActivity(getActivity(), DataActivity.class);
            }
        });


        titleBar.initTitleBarInfo("健康数据", -1, -1, "", "");

        LineChartView chartView = (LineChartView) view.findViewById(R.id.chart);
        List<PointValue> values = new ArrayList<PointValue>();
        values.add(new PointValue(0, 4));
        values.add(new PointValue(1, 4));
        values.add(new PointValue(2, 3));
        values.add(new PointValue(3, 4));

        //In most cased you can call data model methods in builder-pattern-like manner.
        Line line = new Line(values).setColor(Color.BLUE).setCubic(true);
        List<Line> lines = new ArrayList<Line>();
        lines.add(line);

        LineChartData data = new LineChartData();
        data.setLines(lines);
        chartView.setLineChartData(data);

        gv_medicine.setAdapter(new HomeAdapter());
        gv_medicine.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0://健康评估
                        IntentUtils.startActivity(getActivity(), Home1Activity.class);
                        break;
                    case 1://医药分发
                        IntentUtils.startActivity(getActivity(), Home2Activity.class);
                        break;
                    case 2://用药提醒
                        IntentUtils.startActivity(getActivity(), Home3Activity.class);
                        break;
                    case 3://医药导购
                        IntentUtils.startActivity(getActivity(), Home4Activity.class);
                        break;
                    case 4://依从教育
                        IntentUtils.startActivity(getActivity(), Home5Activity.class);
                        break;
                    case 5://不良反应
                        IntentUtils.startActivity(getActivity(), Home6Activity.class);
                        break;
                }
            }
        });
    }

    /**
     * GridView的适配器
     */
    private class HomeAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = View.inflate(getContext(), R.layout.item_home, null);
            TextView tv_name = (TextView) view.findViewById(R.id.tv_homeitem_name);
            ImageView iv_icon = (ImageView) view.findViewById(R.id.iv_homeitem_icon);
            tv_name.setText(names[position]);
            iv_icon.setImageResource(icons[position]);
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
