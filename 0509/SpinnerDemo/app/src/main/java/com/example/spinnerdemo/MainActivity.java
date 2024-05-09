package com.example.spinnerdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnConfirn = (Button) findViewById(R.id.button);
        btnConfirn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String[] steak=getResources().getStringArray(R.array.steaks);
                Spinner sp=(Spinner) findViewById(R.id.spinner);
                //int index=sp.getSelectedItemPosition();
                TextView output=(TextView) findViewById(R.id.lblOutput);
                output.setText("牛排要"+sp.getSelectedItem().toString());
            }
        }));

    }
}