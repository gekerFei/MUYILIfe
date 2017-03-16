package com.example.administrator.muyilife.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.administrator.muyilife.Life;
import com.example.administrator.muyilife.Mu;
import com.example.administrator.muyilife.R;
import com.example.administrator.muyilife.Xiang;
import com.example.administrator.muyilife.Xiu;

public class Second extends Fragment implements View.OnClickListener {

    private ImageView mIVmu;
    private ImageView mIVxiang;
    private ImageView mIVxiu;
    private ImageView mIvlife;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_second,container,false);
        initView(view);
        initListener();
        return view;
    }
    public void initView(View view){
        mIVmu = (ImageView)view.findViewById(R.id.mu);
        mIVxiang = (ImageView)view.findViewById(R.id.xiang);
        mIVxiu = (ImageView)view.findViewById(R.id.xiu);
        mIvlife = (ImageView)view.findViewById(R.id.life);
    }
    public void initListener(){
        mIVmu.setOnClickListener(this);
        mIVxiu.setOnClickListener(this);
        mIVxiang.setOnClickListener(this);
        mIvlife.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.mu:
                Intent intent = new Intent(getActivity().getApplicationContext(),Mu.class);
                startActivity(intent);
                break;
            case R.id.xiang:
                Intent intent1 = new Intent(getActivity().getApplicationContext(),Xiang.class);
                startActivity(intent1);
                break;
            case R.id.xiu:
                Intent intent2 = new Intent(getActivity().getApplicationContext(),Xiu.class);
                startActivity(intent2);
                break;
            case R.id.life:
                Intent intent3 = new Intent(getActivity().getApplicationContext(),Life.class);
                startActivity(intent3);
                break;
        }

    }
}
