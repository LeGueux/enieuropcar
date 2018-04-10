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
        vehicules.add(new Vehicule(1, 5, 1, 9, "Renault clio", 3.3f, 99.9f, 50, true));
        vehicules.add(new Vehicule(2, 5, 1, 9, "Peugeot 3008", 3.3f, 99.9f, 50, true));
        vehicules.add(new Vehicule(3, 2, 1, 9, "Ferrari F430", 3.3f, 99.9f, 50, true));
        vehicules.add(new Vehicule(4, 2, 1, 9, "Audi TT RS", 3.3f, 99.9f, 50, true));

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
