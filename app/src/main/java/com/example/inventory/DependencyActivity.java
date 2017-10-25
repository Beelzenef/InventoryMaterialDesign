package com.example.inventory;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import com.example.inventory.pojo.Dependency;

/**
 * Clase para gestionar las dependencias en una lista
 * @author Elena G (Beelzenef)
 */
public class DependencyActivity extends ListActivity {

    private ArrayAdapter<Dependency> dependencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency);

        // Agregando lista de dependencias con InventoryApplication, que contiene el array de Dependencias
        // Estamos mezclando Application con Dependency, MALA SOLUCION, vía rápida pero mala
        dependencias = new ArrayAdapter<Dependency>(this, android.R.layout.simple_list_item_1, ((InventoryApplication) getApplicationContext()).getDependencies());
        getListView().setAdapter(dependencias);
    }
}
