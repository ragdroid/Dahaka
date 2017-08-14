package com.ragdroid.dahaka.api.entity;


import java.util.List;


public class Pokemon {


    private Integer id;
    private String name;
    private Integer baseExperience;
    private Integer height;
    private Boolean isDefault;
    private Integer order;
    private Integer weight;
    private List<Ability> abilities = null;
    private List<Form> forms = null;
    private List<GameIndex> gameIndices = null;
    private List<HeldItem> heldItems = null;
    private String locationAreaEncounters = null;
    private List<Move> moves = null;
    private Species species;
    private Sprites sprites;
    private List<Stat> stats = null;
    private List<Type> types = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public List<Form> getForms() {
        return forms;
    }

    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    public List<GameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<GameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public List<HeldItem> getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(List<HeldItem> heldItems) {
        this.heldItems = heldItems;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }



    public static class Ability {

        private Boolean isHidden;
        private Integer slot;


        private AbilityDetail ability;

        public Boolean getIsHidden() {
            return isHidden;
        }

        public void setIsHidden(Boolean isHidden) {
            this.isHidden = isHidden;
        }

        public Integer getSlot() {
            return slot;
        }

        public void setSlot(Integer slot) {
            this.slot = slot;
        }

        public AbilityDetail getAbility() {
            return ability;
        }

        public void setAbility(AbilityDetail ability) {
            this.ability = ability;
        }

    }

     public static class AbilityDetail {

        private String name;

        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }


    public static class ConditionValue {

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }


    public static class EncounterDetail {

        private Integer minLevel;
        private Integer maxLevel;
        private List<ConditionValue> conditionValues = null;
        private Integer chance;
        private Method method;

        public Integer getMinLevel() {
            return minLevel;
        }

        public void setMinLevel(Integer minLevel) {
            this.minLevel = minLevel;
        }

        public Integer getMaxLevel() {
            return maxLevel;
        }

        public void setMaxLevel(Integer maxLevel) {
            this.maxLevel = maxLevel;
        }

        public List<ConditionValue> getConditionValues() {
            return conditionValues;
        }

        public void setConditionValues(List<ConditionValue> conditionValues) {
            this.conditionValues = conditionValues;
        }

        public Integer getChance() {
            return chance;
        }

        public void setChance(Integer chance) {
            this.chance = chance;
        }

        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

    }


    public static class Form {

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public static class GameIndex {

        private Integer gameIndex;
        private Version version;

        public Integer getGameIndex() {
            return gameIndex;
        }

        public void setGameIndex(Integer gameIndex) {
            this.gameIndex = gameIndex;
        }

        public Version getVersion() {
            return version;
        }

        public void setVersion(Version version) {
            this.version = version;
        }

    }


    public static class HeldItem {

        private Item item;
        private List<VersionDetail> versionDetails = null;

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

        public List<VersionDetail> getVersionDetails() {
            return versionDetails;
        }

        public void setVersionDetails(List<VersionDetail> versionDetails) {
            this.versionDetails = versionDetails;
        }

    }


    public static class Item {

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public static class Method {

        private String name;


        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }


    public static class Move {


        private MoveDetail move;


        private List<VersionGroupDetail> versionGroupDetails = null;

        public MoveDetail getMove() {
            return move;
        }

        public void setMove(MoveDetail move) {
            this.move = move;
        }

        public List<VersionGroupDetail> getVersionGroupDetails() {
            return versionGroupDetails;
        }

        public void setVersionGroupDetails(List<VersionGroupDetail> versionGroupDetails) {
            this.versionGroupDetails = versionGroupDetails;
        }

    }

    public static class MoveLearnMethod {

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public static class MoveDetail {

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }


    public static class Species {

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }



    public static class Sprites {


        private String backFemale;
        private String backShinyFemale;
        private String backDefault;
        private String frontFemale;
        private String frontShinyFemale;
        private String backShiny;
        private String frontDefault;
        private String frontShiny;

        public String getBackFemale() {
            return backFemale;
        }

        public void setBackFemale(String backFemale) {
            this.backFemale = backFemale;
        }

        public String getBackShinyFemale() {
            return backShinyFemale;
        }

        public void setBackShinyFemale(String backShinyFemale) {
            this.backShinyFemale = backShinyFemale;
        }

        public String getBackDefault() {
            return backDefault;
        }

        public void setBackDefault(String backDefault) {
            this.backDefault = backDefault;
        }

        public String getFrontFemale() {
            return frontFemale;
        }

        public void setFrontFemale(String frontFemale) {
            this.frontFemale = frontFemale;
        }

        public String getFrontShinyFemale() {
            return frontShinyFemale;
        }

        public void setFrontShinyFemale(String frontShinyFemale) {
            this.frontShinyFemale = frontShinyFemale;
        }

        public String getBackShiny() {
            return backShiny;
        }

        public void setBackShiny(String backShiny) {
            this.backShiny = backShiny;
        }

        public String getFrontDefault() {
            return frontDefault;
        }

        public void setFrontDefault(String frontDefault) {
            this.frontDefault = frontDefault;
        }

        public String getFrontShiny() {
            return frontShiny;
        }

        public void setFrontShiny(String frontShiny) {
            this.frontShiny = frontShiny;
        }

    }



    public static class Stat {

        private Integer baseStat;
        private Integer effort;
        private StatDetail stat;

        public Integer getBaseStat() {
            return baseStat;
        }

        public void setBaseStat(Integer baseStat) {
            this.baseStat = baseStat;
        }

        public Integer getEffort() {
            return effort;
        }

        public void setEffort(Integer effort) {
            this.effort = effort;
        }

        public StatDetail getStat() {
            return stat;
        }

        public void setStat(StatDetail stat) {
            this.stat = stat;
        }

    }




    public static class StatDetail {


        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }



    public static class Type {



        private Integer slot;
        private TypeDetail type;

        public Integer getSlot() {
            return slot;
        }

        public void setSlot(Integer slot) {
            this.slot = slot;
        }

        public TypeDetail getType() {
            return type;
        }

        public void setType(TypeDetail type) {
            this.type = type;
        }

    }




    public static class TypeDetail {



        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }



    public static class Version {


        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }



    public static class VersionDetail {


        private Integer rarity;
        private Version version;

        public Integer getRarity() {
            return rarity;
        }

        public void setRarity(Integer rarity) {
            this.rarity = rarity;
        }

        public Version getVersion() {
            return version;
        }

        public void setVersion(Version version) {
            this.version = version;
        }

    }




    public static class VersionDetails {



        private Integer maxChance;


        private List<EncounterDetail> encounterDetails = null;


        private Version version;

        public Integer getMaxChance() {
            return maxChance;
        }

        public void setMaxChance(Integer maxChance) {
            this.maxChance = maxChance;
        }

        public List<EncounterDetail> getEncounterDetails() {
            return encounterDetails;
        }

        public void setEncounterDetails(List<EncounterDetail> encounterDetails) {
            this.encounterDetails = encounterDetails;
        }

        public Version getVersion() {
            return version;
        }

        public void setVersion(Version version) {
            this.version = version;
        }

    }




    public static class VersionGroup {


        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }




    public static class VersionGroupDetail {

        private Integer levelLearnedAt;
        private VersionGroup versionGroup;
        private MoveLearnMethod moveLearnMethod;

        public Integer getLevelLearnedAt() {
            return levelLearnedAt;
        }

        public void setLevelLearnedAt(Integer levelLearnedAt) {
            this.levelLearnedAt = levelLearnedAt;
        }

        public VersionGroup getVersionGroup() {
            return versionGroup;
        }

        public void setVersionGroup(VersionGroup versionGroup) {
            this.versionGroup = versionGroup;
        }

        public MoveLearnMethod getMoveLearnMethod() {
            return moveLearnMethod;
        }

        public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
            this.moveLearnMethod = moveLearnMethod;
        }

    }

}





