package com.ecole.cdi.europcar.europcar.Service;

import com.ecole.cdi.europcar.europcar.DAO.ILocationDAO;
import com.ecole.cdi.europcar.europcar.DAO.LocationBouchon;
import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Entity.Reservation;
import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;

import java.util.List;

public class LocationService {
    private static final LocationService ourInstance = new LocationService();
    private ILocationDAO dao = new LocationBouchon();

    public static LocationService getInstance() {
        return ourInstance;
    }

    private LocationService() {
    }

    public Utilisateur connexion(String username, String password) {
        Utilisateur user =  dao.connexion(username,password);

        return user;
    }

    public Utilisateur inscription(Utilisateur user) {
        return user;
    }

    public List<Reservation> getListeReservation() {
        return dao.getListReservation();
    }

    public List<Vehicule> getListVehicule() {
        return dao.getListVehicule();
    }

    public Boolean louer(Vehicule vehicule, Utilisateur user) {
        return true;
    }

    public Boolean rendre(Vehicule vehicule, Utilisateur user) {
        return true;
    }

    public Agence modifierAgence(Agence agence) {

        return dao.modifierAgence(agence);
    }

    public void generateAgence() {

    }

    public Vehicule getVehiculeById(int id) {
        return dao.getVehiculeById(id);
    }
}
