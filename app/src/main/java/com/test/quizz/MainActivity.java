package com.test.quizz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopic ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.statbar));

        final LinearLayout mova = findViewById(R.id.movaLayout);
        final LinearLayout history = findViewById(R.id.historyLayout);
        final LinearLayout english = findViewById(R.id.englLayout);
        final LinearLayout match = findViewById(R.id.matchLayout);

        final Button startquizzbtn = findViewById(R.id.startquizzbtn);

        mova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic ="Українська мова";
                mova.setBackgroundResource(R.drawable.selectedroundwhitest10);

                history.setBackgroundResource(R.drawable.round_backg_white10);
                english.setBackgroundResource(R.drawable.round_backg_white10);
                match.setBackgroundResource(R.drawable.round_backg_white10);


            }

        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic ="Історія";
                history.setBackgroundResource(R.drawable.selectedroundwhitest10);

                match.setBackgroundResource(R.drawable.round_backg_white10);
                mova.setBackgroundResource(R.drawable.round_backg_white10);
                match.setBackgroundResource(R.drawable.round_backg_white10);

            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic ="Англійська мова";
                english.setBackgroundResource(R.drawable.selectedroundwhitest10);

                history.setBackgroundResource(R.drawable.round_backg_white10);
                mova.setBackgroundResource(R.drawable.round_backg_white10);
                match.setBackgroundResource(R.drawable.round_backg_white10);

            }
        });

        match.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic ="Математика";
                match.setBackgroundResource(R.drawable.selectedroundwhitest10);

                history.setBackgroundResource(R.drawable.round_backg_white10);
                english.setBackgroundResource(R.drawable.round_backg_white10);
                mova.setBackgroundResource(R.drawable.round_backg_white10);

            }
        });

        startquizzbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (selectedTopic.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Оберiть тест", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(MainActivity.this, QuizzActivity.class);
                    intent.putExtra("selectedTopic",selectedTopic);
                    startActivity(intent);
                    finish();

                }

                }
        });

    }
}