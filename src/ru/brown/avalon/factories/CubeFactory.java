package ru.brown.avalon.factories;

import ru.brown.avalon.gameinterfaces.Castable;
import ru.brown.avalon.gameinterfaces.Cube;

public class CubeFactory implements CastableFactory {

    @Override
    public Castable getCastable() {
        return new Cube();
    }

    @Override
    public Castable getCastable(int castTimes) {
        return  new Cube(castTimes);
    }
}
