package DTO.Spectator

/**
 * Created by jeongjihun on 2017. 6. 27..
 */

/*
    SPECTATOR-V3

    /lol/spectator/v3/active-games/by-summoner/{summonerId}
    CurrentGameInfo
 */
data class CurrentGameInfoDto(var gameId: Long, var gameStarTime: Long, var platformId: String,
                              var gameMode: String, var mapId: Long, var gameType: String,
                              var bannedChampions: List<BannedChampionDto>, var observers: ObserverDto,
                              var participants: List<CurrentGameParticipantDto>, var gameLength: Long,
                              var gameQueueConfigId: Long)

/*
    BannedChampion
 */
data class BannedChampionDto(var pickTurn: Int, var championId: Long, var teamId: Long)

/*
    Observer
 */
data class ObserverDto(var encryptionKey: String)

/*
    CurrentGameParticipant
 */
data class CurrentGameParticipantDto(var profileIconId: Long, var championId: Long, var summonerName: String,
                                     var runes: List<RuneDto>, var bot: Boolean, var teamId: Long,
                                     var spell2Id: Long, var masteries: List<MasteryDto>, var spell1Id: Long,
                                     var summonerId: Long)

/*
    Rune
 */
data class RuneDto(var count: Int, var runeId: Long)

/*
    Mastery
 */
data class MasteryDto(var masteryId: Long, var rank: Int)