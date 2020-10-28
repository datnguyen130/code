package JAVA2.Lab_01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUserDefineOjectExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Rajeev", 25));
        users.add(new User("John", 34));
        users.add(new User("steve", 29));
        users.forEach(user -> {
            System.out.println("Name : " + user.getName() + " , Age :" + user.getAge());
        });
    }
}
