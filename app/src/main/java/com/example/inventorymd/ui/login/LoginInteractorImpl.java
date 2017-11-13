package com.example.inventorymd.ui.login;

import android.text.TextUtils;

import com.example.inventorymd.db.repo.UserRepository;
import com.example.inventorymd.utils.CommonUtils;

/**
 * Created by usuario on 10/11/17.
 */

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void validateCredentials(String u, String p, LoginInteractor.OnLoginFinishedListener listener)
    {
        // Realiza comprobaciones

        if (TextUtils.isEmpty(u))
            listener.onUserEmptyError();
        else if (TextUtils.isEmpty(p))
            listener.onPasswordEmptyError();
        else if (!CommonUtils.isPasswordValid(p))
            listener.onPasswordLengthError();
        else if (!UserRepository.getInstance().userExists(u, p))
            listener.onUserNotExists();
        else
            listener.onSucess();
        // Es correcto
    }

}
