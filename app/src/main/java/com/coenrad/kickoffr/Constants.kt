package com.coenrad.kickoffr

import com.example.kickoffr.R
import java.util.HashMap

class Constants {

    val imageIcon: HashMap<String, String> = hashMapOf(
        "Manchester United" to "https://media.api-sports.io/football/teams/33.png",
        "Crystal Palace" to "https://upload.wikimedia.org/wikipedia/id/thumb/0/0c/Crystal_Palace_FC_logo.svg/1200px-Crystal_Palace_FC_logo.svg.png",
        "Chelsea" to "https://upload.wikimedia.org/wikipedia/id/thumb/c/cc/Chelsea_FC.svg/1200px-Chelsea_FC.svg.png",
        "Arsenal" to "https://upload.wikimedia.org/wikipedia/id/thumb/5/53/Arsenal_FC.svg/1200px-Arsenal_FC.svg.png",
        "Manchester City" to "https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/1200px-Manchester_City_FC_badge.svg.png",
        "Tottenham Hotspurs" to "https://upload.wikimedia.org/wikipedia/id/thumb/b/b4/Tottenham_Hotspur.svg/1200px-Tottenham_Hotspur.svg.png",
        "Liverpool" to "https://upload.wikimedia.org/wikipedia/id/thumb/0/0c/Liverpool_FC.svg/1200px-Liverpool_FC.svg.png",
        "Southampton" to "https://upload.wikimedia.org/wikipedia/id/thumb/c/c9/FC_Southampton.svg/1200px-FC_Southampton.svg.png",
        "Leeds United" to "https://upload.wikimedia.org/wikipedia/id/thumb/5/54/Leeds_United_F.C._logo.svg/1200px-Leeds_United_F.C._logo.svg.png",
    )

    val firstTeamLineup: List<Int> = listOf(
        R.drawable.match_1_1,
        R.drawable.match_2_1,
        R.drawable.match_3_1,
        R.drawable.match_4_1,
        R.drawable.match_5_1,
        R.drawable.match_6_1,
        R.drawable.match_7_1,
        R.drawable.match_8_1,
        R.drawable.match_9_1,
    )

    val secondTeamLineup: List<Int> = listOf(
        R.drawable.match_1_2,
        R.drawable.match_2_2,
        R.drawable.match_3_2,
        R.drawable.match_4_2,
        R.drawable.match_5_2,
        R.drawable.match_6_2,
        R.drawable.match_7_2,
        R.drawable.match_8_2,
        R.drawable.match_9_2,
    )
}