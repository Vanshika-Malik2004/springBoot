package com.vanshikacodes.fullstackbackend.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vanshikacodes.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
