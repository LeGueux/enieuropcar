package com.ecole.cdi.europcar.europcar.Activity;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Entity.Reservation;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;
import com.ecole.cdi.europcar.europcar.Fragment.AddReservationFragment;
import com.ecole.cdi.europcar.europcar.R;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ReservationActivity extends AppCompatActivity implements
        AddReservationFragment.OnReservationListener {

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

        id.setText("ID vehicule : " + String.valueOf(v.getId()));
        libelle.setText("Libelle : "+ v.getModele());
        places.setText("Nombres de places : " + String.valueOf(v.getNbPlaces()));
        lmin.setText("Location minimum : " + String.valueOf(v.getLocationMin()));
        lmax.setText("Location maximum : " + String.valueOf(v.getLocationMax()));
        tmin.setText("Tarif minimum : " + tarifMin + " €");
        tmax.setText("Tarif minimum : " +tarifMax + " €");
    }

    @Override
    public void onReservation(TextView debut, TextView fin, TextView tarif) {
        int idVehicule = getIntent().getIntExtra("idVehicule",-1);

        Vehicule v = locationService.getInstance().getVehiculeById(idVehicule);

        Agence a = new Agence(1, "test", "123456", "voie test", "14000", "Caen");

        Float tarifJournalier = Float.parseFloat(tarif.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String debutString = debut.toString();
        String finString = fin.toString();

        Date dateDebut = new Date();
        Date dateFin = new Date();

        try {
            dateDebut = sdf.parse(debutString);
            dateFin = sdf.parse(finString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long dd = dateDebut.getTime();
        long df = dateFin.getTime();

        Reservation r = new Reservation(5,v,a,dd,df,tarifJournalier,true);

        Reservation r2 = locationService.getInstance().reservation(r);

        Toast.makeText(this,
                "Réservation terminée : " + r2.getAgenceId().getSiret() + " - "
                        + r2.getVehiculeId().getModele() + " - " + r2.getDateDebut() + " - " + r2.getDateFin() +
                        r2.getTarifJournalier(),
                Toast.LENGTH_SHORT).show();


    }
}
