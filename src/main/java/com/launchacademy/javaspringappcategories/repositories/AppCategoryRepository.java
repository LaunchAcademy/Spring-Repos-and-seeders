package com.launchacademy.javaspringappcategories.repositories;

import com.launchacademy.javaspringappcategories.models.AppCategory;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface AppCategoryRepository extends CrudRepository<AppCategory, Integer> {

  List<AppCategory> findAllByName(String name);
}
