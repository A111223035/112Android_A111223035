package com.example.alertdialogmultichoicedemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener{

    private String[] items = {"Samsung", "OPPO", "Apple", "Asus"};
    private boolean[] itemsChecked = new boolean[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSelect = (Button) findViewById(R.id.btnSelect);
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog build = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("請勾選選項？")
                        .setPositiveButton("確定", null)
                        .setNegativeButton("取消", null)
                        .setMultiChoiceItems(items, itemsChecked, null)
                        .show(); //顯示對話方塊
            }
        });
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which){
            case DialogInterface
        }
    }
}