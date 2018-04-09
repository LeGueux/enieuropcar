package com.ecole.cdi.europcar.europcar.DAO;

import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class LocationBouchon implements ILocationDAO {



    @Override
    public Utilisateur connexion(String username, String password) {
        return new Utilisateur();
    }

    @Override
    public Utilisateur inscription(Utilisateur user) {
        return new Utilisateur();
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
    public void modifierAgence(Agence agence) {

    }

    @Override
    public void generateAgence() {

    }
}
