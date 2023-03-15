package com.coenrad.kickoffr

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.coenrad.kickoffr.model.ui.Fixture
import com.example.kickoffr.R

class DetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val firstTeamImageView: ImageView = findViewById(R.id.firstTeamImageIcon)
        val firstTeamNameView: TextView = findViewById(R.id.firstTeamTextName)
        val secondTeamImageView: ImageView = findViewById(R.id.secondTeamImageIcon)
        val secondTeamNameView: TextView = findViewById(R.id.secondTeamTextName)
        val matchDayDate: TextView = findViewById(R.id.matchDayDate)
        val firstTeamLineupImageView: ImageView = findViewById(R.id.firstTeamLineUpImageView)
        val secondTeamLineupImageView: ImageView = findViewById(R.id.secondTeamLineUpImageView)

        val data: Fixture? = intent.getParcelableExtra("fixture")

        data?.let {
            firstTeamNameView.text = it.firstTeamName
            secondTeamNameView.text = it.secondTeamName
            matchDayDate.text = getString(R.string.match_date_time, it.matchDayDate, it.matchTime)

            Glide.with(this)
                .load(data.firstTeamImage)
                .fitCenter()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.color.purple_200)
                .into(firstTeamImageView)

            Glide.with(this)
                .load(data.secondTeamImage)
                .fitCenter()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.color.purple_200)
                .into(secondTeamImageView)

            firstTeamLineupImageView.setImageResource(Constants().firstTeamLineup[data.id])
            secondTeamLineupImageView.setImageResource(Constants().secondTeamLineup[data.id])

        }
    }
}