package com.ecole.cdi.europcar.europcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

public class InscriptionActivity extends AppCompatActivity implements InscriptionFragment.OnInscriptionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
    }

    @Override
    public void OnInscription(String login, String password, String email) {

        
    }
}
