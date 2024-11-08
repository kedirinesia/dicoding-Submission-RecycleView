package com.example.submission_pulung

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlayerAdapter(private val players: List<Player>, private val onClick: (Player) -> Unit) :
    RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemplayer, parent, false)
        return PlayerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player = players[position]
        holder.bind(player, onClick)
    }

    override fun getItemCount() = players.size

    class PlayerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(player: Player, onClick: (Player) -> Unit) {
            itemView.findViewById<TextView>(R.id.nameTextView).text = player.name
            itemView.findViewById<TextView>(R.id.positionTextView).text = player.position
            itemView.findViewById<ImageView>(R.id.playerImageView).setImageResource(player.imageUrl)

            itemView.setOnClickListener { onClick(player) }
        }
    }
}
