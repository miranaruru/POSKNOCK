package com.example.mirana.posknock.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mirana.posknock.R;

public class FirstPageActivity extends Activity {

    Button btn_login;
    Button btn_buynow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first_page);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstPageActivity.this.getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        btn_buynow = (Button) findViewById(R.id.btn_buyNow);
        btn_buynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstPageActivity.this.getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.

    }

}