package es.unican.ss.Practica3.estimacionesTUS;

import com.sun.xml.wss.impl.callback.PasswordValidationCallback;

public class PlainTextPasswordValidator implements PasswordValidationCallback.PasswordValidator {
    PasswordValidationCallback.PlainTextPasswordRequest plainTextPasswordRequest = null;
    public boolean validate(PasswordValidationCallback.Request request) throws
            PasswordValidationCallback.PasswordValidationException {
        plainTextPasswordRequest = (PasswordValidationCallback.PlainTextPasswordRequest) request;
        System.out.println("Voy a validar");
// here actually we can integrate with database or LDAP server for authentication
        if(plainTextPasswordRequest.getUsername().equals("patri") &&
                plainTextPasswordRequest.getPassword().equals("patri")) {
            return true;
        }
        return false;
    }
}
}