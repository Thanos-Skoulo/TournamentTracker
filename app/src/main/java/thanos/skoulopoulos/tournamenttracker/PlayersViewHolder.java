package thanos.skoulopoulos.tournamenttracker;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class PlayersViewHolder extends RecyclerView.ViewHolder {

    TextView name;

    public PlayersViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.tv_player_name);
    }

    public TextView getName(){
        return name;
    }

    public void bind(Player player) {
        name.setText(player.getName());
    }
}
