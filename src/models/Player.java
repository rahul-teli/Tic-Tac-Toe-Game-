package models;

import lombok.Getter;

@Getter
public abstract class Player {
    String name;
    Character symbol;
    int id;

    public Player(String name, Character symbol, int id) {
        this.name = name;
        this.symbol = symbol;
        this.id = id;
    }
    public abstract Cell makeMove();

}
