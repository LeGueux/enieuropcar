package com.ecole.cdi.europcar.europcar.Entity;

/**
 * Created by Administrateur on 09/04/2018.
 */

public class Agence {

    private long id;
    private String raison;
    private String siret;
    private String voie;
    private String cp;
    private String ville;

    public Agence(long id, String raison, String siret, String voie, String cp, String ville) {
        this.id = id;
        this.raison = raison;
        this.siret = siret;
        this.voie = voie;
        this.cp = cp;
        this.ville = ville;
    }

    public Agence() {
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
