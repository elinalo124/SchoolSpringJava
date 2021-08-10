package com.elina.repository;

import com.elina.model.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

/*@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findById(int id);
    List<Course> findAllByOrderByIdAsc();

}
 */
public interface CourseRepository {
    List<Course> findAll();
}
