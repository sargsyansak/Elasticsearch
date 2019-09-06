package com.itspace.elasticsearch.resource;

import com.itspace.elasticsearch.builder.SearchQueryBuilder;
import com.itspace.elasticsearch.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/manual/search")
public class ManualSearchResource {

  @Autowired
  private SearchQueryBuilder searchQueryBuilder;


  @GetMapping(value = "/{text}")
  public List<Users> getAll(@PathVariable final String text) {
    return searchQueryBuilder.getAll(text);
  }
}
