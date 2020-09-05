package Day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscriptions = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;

    }

    public void sendMessage(User user, String text){
        MessageDateBase.sendMessage(this,user,text);
    }

    @Override
    public String toString() {
        return userName;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }
    public boolean isSubscribe(User user){
        for (int i = 0; i < subscriptions.size(); i++) {
            if(subscriptions.get(i).equals(user)){
                return true;
            }
        }
        return false;
    }

    public boolean isFriend (User user){
        for (int i = 0; i < user.getSubscriptions().size(); i++) {
            if(user.getSubscriptions().get(i).equals(this) && isSubscribe(user) == true)
                return true;
        }
        return false;
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}
