package com.example.demo.user.repository;

import com.example.demo.user.model.UserFollow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFollowRepository extends CrudRepository<UserFollow, Integer> {
}
