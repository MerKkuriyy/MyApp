package ru.mirea.ignatenkomm.favoritebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShareActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView textView = findViewById(R.id.textViewBook);
            String book_name = extras.getString(MainActivity.BOOK_NAME_KEY);
            String quotes_name = extras.getString(MainActivity.QUOTES_KEY);
            textView.setText(String.format("Моя любимая книга: %s и цитата: %s",
                    book_name, quotes_name));
        }

        Button btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(v -> {
            EditText editBook = findViewById(R.id.editBook);
            EditText editQuote = findViewById(R.id.editQuote);

            String text = "Название Вашей любимой книги: " + editBook.getText().toString() +
                    ". Цитата: " + editQuote.getText().toString();

            Intent data = new Intent();
            data.putExtra(MainActivity.USER_MESSAGE, text);
            setResult(Activity.RESULT_OK, data);
            finish();
        });
    }
}