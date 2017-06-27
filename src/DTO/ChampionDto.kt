package DTO.Champion

/**
 * Created by jeongjihun on 2017. 6. 27..
 */


/*
    CHAMPION-V3

    /lol/platform/v3/champions
    /lol/platform/v3/champions/{id}

    ChampionListDto - This object contains a collection of champion information.
 */
data class ChampionListDto(var champions: List<ChampionDto>)

/*
    ChampionDto - This object contains champion information.
 */
data class ChampionDto(var rankedPlayEnabled: Boolean, var botEnabled: Boolean, var botMmEnabled: Boolean,
                       var active: Boolean, var freeToPlay: Boolean, var id: Long)

/*
    CHAMPION-MASTERY-V3

    /lol/champion-mastery/v3/champion-masteries/by-summoner/{summonerId}
    /lol/champion-mastery/v3/champion-masteries/by-summoner/{summonerId}/by-champion/{championId}
    /lol/champion-mastery/v3/scores/by-summoner/{summonerId}

    ChampionMasteryDTO - This object contains single Champion Mastery information for player and champion combination.
 */
data class ChampionMasteryDto(var chestGranted: Boolean, var championLevel:Int, var championPoints: Int,
                              var championId: Long, var playerId: Long, var championPointsUntilNextLevel: Long,
                              var championPointsSinceLastLevel: Long, var lastPlayTime: Long)
