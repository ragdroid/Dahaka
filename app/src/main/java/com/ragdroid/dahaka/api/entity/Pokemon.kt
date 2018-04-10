package com.ragdroid.dahaka.api.entity


class Pokemon {


    var id: Int? = null
    var name: String? = null
    var baseExperience: Int? = null
    var height: Int? = null
    var isDefault: Boolean? = null
    var order: Int? = null
    var weight: Int? = null
    var abilities: List<Ability>? = null
    var forms: List<Form>? = null
    var gameIndices: List<GameIndex>? = null
    var heldItems: List<HeldItem>? = null
    var locationAreaEncounters: String? = null
    var moves: List<Move>? = null
    var species: Species? = null
    var sprites: Sprites? = null
    var stats: List<Stat>? = null
    var types: List<Type>? = null


    class Ability {

        var isHidden: Boolean? = null
        var slot: Int? = null


        var ability: AbilityDetail? = null

    }

    class AbilityDetail {

        var name: String? = null

        var url: String? = null

    }


    class ConditionValue {

        var name: String? = null
        var url: String? = null

    }


    class EncounterDetail {

        var minLevel: Int? = null
        var maxLevel: Int? = null
        var conditionValues: List<ConditionValue>? = null
        var chance: Int? = null
        var method: Method? = null

    }


    class Form {

        var name: String? = null
        var url: String? = null

    }

    class GameIndex {

        var gameIndex: Int? = null
        var version: Version? = null

    }


    class HeldItem {

        var item: Item? = null
        var versionDetails: List<VersionDetail>? = null

    }


    class Item {

        var name: String? = null
        var url: String? = null

    }

    class Method {

        var name: String? = null


        var url: String? = null

    }


    class Move {


        var move: MoveDetail? = null


        var versionGroupDetails: List<VersionGroupDetail>? = null

    }

    class MoveLearnMethod {

        var name: String? = null
        var url: String? = null

    }

    class MoveDetail {

        var name: String? = null
        var url: String? = null

    }


    class Species {

        var name: String? = null
        var url: String? = null

    }


    class Sprites {


        var backFemale: String? = null
        var backShinyFemale: String? = null
        var backDefault: String? = null
        var frontFemale: String? = null
        var frontShinyFemale: String? = null
        var backShiny: String? = null
        var frontDefault: String? = null
        var frontShiny: String? = null

    }


    class Stat {

        var baseStat: Int? = null
        var effort: Int? = null
        var stat: StatDetail? = null

    }


    class StatDetail {


        var name: String? = null
        var url: String? = null

    }


    class Type {


        var slot: Int? = null
        var type: TypeDetail? = null

    }


    class TypeDetail {


        var name: String? = null
        var url: String? = null

    }


    class Version {


        var name: String? = null
        var url: String? = null

    }


    class VersionDetail {


        var rarity: Int? = null
        var version: Version? = null

    }


    class VersionDetails {


        var maxChance: Int? = null


        var encounterDetails: List<EncounterDetail>? = null


        var version: Version? = null

    }


    class VersionGroup {


        var name: String? = null
        var url: String? = null

    }


    class VersionGroupDetail {

        var levelLearnedAt: Int? = null
        var versionGroup: VersionGroup? = null
        var moveLearnMethod: MoveLearnMethod? = null

    }

}





