package Day7.Task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Player player1 = new Player(100);
        Player player2 = new Player(rd.nextInt(11) + 90);
        Player player3 = new Player(rd.nextInt(11) + 90);
        Player player4 = new Player(rd.nextInt(11) + 90);
        Player player5 = new Player(rd.nextInt(11) + 90);
        Player player6 = new Player(rd.nextInt(11) + 90);
        Player.info();
        Player player7 = new Player(rd.nextInt(11) + 90);
        Player.info();
        player1.run();
        for (int i = 0; i < 99; i++) {
            player1.run();
        }
        Player.info();



    }
}
