package com.magesh.learn_quarkus.service;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {


    UserService userService = new UserService();

    @Test
    void shouldReturnUser() {

        Map<String, Object> user = userService.getUser("123");

        assertEquals("1", user.get("user_id"));
        assertEquals("Magesh", user.get("name"));
        assertEquals(25, user.get("age"));
        assertNotEquals("Macdcdfgesh", user.get("name"));
    }
}
