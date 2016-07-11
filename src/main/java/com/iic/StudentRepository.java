package com.iic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 6/30/2016.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student1,Integer> {
}
