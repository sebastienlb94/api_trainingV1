package fr.esiea.ex4A.hello;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.ArrayList;

@Repository
class HelloRepository {
    final List<User> userSubscribed = new ArrayList<>();

    public HelloRepository() {
        User user1 = new User("pierre@esiea.fr", "Pierre", "Carton", "FR", "M", "M");
        userSubscribed.add(user1);
        User user2 = new User("yannis@esiea.fr", "Yannis", "Boughali", "FR", "M", "F");
        userSubscribed.add(user2);
        User user3 = new User("ahmed@esiea.fr", "Ahmed", "Samba", "FR", "M", "F");
        userSubscribed.add(user3);
        User user4 = new User("maxime@esiea.fr", "Maxime", "Gund", "FR", "M", "F");
        userSubscribed.add(user4);
        User user5 = new User("lisa@esiea.fr", "Lisa", "Rikab", "IT", "F", "M");
        userSubscribed.add(user5);
        User user6 = new User("marie@esiea.fr", "Marie", "Curie", "FR", "F", "M");
        userSubscribed.add(user6);
    }

    boolean userAdded(User user) {
        if(userSubscribed.contains(user)) {
            return false;
        }
        else {
            userSubscribed.add(user);
            return true;
        }
    }
}
