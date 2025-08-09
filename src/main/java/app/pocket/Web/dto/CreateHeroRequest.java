package app.pocket.Web.dto;


import app.pocket.Hero.Model.ClassType;

import java.util.UUID;

public class CreateHeroRequest {

    private String characterName;

    private ClassType classType;

    private boolean ally;

    private String backstory;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }


    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public boolean isAlly() {
        return ally;
    }

    public void setAlly(boolean anAlly) {
        ally = anAlly;
    }

    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }
}
