package com.example.valentine.hell_wolrd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;
    private EditText mNameEditText;
    private Button mCrowsCounterButton;
    private int mCount = 0;
    private TextView mInfoTextView;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton = findViewById(R.id.button_counter);
        mHelloTextView = findViewById(R.id.textHello);
        mNameEditText = findViewById(R.id.nameText);
        mInfoTextView = findViewById(R.id.textHello);

        mCrowsCounterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mHelloTextView.setText("Я насчитал "+ ++mCount+ " мышей");
            }
        });



         }

    public void onClick(View view) {
        if (mNameEditText.getText().length() == 0) {
            mInfoTextView.setText("Hello Batty!");
        } else {


            mInfoTextView.setText("Hello " + mNameEditText.getText());
        }
    }
}
