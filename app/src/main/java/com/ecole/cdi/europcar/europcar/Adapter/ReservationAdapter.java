package com.ecole.cdi.europcar.europcar.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ecole.cdi.europcar.europcar.Entity.Reservation;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;
import com.ecole.cdi.europcar.europcar.R;

import java.util.List;
import java.util.Objects;

/**
 * Created by Administrateur on 10/04/2018.
 */

public class ReservationAdapter extends ArrayAdapter<Reservation> {
    private int layout;
    private Context context;
    private List<Reservation> objects;

    public ReservationAdapter(@NonNull Context context, int resource, @NonNull List<Reservation> objects) {
        super(context, resource, objects);
        this.layout = resource;
        this.context = context;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(this.layout, parent, false);
        }

        Reservation reservation = this.getItem(position);
        TextView id = convertView.findViewById(R.id.id_reservation);
        TextView dateDebut = convertView.findViewById(R.id.date_debut);
        TextView dateFin = convertView.findViewById(R.id.date_fin);
        TextView tarif = convertView.findViewById(R.id.tarif_journalier);

        id.setText(String.valueOf(reservation.getVehiculeId().getId()));
        dateDebut.setText(String.valueOf(reservation.getDateDebut()));
        dateFin.setText(String.valueOf(reservation.getDateFin()));
        tarif.setText(String.valueOf(reservation.getTarifJournalier()));

        return convertView;
    }
}
