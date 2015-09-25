package com.example.mirana.posknock.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.mirana.posknock.R;

/**
 * Created by xiaotingtang on 9/21/15.
 */
public class CategoryActivity extends Activity {
    private Spinner spinner;
    private String[] array;
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private Button btn_menu;
    private Button btn_knock_computer;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
        spinner = (Spinner) findViewById(R.id.spinner);
        btn_menu = (Button) findViewById(R.id.btn_menu);
        btn_knock_computer = (Button) findViewById(R.id.btn_knock_computer);
        btn_knock_computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CategoryActivity.this, StoreListActivity.class);
                startActivity(i);
            }
        });

        this.array = new String[] {"5KM", "10KM", "20KM", "50KM", "100KM"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.simple_spinner_item,array);
        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        mPlanetTitles = new String[] {"FAQ", "Contact Us"};
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.right_drawer);

        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(Gravity.RIGHT);
            }
        });
        // Set the adapter for the list view
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mPlanetTitles));
        // Set the list's click listener
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());


//        mDrawerLayout.setDrawerListener(new ActionBarDrawerToggle(this,
//                mDrawerLayout,
//                R.drawable.ic_menu_slide,
//                0,
//                0
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            selectItem(position);
        }
    }

    /** Swaps fragments in the main content view */
    private void selectItem(int position) {
        Intent i = null;
        switch (position) {
            case 0:
                i = new Intent(CategoryActivity.this, FAQActivity.class);
                startActivity(i);
                break;
            case 1:
                i = new Intent(CategoryActivity.this, ContactUsActivity.class);
                startActivity(i);
                break;
        }
    }

    @Override
    public void setTitle(CharSequence title) {
//        mTitle = title;
//        getActionBar().setTitle(mTitle);
    }
}
