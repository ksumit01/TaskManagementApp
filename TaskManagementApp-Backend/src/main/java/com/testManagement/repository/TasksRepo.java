package com.testManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testManagement.model.Tasks;

@Repository
public interface TasksRepo extends JpaRepository<Tasks, Integer> {

	List<Tasks> findByUserId(Integer uId);

}
