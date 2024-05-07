package com.institution.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<com.institution.security.User, Long> {
    com.institution.security.User findByUsername(String username);
}

