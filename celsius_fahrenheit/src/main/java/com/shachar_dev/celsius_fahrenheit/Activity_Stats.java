package com.shachar_dev.celsius_fahrenheit;

import android.graphics.drawable.Drawable;

import com.shachar_dev.common.Activity_StatsParent;
import com.shachar_dev.common.MSP;

public class Activity_Stats extends Activity_StatsParent {

    private float celsius, fahrenheit;

    @Override
    protected float getData() {
        celsius = MSP.getInstance().getFloat("unit", -1);
        fahrenheit = MSP.getInstance().getFloat("fahrenheit", -1);

        if (celsius == -1) {
            return (fahrenheit - 32) * 5 / 9;
        } else
            return (celsius * 9 / 5) + 32;
    }

    @Override
    protected Drawable setBg() {
        return getDrawable(com.shachar_dev.common.R.drawable.main_bg_b);
    }

}
