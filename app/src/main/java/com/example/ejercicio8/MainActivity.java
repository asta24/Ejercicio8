package com.example.ejercicio8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private ListView lv1;
    private String nombres [] = {"Carmen", "Juan", "Pedro", "Paco", "Antuan", "María", "Alejandro", "Alfonso", "Gonzalo", "Carlos"};
    private String edades [] = {"23", "30", "18", "44", "24", "83", "89", "38", "68", "12"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        lv1 = (ListView) findViewById(R.id.lv1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_rcorp, nombres);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                tv1.setText("La edad de " + lv1.getItemAtPosition(position) + " es " + edades[position] + " años ");

            }
        });
    }
}