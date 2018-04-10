package com.ecole.cdi.europcar.europcar.Entity;

/**
 * Created by Administrateur on 09/04/2018.
 */

public class Utilisateur {

    private long id;
    private String login;
    private String password;
    private String email;
    private Agence agenceId;

    public Utilisateur() {
    }

    public Utilisateur(long id, String login, String password, String email) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Agence getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(Agence agenceId) {
        this.agenceId = agenceId;
    }
}
