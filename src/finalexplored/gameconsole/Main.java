package finalexplored.gameconsole;

import finalexplored.gameconsole.game.GameConsole;
import finalexplored.gameconsole.game.ShooterGame;
import finalexplored.gameconsole.pirate.Pirate;
import finalexplored.gameconsole.pirate.Weapon;

public class Main {
    public static void main(String[] args) {
//        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);
        Weapon weapon = Weapon.getWeaponByChar('P');
        System.out.println("weapon = " + weapon + ", hitpoints = " + weapon.getHitPoints() + ", minLevel = " + weapon.getMinLevel());

        var list = Weapon.getWeaponsByLevel(1);
        list.forEach(System.out::println);

        Pirate tim = new Pirate("Tim");
        System.out.println(tim);
    }
}
