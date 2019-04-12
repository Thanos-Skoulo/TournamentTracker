package thanos.skoulopoulos.tournamenttracker;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PlayersAdapter extends RecyclerView.Adapter<PlayersViewHolder> {

    ArrayList<Player> playerArrayList = new ArrayList<Player>();

    public PlayersAdapter(){
        playerArrayList.add(new Player("pare paikth"));
    }

    @NonNull
    @Override
    public PlayersViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new PlayersViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_player));
    }

    @Override
    public void onBindViewHolder(@NonNull PlayersViewHolder playersViewHolder, int i) {
        playersViewHolder.bind(playerArrayList.get(i));

    }

    @Override
    public int getItemCount() {
        return playerArrayList.size();
    }

}
