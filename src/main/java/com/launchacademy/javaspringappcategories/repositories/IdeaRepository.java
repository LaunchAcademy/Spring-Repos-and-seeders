package com.launchacademy.javaspringappcategories.repositories;

import com.launchacademy.javaspringappcategories.models.Idea;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IdeaRepository extends CrudRepository<Idea, Integer> {
  List findAllByName(String name);

//  Return all Ideas
List<Idea> findAll();

//  Return a specific Idea by id
//Idea findById();

//  Return a specific Idea by name
Idea findByName(String name);

//  Return an Idea which doesn't contain the word "Facebook"
List<Idea> findByDescriptionNotContaining(String description);

//  Return all Ideas that start with "Cat"
List<Idea> findByNameStartingWith(String name);

//  For an extra challenge figure out how to make this work with "Cat" or "cat" using a JPA query-method


//  Return all Ideas that end with "book"



}
