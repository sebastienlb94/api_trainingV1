package fr.esiea.ex4A.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void Constructor() {
        User user = new User("ssoto@et.esiea.fr", "Sebastien", "seb", "France", "M", "F");
        Assertions.assertNotNull(user);
    }

    @Test
    void getUserEmail() {
        User user = new User("ssoto@et.esiea.fr", "Sebastien", "seb", "France", "M", "F");
        Assertions.assertEquals("ssoto@et.esiea.fr", user.getUserEmail());
    }
    @Test
    void getUserName() {
        User user = new User("ssoto@et.esiea.fr", "Sebastien", "seb", "France", "M", "F");
        Assertions.assertEquals("Sebastien", user.getUserName());
    }

    @Test
    void getUserTweeter() {
        User user = new User("ssoto@et.esiea.fr", "Sebastien", "seb", "France", "M", "F");
        Assertions.assertEquals("seb", user.getUserTweeter());
    }

    @Test
    void getUserCounter() {
        User user = new User("tchiasso@et.esiea.fr", "Sebastien", "seb", "France", "M", "F");
        Assertions.assertEquals("France", user.getUserCountry());
    }

    @Test
    void getUserSex() {
        User user = new User("ssoto@et.esiea.fr", "Sebastien", "seb", "France", "M", "F");
        Assertions.assertEquals("M", user.getUserSex());
    }

    @Test
    void getUserSexPref() {
        User user = new User("ssoto@et.esiea.fr", "Sebastien", "seb", "France", "M", "F");
        Assertions.assertEquals("F", user.getUserSexPref());
    }
}
