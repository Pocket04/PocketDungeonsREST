package app.pocket.Spells.Repository;

import app.pocket.Hero.Model.ClassType;
import app.pocket.Spells.Model.Spell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SpellRepository extends JpaRepository<Spell, UUID> {
    Spell findSpellById(UUID id);

    List<Spell> findSpellsByClassType(ClassType classType);
}
