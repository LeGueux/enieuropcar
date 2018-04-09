package com.ecole.cdi.europcar.europcar.DAO;

import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class LocationBouchon implements ILocationDAO {

    private List<Vehicule> vehicules = new ArrayList<>();

    public LocationBouchon() {
        this.vehicules = this.generateVehicules();
    }

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
        return this.vehicules;
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

    private List<Vehicule> generateVehicules() {
        vehicules.add(new Vehicule(1, "Renault", "Clio", "AA-000-AA"));
        vehicules.add(new Vehicule(2, "Peugeot", "3008", "BB-111-BB"));
        vehicules.add(new Vehicule(3, "Ferrari", "F430", "CC-222-CC"));
        vehicules.add(new Vehicule(4, "Porsche", "Panamera", "DD-333-DD"));
        return vehicules;
    }
}
