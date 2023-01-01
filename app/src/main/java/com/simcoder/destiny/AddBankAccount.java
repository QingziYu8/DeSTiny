package com.simcoder.destiny;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddBankAccount extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bank_account);

        Button buttonAdd2= findViewById(R.id.confirmAddBankAcount);
        buttonAdd2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent= new Intent();
                intent.setClass(AddBankAccount.this,Success.class);
                startActivity(intent);

            }
        });
    }
}