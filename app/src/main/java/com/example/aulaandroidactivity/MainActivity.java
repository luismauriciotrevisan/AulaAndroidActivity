package com.example.aulaandroidactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_1, et_2;
    TextView tv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_1 = (EditText) findViewById(R.id.et_01);
        et_2 = (EditText) findViewById(R.id.et_02);
        tv_1 = (TextView) findViewById(R.id.tv_01);
    }

    public void HandleButtonClick(View view){
        tv_1.setText(et_1.getText().toString());
        tv_1.append("\n");
        tv_1.append(et_2.getText().toString());
    }
}
