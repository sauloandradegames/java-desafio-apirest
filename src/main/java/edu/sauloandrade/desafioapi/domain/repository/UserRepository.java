package edu.sauloandrade.desafioapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.sauloandrade.desafioapi.domain.model.User;

//@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    boolean existsByAccountNumber(String accountNumber);
}