package com.ecole.cdi.europcar.europcar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ecole.cdi.europcar.europcar.Entity.Reservation;
import com.ecole.cdi.europcar.europcar.Fragment.ListeReservationFragment;
import com.ecole.cdi.europcar.europcar.Fragment.ListeVehiculeFragment;
import com.ecole.cdi.europcar.europcar.R;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

public class ListeReservationsActivity extends AppCompatActivity
        implements ListeReservationFragment.OnClickReservationListener{

    private ListeReservationFragment fragment;

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

        // Donner au fragment la liste de voiture à afficher
        fragment.setListe(locationService.getListeReservation());
    }

    @Override
    public void onClickReservation(Reservation R) {

    }
}
