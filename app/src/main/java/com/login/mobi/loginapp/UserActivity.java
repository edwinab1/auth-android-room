package com.login.mobi.loginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.login.mobi.loginapp.Models.User;

public class UserActivity extends AppCompatActivity {
    private TextView tvUser;

    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        user = (User) getIntent().getSerializableExtra("User");

        tvUser = findViewById(R.id.tvUser);

        if (user != null) {
            tvUser.setText("WELCOME "+user.getName() +" "+user.getLastName());
        }
    }
}
