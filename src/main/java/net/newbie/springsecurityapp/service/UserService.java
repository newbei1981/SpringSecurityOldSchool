package net.newbie.springsecurityapp.service;

import net.newbie.springsecurityapp.model.User;

/**
 * Service class for {@link User}
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
