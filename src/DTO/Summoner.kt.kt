package DTO

/**
 * Created by jeongjihun on 2017. 6. 27..
 */

/*
    SUMMONER-V3

    /lol/summoner/v3/summoners/by-account/{accountId}
    /lol/summoner/v3/summoners/by-name/{summonerName}
    /lol/summoner/v3/summoners/{summonerId}
 */
data class `Summoner.kt`(var profileIconId: Int, var name: String, var summonerLevel: Long,
                         var revisionDate: Long, var id: Long, var accountId: Long)
