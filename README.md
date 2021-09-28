# empmanagement

**Basic Employee Management Project using Java, Spring MVC and Hibernate.**

Technologies Used:
1. Java
2. Spring MVC
3. Hibernate
4. Maven
5. MySQL workbench
6. Eclipse IDE
7. Apache Tomcat 8.5

Steps to setup and run the project:
1. Download this project as zip and extract it.
2. Use eclipse IDE and import project as existing maven project and select employeemanagement folder.
3. Eclipse will import and maven will download the dependencies. (It may show and error to the jsp files that's because there is no server available. use Build Path -> Configure Build Path -> add library -> server runtime -> apache tomcat 8.5 and finish.)
4. Create database named employeemanagement in mySQL database. Make sure database is up and running. I have used XAMPP with MySQL workbench. and in spring-servlet.xml file check hibernate.dialect property matching with your database, for me MySQL5Dialect worked fine.
5. Now project is executable.

Project screenshots:
**Validations:**

![image](https://user-images.githubusercontent.com/43596078/135026483-56a80fa8-3167-4905-b078-acfd9b0538c1.png)
![image](https://user-images.githubusercontent.com/43596078/135026559-28a939ae-5940-4531-895b-3408a9ee83c2.png)

**Output on Successful submission:**

![image](https://user-images.githubusercontent.com/43596078/135026776-33840ab8-3baa-4fdd-92b2-5232fefdb091.png)

**Output for Search button:**

![image](https://user-images.githubusercontent.com/43596078/135026862-786dc046-c177-4529-a8e4-a733bee6bc15.png)

**Output if user doesn't exists in Database:**

![image](https://user-images.githubusercontent.com/43596078/135027118-3c10c316-b8a9-45c3-873a-97976c7c632e.png)

**Database screenshot:**

![image](https://user-images.githubusercontent.com/43596078/135027280-6c872253-c185-4dba-bdd3-5345b18b0413.png)
