package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        String message = intent.getStringExtra("mon message");
        TextView text=findViewById(R.id.text_view);
        if(message!=null) {
            text.setText(message);
        }
    }

    public void sendMessage(View view){
        Intent intent =new Intent(this,DisplayActivity.class);
        TextView text=(TextView) findViewById(R.id.text_view);
        String message = text.getText().toString();
        intent.putExtra("mon message",message);
        startActivity(intent);
    }
}
