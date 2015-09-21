package com.example.mirana.posknock.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mirana.posknock.R;

/**
 * Created by xiaotingtang on 9/19/15.
 */
public class HomeActivity extends Activity {
    private ImageView thumb_machine = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        thumb_machine = (ImageView) findViewById(R.id.thumb_machine);
        thumb_machine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, CategoryActivity.class);
                startActivity(i);
            }
        });
    }
}
