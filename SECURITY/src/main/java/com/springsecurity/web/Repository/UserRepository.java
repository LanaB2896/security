package com.springsecurity.web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.web.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String username);

}
