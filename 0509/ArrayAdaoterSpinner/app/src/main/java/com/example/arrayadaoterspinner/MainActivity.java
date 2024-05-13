package com.example.arrayadaoterspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Spinner drink, temp; //顯示飲品項目與溫度選項的 Spinner
    TextView txv; // 顯示訂單內容的 TextView
    private String[] tempSet1 = {"冰", "去冰", "溫"};
    private String[] tempSet2 = {"冰", "去冰"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = (TextView) findViewById(R.id.order);
        temp = (Spinner) findViewById(R.id.temp); //找出顯示溫度的 Spinner

        drink = (Spinner) findViewById(R.id.drink); //找出顯示飲品項目的 Spinner
        drink.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] tempSet;
                if (position == 3) //若選取檸檬汁
                    tempSet = tempSet2; //溫度選項沒有「溫」
                else
                    tempSet = tempSet1;

                ArrayAdapter<String> tempAd = //依據溫度選項建立 ArrayAdapter
                        new ArrayAdapter<>(MainActivity.this, //**與原例不同**)
                                android.R.layout.simple_spinner_item, // 選單位打開時的顯示樣式
                                tempSet); //溫度選項
                tempAd.setDropDownViewResource( //設定下拉選單的選項樣式
                        android.R.layout.simple_spinner_dropdown_item);
                temp.setAdapter(tempAd); //設定使用 Adapter 物件
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); //設定監聽選取事件

    }
}