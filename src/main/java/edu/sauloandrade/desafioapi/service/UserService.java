package edu.sauloandrade.desafioapi.service;

import edu.sauloandrade.desafioapi.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
