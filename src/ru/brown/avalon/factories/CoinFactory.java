package ru.brown.avalon.factories;

import ru.brown.avalon.gameinterfaces.Castable;
import ru.brown.avalon.gameinterfaces.Coin;

public class CoinFactory implements CastableFactory {
    @Override
    public Castable getCastable() {
        return new Coin();
    }

    @Override
    public Castable getCastable(int castTimes) {
        return new Coin(castTimes);
    }
}
