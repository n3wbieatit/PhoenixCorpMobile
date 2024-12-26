package com.example.phoenixcorp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice_activity);
    }

    public void showInfo(View view) {
        String text = "ОТКРЫТА БАЗА ДАННЫХ:" +
                "\n*****************************************\n" +
                "ЗАПИСЬ №1\n" +
                "ID: 638702968\n" +
                "НАЗВАНИЕ ПОДРАЗДЕЛЕНИЯ: Северное\n" +
                "ГОД: 2021\n" +
                "МЕСЯЦ: 1\n" +
                "ДОХОД: 10000\n" +
                "-----------------------------------------------------\n" +
                "ЗАПИСЬ №2\n" +
                "ID: 638702968\n" +
                "НАЗВАНИЕ ПОДРАЗДЕЛЕНИЯ: Северное\n" +
                "ГОД: 2020\n" +
                "МЕСЯЦ: 1\n" +
                "ДОХОД: 5000\n" +
                "-----------------------------------------------------\n" +
                "ЗАПИСЬ №3\n" +
                "ID: 638702969\n" +
                "НАЗВАНИЕ ПОДРАЗДЕЛЕНИЯ: Южное\n" +
                "ГОД: 2022\n" +
                "МЕСЯЦ: 5\n" +
                "ДОХОД: 5000\n" +
                "-----------------------------------------------------\n" +
                "ЗАПИСЬ №4\n" +
                "ID: 638702969\n" +
                "НАЗВАНИЕ ПОДРАЗДЕЛЕНИЯ: Южное\n" +
                "ГОД: 2023\n" +
                "МЕСЯЦ: 1\n" +
                "ДОХОД: 10000\n" +
                "-----------------------------------------------------\n";

        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra("example", text);
        startActivity(intent);
    }

    public void doEx1(View view) {
        String text = "Самые прибыльные годы подразделений:\n" +
                "------------------------------------------------\n" +
                "Северное: 2021 (Доход: 10000)\n" +
                "Южное: 2023 (Доход: 10000)\n";
        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra("example", text);
        startActivity(intent);
    }

    public void doEx2(View view) {
        String text = "Средний доход всей фирмы за 5 лет = 500\n" +
                "-----------------------------------------------\n" +
                "Северное: 1.2020 - 12.2024 (средний доход: 250)\n" +
                "Южное: 1.2020 - 12.2024 (средний доход: 250)\n";
        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra("example", text);
        startActivity(intent);
    }

    public void doEx3(View view) {
        String text = "Самые не прибыльные годы подразделений:\n" +
                "----------------------------------------------\n" +
                "Северное: 2020 (Доход: 5000)\n" +
                "Южное: 2022 (Доход: 5000)\n";
        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra("example", text);
        startActivity(intent);
    }
}