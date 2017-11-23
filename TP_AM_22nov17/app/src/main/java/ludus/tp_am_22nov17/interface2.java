package ludus.tp_am_22nov17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static ludus.tp_am_22nov17.R.layout.activity_interface2;

public class interface2 extends AppCompatActivity {

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
    private TextView i2_txtV_civil;
    private RadioButton i2_btn_mme;
    private RadioButton i2_btn_mr;
    private EditText i2_txtE_nom;
    private EditText i2_txtE_prenom;
    private TextView i2_txtV_dateN;
    private EditText i2_txtE_jour;
    private EditText i2_txtE_mois;
    private EditText i2_txtE_an;
    private EditText i2_txtE_mail;
    private EditText i2_txtE_adresse;
    private EditText i2_txtE_comment;
    private Button i2_btn_valider;

    //Lancement de l'activité
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_interface2);

        //Associer physiquement les objets de la classe java aux objets de l'interface
        i2_btn_mme = (RadioButton) findViewById(R.id.i2_btn_mme);
        i2_btn_mr = (RadioButton) findViewById(R.id.i2_btn_mr);
        i2_txtE_nom = (EditText) findViewById(R.id.i2_txtE_nom);
        i2_txtE_prenom = (EditText) findViewById(R.id.i2_txtE_prenom);
        i2_txtE_jour = (EditText) findViewById(R.id.i2_txtE_jour);
        i2_txtE_mois = (EditText) findViewById(R.id.i2_txtE_mois);
        i2_txtE_an = (EditText) findViewById(R.id.i2_txtE_an);
        i2_txtE_mail = (EditText) findViewById(R.id.i2_txtE_mail);
        i2_txtE_adresse = (EditText) findViewById(R.id.i2_txtE_adresse);
        i2_txtE_comment= (EditText) findViewById(R.id.i2_txtE_comment);
        i2_btn_valider = (Button) findViewById(R.id.i2_btn_valider);

        //On définit un des radioBouton sélectionné de base
        i2_btn_mme.setChecked(true);

        //Action effectuée sur le bouton
        i2_btn_valider.setOnClickListener(new View.OnClickListener() {

            @Override
            //En cas de clic sur le bouton
            public void onClick(View view){
                if ((i2_btn_mme.getText().toString() != "")
                        && (i2_txtE_nom.getText().toString() != "")
                        && (i2_txtE_prenom.getText().toString() != "")
                        && (i2_txtE_jour.getText().toString() != "")
                        && (i2_txtE_mois.getText().toString() != "")
                        && (i2_txtE_an.getText().toString() != "")
                        && (i2_txtE_mail.getText().toString() != "")
                        && (i2_txtE_adresse.getText().toString() != "")
                        && (i2_txtE_comment.getText().toString() != "") ) {

                    //Créer une procédure pour passer à l'activité suivante
                    validationFormulaire();
                }

            }

        });
    }

    public void validationFormulaire(){

        Intent intent = new Intent(interface2.this, interface3.class);

        if(i2_btn_mme.isChecked() == true){
            intent.putExtra(EXTRA_CIVIL, i2_btn_mme.getText().toString());
        }else{
            intent.putExtra(EXTRA_CIVIL, i2_btn_mr.getText().toString());
        }

        intent.putExtra(EXTRA_NOM, i2_txtE_nom.getText().toString());
        intent.putExtra(EXTRA_PRENOM, i2_txtE_prenom.getText().toString());
        intent.putExtra(EXTRA_JOURN, i2_txtE_jour.getText().toString());
        intent.putExtra(EXTRA_MOISN, i2_txtE_mois.getText().toString());
        intent.putExtra(EXTRA_ANN, i2_txtE_an.getText().toString());
        intent.putExtra(EXTRA_MAIL, i2_txtE_mail.getText().toString());
        intent.putExtra(EXTRA_ADRESSE, i2_txtE_adresse.getText().toString());
        intent.putExtra(EXTRA_COMMENT, i2_txtE_comment.getText().toString());

        startActivity(intent);

    }
}
