package edu.sauloandrade.desafioapi.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import edu.sauloandrade.desafioapi.domain.model.User;
import edu.sauloandrade.desafioapi.domain.repository.UserRepository;
import edu.sauloandrade.desafioapi.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
    
}
