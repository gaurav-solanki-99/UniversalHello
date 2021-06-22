package com.example.universalhello;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.universalhello.databinding.HomeLayoutBinding;

public class HomeActivity extends AppCompatActivity
{
    HomeLayoutBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=HomeLayoutBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        sendUserToProfileActivity();

    }

    private void sendUserToProfileActivity()
    {
        startActivity(new Intent(HomeActivity.this,CreatProfileActivity.class));
        finish();
    }
}
