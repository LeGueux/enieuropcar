package com.ecole.cdi.europcar.europcar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ecole.cdi.europcar.europcar.ConnexionFragment;
import com.ecole.cdi.europcar.europcar.Entity.Utilisateur;
import com.ecole.cdi.europcar.europcar.R;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

public class MainActivity extends AppCompatActivity implements ConnexionFragment.OnConnexionListener{

    private LocationService locationService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onConnexion(String login, String mdp) {
        Utilisateur user = locationService.getInstance().connexion(login, mdp);

        if(user.getLogin().equals(login) && user.getPassword().equals(mdp)){
            Toast.makeText(this,
                    "Connexion validée : " + login + " - " + user.getEmail(),
                    Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,
                    "Connexion refusée",
                    Toast.LENGTH_SHORT).show();
        }

    }
}
