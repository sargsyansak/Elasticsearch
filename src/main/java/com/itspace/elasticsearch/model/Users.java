package com.itspace.elasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Document(indexName = "users", type = "users", shards = 1)
public class Users {

  private String name;
  @Id
  @GeneratedValue
  private Long id;
  private String teamName;
  private Long salary;
}
