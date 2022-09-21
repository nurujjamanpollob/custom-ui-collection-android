package dev.nurujjamanpollob.uitestapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.nurujjamanpollob.customview.CircleLayout;

import dev.nurujjamanpollob.uitestapp.databinding.CircleLayoutExampleBinding;


public class CircleLayoutDemoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CircleLayoutExampleBinding binding = CircleLayoutExampleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CircleLayout circleLayout = binding.circleLayout;

        // Set change circle color click listener
        binding.changeCircleColor.setOnClickListener(view -> {
            // Change circle color
            circleLayout.setCircleColor(Color.RED);
        });

        // Set change circle border color click listener
        binding.changeCircleBorderColor.setOnClickListener(view -> {
            // Change circle border color
            circleLayout.setCircleBorderColor(Color.GREEN);
        });

        binding.restoreParameters.setOnClickListener(view -> {
            // Restore circle color
            circleLayout.setCircleColor(Color.parseColor("#4B4C4C"));

            // Restore circle border color
            circleLayout.setCircleBorderColor(Color.parseColor("#FF03DAC5"));
        });

    }

}
