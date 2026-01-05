# Student Management System – REST API

A Spring Boot–based **Student Management System** that exposes RESTful APIs to perform CRUD operations on student data. This project was built to learn and demonstrate **REST APIs**, **Spring Boot**, **JPA/Hibernate**, **MySQL**, and **Postman**.

---

## 🚀 Features

* Create a new student
* Get all students
* Get a student by ID
* Update student details
* Delete a student

---

## 🛠 Tech Stack

* **Java**
* **Spring Boot**
* **Spring Data JPA (Hibernate)**
* **MySQL**
* **Maven**
* **Postman** (API testing)
* **Git & GitHub**

---

## 📁 Project Structure

```
secondproject
├── src/main/java/com/codding/secondproject
│   ├── controller
│   ├── service
│   ├── repository
│   ├── dto
│   ├── entity
│   └── config
├── src/main/resources
│   └── application.properties
└── pom.xml
```

---

## 🔗 Base URL

```
http://localhost:8080/api
```

---

## 📌 API Endpoints

### ➤ Create Student

**POST** `/api/Students`

```json
{
  "name": "Rahul",
  "email": "rahul@gmail.com",
  "age": 22
}
```

### ➤ Get All Students

**GET** `/api/Students`

### ➤ Get Student by ID

**GET** `/api/Students/{id}`

### ➤ Update Student

**PUT** `/api/Students/{id}`

```json
{
  "name": "Updated Name",
  "email": "updated@gmail.com",
  "age": 24
}
```

### ➤ Delete Student

**DELETE** `/api/Students/{id}`

---

## ⚙️ Database Configuration

Update your `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.servlet.context-path=/api
```

---

## ▶️ How to Run the Project

1. Clone the repository

   ```bash
   git clone https://github.com/shelkesamruddhi715-jpg/Student-management-system.git
   ```
2. Open the project in **IntelliJ IDEA**
3. Update MySQL credentials
4. Run `SecondprojectApplication`
5. Test APIs using **Postman**

---

## 📌 Learning Outcomes

* Understanding RESTful API design
* CRUD operations using Spring Boot
* DTO usage for clean architecture
* Handling HTTP status codes
* Using Git & GitHub for version control

---

## 🔮 Future Improvements

* Exception handling with `@ControllerAdvice`
* Input validation using `@Valid`
* Pagination & sorting
* Swagger API documentation

---

## 🙌 Author

**Samruddhi Rajendra Shelke**

---

⭐ If you like this project, feel free to star the repository!
