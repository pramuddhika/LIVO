package com.livo.system.user.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livo.system.user.UserEntity;

@Repository
public interface UserRespository extends JpaRepository<UserEntity, Long> {

}
