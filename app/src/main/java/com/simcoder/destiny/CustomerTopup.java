package com.simcoder.destiny;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class CustomerTopup extends Activity implements View.OnClickListener{
    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;
    private Button mBtn4;
    private Button mBtn5;
    private Button mBtn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_topup);

        Button buttonTopup2= findViewById(R.id.confirmTopup);
        buttonTopup2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(CustomerTopup.this,Success.class);
                startActivity(intent);

            }
        });

        mBtn1 = findViewById(R.id.btn1);
        mBtn2 = findViewById(R.id.btn2);
        mBtn3 = findViewById(R.id.btn3);
        mBtn4 = findViewById(R.id.btn4);
        mBtn5 = findViewById(R.id.btn5);
        mBtn6 = findViewById(R.id.btn6);
        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
        mBtn4.setOnClickListener(this);
        mBtn5.setOnClickListener(this);
        mBtn6.setOnClickListener(this);
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                setEnable(mBtn1);
                break;
            case R.id.btn2:
                setEnable(mBtn2);
                break;
            case R.id.btn3:
                setEnable(mBtn3);
                break;
            case R.id.btn4:
                setEnable(mBtn4);
                break;
            case R.id.btn5:
                setEnable(mBtn5);
                break;
            case R.id.btn6:
                setEnable(mBtn6);
                break;
        }
    }
    private void setEnable(Button btn) {
        List<Button> buttonList=new ArrayList<>();
        if (buttonList.size()==0){
            buttonList.add(mBtn1);
            buttonList.add(mBtn2);
            buttonList.add(mBtn3);
            buttonList.add(mBtn4);
            buttonList.add(mBtn5);
            buttonList.add(mBtn6);
        }
        for (int i = 0; i <buttonList.size() ; i++) {
            buttonList.get(i).setEnabled(true);
        }
        btn.setEnabled(false);
    }




}