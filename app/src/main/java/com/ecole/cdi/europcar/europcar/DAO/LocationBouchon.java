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
        vehicules.add(new Vehicule(1, "Renault", "Clio", "AA-000-BB"));
        vehicules.add(new Vehicule(2, "Peugeot", "3008", "BB-111-AA"));
        vehicules.add(new Vehicule(3, "Porsche", "Cayenne", "FF-897-FG"));
        vehicules.add(new Vehicule(4, "Ferrari", "F430", "HH-564-YU"));
        vehicules.add(new Vehicule(5, "BMW", "X6", "ZZ-444-ZZ"));
        vehicules.add(new Vehicule(6, "Audi", "TT RS", "HH-232-YY"));

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
