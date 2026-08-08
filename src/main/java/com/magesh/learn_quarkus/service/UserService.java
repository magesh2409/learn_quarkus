package com.magesh.learn_quarkus.service;

import com.magesh.learn_quarkus.dto.request.GetUser;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class UserService {

    public Map<String, Object> getUser(String userId){
        Map <String, Object> result = new HashMap<>();
        result.put("name", "Magesh");
        result.put("age", 25);
        result.put("user_id", userId);
        return result;
    }

    public List< Map<String, Object> > getAllUsers(){
        List< Map<String, Object> > result = new ArrayList<>();
        result.add(createUser("Magesh", 25));
        result.add(createUser("Sivanesh", 20));
        return result;
    }

    private Map<String, Object> createUser(String name, int age){
        Map<String, Object> user = new HashMap<>();
        user.put("name", name);
        user.put("age", age);
        return user;
    }
}
