package SeaBattle;

import java.util.Scanner;

public class FieldEnemy extends AbstractField implements TranslationCoordinates{
    private Player enemy;
    private Field field;
    private String[][] fieldEnemy = new String[12][12];
    public FieldEnemy(){
        for (int i = 0; i < fieldEnemy.length; i++) {
            for (int j = 0; j < fieldEnemy.length; j++) {
                fieldEnemy[i][j] = "⬜";
            }
        }
        addNumberAndLetterOrField();
    }
    public void shot(){
        Scanner sc = new Scanner(System.in);
        String coordinates = sc.nextLine();
        int x = coordinatesX(coordinates);
        int y = coordinatesY(coordinates);
        if(enemy.getField().getField()[y][x] == "")
    }
}
