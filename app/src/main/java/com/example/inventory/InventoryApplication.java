package com.example.inventory;

import android.app.Application;

import com.example.inventory.pojo.Dependency;
import com.example.inventory.repo.DependencyRepository;

import java.util.ArrayList;

/**
 *
 * @author Elena G (Beelzenef)
 */

public class InventoryApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public InventoryApplication() {

    }
}
