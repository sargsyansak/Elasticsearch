package com.itspace.elasticsearch.jparepository;

import com.itspace.elasticsearch.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<Users, Long> {
}
