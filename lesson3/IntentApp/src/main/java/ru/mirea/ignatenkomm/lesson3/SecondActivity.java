package ru.mirea.ignatenkomm.lesson3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String time = intent.getStringExtra("current_time");
        String groupNum = intent.getStringExtra("group_number");

        TextView textView = findViewById(R.id.textView);
        // Предположим, номер по списку = 5, тогда квадрат = 25
        int square = Integer.parseInt(groupNum) * Integer.parseInt(groupNum);

        String result = "КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ " +
                square + ", а текущее время " + time;
        textView.setText(result);
    }
}