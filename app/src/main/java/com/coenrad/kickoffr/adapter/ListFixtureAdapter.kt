package com.coenrad.kickoffr.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.coenrad.kickoffr.`interface`.OnItemClickCallback
import com.coenrad.kickoffr.model.ui.Fixture
import com.example.kickoffr.R

class ListFixtureAdapter(private val listFixture: MutableList<Fixture>): RecyclerView.Adapter<ListFixtureAdapter.ListViewHolder>() {

    private lateinit var onItemClick: OnItemClickCallback

    private var context: Context? = null

    constructor(context: Context, listFixture: MutableList<Fixture>) : this(listFixture) {
        this.context = context
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
       val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
       return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val fixture = listFixture[position]
        holder.firstTeamNameView.text = fixture.firstTeamName
        holder.secondTeamNameView.text = fixture.secondTeamName
        holder.matchDayDate.text = fixture.matchDayDate
        holder.matchTime.text = fixture.matchTime

        context?.let {
            Glide.with(it)
                .load(fixture.firstTeamImage)
                .fitCenter()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.color.purple_200)
                .into(holder.firstTeamImageView)

            Glide.with(it)
                .load(fixture.secondTeamImage)
                .fitCenter()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.color.purple_200)
                .into(holder.secondTeamImageView)
        }

        holder.itemView.setOnClickListener {
            onItemClick.onItemClick(fixture)
        }
    }

    override fun getItemCount(): Int = listFixture.size

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstTeamImageView: ImageView = itemView.findViewById(R.id.firstTeamImageIcon)
        val firstTeamNameView: TextView = itemView.findViewById(R.id.firstTeamTextName)
        val secondTeamImageView: ImageView = itemView.findViewById(R.id.secondTeamImageIcon)
        val secondTeamNameView: TextView = itemView.findViewById(R.id.secondTeamTextName)
        val matchDayDate: TextView = itemView.findViewById(R.id.matchDayDate)
        val matchTime: TextView = itemView.findViewById(R.id.matchTime)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClick = onItemClickCallback
    }
}