package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    private User user;

    @BeforeEach
    void before(){
        user = new User(2,"ramon","morcillo");
    }

    @Test
    void testUserIntStringString(){
        assertEquals(2, user.getNumber());
        assertEquals("Ramon", user.getName());
        assertEquals("Morcillo", user.getFamilyName());
    }

    @Test
    void testFullName(){
        assertEquals("Ramon Morcillo", user.fullName());
    }

    @Test
    void testInitials(){
        assertEquals("R.", user.initials());
    }
}
