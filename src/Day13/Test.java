package Day13;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Dima");
        User user2 = new User("Petya");
        User user3 = new User("Vasya");

        user1.sendMessage(user2, "Привет");
        user2.sendMessage(user1,"Здарова");
        user1.sendMessage(user2, "Петька, как у тебя дела? вечером все в силе?");
        user2.sendMessage(user1, "Диман, все ок, да в 20 00 встречаемся");
        user1.sendMessage(user2, "Ладно, тогда до встречи");


        user3.sendMessage(user1, "Хай, Диман");
        user1.sendMessage(user3, "Здарова Васёк");
        user3.sendMessage(user1, "Вечером встречаемся, с Петькой списывался?");
        user1.sendMessage(user3, "Да Васян, все ок!");
        user3.sendMessage(user1, "Лады, до вечера");
        user3.sendMessage(user1, "Лады, до вечера1!");



        MessageDateBase.showDialog(user1, user2);
        MessageDateBase.showDialog(user1, user3);
        MessageDateBase.showDialog(user2, user3);










    }
}
