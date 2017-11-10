package com.example.inventorymd.ui.login;

/**
 * Created by usuario on 10/11/17.
 */

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void validateCredentials(String u, String p, LoginInteractor.OnLoginFinishedListener listener)
    {
        // Realiza comprobaciones

        listener.onPasswordEmptyError();
        listener.onPasswordLengthError();
        listener.onUserEmptyError();
        // Es correcto
    }

}
