package ludus.tp_am_22nov17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static ludus.tp_am_22nov17.R.id.i2_btn_mme;
import static ludus.tp_am_22nov17.R.id.i3_btn_accueil;
import static ludus.tp_am_22nov17.R.id.i3_btn_sports;

public class interface3 extends AppCompatActivity {

    //Constantes de transfert de données
    private final String EXTRA_CIVIL = "civilité";
    private final String EXTRA_NOM = "nom";
    private final String EXTRA_PRENOM = "prénom";
    private final String EXTRA_JOURN = "jourN";
    private final String EXTRA_MOISN = "moisN";
    private final String EXTRA_ANN = "anN";
    private final String EXTRA_MAIL = "mail";
    private final String EXTRA_ADRESSE = "adresse";
    private final String EXTRA_COMMENT = "comment";

    //Widgets
    private TextView i3_txtV_infos;
    private Button i3_btn_sports;
    private Button i3_btn_accueil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface3);

        i3_txtV_infos = (TextView) findViewById(R.id.i3_txtV_infos);
        i3_btn_sports = (Button) findViewById(R.id.i3_btn_sports);
        i3_btn_accueil = (Button) findViewById(R.id.i3_btn_accueil);

        //On récupère les informations saisies par l'utilisateur
        Intent currentIntent = getIntent();
        currentIntent.getStringExtra(EXTRA_CIVIL);
        currentIntent.getStringExtra(EXTRA_NOM);
        currentIntent.getStringExtra(EXTRA_PRENOM);
        currentIntent.getStringExtra(EXTRA_JOURN);
        currentIntent.getStringExtra(EXTRA_MOISN);
        currentIntent.getStringExtra(EXTRA_ANN);
        currentIntent.getStringExtra(EXTRA_MAIL);
        currentIntent.getStringExtra(EXTRA_ADRESSE);
        currentIntent.getStringExtra(EXTRA_COMMENT);

        //On affiche les infos dans le texte
        i3_txtV_infos.setText(EXTRA_CIVIL + " " + EXTRA_NOM + " " + EXTRA_PRENOM + "\n");
        i3_txtV_infos.append("Né(e) le " + EXTRA_JOURN + "/" + EXTRA_MOISN + "/" + EXTRA_ANN + "\n");
        i3_txtV_infos.append(EXTRA_MAIL + "\n");
        i3_txtV_infos.append(EXTRA_ADRESSE + "\n");
        i3_txtV_infos.append(EXTRA_COMMENT);

        //On se dirige vers l'écran des sports
        i3_btn_sports.setOnClickListener(new View.OnClickListener() {

            @Override
            //En cas de clic sur le bouton
            public void onClick(View view){
                //Créer une procédure pour passer à l'activité suivante
                goSports();

            }

        });

    }

    public void goSports(){
        //Passer à l'interface 4
    }
}
