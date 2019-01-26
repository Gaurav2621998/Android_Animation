 package com.gourav.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;

 public class MainActivity extends AppCompatActivity {

    public ScrollView scrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView=(ScrollView)findViewById(R.id.scroll);

    }

    @Override
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        final int pos=50;
        Animator animator=ObjectAnimator.ofInt(scrollView,
                "scrollY",
                pos).setDuration(500);
        animator.start();

    }
}
