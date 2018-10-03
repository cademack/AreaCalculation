package dev.kaed.areacalculation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SquareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
    }

    public void areacalc(View view) {
        TextView areadisplay = findViewById(R.id.areadisplay3);
        EditText lengthinput = findViewById(R.id.baseinput);
        EditText widthinput = findViewById(R.id.heightinput);
        double length = Double.parseDouble(lengthinput.getText().toString());
        double width = Double.parseDouble(widthinput.getText().toString());
        double area = length * width;
        String areastring = Double.toString(area);
        areadisplay.setText(areastring);

    }

    public void circleclicked(View view) {
        Intent intent = new Intent(this, circleactivity.class);
        startActivity(intent);
    }

    public void triangleclicked(View view) {
        Intent intent = new Intent(this, TriangleActivity.class);
        startActivity(intent);
    }

}
