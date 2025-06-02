# 📚 Student Management System

A web-based Student Management System built using Java (J2EE), JSP, Servlets, and MySQL. This application allows users to manage student records with full CRUD (Create, Read, Update, Delete) functionality.

---

## 🚀 Features

- ➕ Add New Students  
- 📋 View All Student Records  
- 🖊️ Update Existing Student Information  
- ❌ Delete Student Records  
- 🛡️ Basic Form Validation  
- 👨‍💻 Simple and User-Friendly Interface

---

## 🛠️ Technologies Used

- **Frontend**: HTML, CSS, JSP  
- **Backend**: Java, Servlet  
- **Database**: MySQL  
- **Web Server**: Apache Tomcat  
- **IDE**: Eclipse IDE

---

## 🧑‍💻 How to Run This Project



2. 🧩 Import Project in Eclipse
Open Eclipse IDE

Go to: File -> Import -> Existing Projects into Workspace

Select the cloned folder

Finish

3. 🛢️ Set Up MySQL Database
Open MySQL or your preferred MySQL client

Run the following commands:

sql
Copy
Edit
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  email VARCHAR(100),
  phone VARCHAR(15)
);
4. 🔗 Configure Database Connection
Open the database connection file (e.g., DBConnection.java) and update:

java
Copy
Edit
String url = "jdbc:mysql://localhost:3306/studentdb";
String username = "root";
String password = "your_password"; // Replace with your MySQL password
5. 🌐 Deploy to Apache Tomcat
Right-click the project → Run As → Run on Server

Choose Apache Tomcat

Wait for the server to start

6. ✅ Access the Web App
Open your browser and visit:

arduino
Copy
Edit
http://localhost:8080/Student_Management/
📸 Screenshots
Add screenshots here if available (e.g., form UI, list of students, edit form, etc.)

🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

📄 License
This project is open-source and available under the MIT License.

🙋‍♂️ Author
Sachin Shinde
GitHub: @Sachinshindeb11

### 1. 📁 Clone the Repository

```bash
git clone https://github.com/Sachinshindeb11/Student_Management.git



