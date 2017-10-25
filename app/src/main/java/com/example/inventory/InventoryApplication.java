package com.example.inventory;

import android.app.Application;

import com.example.inventory.pojo.Dependency;

import java.util.ArrayList;

/**
 * Created by usuario on 25/10/17.
 */

public class InventoryApplication extends Application {

    ArrayList<Dependency> dependencies;

    @Override
    public void onCreate() {
        super.onCreate();
        addDependency(new Dependency(1, "1º CF Grado superior", "1CFGS", "Ciclos superiores, primer año, la locura"));
        addDependency(new Dependency(2, "2º CF Grado superior", "2CFGS", "Ciclos superiores, segundo año, la muerte"));
    }

    /**
     * Constructor para inicializar la lista de dependencias
     */
    public InventoryApplication() {
        this.dependencies = new ArrayList<>();
    }

    /**
     * Metodo para agregar Dependencias a la lista
     * @param d
     */
    public void addDependency(Dependency d)
    {
        dependencies.add(d);
    }

    /**
     * Metodo para devolver las dependencias creadas
     * @return Dependencias creadas
     */
    public ArrayList<Dependency> getDependencies()
    {
        return dependencies;
    }
}
