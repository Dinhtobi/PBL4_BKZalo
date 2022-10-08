package com.example.bkzalo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bkzalo.R;
import com.example.bkzalo.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
    private void SetListeners(){
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}