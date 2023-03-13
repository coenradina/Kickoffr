package com.coenrad.kickoffr.model.response

import com.coenrad.kickoffr.model.Fixture
import com.coenrad.kickoffr.model.Goal
import com.coenrad.kickoffr.model.MatchTeam
import com.coenrad.kickoffr.model.Score
import com.coenrad.kickoffr.model.base.League

data class FixturesResponse(
    val fixture: Fixture,
    val league: League,
    val teams: MatchTeam,
    val goals: Goal,
    val score: Score
)
