package com.ecole.cdi.europcar.europcar.DAO;

import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Entity.Reservation;
import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;

import java.util.List;

public interface ILocationDAO {
    public Utilisateur connexion(String username, String password);

    public Utilisateur inscription(Utilisateur user);

    public List<Vehicule> getListVehicule();

    public Boolean louer(Vehicule vehicule, Utilisateur user);

    public Boolean rendre(Vehicule vehicule, Utilisateur user);

    public Agence modifierAgence(Agence agence);

    public void generateAgence();

    public List<Reservation> getListReservation();

    public Vehicule getVehiculeById(int id);

    public Reservation reservation(Reservation r);
}
