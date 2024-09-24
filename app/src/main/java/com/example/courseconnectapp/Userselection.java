package com.example.courseconnectapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Userselection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_userselection);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void adminLogin(View view){
        Intent intent = new Intent(this, AdminLogin.class);
        startActivity(intent);
    }

    public void userLogin(View view){
        Intent intent = new Intent(this, UserLogin.class);
        startActivity(intent);
    }

    public void guestLogin(View view){
        Intent intent = new Intent(this, GuestUserHome.class);
        startActivity(intent);
    }
    }
