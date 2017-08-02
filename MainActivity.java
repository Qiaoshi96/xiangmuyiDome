package com.example.administrator.firstdome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.administrator.firstdome.Fragment.Fragment01;
import com.example.administrator.firstdome.Fragment.Fragment02;
import com.example.administrator.firstdome.Fragment.Fragment03;
import com.example.administrator.firstdome.Fragment.Fragment04;
import com.hjm.bottomtabbar.BottomTabBar;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;
@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewInject(R.id.bottom_tab_bar)
    private BottomTabBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        bar.init(getSupportFragmentManager())
                .addTabItem("月光茶人",R.drawable.tab_home_s,R.drawable.tab_home, Fragment01.class)
                .addTabItem("优惠",R.drawable.tab_topic_s,R.drawable.tab_topic, Fragment02.class)
                .addTabItem("购物车",R.drawable.main_index_cart_pressed,R.drawable.main_index_cart_normal, Fragment03.class)
                .addTabItem("我的",R.drawable.main_index_my_pressed,R.drawable.main_index_my_normal, Fragment04.class);

    }
}
