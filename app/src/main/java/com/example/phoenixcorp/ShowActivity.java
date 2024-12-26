package com.example.phoenixcorp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);
        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            String text = arguments.getString("example");
            TextView textView = findViewById(R.id.textViewShow);
            textView.setText(text);
        }
    }
}