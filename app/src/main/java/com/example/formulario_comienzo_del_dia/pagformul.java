package com.example.formulario_comienzo_del_dia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pagformul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagformul);

    }
    public void PT1 (View v){
        Intent inte2 = new Intent(this, MainActivity.class);
        startActivity(inte2);
    }


    public void PT3 (View V){
        Intent inte3 = new Intent(this, resultado.class);
        startActivity(inte3);

    }
}