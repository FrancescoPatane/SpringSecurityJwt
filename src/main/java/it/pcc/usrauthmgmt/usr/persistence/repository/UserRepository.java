package it.pcc.usrauthmgmt.usr.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.pcc.usrauthmgmt.usr.persistence.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUsername(String username);

}
