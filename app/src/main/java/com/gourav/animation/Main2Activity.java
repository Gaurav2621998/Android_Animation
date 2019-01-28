package com.gourav.animation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;

import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onClick(View view) {

        ImageView imageView=(ImageView)findViewById(R.id.abc);

        Slide slide = new Slide();
        slide.setSlideEdge(Gravity.TOP);


        ViewGroup root = (ViewGroup) findViewById(android.R.id.content);
        TransitionManager.beginDelayedTransition(root, slide);
        imageView.setVisibility(View.INVISIBLE);


//        TextView textView=(TextView)findViewById(R.id.data);
////        Bundle bundle=ActivityOptions.makeSceneTransitionAnimation(this,imageView,imageView.getTransitionName()).toBundle();
////        startActivity(new Intent(this,Image_detail.class),bundle);
//        Intent intent = new Intent(this, Image_detail.class);
//        Pair<View, String> p1 = Pair.create((View)view.findViewById(R.id.abc), "profile");
//        Pair<View, String> p3 = Pair.create((View)findViewById(R.id.data), "data");
//        ActivityOptionsCompat options = ActivityOptionsCompat.
//                makeSceneTransitionAnimation(this, p1, p3);
//        startActivity(intent, options.toBundle());
    }
}
