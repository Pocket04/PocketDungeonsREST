package app.pocket.Web.dto;

import app.pocket.Hero.Model.ClassType;
import app.pocket.Spells.Model.Spell;

import java.util.List;
import java.util.UUID;

public class GetHeroResponse {

    private UUID id;

    private int hp;

    private int maxHp;

    private String characterName;

    private ClassType classType;

    private String heroModel;

    private boolean isAlly;

    private String backStory;

    private List<Spell> spells;

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public String getHeroModel() {
        return heroModel;
    }

    public void setHeroModel(String heroModel) {
        this.heroModel = heroModel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    public UUID getId() {
        return id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public ClassType getClassType() {
        return classType;
    }

    public boolean isAlly() {
        return isAlly;
    }

    public String getBackStory() {
        return backStory;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public void setAlly(boolean ally) {
        isAlly = ally;
    }

    public void setBackStory(String backStory) {
        this.backStory = backStory;
    }
}
