package com.ecole.cdi.europcar.europcar.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.ecole.cdi.europcar.europcar.Entity.Agence;
import com.ecole.cdi.europcar.europcar.Fragment.ModifierAgenceFragment;
import com.ecole.cdi.europcar.europcar.R;
import com.ecole.cdi.europcar.europcar.Service.LocationService;

public class ModifierAgenceActivity extends AppCompatActivity
        implements ModifierAgenceFragment.OnModificationAgenceListener{
    private LocationService locationService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifier_agence);

        EditText raison = findViewById(R.id.raison);
        EditText siret = findViewById(R.id.siret);
        EditText voie = findViewById(R.id.voie);
        EditText cp = findViewById(R.id.cp);
        EditText ville = findViewById(R.id.ville);

        raison.setText("RaisonTest");
        siret.setText("123456789");
        voie.setText("10 rue Test");
        cp.setText("44000");
        ville.setText("Nantes");
    }

    @Override
    public void onModification(String raison, String siret, String voie, String cp, String ville) {

        Agence agence = new Agence(1,raison, siret, voie, cp, ville);

        Agence agence2 =  locationService.getInstance().modifierAgence(agence);

        Toast.makeText(this,
                "Modification terminée : " + agence2.getSiret(),
                Toast.LENGTH_SHORT).show();
    }
}
