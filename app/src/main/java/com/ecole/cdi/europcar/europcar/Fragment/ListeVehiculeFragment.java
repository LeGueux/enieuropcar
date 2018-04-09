package com.ecole.cdi.europcar.europcar.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ecole.cdi.europcar.europcar.Adapter.VehiculeAdapter;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;
import com.ecole.cdi.europcar.europcar.R;

import java.util.List;

public class ListeVehiculeFragment extends Fragment {

    private List<Vehicule> vehicules;
    private OnClickVehiculeListener mListener;

    public ListeVehiculeFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnClickVehiculeListener) {
            mListener = (OnClickVehiculeListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnRechercheListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_liste_vehicule, container, false);
        ListView listeResultats = v.findViewById(R.id.liste_vehicules);
        listeResultats.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view,
                                    int position,
                                    long l) {
                if (vehicules != null) {
                    mListener.clickOnVehicule(vehicules.get(position));
                }
            }
        });
        return v;
    }

    public void setListe(List<Vehicule> v) {
        this.vehicules = v;
        ListView listeVehicules = this.getView()
                .findViewById(R.id.liste_vehicules);
        VehiculeAdapter adapter = new VehiculeAdapter(
                this.getContext(),
                R.layout.ligne_vehicule,
                vehicules);
        listeVehicules.setAdapter(adapter);
    }

    public interface OnClickVehiculeListener {
        void clickOnVehicule(Vehicule v);
    }
}
