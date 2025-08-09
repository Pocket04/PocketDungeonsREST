package app.pocket.Hero.Model;


import app.pocket.Spells.Model.Spell;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true)
    private String characterName;

    @Column
    @Enumerated(EnumType.STRING)
    private ClassType classType;

    @Column
    private String heroModel;

    @Column
    private int HP;

    @Column
    private int maxHP;

    @Column
    private boolean isAlly;

    @Column
    private String backStory;

    @ManyToMany
    @JoinTable(name = "player_spells", joinColumns = @JoinColumn(name = "spell_id"), inverseJoinColumns = @JoinColumn(name = "hero_id"))
    private List<Spell> spells;

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public String getHeroModel() {
        return heroModel;
    }

    public void setHeroModel(String heroModel) {
        this.heroModel = heroModel;
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

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public boolean isAlly() {
        return isAlly;
    }

    public void setAlly(boolean ally) {
        isAlly = ally;
    }

    public String getBackStory() {
        return backStory;
    }

    public void setBackStory(String backStory) {
        this.backStory = backStory;
    }

    public List<Spell> getPlayerSpells() {
        return spells;
    }

    public void setPlayerSpells(List<Spell> playerSpells) {
        this.spells = playerSpells;
    }
}
