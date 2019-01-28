package com.gourav.animation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onClick(View view) {

        ImageView imageView=(ImageView)findViewById(R.id.abc);
        Bundle bundle=ActivityOptions.makeSceneTransitionAnimation(this,imageView,imageView.getTransitionName()).toBundle();
        startActivity(new Intent(this,Image_detail.class),bundle);

    }
}
