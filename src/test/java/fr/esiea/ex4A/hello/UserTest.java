package fr.esiea.ex4A.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void Constructor() {
        User user = new User("ssoto@et.esiea.fr", "Sebastien", "seb", "France", "M", "F");
        Assertions.assertNotNull(user);
    }

    void getUserEmail() {
        User user = new User("ssoto@et.esiea.fr", "Sebastien", "seb", "France", "M", "F");
        Assertions.assertEquals("ssoto@et.esiea.fr", user.getUserEmail());
    }

    void getUserName() {
        User user = new User("ssoto@et.esiea.fr", "Sebastien", "seb", "France", "M", "F");
        Assertions.assertEquals("Sebastien", user.getUserName());
    }

    void getUserTweeter() {
        User user = new User("tchiasso@et.esiea.fr", "Armel", "seb", "France", "M", "F");
        Assertions.assertEquals("seb", user.getUserTweeter());
    }

    void getUserCounter() {
        User user = new User("tchiasso@et.esiea.fr", "Armel", "seb", "France", "M", "F");
        Assertions.assertEquals("France", user.getUserCountry());
    }

    void getUserSex() {
        User user = new User("tchiasso@et.esiea.fr", "Armel", "armelito", "France", "M", "F");
        Assertions.assertEquals("M", user.getUserSex());
    }

    void getUserSexPref() {
        User user = new User("tchiasso@et.esiea.fr", "Armel", "seb", "France", "M", "F");
        Assertions.assertEquals("F", user.getUserSexPref());
    }
}
