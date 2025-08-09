package app.pocket.Web;


import app.pocket.Spells.Model.Spell;
import app.pocket.Spells.Service.SpellService;
import app.pocket.Web.dto.CreateSpellRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/spells")
@CrossOrigin(origins = "http://localhost:5174")
public class SpellController {


    private final SpellService spellService;

    public SpellController(SpellService spellService) {
        this.spellService = spellService;
    }

    @PostMapping()
    public ResponseEntity<Spell> createSpell(@RequestBody CreateSpellRequest createSpellRequest){
        return ResponseEntity.ok(spellService.createSpell(createSpellRequest));
    }

}
