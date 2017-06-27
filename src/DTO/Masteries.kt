package DTO

/**
 * Created by jeongjihun on 2017. 6. 27..
 */

/*
    MASTERIES-V3

    /lol/platform/v3/masteries/by-summoner/{summonerId}

    MasteryPagesDto - This object contains masteries information.
 */
data class MasteryPagesDto(var pages: Set<MasteryPageDto>, var summonerId: Long)

/*
    MasteryPageDto - This object contains mastery page information.
 */
data class MasteryPageDto(var current: Boolean, var masteries: List<MasteryDto>, var name: String,
                          var id: Long)

/*
    MasteryDto - This object contains mastery information.
 */
data class MasteryDto(var id: Int, var rank: Int)