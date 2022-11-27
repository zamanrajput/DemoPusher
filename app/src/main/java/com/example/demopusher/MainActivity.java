package com.example.demopusher;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.demopusher.databinding.ActivityMainBinding;
import com.pusher.pushnotifications.PushNotifications;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        PushNotifications.start(getApplicationContext(), "64446940-5741-4903-bfdd-c81d928a0b67");
        PushNotifications.addDeviceInterest("hello");
    }
}