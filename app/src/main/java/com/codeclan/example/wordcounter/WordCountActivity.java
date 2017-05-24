package com.codeclan.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        result = (TextView) findViewById(R.id.txtview_answer);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String counter = extras.getString("counter");

        result.setText(counter);
    }
}
