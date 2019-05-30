package com.example.mi.loginpage.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import com.facebook.FacebookSdk;

import butterknife.ButterKnife;

public  abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(getLayout());
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(getDisplayBackButton());
        }
        ButterKnife.bind(this,this);
    }
    protected abstract boolean getDisplayBackButton();

    public abstract int getLayout() ;



}
