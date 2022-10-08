package com.example.bkzalo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.bkzalo.R;
import com.example.bkzalo.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {


    private ActivitySignInBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        setListeners();
    }
    private void setListeners(){
        binding.textCreateNewAccount.setOnClickListener( v -> startActivity(new Intent(getApplicationContext() , SignUpActivity.class)));
    }
}