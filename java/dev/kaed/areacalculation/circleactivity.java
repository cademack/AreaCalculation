package dev.kaed.areacalculation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.function.ToDoubleFunction;

public class circleactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
    }

    public void areacalc(View view) {
        TextView areadisplay = findViewById(R.id.areadisplay2);
        EditText radiusinput = findViewById(R.id.radiusinput);
        double radius = Double.parseDouble(radiusinput.getText().toString());
        double area = (Math.PI * (radius * radius));
        String areastring = Double.toString(area);
        areadisplay.setText(areastring);

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
