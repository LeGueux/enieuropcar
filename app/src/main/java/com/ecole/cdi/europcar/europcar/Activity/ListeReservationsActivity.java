package com.ecole.cdi.europcar.europcar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ecole.cdi.europcar.europcar.Entity.Reservation;
import com.ecole.cdi.europcar.europcar.Fragment.ListeReservationFragment;
import com.ecole.cdi.europcar.europcar.Fragment.ListeVehiculeFragment;
import com.ecole.cdi.europcar.europcar.R;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

import java.util.ArrayList;
import java.util.List;

public class ListeReservationsActivity extends AppCompatActivity
        implements ListeReservationFragment.OnClickReservationListener{

    private ListeReservationFragment fragment;
    private List<Reservation> reservations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_reservations);
    }

    @Override
    protected void onResume() {
        super.onResume();
        fragment = (ListeReservationFragment) getSupportFragmentManager().findFragmentById(R.id.fragement_liste_reservations);

        LocationService locationService = LocationService.getInstance();

        this.reservations = new ArrayList<>();

        reservations = locationService.getListeReservation();

        // Donner au fragment la liste de reservation à afficher
        fragment.setListe(this.reservations);
    }

    @Override
    public void onClickReservation(Reservation R) {

    }
}
