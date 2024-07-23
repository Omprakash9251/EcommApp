package com.example.ecomm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecomm.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long>{

    
}