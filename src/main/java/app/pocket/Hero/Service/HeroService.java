package app.pocket.Hero.Service;

import app.pocket.Hero.Model.ClassType;
import app.pocket.Hero.Model.Hero;
import app.pocket.Hero.Repository.HeroRepository;
import app.pocket.Spells.Model.Spell;
import app.pocket.Spells.Service.SpellService;
import app.pocket.Web.dto.CastSpellRequest;
import app.pocket.Web.dto.CreateHeroRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {

    private final HeroRepository heroRepository;
    private final SpellService spellService;

    @Autowired
    public HeroService(HeroRepository heroRepository, SpellService spellService) {
        this.heroRepository = heroRepository;
        this.spellService = spellService;
    }

    public Hero createHero(CreateHeroRequest createHeroDTO){
        Hero hero = new Hero();
        hero.setCharacterName(createHeroDTO.getCharacterName());
        if (!createHeroDTO.isAlly()){
            hero.setClassType(ClassType.BOSS);
        }
        else {
            hero.setClassType(createHeroDTO.getClassType());
        }
        hero.setAlly(createHeroDTO.isAlly());
        hero.setBackStory(createHeroDTO.getBackstory());
        switch (hero.getClassType()){
            case WARRIOR:
                hero.setPlayerSpells(spellService.getAllSpells(ClassType.WARRIOR));
                hero.setHeroModel("https://res.cloudinary.com/ddaf5iq7k/image/upload/v1753447832/warriorImage_qxsrci.png");
                hero.setHP(50);
                hero.setMaxHP(50);
                break;
            case PRIEST:
                hero.setPlayerSpells(spellService.getAllSpells(ClassType.PRIEST));
                hero.setHeroModel("https://res.cloudinary.com/ddaf5iq7k/image/upload/v1753447812/priestImage_vwcqjp.png");
                hero.setHP(25);
                hero.setMaxHP(25);
                break;
            case ROGUE:
                hero.setPlayerSpells(spellService.getAllSpells(ClassType.ROGUE));
                hero.setHeroModel("https://res.cloudinary.com/ddaf5iq7k/image/upload/v1753447827/rogueImage_yubjjl.png");
                hero.setHP(20);
                hero.setMaxHP(20);
                break;
            case BOSS:
                hero.setPlayerSpells(spellService.getAllSpells(ClassType.BOSS));
                hero.setHeroModel("https://res.cloudinary.com/ddaf5iq7k/image/upload/v1753447836/wizardImage_digzzr.png");
                hero.setHP(100);
                hero.setMaxHP(100);
                break;
        }

        return heroRepository.save(hero);
    }

    public List<Hero> getAll(){
        return heroRepository.findAll();
    }

    public Hero castSpell(CastSpellRequest castSpellRequest){
        Hero hero = heroRepository.findById(castSpellRequest.getTargetId()).get();
        Spell spell = spellService.getSpell(castSpellRequest.getSpellId());
        hero.setHP(hero.getHP() + spell.getPower());
        return heroRepository.save(hero);
    }

}
