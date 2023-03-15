package com.coenrad.kickoffr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.coenrad.kickoffr.adapter.ListFixtureAdapter
import com.coenrad.kickoffr.`interface`.OnItemClickCallback
import com.coenrad.kickoffr.model.ui.Fixture
import com.example.kickoffr.R

class MainActivity : AppCompatActivity() {

    private lateinit var rvFixture: RecyclerView
    private val list = ArrayList<Fixture>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFixture = findViewById(R.id.recyclerView)
        rvFixture.setHasFixedSize(true)

        list.addAll(getListFixtures())
        showRecyclerList()
    }

    private fun getListFixtures(): Collection<Fixture> {
        val firstTeamName = resources.getStringArray(R.array.first_team_name)
        val secondTeamName = resources.getStringArray(R.array.second_team_name)
        val matchDayDate = resources.getStringArray(R.array.match_day_date)
        val matchTime = resources.getStringArray(R.array.match_time)
        val listFixture = ArrayList<Fixture>()
        for (i in firstTeamName.indices) {
            val fixture = Fixture(
                id = i,
                firstTeamName = firstTeamName[i],
                firstTeamImage = Constants().imageIcon[firstTeamName[i]],
                secondTeamName = secondTeamName[i],
                secondTeamImage = Constants().imageIcon[secondTeamName[i]],
                matchDayDate = matchDayDate[i],
                matchTime = matchTime[i])
            listFixture.add(fixture)
        }
        return listFixture
    }

    private fun showRecyclerList() {
        rvFixture.layoutManager = LinearLayoutManager(this)
        val listFixtureAdapter = ListFixtureAdapter(listFixture = list, context = this)

        listFixtureAdapter.run {
            rvFixture.adapter = this

            setOnItemClickCallback(object : OnItemClickCallback {
                override fun onItemClick(data: Fixture) {
                    val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    intent.putExtra("fixture", data)
                    startActivity(intent)
                }
            })
        }
    }


}