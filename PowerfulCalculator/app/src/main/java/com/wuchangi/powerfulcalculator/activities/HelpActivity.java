package com.wuchangi.powerfulcalculator.activities;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.ActionBar;
import android.os.Bundle;
import com.wuchangi.powerfulcalculator.R;
import com.wuchangi.powerfulcalculator.base.BaseActivity;


/**
 * 帮助界面
 */
public class HelpActivity extends BaseActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("帮助");
        }
    }

    public static void actionStart(Context context)
    {
        context.startActivity(new Intent(context, HelpActivity.class));
    }
}
