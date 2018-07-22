package com.example.hp.foodopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CtgresActivity extends AppCompatActivity {

    Button  btnHandi,btnMeridian,btnGreedy,btnCube,btnBonanaza,btnWhiteRabbit,btnPeninsula,btnErrante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctgres);

        btnHandi=findViewById(R.id.btn_handi);
        btnMeridian=findViewById(R.id.btn_meridian);
        btnGreedy=findViewById(R.id.btn_greedy);
        btnCube=findViewById(R.id.btn_cube);
        btnBonanaza=findViewById(R.id.btn_bonanza);
        btnWhiteRabbit=findViewById(R.id.btn_white_rabbit);
        btnPeninsula=findViewById(R.id.btn_peninsula);
        btnErrante=findViewById(R.id.btn_errante);

        btnHandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CtgresActivity.this,DetailsActivity.class);
                intent.putExtra("res_name","one");
                Toast.makeText(CtgresActivity.this,"Handi Restuarant", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnMeridian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CtgresActivity.this,DetailsActivity.class);
                intent.putExtra("res_name","two");
                Toast.makeText(CtgresActivity.this,"Meridian", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnGreedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CtgresActivity.this,DetailsActivity.class);
                intent.putExtra("res_name","three");
                Toast.makeText(CtgresActivity.this,"Greedy Guts", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CtgresActivity.this,DetailsActivity.class);
                intent.putExtra("res_name","four");
                Toast.makeText(CtgresActivity.this,"Cube", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnBonanaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CtgresActivity.this,DetailsActivity.class);
                intent.putExtra("res_name","five");
                Toast.makeText(CtgresActivity.this,"Bonanza", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnWhiteRabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CtgresActivity.this,DetailsActivity.class);
                intent.putExtra("res_name","six");
                Toast.makeText(CtgresActivity.this,"White Rabbit", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnPeninsula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CtgresActivity.this,DetailsActivity.class);
                intent.putExtra("res_name","seven");
                Toast.makeText(CtgresActivity.this,"Peninsula", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnErrante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CtgresActivity.this,DetailsActivity.class);
                intent.putExtra("res_name","eight");
                Toast.makeText(CtgresActivity.this,"Errante", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
}
