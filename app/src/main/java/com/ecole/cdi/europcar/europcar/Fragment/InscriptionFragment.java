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


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InscriptionFragment.OnInscriptionListener} interface
 * to handle interaction events.
 * Use the {@link InscriptionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InscriptionFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button inscription;
    private EditText login;
    private EditText mdp;
    private EditText email;
    private EditText token;

    private OnInscriptionListener mListener;

    public InscriptionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InscriptionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InscriptionFragment newInstance(String param1, String param2) {
        InscriptionFragment fragment = new InscriptionFragment();
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
        View v = inflater.inflate(R.layout.fragment_inscription, container, false);

        this.login = v.findViewById(R.id.inscr_login);
        this.mdp = v.findViewById(R.id.inscr_password);
        this.inscription = v.findViewById(R.id.btn_inscription);
        this.email = v.findViewById(R.id.inscr_email);
        this.token = v.findViewById(R.id.inscr_token);
        this.inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(token.getText().toString().isEmpty() || token.getText().toString() == null){
                token.setError("Le token est vide, veuillez en saisir un");
            }else{
                mListener.OnInscription(login.getText().toString(), mdp.getText().toString(),email.getText().toString());
            }
            }
        });

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnInscriptionListener) {
            mListener = (OnInscriptionListener) context;
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
    public interface OnInscriptionListener {
        // TODO: Update argument type and name
        void OnInscription(String login, String password, String email);
    }
}
