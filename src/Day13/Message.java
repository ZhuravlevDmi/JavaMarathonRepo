package Day13;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date = new Date();

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    @Override
    public String toString() {
        return "FROM: " + sender.getUserName() + "/n" +
               "TO: " + receiver.getUserName() + "/n" +
                "ON: " + date +
                text;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}
