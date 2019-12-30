package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent=getIntent();
        String message = intent.getStringExtra("mon message");
        EditText text=findViewById(R.id.text_input);
        text.setText(message);
    }

    public void sendMessage(View view){
        Intent intent =new Intent(this,MainActivity.class);
        EditText text=(EditText) findViewById(R.id.text_input);
        String message = text.getText().toString();
        intent.putExtra("mon message",message);
        startActivity(intent);
    }
}
