package com.example.bottom_navigationbar_tutorial;

import static java.security.AccessController.getContext;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ImageButton;

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

        binding.camera.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.lightGreen));
        binding.camera.setImageTintList(ContextCompat.getColorStateList(DesginTest.this, R.color.solidGreen));
    }


    public void navClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.camera:
                binding.camera.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.selectorGreen));
                binding.camera.setImageTintList(ContextCompat.getColorStateList(DesginTest.this, R.color.lightGreen));
                binding.gallery.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.lightGreen));
                binding.settings.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.lightGreen));
                break;

            case R.id.gallery:
                binding.camera.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.lightGreen));
                binding.camera.setImageTintList(ContextCompat.getColorStateList(DesginTest.this, R.color.solidGreen));
                binding.gallery.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.selectorGreen));
                binding.settings.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.lightGreen));
                break;
            case R.id.settings:
                binding.camera.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.lightGreen));
                binding.camera.setImageTintList(ContextCompat.getColorStateList(DesginTest.this, R.color.solidGreen));
                binding.gallery.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.lightGreen));
                binding.settings.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.selectorGreen));
                break;
        }
    }
}
