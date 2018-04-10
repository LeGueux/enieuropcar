package com.ecole.cdi.europcar.europcar.DAO;

import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;

import java.util.List;

/**
 * Created by Administrateur on 09/04/2018.
 */

public class LocationSQL implements ILocationDAO {
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
    public Agence modifierAgence(Agence agence) {

        return agence;
    }

    @Override
    public void generateAgence() {

    }

    @Override
    public Vehicule getVehiculeById(int id) {
        return null;
    }
}
