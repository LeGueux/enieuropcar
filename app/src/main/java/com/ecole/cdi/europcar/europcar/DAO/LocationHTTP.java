package com.ecole.cdi.europcar.europcar.DAO;

import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;

import java.util.List;

public class LocationHTTP implements ILocationDAO {
    @Override
    public Utilisateur connexion(String username, String password) {
        return null;
    }

    @Override
    public Utilisateur inscription(Utilisateur user) {
        return null;
    }

    @Override
    public List<Vehicule> getListVehicule() {
        return null;
    }

    @Override
    public Boolean louer(Vehicule vehicule, Utilisateur user) {
        return null;
    }

    @Override
    public Boolean rendre(Vehicule vehicule, Utilisateur user) {
        return null;
    }

    @Override
    public void modifierAgence(Agence agence) {

    }

    @Override
    public void generateAgence() {

    }
}
