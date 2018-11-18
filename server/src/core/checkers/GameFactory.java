package core.checkers;

import core.checkers.players.IPlayer;
import core.checkers.primitives.Checker;

import java.util.ArrayList;
import java.util.HashSet;

public class GameFactory implements IGameFactory {
    private final Generator generator = new Generator();

    @Override
    public IGame createGame(IPlayer whitePlayer, IPlayer blackPlayer) {
        HashSet<Checker> checkers = generator.getStartCheckers();
        GameBoard board = new GameBoard(checkers);
        return new Game(whitePlayer, blackPlayer, new GameState(), board);
    }
}
