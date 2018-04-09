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

        TextView marqueVoiture = convertView.findViewById(R.id.marque_voiture);
        Vehicule vehicule = this.getItem(position);
        marqueVoiture.setText(vehicule.getMarque());

        return convertView;
    }
}
