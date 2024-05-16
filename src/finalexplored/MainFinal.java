package finalexplored;

import finalexplored.gameconsole.game.Game;
import finalexplored.gameconsole.game.GameConsole;
import finalexplored.gameconsole.game.Player;
import finalexplored.gameconsole.pirate.PirateGame;

//class SpecialGameConsole<T extends Game<? extends Player>>
//    extends GameConsole<Game<? extends Player>> {
//
//    public SpecialGameConsole(Game<? extends Player> game) {
//        super(game);
//    }
//}

public class MainFinal {
    public static void main(String[] args) {
        GameConsole<PirateGame> game = new GameConsole<>(new PirateGame("Pirate Game"));

    }
}
