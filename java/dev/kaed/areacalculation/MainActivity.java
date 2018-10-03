package dev.kaed.areacalculation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void circleclicked(View view) {
        Intent intent = new Intent(this, circleactivity.class);
        startActivity(intent);
    }

    public void squareclicked(View view) {
        Intent intent = new Intent(this, SquareActivity.class);
        startActivity(intent);
    }

    public void triangleclicked(View view) {
        Intent intent = new Intent(this, TriangleActivity.class);
        startActivity(intent);
    }

}
