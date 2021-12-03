package com.example.parcialdam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button botonGet;
    Button botonCommit;
    EditText texto;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto= findViewById(R.id.text);
        botonGet= findViewById(R.id.boton_get);
        botonCommit= findViewById(R.id.boton_commit);
        spinner= findViewById(R.id.sp);
        spinner.setAdapter(ArrayAdapter.createFromResource(this,R.array.values_spinner, android.R.layout.simple_spinner_item));
        botonGet.setOnClickListener(view -> {
            //codigo a ejecutar
            Toast.makeText(MainActivity.this,"Boton Get apretado "+MainActivity.this.spinner.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
        });
        botonCommit.setOnClickListener(view -> {
            //codigo a ejecutar
            Toast.makeText(MainActivity.this,"Boton Commit apretado "+MainActivity.this.spinner.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
        });
    }
}