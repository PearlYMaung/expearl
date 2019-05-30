package com.example.mi.loginpage.activities;

import android.os.Bundle;

import com.example.mi.loginpage.R;

public class SecondActivity extends BaseActivity {

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
    }

    @Override
    protected boolean getDisplayBackButton() {
        return false;
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }
}
