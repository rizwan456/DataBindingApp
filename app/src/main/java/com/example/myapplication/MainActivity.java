package com.example.myapplication;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.MainActivityBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    MainActivityBinding mainActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        mainActivityBinding.rView.setLayoutManager(new LinearLayoutManager(this));
        mainActivityBinding.rView.setAdapter(new RAdapter(Arrays.asList("gokul","rizwan","abcd","Hello","hi"),this));
    }

}
