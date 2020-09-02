package Day7.Task2;

public class Player {
    private  int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if(stamina > MAX_STAMINA) stamina = MAX_STAMINA;
        if(stamina < MIN_STAMINA) stamina = MIN_STAMINA;

        if(countPlayers < 6)
            countPlayers++;
    }

    void run(){
        if(stamina == MIN_STAMINA){
            System.out.println("Игрок не побежит, его уже нет на поле");
            return;
        }
        stamina--;
            if(stamina == MIN_STAMINA){
                System.out.println("Игрок выдохся и уходит с поля");
            countPlayers--;
            }
        }


    static void info(){
        if (countPlayers == 6){
            System.out.println("Мест в командах больше нет." + " На поле все " + countPlayers + " игроков");
        }if (countPlayers < 6){
            System.out.println("Команды не полные, еще есть " + (6 - countPlayers) + " свободных мест");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public static int getMaxStamina() {
        return MAX_STAMINA;
    }

    public static int getMinStamina() {
        return MIN_STAMINA;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void setCountPlayers(int countPlayers) {
        Player.countPlayers = countPlayers;
    }
}
