package com.shachar_dev.unitconvertermultiapp;

import android.graphics.drawable.Drawable;

import com.shachar_dev.common.Activity_StatsParent;
import com.shachar_dev.common.MSP;

public class Activity_Stats extends Activity_StatsParent {

    private float dollar, shekal;
    private final float USD_SHEKEL = (float) 3.67;


    @Override
    protected float getData() {
        dollar = MSP.getInstance().getFloat("unit", -1);
        shekal = MSP.getInstance().getFloat("shekal", -1);

        if (dollar == -1) {
            return shekal/USD_SHEKEL;
        } else
            return dollar*USD_SHEKEL;
    }

    @Override
    protected Drawable setBg() {
        return getDrawable(com.shachar_dev.common.R.drawable.main_bg_a);
    }

}
