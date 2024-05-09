package com.example.spinneradapter;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private String[] courses, desserts;
    private Spinner spcourses, spdesserts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courses = getResources().getStringArray(R.array.courses);
        desserts = getResources().getStringArray(R.array.desserts);

        spcourses = (Spinner) findViewById(R.id.spinner);
        spdesserts = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> adpCourses= new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,courses );
        ArrayAdapter<String> adpDesserts= new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,desserts );

        spcourses.setAdapter(adpCourses);
        spdesserts.setAdapter(adpDesserts);

        Button btnConfirm = (Button) findViewById(R.id.button);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String course = spcourses.getSelectedItem().toString();
                String dessert = spdesserts.getSelectedItem().toString();
                TextView output = (TextView) findViewById(R.id.lblOutput);
                output.setText("主餐：" +course +"\n甜點：" +dessert);
            }
        });
    }
}