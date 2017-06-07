package com.example.djc512.activityoptiondemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);

        iv.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(
                        MainActivity.this,iv,"imageView");
                Bundle bundle = options.toBundle();
                bundle.putString("msg","hello");
                intent.putExtras(bundle);
                ActivityCompat.startActivity(MainActivity.this,intent,bundle);
            }
        });
    }
}
