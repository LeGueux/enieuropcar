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

import com.ecole.cdi.europcar.europcar.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ModifierAgenceFragment.OnModificationAgenceListener} interface
 * to handle interaction events.
 * Use the {@link ModifierAgenceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ModifierAgenceFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Button modifier;
    private EditText raison;
    private EditText siret;
    private EditText voie;
    private EditText cp;
    private EditText ville;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnModificationAgenceListener mListener;

    public ModifierAgenceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ModifierAgenceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ModifierAgenceFragment newInstance(String param1, String param2) {
        ModifierAgenceFragment fragment = new ModifierAgenceFragment();
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
        View v = inflater.inflate(R.layout.fragment_modfier_agence, container, false);

        this.raison = v.findViewById(R.id.raison);
        this.siret = v.findViewById(R.id.siret);
        this.voie = v.findViewById(R.id.voie);
        this.cp = v.findViewById(R.id.cp);
        this.ville = v.findViewById(R.id.ville);

        this.modifier = v.findViewById(R.id.btn_modifier);

        this.modifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onModification(raison.getText().toString(),siret.getText().toString(),
                        voie.getText().toString(),cp.getText().toString(), ville.getText().toString());
            }
        });
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnModificationAgenceListener) {
            mListener = (OnModificationAgenceListener) context;
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
    public interface OnModificationAgenceListener {
        // TODO: Update argument type and name
        void onModification(String raison, String siret, String voie, String cp, String ville);
    }

}
