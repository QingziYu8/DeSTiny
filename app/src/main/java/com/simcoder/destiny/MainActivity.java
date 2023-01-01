package com.simcoder.destiny;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonTopup1= findViewById(R.id.chooseTopup);
        buttonTopup1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,CustomerTopup.class);
                startActivity(intent);

            }
        });

        Button buttonBankAccount= findViewById(R.id.customerClickBankAcount);
        buttonBankAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this,BankAccount.class);
                startActivity(intent);

            }
        });

    }
}