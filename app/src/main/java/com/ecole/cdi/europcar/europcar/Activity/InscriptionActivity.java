package com.ecole.cdi.europcar.europcar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.Fragment.InscriptionFragment;
import com.ecole.cdi.europcar.europcar.R;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

public class InscriptionActivity extends AppCompatActivity implements InscriptionFragment.OnInscriptionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
    }

    @Override
    public void OnInscription(String login, String password, String email) {

        Utilisateur user = new Utilisateur(2,login,password,email);

         Utilisateur user2 = LocationService.getInstance().inscription(user);

        Toast.makeText(this,
                "Inscription terminée : " + user2.getLogin() + " - " + user2.getEmail(),
                Toast.LENGTH_SHORT).show();
    }
}
