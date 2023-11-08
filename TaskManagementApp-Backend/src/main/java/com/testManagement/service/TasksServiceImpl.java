package com.testManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testManagement.model.Tasks;
import com.testManagement.repository.TasksRepo;

@Service
public class TasksServiceImpl implements TasksService{

	@Autowired
	TasksRepo tasksRepo;
	
	@Override
	public Tasks createTask(Tasks task) {
		// TODO Auto-generated method stub
		
		return tasksRepo.save(task);
	}

	@Override
	public List<Tasks> viewTasks(Integer uId) {
		// TODO Auto-generated method stub
		
		
		return tasksRepo.findByUserId(uId);
	}

	@Override
	public Tasks updateTasks(Tasks task ) {
		// TODO Auto-generated method stub
		
		
		return tasksRepo.save(task);
	}

	@Override
	public void deleteTasks(Integer tId) {
		// TODO Auto-generated method stub
		
		tasksRepo.deleteById(tId);
		
	}

}
