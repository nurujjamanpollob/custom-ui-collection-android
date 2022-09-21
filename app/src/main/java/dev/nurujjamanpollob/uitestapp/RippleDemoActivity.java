package dev.nurujjamanpollob.uitestapp;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.nurujjamanpollob.customview.RippleBackground;

import dev.nurujjamanpollob.uitestapp.databinding.RippleBackgroundExampleBinding;

public class RippleDemoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get activity binding for layout
        RippleBackgroundExampleBinding binding = RippleBackgroundExampleBinding.inflate(getLayoutInflater());

        // Set content view
        setContentView(binding.getRoot());

        // Get ripple background
        RippleBackground rippleBackground = binding.rippleBackground;

        // Get start button and set click listener
        binding.startRippleAnimation.setOnClickListener(v -> rippleBackground.startRippleAnimation());

        // Get stop button and set click listener
        binding.stopRippleAnimation.setOnClickListener(v -> rippleBackground.stopRippleAnimation());


    }
}
