package com.ecole.cdi.europcar.europcar.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ecole.cdi.europcar.europcar.Adapter.ReservationAdapter;
import com.ecole.cdi.europcar.europcar.Adapter.VehiculeAdapter;
import com.ecole.cdi.europcar.europcar.Entity.Reservation;
import com.ecole.cdi.europcar.europcar.Entity.Vehicule;
import com.ecole.cdi.europcar.europcar.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListeReservationFragment.OnClickReservationListener} interface
 * to handle interaction events.
 * Use the {@link ListeReservationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListeReservationFragment extends Fragment {

    private List<Reservation> reservations;
    private OnClickReservationListener mListener;

    public ListeReservationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListeReservationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListeReservationFragment newInstance(String param1, String param2) {
        ListeReservationFragment fragment = new ListeReservationFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_liste_reservation, container, false);
        ListView listeResultats = v.findViewById(R.id.liste_reservations);
        listeResultats.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view,
                                    int position,
                                    long l) {
                if (reservations != null) {
                    mListener.onClickReservation(reservations.get(position));
                }
            }
        });
        return v;
    }

    public void setListe(List<Reservation> r) {
        this.reservations = r;
        ListView listeReservation = this.getView().findViewById(R.id.liste_reservations);

        ReservationAdapter adapter = new ReservationAdapter(
                this.getContext(),
                R.layout.ligne_reservation,
                reservations);
        listeReservation.setAdapter(adapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnClickReservationListener) {
            mListener = (OnClickReservationListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
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
    public interface OnClickReservationListener {
        // TODO: Update argument type and name
        void onClickReservation(Reservation R);
    }
}
