Resident Management System
Overview
This is a simple Resident Management System built using Java and Spring Boot. The project allows users to add, search, and manage resident information such as first name, last name, move-in date, and unit number. The project uses an in-memory list to store residents.

Features
Add new residents
Search for residents using filters (first name, last name, unit number, move-in date)
View a list of all residents

Project Structure
Resident.java: This is the entity class that represents the Resident object with fields such as firstName, lastName, moveInDate, and unitNumber.
ResidentController.java: This controller handles HTTP requests for adding residents and searching through existing residents.
ResidentService.java: A service class that contains the business logic for managing residents, including adding new residents and filtering the list.
ResidentRepository.java: Interface that extends JpaRepository to provide database access for Resident entities. This can be used for future database integration.
ResidentsDatabaseToolApplication.java: Main class to start the Spring Boot application.
templates/add-resident.html: Frontend form to add new residents.
templates/residents.html: Frontend form to search and display residents.

How to Run
Ensure that you have JDK 17+ installed.
Clone the repository.
Navigate to the project directory.
Run the application using the following command:
arduino
Copy code
./mvnw spring-boot:run
Open a web browser and go to http://localhost:8080/residents to view the list of residents or to http://localhost:8080/add-resident to add a new resident.

Endpoints
GET /residents: Displays the list of residents, allowing users to search using filters such as first name, last name, unit number, and move-in date.
GET /add-resident: Displays a form to add a new resident.
POST /add-resident: Accepts form data and adds a new resident to the system.

Adding a New Resident
To add a new resident:

Go to the /add-resident page.
Fill in the required fields (first name, last name, unit number, move-in date).
Click the "Add Resident" button to submit the form.
Searching for Residents

To search for residents:

Go to the /residents page.
Enter search criteria in the form fields (optional).
Click the "Search" button to display matching residents.

Dependencies
Spring Boot 3.x
Jakarta Persistence API (JPA)
Spring Data JPA
Thymeleaf (for HTML templates)

Author
Vitor Lopes
