# songr

Introduction to Spring MVC

Challenge
Use the Spring Initializr to create a new application with Web and Postgres dependencies.
#### Feature Tasks
Ensure that you can run the Spring app.
Create a hello world route at /hello, and ensure that you can visit that route in your browser and see data come back.
Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get the response THIS IS KINDA CAPITALIZED.
Write a unit test for the capitalization functionality of that route.


# lab 12: Spring RESTful Routing
Challenge
Create an Album model.
An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
A user should be able to see information about all the albums on the site.
A user should be able to add albums to the site.
#### Instructions:
Create a database called spring
Create an application.properties file inside of the resources directory and add the following:
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:/spring
spring.datasource.username= rawzi
spring.datasource.password=
spring.jpa.generate-ddl=true 
spring.jpq.hibernate.ddl-auto=create
Gradle command to run: ./gradlew bootrun
