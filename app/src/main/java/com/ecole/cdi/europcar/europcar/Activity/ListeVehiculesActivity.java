package com.ecole.cdi.europcar.europcar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ecole.cdi.europcar.europcar.Entity.Vehicule;
import com.ecole.cdi.europcar.europcar.Fragment.ListeVehiculeFragment;
import com.ecole.cdi.europcar.europcar.R;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

import java.util.ArrayList;
import java.util.List;

public class ListeVehiculesActivity extends AppCompatActivity implements ListeVehiculeFragment.OnClickVehiculeListener {

    private ListeVehiculeFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_vehicules);
    }

    @Override
    protected void onResume() {
        super.onResume();
        fragment = (ListeVehiculeFragment) getSupportFragmentManager().findFragmentById(R.id.fragement_liste_vehicules);

        LocationService locationService = LocationService.getInstance();

        // Donner au fragment la liste de voiture à afficher
        fragment.setListe(locationService.getListVehicule());
    }

    @Override
    public void clickOnVehicule(Vehicule v) {

    }
}
