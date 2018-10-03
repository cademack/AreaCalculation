package dev.kaed.areacalculation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TriangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
    }

    public void areacalc(View view) {
        TextView areadisplay = findViewById(R.id.areadisplay4);
        EditText baseinput = findViewById(R.id.baseinput);
        EditText heightinput = findViewById(R.id.heightinput);
        double base = Double.parseDouble(baseinput.getText().toString());
        double height = Double.parseDouble(heightinput.getText().toString());
        double area =(base * height) * (0.5);
        String areastring = Double.toString(area);
        areadisplay.setText(areastring);

    }


    public void circleclicked(View view) {
        Intent intent = new Intent(this, circleactivity.class);
        startActivity(intent);
    }

    public void squareclicked(View view) {
        Intent intent = new Intent(this, SquareActivity.class);
        startActivity(intent);
    }

}
