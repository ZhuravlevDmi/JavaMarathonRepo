package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDateBase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text){
        messages.add(new Message(u1,u2,text));
    }

    public static void showDialog(User u1, User u2){
        int counter = 0;
        for (int i = 0; i < messages.size(); i++) {
            if(messages.get(i).getSender().equals(u1) && messages.get(i).getReceiver().equals(u2)) {
                System.out.println(u1.getUserName() + ": " + messages.get(i).getText());
                counter++;
            }
            if(messages.get(i).getSender().equals(u2) && messages.get(i).getReceiver().equals(u1)) {
                System.out.println(u2.getUserName() + ": " + messages.get(i).getText());
                counter++;
            }
        }
        if(counter == 0)
            System.out.println("Сообщений между этими пользователями нет");
        System.out.println();
    }
}

