package com.example.app_ptrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlunosCAD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alunos_cad);
    }

    public void chamarAlunosADDActivity(View view) {
        Intent intent = new Intent(this,AlunosADDActivity.class);
        startActivity(intent);
    }
}