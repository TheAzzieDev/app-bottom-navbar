package com.example.bottom_navigationbar_tutorial;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bottom_navigationbar_tutorial.databinding.ActivityMainBinding;

import com.example.bottom_navigationbar_tutorial.databinding.BottomNavbardesginterstBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DesginTest extends AppCompatActivity {
    BottomNavbardesginterstBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  BottomNavbardesginterstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        /*

        nav_settings
        nav_gallery
         */
        FloatingActionButton a = findViewById(R.id.floatingActionButton);

        binding.bottomNavigationView.setOnItemSelectedListener(item ->{
            switch (item.getItemId()){
                case R.id.nav_settings:
                    Log.d("testing", "hey");
                    item.setIconTintList(ColorStateList.valueOf(Color.RED));
                    break;
            }
            return true;
        });
        /*
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(view -> {
            Intent intent = new Intent(this, DesginTest.class);
            startActivity(intent);
        });
        */


        a.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.color_test));
        a.setImageTintList(ContextCompat.getColorStateList(DesginTest.this, R.color.solidGreen));
        a.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.getBackgroundTintList() == ContextCompat.getColorStateList(DesginTest.this, R.color.selectorGreen)){
                    a.setBackgroundTintList(ContextCompat.getColorStateList(DesginTest.this, R.color.lightGreen));
                    a.setImageTintList(ContextCompat.getColorStateList(DesginTest.this, R.color.solidGreen));
                }
                else{
                    a.setBackgroundTintList(ContextCompat.getColorStateList(DesginTest.this, R.color.selectorGreen));
                    a.setImageTintList(ContextCompat.getColorStateList(DesginTest.this, R.color.lightGreen));
                }
            }
        });
    }




}
