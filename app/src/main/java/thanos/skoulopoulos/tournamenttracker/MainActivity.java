package thanos.skoulopoulos.tournamenttracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createNewTournament;

        ImageView imageView = findViewById(R.id.image_home_screen);
        imageView.setAlpha(100);

        createNewTournament = findViewById(R.id.button_create_new_tournament);

        createNewTournament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddNewTournamentPopUp fragment = AddNewTournamentPopUp.newInstance();
                fragment.show(getSupportFragmentManager(),"AddNewTournamentPopUp");

            }
        });

    }
}
