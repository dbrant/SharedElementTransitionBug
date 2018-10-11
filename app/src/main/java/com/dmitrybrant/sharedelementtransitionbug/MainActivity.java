package com.dmitrybrant.sharedelementtransitionbug;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private View transitionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transitionView = findViewById(R.id.clickHereText);
        transitionView.setOnClickListener(v -> startSecondActivity());
    }

    private void startSecondActivity() {
        startActivity(new Intent(this, SecondActivity.class), ActivityOptionsCompat.
                makeSceneTransitionAnimation(this, transitionView,
                        ViewCompat.getTransitionName(transitionView)).toBundle());
    }
}
