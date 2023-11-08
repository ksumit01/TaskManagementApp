import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css'],
})
export class AddTaskComponent {
  task: any = {
    title: '',
    description: '',
    priority: 'low',
    status: 'todo',
    user: { id: 0 },
  };
  tasks: any[] = []; // Array to store tasks

  constructor(private http: HttpClient) {
    this.loadUserIdFromLocalStorage();
    this.getTasks(); // Load initial tasks
  }

  loadUserIdFromLocalStorage() {
    const userData = localStorage.getItem('user');
    if (userData) {
      const user = JSON.parse(userData);
      console.log(user.id);
      if (user.id) {
        this.task.user.id = user.id;
      }
    }
  }

  addTask() {
    this.loadUserIdFromLocalStorage();
    const apiEndpoint = 'http://localhost:8080/tasks';

    this.http.post<any>(apiEndpoint, this.task).subscribe(
      (response) => {
        console.log('Task added successfully:', response);
        this.getTasks(); // Update the tasks after adding a new one
      },
      (error) => {
        console.error('Error adding task:', error);
      }
    );

    this.task = {
      title: '',
      description: '',
      priority: 'low',
      status: 'todo',
      user: { id: this.task.user.id },
    };
  }

  getTasks() {
    const apiEndpoint = 'http://localhost:8080/tasks';
    this.http.get<any[]>(apiEndpoint).subscribe(
      (response) => {
        this.tasks = response;
      },
      (error) => {
        console.error('Error getting tasks:', error);
      }
    );
  }
}
