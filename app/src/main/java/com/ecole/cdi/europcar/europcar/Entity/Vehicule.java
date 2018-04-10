package com.ecole.cdi.europcar.europcar.Entity;

public class Vehicule {

    private int id;
    private int nbPlaces;
    private int locationMin;
    private int locationMax;
    private String modele;
    private float tarifMin;
    private float tarifMax;
    private float tarifMoyen;
    private boolean isDisponible;

    public Vehicule() {
    }

    public Vehicule(int id, int nbPlaces, int locationMin, int locationMax, String modele, float tarifMin, float tarifMax, float tarifMoyen, boolean isDisponible) {
        this.id = id;
        this.nbPlaces = nbPlaces;
        this.locationMin = locationMin;
        this.locationMax = locationMax;
        this.modele = modele;
        this.tarifMin = tarifMin;
        this.tarifMax = tarifMax;
        this.tarifMoyen = tarifMoyen;
        this.isDisponible = isDisponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getLocationMin() {
        return locationMin;
    }

    public void setLocationMin(int locationMin) {
        this.locationMin = locationMin;
    }

    public int getLocationMax() {
        return locationMax;
    }

    public void setLocationMax(int locationMax) {
        this.locationMax = locationMax;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public float getTarifMin() {
        return tarifMin;
    }

    public void setTarifMin(float tarifMin) {
        this.tarifMin = tarifMin;
    }

    public float getTarifMax() {
        return tarifMax;
    }

    public void setTarifMax(float tarifMax) {
        this.tarifMax = tarifMax;
    }

    public float getTarifMoyen() {
        return tarifMoyen;
    }

    public void setTarifMoyen(float tarifMoyen) {
        this.tarifMoyen = tarifMoyen;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }
}
