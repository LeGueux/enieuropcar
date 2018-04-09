package com.ecole.cdi.europcar.europcar.Service;

import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;

import java.util.List;

public class LocationService {
    private static final LocationService ourInstance = new LocationService();

    public static LocationService getInstance() {
        return ourInstance;
    }

    private LocationService() {
    }

    public Utilisateur connexion(String username, String password) {
        return null;
    }

    public Utilisateur inscription(Utilisateur user) {
        return null;
    }

    public List<Vehicule> getListVehicule() {
        return null;
    }

    public Boolean louer(Vehicule vehicule, Utilisateur user) {
        return true;
    }

    public Boolean rendre(Vehicule vehicule, Utilisateur user) {
        return true;
    }

    public void modifierAgence(Agence agence) {

    }

    public void generateAgence() {

    }
}
