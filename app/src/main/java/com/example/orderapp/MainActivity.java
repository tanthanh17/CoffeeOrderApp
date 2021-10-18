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

public class MainActivity extends AppCompatActivity {

    Button btndangnhap,btndangky;
    EditText edtendangnhap, edpassword;
    String ten,mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login();
        ControlButton();
    }


    private void Login(){
        edtendangnhap = (EditText)findViewById(R.id.edtendangnhap);
        edpassword = (EditText)findViewById(R.id.edpassword);
        btndangnhap = (Button)findViewById(R.id.btndangnhap);
        btndangky = (Button)findViewById(R.id.btndangky);
    }

    private void ControlButton(){
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtendangnhap.getText().toString().equals(ten) && edpassword.getText().toString().equals(mk))
                {
                    Toast.makeText(MainActivity.this,"Logged in Successfully",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
                }
            }
        });



        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setTitle("Đăng ký tài khỏan");
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.dangky);
                EditText edtk = (EditText)dialog.findViewById(R.id.edtk);
                EditText edmk = (EditText)dialog.findViewById(R.id.edmk);
                Button btnhuy = (Button)dialog.findViewById(R.id.btnhuy);
                Button btntao = (Button)dialog.findViewById(R.id.btntao);
                btntao.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ten = edtk.getText().toString().trim();
                        mk = edmk.getText().toString().trim();

                        edtendangnhap.setText(ten);
                        edpassword.setText(mk);

                        dialog.cancel();

                    }
                });

                btnhuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });

    }

}
