package dev.nurujjamanpollob.uitestapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import dev.nurujjamanpollob.uitestapp.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dev.nurujjamanpollob.uitestapp.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.rippleBackground.setOnClickListener(v -> {
            // Launch new activity
            startActivity(new Intent(this, RippleDemoActivity.class));
        });

        binding.circleLayout.setOnClickListener(v -> {
            // Launch new activity
            startActivity(new Intent(this, CircleLayoutDemoActivity.class));
        });


    }

}