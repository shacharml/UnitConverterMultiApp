package com.shachar_dev.common;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.google.android.material.textview.MaterialTextView;

public abstract class Activity_StatsParent extends AppCompatActivity {

    private MaterialTextView calculate_result;
    public LinearLayout layout;

    protected abstract float getData();
    protected abstract Drawable setBg();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_parent);

        findViews();
        updateUI();
    }

    @SuppressLint("SetTextI18n")
    private void updateUI() {
        layout.setBackground(setBg());
        calculate_result.setText(""+getData());
    }

    private void findViews() {
        calculate_result = findViewById(R.id.calculate_result);
        layout = findViewById(R.id.layout);
    }

}