package com.testing.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testing.user.entity.UsersEntity;

@Repository
public interface UserRepository extends CrudRepository<UsersEntity, Integer> {

}
