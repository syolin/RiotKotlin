package DTO.StaticData

/**
 * Created by jeongjihun on 2017. 6. 27..
 */

/*
    LOL-STATIC-DATA-V3


    ChampionListDto - This object contains champion list data.
 */
data class StaticChampionListDto(var keys: Map<String, String>, var data: Map<String, StaticChampionDto>, var version: String,
                                 var type: String, var format: String)

/*
    ChampionDto - This object contains champion data
 */
data class StaticChampionDto(var info: StaticInfoDto, var enemytips: List<String>, var stats: StaticStatsDto,
                             var name: String, var title: String, var image: StaticImageDto,
                             var tags: List<String>, var partype: String, var skins: List<StaticSkinDto>,
                             var passive: StaticPassiveDto, var recommended: List<StaticRecommendedDto>, var allytips: List<String>,
                             var key: String, var lore: String, var id: Int, var blurb: String,
                             var spells: List<StaticChampionSpellDto>)

/*
    InfoDto - This object contains champion information.
 */
data class StaticInfoDto(var difficulty: Int, var attack: Int, var defense:Int,
                         var magic: Int)

/*
    StatsDto - This object contains champion stats data.
 */
data class StaticStatsDto(var armorperlevel: Double, var hpperlevel: Double, var attackdamage: Double,
                          var mpperlevel: Double, var attackspeedoffset: Double, var armor: Double,
                          var hp: Double, var hpregenperlevel: Double, var spellblock: Double,
                          var attackrange: Double, var movespeed: Double, var attackdamageperlevel: Double,
                          var mpregenperlevel: Double, var mp: Double, var spellblockperlevel: Double,
                          var crit: Double, var mpregen: Double, var attackspeedperlevel: Double,
                          var hpregen: Double, var critperlevel: Double)

/*
    ImageDto - This object contains image data.
 */
data class StaticImageDto(var full: String, var group: String, var sprite: String,
                          var h: Int, var w: Int, var y: Int, var x: Int)

/*
    SkinDto - This object contains champion skin data.
 */
data class StaticSkinDto(var num: Int, var name: String, var id: Int)

/*
    PassiveDto - This object contains champion passive data.
 */
data class StaticPassiveDto(var image: StaticImageDto, var sanitizedDescription: String, var name: String,
                            var description: String)

/*
    RecommendedDto - This object contains champion recommended data.
 */
data class StaticRecommendedDto(var map: String, var blocks: List<StaticBlockDto>, var champion: String,
                                var title: String, var priority: Boolean, var mode: String,
                                var type: String)

/*
    BlockDto - This object contains champion recommended block data.
 */
data class StaticBlockDto(var items: List<StaticBlockItemDto>, var recMath: Boolean, var type: String)

/*
    BlockItemDto - This object contains champion recommended block item data.
 */
data class StaticBlockItemDto(var count: Int, var id: Int)

/*
    ChampionSpellDto - This object contains champion spell data.
 */
data class StaticChampionSpellDto(var cooldownBurn: String, var resource: String, var leveltip: StaticLevelTipDto,
                                  var vars: List<StaticSpellVarsDto>, var costType: String, var image: StaticImageDto,
                                  var sanitizedDescription: String, var sanitizedTooltip: String,
                                  var effect: List<Object>, var tooltip: String, var maxrank: Int,
                                  var costBurn: String, var rangeBurn: String, var range: Object,
                                  var cooldown: List<Double>, var cost: List<Int>, var key: String,
                                  var description: String, var effectBurn: List<String>, var altimages: List<StaticImageDto>,
                                  var name: String)

/*
    LevelTipDto - This object contains champion level tip data.
 */
data class StaticLevelTipDto(var effect: List<String>, var label: List<String>)

/*
    SpellVarsDto - This object contains spell vars data.
 */
data class StaticSpellVarsDto(var ranksWith: String, var dyn: String, var link: String,
                              var coeff: List<Double>, var key: String)