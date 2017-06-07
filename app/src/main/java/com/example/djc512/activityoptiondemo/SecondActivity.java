package com.example.djc512.activityoptiondemo;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by DjC512 on 2017-6-7.
 */

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv;
    private String msg;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        msg = bundle.getString("msg");
        iv = (ImageView) findViewById(R.id.iv);
        iv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv:
                Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
                ActivityCompat.finishAfterTransition(this);
                break;
        }
    }
}
