package com.example.universalhello;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.universalhello.databinding.SplashLayoutBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SplashActivity extends AppCompatActivity
{

    SplashLayoutBinding binding;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=SplashLayoutBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
                if(currentUser!=null)
                {
                    sendUserHome();
                }
                else
                {
                    sendUserLogin();
                }
            }
        },5000);

    }

    private void sendUserLogin()
    {
        startActivity(new Intent(SplashActivity.this,MainActivity.class));
        finish();
    }

    private void sendUserHome()
    {
        startActivity(new Intent(SplashActivity.this,HomeActivity.class));
        finish();
    }
}
