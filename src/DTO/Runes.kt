package DTO.Runes

/**
 * Created by jeongjihun on 2017. 6. 27..
 */

/*
    RUNES-V3
    /lol/platform/v3/runes/by-summoner/{summonerId}


    RunePagesDto - This object contains rune pages information.
 */
data class RunePagesDto(var pages: Set<RunePageDto>, var summonerId: Long)

/*
    RunePageDto - This object contains rune page information.
 */
data class RunePageDto(var current: Boolean, var slots: Set<RuneSlotDto>, var name: String,
                       var id: Long)

/*
    RuneSlotDto - This object contains rune slot information.
 */
data class RuneSlotDto(var runeSlotId: Int, var runeId: Int)