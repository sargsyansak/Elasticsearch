package com.itspace.elasticsearch.repository;

import com.itspace.elasticsearch.model.Users;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UsersRepository extends ElasticsearchRepository<Users, Long> {

  List<Users> findByName(String text);
  List<Users> findBySalary(Long salary);
}
