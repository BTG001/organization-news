# Project Name
#### [Organization News App](https://github.com/BTG001/organization-news)

# Author Name
This project was authored by Bruno Towett

# Description
The news portal app is intended to be used by an organization to pass their news to the other employees. The news can be either departmental or general news.

# Project Setup
### Database Setup
Click this [link](https://www.postgresql.org/download/) to install postgreSQL if you don't have one.

for ubuntu users use the following in the terminal:

> sudo apt-get update

> sudo apt-get install postgresql postgresql-contrib libpq-dev


 ##### creating database
open your terminal and paste the following:
> psql <drop.sql 

This will clear the databases created with same name

> psql <create.sql

This will create all tables required for the system

### cloning project

Click [here](https://github.com/BTG001/organization-news) and fork this repository to your github.

Copy the clone link.

Navigate through your local storage to your favourite directory using terminal.

Clone the App to your local storage and launch it.

# Getting things ready
 navigate to your project and make necessary changes to the following files
 #### path
 > organization-news/src/main/java/App

>>  String connectionString = "jdbc:postgresql://localhost:5432/organisational_news_portal";

>>  Sql2o sql2o = new Sql2o(connectionString, "user", "pass");

> organization-news/src/test/java/models/dao/

make necessary changes to the database links in the test files

>>  String connectionString = "jdbc:postgresql://localhost:5432/organisational_news_portal_test";

>>  Sql2o sql2o = new Sql2o(connectionString, "user", "pass");
 
  # Api Documentation
  
  ## users
  
  ### new user
  
  > http://localhost:4567/users/new
 
  {
  
 "name":"Mbae",
 
 "email":"mbae@gmail.com",
 
 "phone":"0712345678",
 
 "idNumber":"12345"
 
 }
 
 ### get all users
 
 > http://localhost:4567/users
 
 ### get user by id
 
 > http://localhost:4567/user/:id
 
 replace :id with the user id (eg 2)
 
 ### remove user by id
 
 > http://localhost:4567/users/:id/remove
 
 replace :id with the user id (eg 2)
 
 ### Clear entire database
 
 > http://localhost:4567/users/clear
 
 ## Department
 
 ### New department
 
 > http://localhost:4567/department/new
 
 {
 
 	"name":"Customer Desk",
 	
 	"floor":"Ground"
 	
 }
 
 ### get all departments
 
 > http://localhost:4567/departments
 
 ### get department by id
 
 > http://localhost:4567/department/:id
 
 replace :id with the department id (eg 2)
 
 ### remove department by id
 
 > http://localhost:4567/departments/:id/remove
 
 replace :id with the department id (eg 2)
 
 ### clear department database
 
 > http://localhost:4567/departments/remove/all
 
 ## General news
 
 ### new
 
 > http://localhost:4567/news/general-news/new
 
 {
 
 	"content":"Tomorrow is a long holiday",
 	
 	"type":"General News"
 	
 }
 
 ### fetch general news 
 
 > http://localhost:4567/news/general-news/
 
 ### clear the database
 
 > http://localhost:4567/news/general-news/clear
 
 ## Department news
 
 ### new
 
 > http://localhost:4567/news/department-news/new
 
 {
 
 	"content":"public holiday approaching",
 	
 	"type":"Department News"
 	
 }
 
 ## fetch department news
 
 > http://localhost:4567/news/department-news
 
 ### clear the database
 
 > http://localhost:4567/news.department-news/clear
  
  :phone: Incase of anything you can easily reach me through:
  * brunokipkorir2@gmail.com
  
  ### License
  
  * MIT LICENCE [MIT](http://opensource.org/licenses/MIT)
  © 2020 BRUNO TOWETT
  

