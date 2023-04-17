package com.shachar_dev.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button main_BTN_calculate;
    private TextView main_TXV_unit;
    private EditText main_EDT_number;
    private TextView main_TXV_title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initButton();

    }

    private void initButton() {
        main_BTN_calculate.setOnClickListener(v -> {
            MSP.getInstance().putFloat("unit", Integer.parseInt(String.valueOf(main_EDT_number.getText())));
            startActivity(new Intent(MainActivity.this, App_Parent.statsClass));
        });
    }


    private void findViews() {
        main_BTN_calculate = findViewById(R.id.main_BTN_calculate);
        main_TXV_unit = findViewById(R.id.main_TXV_unit);
        main_EDT_number = findViewById(R.id.main_EDT_number);
        main_TXV_title = findViewById(R.id.main_TXV_title);
    }
}