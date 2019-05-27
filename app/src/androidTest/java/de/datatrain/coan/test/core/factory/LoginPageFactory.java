package de.datatrain.coan.test.core.factory;

import android.support.annotation.NonNull;

import de.datatrain.coan.test.core.AbstractLoginPage;
import de.datatrain.coan.test.pages.LoginPage;

import static de.datatrain.coan.test.core.Constants.APPLICATION_AUTH_TYPE;

public class LoginPageFactory {

    @NonNull
    public static AbstractLoginPage getLoginPage() {

        switch (APPLICATION_AUTH_TYPE) {
            case BASIC:
                return new LoginPage.BasicAuthPage();
            case OAUTH:
                return new LoginPage.WebviewPage();
            case SAML:
                return new LoginPage.WebviewPage();
            case NOAUTH:
                return new LoginPage.NoAuthPage();
            default:
                return new LoginPage.NoAuthPage();
        }
    }
}
