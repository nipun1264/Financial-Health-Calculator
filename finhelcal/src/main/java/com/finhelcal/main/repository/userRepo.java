package com.finhelcal.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finhelcal.main.model.User;



@Repository
public interface userRepo extends JpaRepository<User, Integer>{

}
