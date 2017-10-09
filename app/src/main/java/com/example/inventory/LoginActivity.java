package com.example.inventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *  Activity de Login con diversas redes sociales. Conceptos aprendidos: estilos, dimensiones en XML, localización, 
 *
 *
 *  @author Elena G (Beelzenef)
 */
public class LoginActivity extends AppCompatActivity {

    private Button btn_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_Login = (Button)findViewById(R.id.btn_SignIn);
    }

    public void onClick_Dashboard(View v) {
        switch (v.getId()) {
            case R.id.btn_SignIn:
                abrirDashboard();
                break;
        }
    }

    private void abrirDashboard()
    {
        Intent unIntent = new Intent(LoginActivity.this, DashboardActivity.class);
        startActivity(unIntent);
    }
}
