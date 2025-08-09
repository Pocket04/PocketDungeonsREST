package app.pocket.Web;

import app.pocket.Hero.Model.Hero;
import app.pocket.Hero.Service.HeroService;
import app.pocket.Spells.Model.Spell;
import app.pocket.Web.dto.CastSpellRequest;
import app.pocket.Web.dto.CreateHeroRequest;
import app.pocket.Web.dto.CreateHeroResponse;
import app.pocket.Web.dto.GetHeroResponse;
import app.pocket.Web.mapper.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/heroes")
@CrossOrigin(origins = "http://localhost:5174")
public class HeroController {

    private final HeroService heroService;
    private final DTOMapper dtoMapper;


    @Autowired
    public HeroController(HeroService heroService, DTOMapper dtoMapper) {
        this.heroService = heroService;
        this.dtoMapper = dtoMapper;
    }

    @PostMapping()
    public ResponseEntity<CreateHeroResponse> createHero(@RequestBody CreateHeroRequest createHeroDTO){
        CreateHeroResponse createHeroResponse = dtoMapper.mapHeroToCreateHeroResponse(heroService.createHero(createHeroDTO));
        return ResponseEntity.ok(createHeroResponse);
    }

    @GetMapping()
    public ResponseEntity<List<GetHeroResponse>> getHeroes(){
        List<GetHeroResponse> getHeroResponseList = new ArrayList<>();
        for (Hero hero : heroService.getAll()) {
            getHeroResponseList.add(dtoMapper.mapHeroToGetHeroResponse(hero));
        }
        return ResponseEntity.ok(getHeroResponseList);
    }

    @PutMapping()
    public ResponseEntity<GetHeroResponse> dealDamage(@RequestBody CastSpellRequest castSpellRequest){
        GetHeroResponse getHeroResponse = dtoMapper.mapHeroToGetHeroResponse(heroService.castSpell(castSpellRequest));
        return ResponseEntity.ok(getHeroResponse);
    }

}
