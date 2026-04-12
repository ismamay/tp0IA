package ht.ueh.mbds.tp0_ismael_romelus.service;


import jakarta.enterprise.context.Dependent;

import java.io.Serializable;

@Dependent
public class Modificateur implements Serializable {

    private static final long serialVersionUID = 1L;

    public String modifier(String question, String role) {

        String result = "|| " + question.toUpperCase() + " ||";

        if (role != null) {
            result = role.toUpperCase() + "\n" + result;
        }

        return result;
    }
}
