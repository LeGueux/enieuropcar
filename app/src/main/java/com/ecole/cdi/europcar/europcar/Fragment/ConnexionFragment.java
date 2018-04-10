package com.ecole.cdi.europcar.europcar.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.ecole.cdi.europcar.europcar.R;

public class ConnexionFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button connecter;
    private EditText login;
    private EditText mdp;

    private OnConnexionListener mListener;

    public ConnexionFragment() {
        // Required empty public constructor
    }

    public static ConnexionFragment newInstance(String param1, String param2) {
        ConnexionFragment fragment = new ConnexionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_connexion, container, false);

        this.login = v.findViewById(R.id.login);
        this.mdp = v.findViewById(R.id.password);
        this.connecter = v.findViewById(R.id.btn_connexion);
        this.connecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (login.getText().toString().isEmpty()) {
                    login.setError("Champs obligatoire");
                } else if (mdp.getText().toString().isEmpty()) {
                    mdp.setError("Champs obligatoire");
                } else {
                    mListener.onConnexion(login.getText().toString(),mdp.getText().toString());
                }
            }
        });


        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnConnexionListener) {
            mListener = (OnConnexionListener) context;
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

    public interface OnConnexionListener {
        void onConnexion(String login, String mdp);
    }
}
