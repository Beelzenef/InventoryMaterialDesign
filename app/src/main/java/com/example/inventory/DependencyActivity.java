package com.example.inventory;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.inventory.adapter.DependencyAdapter;
import com.example.inventory.pojo.Dependency;
import com.example.inventory.repo.DependencyRepository;

/**
 * Clase para gestionar las adapter en una lista
 * @author Elena G (Beelzenef)
 */
public class DependencyActivity extends ListActivity {

    private ArrayAdapter<Dependency> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency);

        // Caso 1, adapter no personalizado
        // Agregando lista de adapter con InventoryApplication, que contiene el array de Dependencias
        // Estamos mezclando Application con Dependency, MALA SOLUCION, vía rápida pero mala
        adapter = new ArrayAdapter<Dependency>(this, android.R.layout.simple_list_item_1,
                DependencyRepository.getInstance().getDependencies());

        // Caso 2 A, adapter personalizado
        adapter = new DependencyAdapter(this);
        getListView().setAdapter(adapter);
    }
}
