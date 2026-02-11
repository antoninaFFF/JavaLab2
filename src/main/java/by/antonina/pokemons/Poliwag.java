package by.antonina.pokemons;

import by.antonina.attack.DoubleSlap;
import by.antonina.attack.status.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon {

    public Poliwag(String name, int level) {
        super(name, level);
        this.setStats(40, 50, 40, 40, 40, 90);
        this.setType(Type.WATER);

        this.setMove(new DoubleSlap(), new Confide());
    }
}