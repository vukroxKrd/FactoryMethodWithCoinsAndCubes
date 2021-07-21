package ru.brown.avalon.factories;

import ru.brown.avalon.gameinterfaces.Castable;

public interface CastableFactory {
    Castable getCastable();
    Castable getCastable(int castTimes);
}
