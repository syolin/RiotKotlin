package DTO.Match

/**
 * Created by jeongjihun on 2017. 6. 27..
 */

/*
    MATCH-V3

    MatchDto
 */
data class MatchDto(var seasonId: Int, var queueId: Int, var gameId: Long,
                    var participantIdentities: List<ParticipantIdentityDto>,
                    var gameVersion: String, var platformId: String, var gameMode: String,
                    var mapId: Int, var gameType: String, var teams: List<TeamStatsDto>,
                    var participants: List<ParticipantDto>, var gameDuration: Long, var gameCreation: Long)

/*
    ParticipantIdentityDto
 */
data class ParticipantIdentityDto(var player: PlayerDto, var participantId: Int)

/*
    PlayerDto
 */
data class PlayerDto(var currentPlatformId: String, var summonerName: String, var matchHistoryUri: String,
                     var platformId: String, var currentAccountId: Long, var profileIcon: Int,
                     var summonerId: Long, var accountId: Long)

/*
    TeamStatsDto
 */
data class TeamStatsDto(var firstDragon: Boolean, var firstInhibitor: Boolean, var bans: List<TeamBansDto>,
                        var baronKills: Int, var firstRiftHeraId: Boolean, var firstBaron: Boolean,
                        var riftHeraIdKills: Int, var firstBlood: Boolean, var teamId: Int,
                        var firstTower: Boolean, var vilemawKills: Int, var inhibitorKills: Int,
                        var towerKills: Int, var dominionVictoryScore: Int, var win: String,
                        var dragonKills: Int)

/*
    TeamBansDto
 */
data class TeamBansDto(var pickTurn: Int, var championId: Int)

/*
    ParticipantDto
 */
data class ParticipantDto(var stats: ParticipantStatsDto, var participantId: Int, var runes: List<RuneDto>,
                          var timeline: ParticipantTimelineDto, var teamId: Int, var speel2Id: Int,
                          var masteries: List<MasteryDto>, var highestAchievedSeasonTier: String,
                          var spell1Id: Int, var championId: Int)

/*
    ParticipantStatsDto
 */

data class ParticipantStatsDto(var physicalDamageDealt: Long, var neutralMinionsKilledTeamJungle: Int,
                               var magicDamageDealt: Long, var totalPlayerScore: Int, var deaths: Int,
                               var win: Boolean, var neutralMinionsKilledEnemyJungle: Int,
                               var altarsCaptured: Int, var largestCriticalStrike: Int,
                               var totalDamageDealt: Long, var magicDamageDealtToChampions: Long,
                               var visionWardsBoughtInGame: Int, var damageDealtToObjectives: Long,
                               var largestKillingSpree: Int, var item1: Int, var quadraKills: Int,
                               var teamObjective: Int, var totalTimeCrowdControlDealt: Int,
                               var longestTimeSpentLiving: Int, var wardsKilled: Int,
                               var firstTowerAssist: Boolean, var firstTowerKill: Boolean,
                               var item2: Int, var item3: Int, var item0: Int,
                               var firstBloodAssist: Boolean, var visionScore: Long, var wardsPlaced: Int,
                               var item4: Int, var item5: Int, var item6: Int, var turretKills: Int,
                               var tripleKills: Int, var damageSelfMitigated: Long,
                               var champLevel: Int, var nodeNeutralizeAssist: Int,
                               var firstInhibitorKill: Boolean, var goldEarned: Int,
                               var magicalDamageTaken: Long, var kills: Int, var doubleKills: Int,
                               var nodeCaptureAssist: Int, var trueDamageTaken: Long,
                               var nodeNeutralize: Int, var firstInhibitorAssist: Boolean,
                               var assists: Int, var unrealKills: Int, var neutralMinionsKilled: Int,
                               var objectivePlayerScore: Int, var combatPlayerScore: Int,
                               var damageDealtToTurrets: Long, var altarsNeutralized: Int,
                               var physicalDamageDealtToChampions: Long, var goldSpent: Int,
                               var trueDamageDealt: Long, var trueDamageDealtToChampions: Long,
                               var participantId: Int, var pentaKills: Int, var totalHeal: Long,
                               var totalMinionsKilled: Int, var firstBloodKill: Boolean, var nodeCapture: Int,
                               var largestMultiKill: Int, var sightWardsBoughtInGame: Int,
                               var totalDamageDealtToChampions: Long, var totalUnitsHealed: Int,
                               var inhibitorKills: Int, var totalScoreRank: Int,
                               var totalDamageTaken: Long, var killingSprees: Int, var timeCCingOthers: Long,
                               var physicalDamageTaken: Long)

/*
    RuneDto
 */
data class RuneDto(var runeId: Int, var rank: Int)

/*
    ParticipantTimelineDto
 */
data class ParticipantTimelineDto(var lane: String, var participantId: Int, var csDiffPerMinDeltas: Map<String, Double>,
                                  var goldPerMinDeltas: Map<String, Double>, var xpDiffPerMinDeltas: Map<String, Double>,
                                  var creepsPerMinDeltas: Map<String, Double>, var xpPerMinDeltas: Map<String, Double>,
                                  var role: String, var damageTakenDiffPerMinDeltas: Map<String, Double>,
                                  var damageTakenPerMinDeltas: Map<String, Double>)

/*
    MasteryDto
 */
data class MasteryDto(var masteryId: Int, var rank: Int)