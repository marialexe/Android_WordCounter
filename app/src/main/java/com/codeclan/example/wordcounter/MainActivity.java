package com.codeclan.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inserttext;
    private Button wordcounter;
    private TextView result;
    private WordCounter output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inserttext = (EditText) findViewById(R.id.editxt_input);
        wordcounter = (Button) findViewById(R.id.counter_button);
        result = (TextView) findViewById(R.id.txtview_answer);
    }

    public void onButtonBeingClicked(View button) {

        String input = inserttext.getText().toString();

        WordCounter wordcount = new WordCounter();
        int output = wordcount.wordCounter(input);

        Intent intent = new Intent(this, WordCountActivity.class);
        intent.putExtra("counter",output);
        startActivity(intent);


    }
}
