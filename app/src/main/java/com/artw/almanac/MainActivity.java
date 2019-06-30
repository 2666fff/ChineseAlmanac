package com.artw.almanac;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView todayText = findViewById(R.id.tv_today);
        luozhuangjiandanxuanri myluozhuangjiandanxuanri = new luozhuangjiandanxuanri();
        final String baziString = myluozhuangjiandanxuanri.getBaziString(Calendar.getInstance());
        luozhuangshierjian myluozhuangshierjian = new luozhuangshierjian(new luozhuangshierjian.On12jianCalculatorListener() {
            @Override
            public void onTextDataGet(String data) {
                todayText.setText(baziString +"\r\n" + data);
            }
        });
        myluozhuangshierjian.test(myluozhuangjiandanxuanri.getbazi(Calendar.getInstance()));

    }
}
