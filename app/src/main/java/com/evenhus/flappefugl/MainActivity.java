package com.evenhus.flappefugl;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean changed = true;
    int timesChanged;

    public void fade(View view) {
        ImageView batman = (ImageView)findViewById(R.id.batman);
        ImageView joker = (ImageView)findViewById(R.id.joker);
        if (changed) {
            batman.animate().alpha(0f).setDuration(2000);
            joker.animate().alpha(1f).setDuration(2000);
            changed = false;
            timesChanged++;
        } else if (timesChanged == 15) {
            joker.animate().alpha(0.5f).setDuration(2000);
            batman.animate().alpha(0.5f).setDuration(2000);
        } else {
            joker.animate().alpha(0f).setDuration(2000);
            batman.animate().alpha(1f).setDuration(2000);
            changed = true;
            timesChanged++;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
