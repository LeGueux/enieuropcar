package com.ecole.cdi.europcar.europcar.DAO;

import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class LocationBouchon implements ILocationDAO {

    @Override
    public Utilisateur connexion(String username, String password) {

        Utilisateur user = new Utilisateur(1,"bourdel","azerty","theo.bourdel@gmail.com");

        return user;
    }

    @Override
    public Utilisateur inscription(Utilisateur user) {

        return user;
    }

    @Override
    public List<Vehicule> getListVehicule() {
        List<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(new Vehicule());
        vehicules.add(new Vehicule());
        vehicules.add(new Vehicule());
        vehicules.add(new Vehicule());

        return vehicules;
    }

    @Override
    public Boolean louer(Vehicule vehicule, Utilisateur user) {
        return true;
    }

    @Override
    public Boolean rendre(Vehicule vehicule, Utilisateur user) {
        return true;
    }

    @Override
    public Agence modifierAgence(Agence agence) {

        return agence;

    }

    @Override
    public void generateAgence() {

    }
}
