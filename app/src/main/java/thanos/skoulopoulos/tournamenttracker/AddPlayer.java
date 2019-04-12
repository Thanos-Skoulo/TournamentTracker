package thanos.skoulopoulos.tournamenttracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddPlayer extends AppCompatActivity {

    EditText newPlayerCreason;
    Button buttonAddPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);

        newPlayerCreason = findViewById(R.id.et_player_name);
        buttonAddPlayer = findViewById(R.id.button_add_player);

        buttonAddPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newPlayerText = newPlayerCreason.getText().toString();

                Intent sendNewPlayer = new Intent(AddPlayer.this, Player.class);
                sendNewPlayer.putExtra(Player.)
            }
        });
    }
}
