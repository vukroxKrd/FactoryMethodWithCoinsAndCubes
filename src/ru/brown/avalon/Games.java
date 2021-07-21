package ru.brown.avalon;

import ru.brown.avalon.factories.CastableFactory;
import ru.brown.avalon.factories.CoinFactory;
import ru.brown.avalon.factories.CubeFactory;
import ru.brown.avalon.gameinterfaces.Castable;

public class Games {
    public static void playGame(CastableFactory factory){
        Castable game = factory.getCastable();
        game.cast();
    }

    public static void playGame(CastableFactory factory, int castTimes){
        Castable game = factory.getCastable(castTimes);
        game.cast();
    }

    public static void main(String[] args) {
        playGame(new CoinFactory());
        playGame(new CubeFactory());
        playGame(new CoinFactory(),8);
        playGame(new CubeFactory(),7);
    }
}
