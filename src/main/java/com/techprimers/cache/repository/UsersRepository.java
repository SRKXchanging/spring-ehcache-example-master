package com.techprimers.cache.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.cache.model.Users;

@Transactional
public interface UsersRepository extends JpaRepository<Users, Long> {
	Users findById(Long id);
    Users findByName(String name);
}
