package com.ecole.cdi.europcar.europcar.Entity;

/**
 * Created by Administrateur on 10/04/2018.
 */

public class Reservation {

    private long id;
    private Vehicule vehiculeId;
    private Agence agenceId;
    private long dateDebut;
    private long dateFin;
    private float tarifJournalier;
    private boolean isEnCours;

    public Reservation() {
    }

    public Reservation(long id, Vehicule vehiculeId, Agence agenceId, long dateDebut, long dateFin, float tarifJournalier,
                       boolean isEnCours) {
        this.id = id;
        this.vehiculeId = vehiculeId;
        this.agenceId = agenceId;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.tarifJournalier = tarifJournalier;
        this.isEnCours = isEnCours;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Vehicule getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(Vehicule vehiculeId) {
        this.vehiculeId = vehiculeId;
    }

    public Agence getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(Agence agenceId) {
        this.agenceId = agenceId;
    }

    public long getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(long dateDebut) {
        this.dateDebut = dateDebut;
    }

    public long getDateFin() {
        return dateFin;
    }

    public void setDateFin(long dateFin) {
        this.dateFin = dateFin;
    }

    public float getTarifJournalier() {
        return tarifJournalier;
    }

    public void setTarifJournalier(float tarifJournalier) {
        this.tarifJournalier = tarifJournalier;
    }

    public boolean isEnCours() {
        return isEnCours;
    }

    public void setEnCours(boolean enCours) {
        isEnCours = enCours;
    }
}
