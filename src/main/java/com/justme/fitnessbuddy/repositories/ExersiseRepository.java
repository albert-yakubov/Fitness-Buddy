package com.justme.fitnessbuddy.repositories;

import com.justme.fitnessbuddy.models.Exercise;
import org.springframework.data.repository.CrudRepository;

public interface ExersiseRepository extends CrudRepository<Exercise, Long> {
}
