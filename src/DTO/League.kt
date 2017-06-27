package DTO.League

/**
 * Created by jeongjihun on 2017. 6. 27..
 */

/*
    LEAGUE-V3

    /lol/league/v3/challengerleagues/by-queue/{queue}
    /lol/league/v3/leagues/by-summoner/{summonerId}
    /lol/league/v3/masterleagues/by-queue/{queue}
    /lol/league/v3/positions/by-summoner/{summonerId}
 */
data class LeagueListDto(var tier: String, var queue: String, var name: String,
                         var entries: List<LeagueItemDto>)

data class LeagueItemDto(var rank: String, var hotStreak: Boolean, var miniSeries: MiniSeriesDto,
                         var wins: Int, var veteran: Boolean, var losses: Int,
                         var playerOrTeamId: String, var playerOrTeamName: String, var inactive: Boolean,
                         var freshBlood: Boolean, var leaguePoints: Int)

data class MiniSeriesDto(var wins: Int, var losses: Int, var target: Int,
                         var progress: String)
