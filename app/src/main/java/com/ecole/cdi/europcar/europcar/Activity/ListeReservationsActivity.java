package com.ecole.cdi.europcar.europcar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ecole.cdi.europcar.europcar.Entity.Reservation;
import com.ecole.cdi.europcar.europcar.Fragment.ListeReservationFragment;
import com.ecole.cdi.europcar.europcar.R;

public class ListeReservationsActivity extends AppCompatActivity
        implements ListeReservationFragment.OnClickReservationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_reservations);
    }

    @Override
    public void onClickReservation(Reservation R) {

    }
}
