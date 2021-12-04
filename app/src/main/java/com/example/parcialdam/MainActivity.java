package com.example.parcialdam;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    Button botonGet;
    Button botonCommit;
    EditText texto;
    Spinner spinner;
    //Repositorio rep;
    ListView lista;
    ArrayAdapter<String> adaptador;
    ArrayList<String> strings;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto= findViewById(R.id.text);
        botonGet= findViewById(R.id.boton_get);
        botonCommit= findViewById(R.id.boton_commit);
        spinner= findViewById(R.id.sp);
        spinner.setAdapter(ArrayAdapter.createFromResource(this,R.array.values_spinner, android.R.layout.simple_spinner_item));
        strings= new ArrayList<String>();

        //La lista se deberia hacer con un recycler para que consuma menos recursos en vez de este adapter
        lista=findViewById(R.id.lista);
        adaptador=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strings);
        lista.setAdapter(adaptador);

        //Se crashea cuando intento usar el repositorio, lo tengo comentado a las lineas que lo usan
        //rep=Repositorio.getInstance(this);

        botonGet.setOnClickListener(view -> {
            //Consulta a la base de datos, no deberia hacerse en la primary thread, se deberia ejecutar en un thread secundario
            //List<Entidad> resultado=MainActivity.this.rep.getEntidades(texto.getText().toString());

            //Funcion para agregar los resultados de la consulta a la ListView
            //adaptador.addAll(resultado.stream().map(e->e.toString()).collect(Collectors.toList()));

            Toast.makeText(MainActivity.this,"Boton Get apretado "+spinner.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
        });
        botonCommit.setOnClickListener(view -> {

            //Inserta a la base de datos una nueva entidad con la descripcion ingresada, no deberia hacerse en la main thread
            //MainActivity.this.rep.insertEntidad(new Entidad(texto.getText().toString()));

            //Funcion stub para mostrar que se inserta el item seleccionado en el spinner a la listview
            adaptador.add(spinner.getSelectedItem().toString());

            Toast.makeText(MainActivity.this,"Boton Commit apretado "+spinner.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
        });
    }
}