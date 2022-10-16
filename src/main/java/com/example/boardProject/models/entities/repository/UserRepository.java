package com.example.boardProject.models.entities.repository;

import com.example.boardProject.models.entities.User;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  private static final Map<Long, User> store = new HashMap<>();
  private static long sequence = 0L;

  public User save(User user) {
    user.setId(++sequence);
    store.put(user.getId(), user);
    return user;
  }
}
