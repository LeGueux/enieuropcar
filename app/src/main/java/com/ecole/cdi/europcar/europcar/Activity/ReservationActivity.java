package com.ecole.cdi.europcar.europcar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ecole.cdi.europcar.europcar.Entity.Vehicule;
import com.ecole.cdi.europcar.europcar.Fragment.AddReservationFragment;
import com.ecole.cdi.europcar.europcar.R;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

public class ReservationActivity extends AppCompatActivity implements AddReservationFragment.OnReservationListener{

    private LocationService locationService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    @Override
    public void onGetVehiculeReservation(TextView id, TextView libelle, TextView places, TextView lmin, TextView lmax,
                                         TextView tmin, TextView tmax) {

        int idVehicule = getIntent().getIntExtra("idVehicule",-1);

        Vehicule v = locationService.getInstance().getVehiculeById(idVehicule);

        String tarifMin = String.valueOf(v.getTarifMin());
        String tarifMax = String.valueOf(v.getTarifMax());

        id.setText(String.valueOf(v.getId()));
        libelle.setText(v.getModele());
        places.setText(String.valueOf(v.getNbPlaces()));
        lmin.setText(String.valueOf(v.getLocationMin()));
        lmax.setText(String.valueOf(v.getLocationMax()));
        tmin.setText(tarifMin);
        tmax.setText(tarifMax);
    }
}
