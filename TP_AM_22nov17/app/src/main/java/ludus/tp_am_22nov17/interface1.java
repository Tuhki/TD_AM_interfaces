package ludus.tp_am_22nov17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class interface1 extends AppCompatActivity {

    private Button i1_btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface1);

        //Passer à l'activité suivante en appuyant sur start
        i1_btn_start.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                connectUser();

            }

        });

    }

    //Procédure pour aller à l'activité suivante
    private void connectUser(){
        Intent intent = new Intent(interface1.this, interface2.class);
        startActivity(intent);
    }
}
