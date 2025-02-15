package com.example.helloworldactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private final static String TAG = "MainActivity";
    private TextView mTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.text_view);
        Button showButton = (Button)findViewById(R.id.button);
        showButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mTextView.setText(R.string.hello_world);
            }
        });
    }
}
