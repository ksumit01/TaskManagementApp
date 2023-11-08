# Task Management System

## Overview
The Task Management System is a comprehensive tool designed to facilitate efficient task management for users. It encompasses essential features such as user authentication, task creation, viewing, updating, and deletion. This document provides a detailed overview of the application's structure, components, services, and key features.

## Features
Login and Signup: Enables users to create new accounts and log in securely.
Dashboard: Facilitates a personalized task management dashboard for each user.
Task Management: Offers comprehensive functionality for adding, viewing, updating, and deleting tasks.
User Authentication: Ensures a secure and seamless login and logout experience.
- Technologies Used
- Frontend: Angular
- Backend: Spring Boot
- Database: MySQL


##Components
- Login Component: Manages user authentication.
- Signup Component: Facilitates user registration.
- View Task Component: Displays the task list and enables task management.
- Add Task Component: Allows users to create and add new tasks.
- Navbar Component: Offers easy navigation and logout functionality.
- Main Component: DashBoard Page Where View Task and Add Task Will Be Viewed.

## Services
User Service: Manages user-related functionalities such as login, signup, and authentication.
Task Service: Handles tasks-related functionalities including creation, deletion, updating, and retrieval of tasks.
Backend Integration
The application seamlessly integrates with the Spring Boot backend, leveraging its robust RESTful APIs for efficient user authentication and seamless task management.

## Local Storage Usage
The application employs the browser's local storage to store user data, ensuring seamless session management and data persistence.

## Future Improvements
Implement user role-based authentication for enhanced security.
Enhance the UI/UX to ensure a more intuitive and user-friendly experience.
Introduce search and filter functionalities within the task management section for improved task organization.
Adopt a secure token-based authentication system for enhanced security measures.

## Section to Run
- Run ng build to build the Angular frontend.
- Run ng serve to serve the Angular application.

 ###For the backend:

- In the properties file, create your own database name.
- Enter your own MySQL password and username.
- Check All the Required Dependencies, Update the Maven Project
- Start the SpringBoot Application

## Conclusion
The Task Management Application presents a user-friendly interface, integrating Angular for the frontend and Spring Boot for the backend. With its seamless user authentication and robust task management capabilities, it offers a comprehensive solution for effective task management and organization.
