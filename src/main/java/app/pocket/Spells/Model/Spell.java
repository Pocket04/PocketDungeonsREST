package app.pocket.Spells.Model;

import app.pocket.Hero.Model.ClassType;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Spell {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String spellName;

    @Column
    @Enumerated(EnumType.STRING)
    private SpellType spellType;

    @Column
    @Enumerated(EnumType.STRING)
    private ClassType classType;

    @Column
    private int power;

    @Column
    private String description;

    @Column
    private int coolDown;

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public UUID getId() {
        return id;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public void setCoolDown(int coolDown) {
        this.coolDown = coolDown;
    }
}
