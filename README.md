# LibraryBooks

This is a simple Web Application providing RESTful Web Services with Spring MVC and Hibernate CRUD for a library of books (information obtained from Project Gutenberg).

### Technology stack:

- Spring Boot version 2.5.6 (using Spring 5)
- Java 8
- Flyway
- Hibernate
- Maven
- PostgreSQL

### Steps to run the program:

[*Ensure that the system has Java SDK 8 and PostgreSQL installed*]

1. Start at the root folder (where the Maven wrapper mvnw can be run)
2. Run the command *./mvnw spring-boot:run* to start the server
3. Once the server is started, we can access the CRUD operations using Insomnia REST Client
4. To stop the server, press *Ctrl-c* at the terminal

### CRUD operations end points:
- GET /books -> To get full list of books
- GET /books/{id} -> To get a specific book with bookId id
- POST /books -> To create a new entry for a book
- PUT /books/{id} -> To update a book with bookId id with new information
- DELETE /books/{id} -> To delete a book with bookId id

---


## Other helpful information

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.6/maven-plugin/reference/html/#build-image)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#howto-execute-flyway-database-migrations-on-startup)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

