package com.kim.chattingappfororg.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.kim.chattingappfororg.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.signIn.setOnClickListener( v -> onBackPressed());
    }
}