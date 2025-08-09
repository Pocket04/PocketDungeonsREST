package app.pocket.Web.mapper;

import app.pocket.Hero.Model.Hero;
import app.pocket.Web.dto.CreateHeroResponse;
import app.pocket.Web.dto.GetHeroResponse;
import org.springframework.stereotype.Component;

@Component
public class DTOMapper {


    public CreateHeroResponse mapHeroToCreateHeroResponse (Hero hero){
        CreateHeroResponse createHeroResponse = new CreateHeroResponse();

        createHeroResponse.setCharacterName(hero.getCharacterName());
        createHeroResponse.setBackStory(hero.getBackStory());
        createHeroResponse.setAlly(hero.isAlly());
        createHeroResponse.setClassType(hero.getClassType());
        createHeroResponse.setId(hero.getId());

        return createHeroResponse;
    }

    public GetHeroResponse mapHeroToGetHeroResponse(Hero hero){
        GetHeroResponse getHeroResponse = new GetHeroResponse();

        getHeroResponse.setCharacterName(hero.getCharacterName());
        getHeroResponse.setBackStory(hero.getBackStory());
        getHeroResponse.setAlly(hero.isAlly());
        getHeroResponse.setClassType(hero.getClassType());
        getHeroResponse.setId(hero.getId());
        getHeroResponse.setSpells(hero.getSpells());
        getHeroResponse.setHp(hero.getHP());
        getHeroResponse.setHeroModel(hero.getHeroModel());
        getHeroResponse.setMaxHp(hero.getMaxHP());

        return getHeroResponse;
    }

}
