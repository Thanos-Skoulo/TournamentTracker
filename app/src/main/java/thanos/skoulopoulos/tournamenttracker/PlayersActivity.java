package thanos.skoulopoulos.tournamenttracker;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlayersActivity extends AppCompatActivity {

    FloatingActionButton fabAddPlayer;
    public static final int ADD_PLAYER = 1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        getSupportActionBar().hide();

        View fabAddPlayer =findViewById(R.id.fab_add_player);

        fabAddPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivityForResult(PlayersActivity.this, AddPlayer.class, ADD_PLAYER);

            }
        });


    }
}
