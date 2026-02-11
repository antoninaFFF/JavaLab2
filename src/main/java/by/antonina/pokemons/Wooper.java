package by.antonina.pokemons;

import by.antonina.attack.Slam;
import by.antonina.attack.special.Blizzard;
import by.antonina.attack.status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wooper extends Pokemon {

    public Wooper(String name, int level) {
        super(name, level);

        this.setStats(55, 45, 45, 25, 25, 15);
        this.setType(Type.WATER);
        this.addType(Type.GROUND);

        this.setMove(new Slam(), new Blizzard(), new Rest());
    }
}