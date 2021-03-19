package fr.esiea.ex4A.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatchTest {
    @Test
    void getName() {
        Match match = new Match("sebastien", "seb");
        Assertions.assertEquals("sebastien", match.getName());
    }

    @Test
    void getTwitter() {
        Match match = new Match("sebastien", "seb");
        Assertions.assertEquals("seb", match.getTwitter());
    }
}
