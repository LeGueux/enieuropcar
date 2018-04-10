package com.ecole.cdi.europcar.europcar.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ecole.cdi.europcar.europcar.Entity.Vehicule;
import com.ecole.cdi.europcar.europcar.R;

import java.util.List;

public class VehiculeAdapter extends ArrayAdapter<Vehicule> {

    private int layout;

    public VehiculeAdapter(@NonNull Context context, int resource, @NonNull List<Vehicule> objects) {
        super(context, resource, objects);
        this.layout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(this.layout, parent, false);
        }

        Vehicule vehicule = this.getItem(position);
        TextView idVehicule = convertView.findViewById(R.id.id_vehicule);
        TextView modeleVehicule = convertView.findViewById(R.id.modele_vehicule);
        TextView nbPlacesVehicule = convertView.findViewById(R.id.nb_places_vehicule);
        TextView locMinVehicule = convertView.findViewById(R.id.location_min_vehicule);
        TextView locMaxVehicule = convertView.findViewById(R.id.location_max_vehicule);
        TextView tarifMinVehicule = convertView.findViewById(R.id.tarif_min_vehicule);
        TextView tarifMaxVehicule = convertView.findViewById(R.id.tarif_max_vehicule);

        idVehicule.setText(String.valueOf(vehicule.getId()));
        modeleVehicule.setText(vehicule.getModele());
        nbPlacesVehicule.setText(String.valueOf(vehicule.getNbPlaces()));
        locMinVehicule.setText(String.valueOf(vehicule.getLocationMin()));
        locMaxVehicule.setText(String.valueOf(vehicule.getLocationMax()));
        tarifMinVehicule.setText(String.valueOf(vehicule.getLocationMin()));
        tarifMaxVehicule.setText(String.valueOf(vehicule.getLocationMax()));

        return convertView;
    }
}
