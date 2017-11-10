package com.example.inventorymd.ui.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.inventorymd.DashboardActivity;
import com.example.inventorymd.R;

/**
 *  Activity de Login con diversas redes sociales. Dirige al Dashboard
 *
 *  @author Elena G (Beelzenef)
 */
public class LoginViewImpl extends AppCompatActivity {

    private Button btn_SignIn;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_SignIn = (Button) findViewById(R.id.btn_SignIn);
        btn_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.validateCredentials("user", "passw");
                /*
                Intent unIntent = new Intent(LoginViewImpl.this, DashboardActivity.class);
                startActivity(unIntent);
                */
            }
        });
    }
}
