package com.thinkxfactor.zomatoplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.User;

//The implementation of this interface is written by Spring DATA JPA
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByNameAndPassword(String name,String password);

}
