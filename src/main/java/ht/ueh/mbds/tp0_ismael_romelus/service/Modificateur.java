package ht.ueh.mbds.tp0_ismael_romelus.service;


import jakarta.enterprise.context.Dependent;

import java.io.Serializable;

@Dependent
public class Modificateur implements Serializable {

    private static final long serialVersionUID = 1L;

    public String modifier(String question, String role) {

        String base = "|| " + question.toUpperCase() + " ||";

        String type;

        if (question.trim().endsWith("?")) {
            type = "on dirait que vous avez posé une question. mais je ne peux pas repondre pour l'instant. je suis en construction... ";
        } else if (question.trim().endsWith("!")) {
            type = "Ceci semble être une exclamation";
        } else {
            type = "Ceci semble être une phrase normale";
        }

        String resultat = base + "\n" + type;

        // Ajouter le rôle seulement pour la première question
        if (role != null) {
            resultat = role.toUpperCase() + "\n" + resultat;
        }

        return resultat;
    }
}
