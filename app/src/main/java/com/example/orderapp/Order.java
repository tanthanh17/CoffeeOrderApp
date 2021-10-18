package com.example.orderapp;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Order extends AppCompatActivity {
    Button btnoder;String ten,mk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        ControlButton();
    }

    private void ControlButton(){
        btnoder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnoder.getText().toString().equals(ten) && btnoder.getText().toString().equals(mk))
                {
                    Toast.makeText(Order.this,"Logged in Successfully",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Order.this,MainActivity2.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(Order.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
                }
            }
        });

}}