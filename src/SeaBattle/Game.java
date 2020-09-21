package SeaBattle;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Game {
    private SingleDeckShip ship1 = new SingleDeckShip();
    private DoubleDeckShip ship2 = new DoubleDeckShip();
    private ThreeDeckSheep ship3 = new ThreeDeckSheep();
    private FourDeckShip ship4 = new FourDeckShip();

    private Player p1;
    private Player p2;
    public Game(){
        System.out.println("Ну что начнем");
        System.out.println("Игрок №1, введдите ваше имя: ");
        p1 = new Player(name(), new Field());
        System.out.println("Игрок №2, введите ваше имя");
        p2 = new Player(name(), new Field());
        System.out.println("Здраствуй " + p1.getName() + "\n" +
                "Здраствуй " + p2.getName());
        System.out.println("Ну что же, давайте начнем!");
        timer();
        System.out.println(p1.getName() + " Заполните пожалуйста поле кораблями");
        fillingField(p1);
indent();
        System.out.println(p2.getName() + " Заполните пожалуйста поле кораблями");
        fillingField(p2);

    }
    public String name(){
       Scanner sc = new Scanner(System.in);
       return sc.nextLine();
    }
    void timer(){
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Понеслась!");
    }
    void fillingField(Player p) {
        ship1.addShip(p.getField());
        ship1.addShip(p.getField());
        ship1.addShip(p.getField());
        ship1.addShip(p.getField());
        ship2.addShip(p.getField());
        ship2.addShip(p.getField());
        ship2.addShip(p.getField());
        ship3.addShip(p.getField());
        ship3.addShip(p.getField());
        ship4.addShip(p.getField());
    }
    public void indent(){
        for (int i = 0; i < 7; i++) {
            System.out.println();

        }
    }

}
