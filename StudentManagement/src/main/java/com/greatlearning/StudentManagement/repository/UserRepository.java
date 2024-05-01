package com.greatlearning.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.StudentManagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String s);

}
