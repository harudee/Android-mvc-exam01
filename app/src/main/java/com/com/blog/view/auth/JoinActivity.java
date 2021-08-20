package com.com.blog.view.auth;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.com.blog.R;
import com.com.blog.view.InitActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;


public class JoinActivity extends AppCompatActivity implements InitActivity {

    private static final String TAG = "JoinActivity";
    private JoinActivity mContext = JoinActivity.this;
    
    private TextInputEditText tfUsername, tfPassword, tfEmail;
    private TextView tvLinkLogin;
    private MaterialButton btnJoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        init();
        initLr();
        initSetting();
    }

    @Override
    public void init() {
        tfUsername = findViewById(R.id.tfUsername);
        tfPassword = findViewById(R.id.tfPassword);
        tfEmail = findViewById(R.id.tfEmail);

        btnJoin = findViewById(R.id.btnJoin);
        tvLinkLogin = findViewById(R.id.tvLinkLogin);

    }

    @Override
    public void initLr() {
        btnJoin.setOnClickListener(v -> {
            Log.d(TAG, "initLr: btnJoin 클릭됨");
            
        });

        tvLinkLogin.setOnClickListener(v -> {
            Intent intent = new Intent(
                    mContext,
                    LoginActivity.class
            );
            startActivity(intent);
            
        });

    }

    @Override
    public void initSetting() {

    }
}