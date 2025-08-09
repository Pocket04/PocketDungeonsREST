package app.pocket.Web.dto;

import app.pocket.Hero.Model.ClassType;
import app.pocket.Spells.Model.Spell;

import java.util.List;
import java.util.UUID;

public class CreateHeroResponse {

    private UUID id;

    private String characterName;

    private ClassType classType;

    private boolean isAlly;

    private String backStory;

    private List<Spell> spells;

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

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setId(UUID id) {
        this.id = id;
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
