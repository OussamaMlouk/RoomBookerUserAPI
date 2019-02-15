package com.qa.roombooker.roombookerapi.persitence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.roombooker.roombookerapi.persistence.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
