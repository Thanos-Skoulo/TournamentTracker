package thanos.skoulopoulos.tournamenttracker;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class AddNewTournamentPopUp extends DialogFragment {

    Button newTournamentNameButton;
    EditText newTournamentNameEditText;

    public static AddNewTournamentPopUp newInstance(){
        return new AddNewTournamentPopUp();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle saveInstanceState) {
        View addNewTournamentPopUpView = inflater.inflate(R.layout.activity_add_new_tournament_pop_up, viewGroup,false);
        return addNewTournamentPopUpView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        newTournamentNameEditText = view.findViewById(R.id.et_new_tournament_name);

        newTournamentNameButton = view.findViewById(R.id.button_name_new_tournament);

        newTournamentNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getContext().startActivity(new Intent(getContext(), PlayersActivity.class));

            }
        });


    }
}
