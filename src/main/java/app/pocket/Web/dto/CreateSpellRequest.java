package app.pocket.Web.dto;


import app.pocket.Hero.Model.ClassType;
import app.pocket.Spells.Model.SpellType;

public class CreateSpellRequest {

    private String spellName;

    private SpellType spellType;

    private ClassType classType;

    private int power;

    private String description;

    private int coolDown;

    public ClassType getClassType() {
        return classType;
    }

    public String getSpellName() {
        return spellName;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public int getPower() {
        return power;
    }

    public String getDescription() {
        return description;
    }

    public int getCoolDown() {
        return coolDown;
    }
}
