package com.varkashy.webservices.advanced.sumws.security;


import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * This class returns the password information to wss4j interceptor
 * to validate the password provided by the user
 */
public class PasswordCallbackHandler implements CallbackHandler {
    private final Map<String,String> passwords=new HashMap<>();
    public PasswordCallbackHandler(){
        passwords.put("sumusr","pass123");
    }
    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (Callback callback:callbacks) {
            WSPasswordCallback pc = (WSPasswordCallback) callback;
            String pass = passwords.get(pc.getIdentifier());
            return ;
        }
    }
}
