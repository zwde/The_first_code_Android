package com.example.zw.the_first_code;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by zw on 2016/8/8.
 */
public class TitleLayout extends LinearLayout{
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        //返回按钮
        Button titleBack=(Button)findViewById(R.id.title_back);
       //编辑按钮
        Button titleEdit=(Button)findViewById(R.id.title_edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"嘿嘿嘿",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
