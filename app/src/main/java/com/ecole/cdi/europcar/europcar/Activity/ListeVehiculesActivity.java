package com.ecole.cdi.europcar.europcar.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ecole.cdi.europcar.europcar.Entity.Vehicule;
import com.ecole.cdi.europcar.europcar.Fragment.ListeVehiculeFragment;
import com.ecole.cdi.europcar.europcar.R;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

import java.util.ArrayList;
import java.util.List;

public class ListeVehiculesActivity extends AppCompatActivity implements ListeVehiculeFragment.OnClickVehiculeListener {

    private ListeVehiculeFragment fragment;
    private List<Vehicule> vehicules;
    private LocationService locationService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_vehicules);

        this.locationService = LocationService.getInstance();
    }

    @Override
    protected void onResume() {
        super.onResume();
        fragment = (ListeVehiculeFragment) getSupportFragmentManager().findFragmentById(R.id.fragement_liste_vehicules);

        this.vehicules = new ArrayList<>();
        this.vehicules = this.locationService.getListVehicule();
        Log.e("nb vehicules", "nb : " + this.vehicules.size());

        // Donner au fragment la liste de voiture à afficher
        fragment.setListe(this.vehicules);
    }

    @Override
    public void clickOnVehicule(Vehicule v) {
        Intent intent = new Intent(ListeVehiculesActivity.this, VehiculeActivity.class);
        intent.putExtra("idVehicule", v.getId());
        startActivity(intent);
    }
}
