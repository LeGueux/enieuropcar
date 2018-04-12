package com.ecole.cdi.europcar.europcar.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;
import com.ecole.cdi.europcar.europcar.R;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AddReservationFragment.OnReservationListener} interface
 * to handle interaction events.
 * Use the {@link AddReservationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddReservationFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TextView idVehicule;
    private TextView libelle;
    private TextView nbPlaces;
    private TextView locationMin;
    private TextView locationMax;
    private TextView tarifMin;
    private TextView tarifMax;

    private EditText dateDebut;
    private EditText dateFin;
    private EditText tarifJournalier;
    private Button reserver;

    private OnReservationListener mListener;

    private LocationService locationService;

    public AddReservationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddReservationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddReservationFragment newInstance(String param1, String param2) {
        AddReservationFragment fragment = new AddReservationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_add_reservation, container, false);

        idVehicule = v.findViewById(R.id.id_vehicule_reservation);
        libelle = v.findViewById(R.id.libelle_vehicule_reservation);
        nbPlaces = v.findViewById(R.id.nbPlaces_vehicule_reservation);
        locationMin = v.findViewById(R.id.location_min_vehicule_reservation);
        locationMax = v.findViewById(R.id.location_max_vehicule_reservation);
        tarifMin = v.findViewById(R.id.tarif_min_vehicule_reservation);
        tarifMax = v.findViewById(R.id.tarif_max_vehicule_reservation);

        dateDebut = v.findViewById(R.id.add_debut_reservation);
        dateFin = v.findViewById(R.id.add_fin_reservation);
        tarifJournalier = v.findViewById(R.id.add_tarif_reservation);
        reserver = v.findViewById(R.id.reserver);

        reserver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mListener.onReservation(dateDebut,dateFin,tarifJournalier);

            }
        });

        mListener.onGetVehiculeReservation(idVehicule,libelle,nbPlaces,locationMin,locationMax,tarifMin,tarifMax);

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnReservationListener) {
            mListener = (OnReservationListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnReservationListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnReservationListener {
        // TODO: Update argument type and name
        void onGetVehiculeReservation(TextView id, TextView libelle, TextView places, TextView lmin, TextView lmax,
                                      TextView tmin, TextView tmax);
        void onReservation(TextView debut, TextView fin, TextView tarif);
    }
}
