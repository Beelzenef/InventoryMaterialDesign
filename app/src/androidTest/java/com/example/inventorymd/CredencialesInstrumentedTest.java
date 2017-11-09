package com.example.inventorymd;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class CredencialesInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.loginlinearlayout", appContext.getPackageName());
    }


    // 1. Usuario introduce username (prueba instrumental, sobre GUI)
    @Test
    public void isUserEmpty() throws Exception {

    }

    // Usuario introduce email (prueba instrumental, sobre GUI)
    @Test
    public void isEmailEmpty() throws Exception {

    }

    // Usuario introduce passw (prueba instrumental, sobre GUI)
    @Test
    public void isPasswordEmpty() throws Exception {

    }

    // Passwd al menos con 6 chars (prueba instrumental, sobre GUI)
    @Test
    public void passwordLenght_isCorrect() throws Exception {

    }

    // Doble comprobacion de contraseña (prueba instrumental, sobre GUI)
    @Test
    public void passwordDoubleCheck() throws Exception
    {

    }
}
