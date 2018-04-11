package com.ecole.cdi.europcar.europcar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ecole.cdi.europcar.europcar.Entity.Vehicule;
import com.ecole.cdi.europcar.europcar.R;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

public class VehiculeActivity extends AppCompatActivity {

    private Vehicule vehicule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicule);
    }

    @Override
    protected void onResume() {
        super.onResume();
        int idVehicule = getIntent().getIntExtra("idVehicule", -1);

        LocationService locationService = LocationService.getInstance();
        this.vehicule = locationService.getVehiculeById(idVehicule);

        TextView idVehiculeView = findViewById(R.id.id_vehicule);
        idVehiculeView.setText(String.valueOf(this.vehicule.getId()));

//        RecetteFragment fragment = (RecetteFragment) getSupportFragmentManager().findFragmentById(R.id.vehicule);
//        fragment.setRecette(this.vehicule);

        // Si on est en portrait, rediriger vers l'écran précédent
//        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            finish();
//        }
    }
}
