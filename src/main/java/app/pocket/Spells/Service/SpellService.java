package app.pocket.Spells.Service;

import app.pocket.Hero.Model.ClassType;
import app.pocket.Spells.Model.Spell;
import app.pocket.Spells.Model.SpellType;
import app.pocket.Spells.Repository.SpellRepository;
import app.pocket.Web.dto.CreateSpellRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SpellService {

    private final SpellRepository spellRepository;


    @Autowired
    public SpellService(SpellRepository spellRepository) {
        this.spellRepository = spellRepository;
    }

    public Spell createSpell(CreateSpellRequest createSpellRequest){
        Spell spell = new Spell();
        spell.setSpellName(createSpellRequest.getSpellName());
        spell.setSpellType(createSpellRequest.getSpellType());
        spell.setPower(createSpellRequest.getPower());
        spell.setDescription(createSpellRequest.getDescription());
        spell.setCoolDown(createSpellRequest.getCoolDown());
        spell.setClassType(createSpellRequest.getClassType());

        return spellRepository.save(spell);
    }

    public Spell getSpell(UUID id){
        return spellRepository.findSpellById(id);
    }
    public List<Spell> getAllSpells(ClassType classType){
        return spellRepository.findSpellsByClassType(classType);
    }

}
