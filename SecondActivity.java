package com.example.firstpr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получаем данные из намерения
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        int age = intent.getIntExtra("AGE", 0);

        // Отображаем данные
        TextView textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText("Hello, " + name + "! You are " + age + " years old.");
    }
}
