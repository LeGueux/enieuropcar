package com.ecole.cdi.europcar.europcar.DAO;

import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Entity.Reservation;
import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LocationBouchon implements ILocationDAO {

    private List<Vehicule> vehicules;

    public LocationBouchon() {
        this.vehicules = new ArrayList<>();
    }

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

    @Override
    public Vehicule getVehiculeById(int id) {
        for (Vehicule v : this.vehicules) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    @Override
    public List<Reservation> getListReservation(){

        List<Reservation> reservations = new ArrayList<Reservation>();
        List<Vehicule> v = getListVehicule();

        Agence agence= new Agence(1, "test", "123456", "voie test", "14000", "Caen");

        for(int i =0; i < v.size();i++){

           SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date dateDebut = new Date(System.currentTimeMillis());

            long debut = dateDebut.getTime();

            reservations.add(new Reservation(1,v.get(i),agence,debut,0,
                    10.0F,true));
        }



        return reservations;
    }
}
