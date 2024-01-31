package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestMessenger {

    private static Messenger msg;

    @BeforeAll
    public static void createMessenger() {
        msg = new Messenger();
    }

    @Test
    public void checkMessage() {

        assertEquals(msg.sendMessage(), "Message from Messenger");
    }

    @Test
    public void checkWrongMessage() {

        assertNotEquals(msg.sendMessage(), "Hello World");
    }
}
