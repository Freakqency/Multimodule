# Introduction 
This is a simple Maven Project That utilizes multimoduling to include external libraries,
In this project i have implemented two maven modules namely 

* MongoDB
* Restfull Endpoint 

The data from the mongodb  is obatined and shown using a restfull endpoint 

# Usage

To Run this application use the following command 

```bash
./mvnw install && ./mvnw spring-boot:run -pl application
```
# Application Endpoints


 * To insert data -[http://localhost:8080/mongo/insert](http://localhost:8080/mongo/insert)
 * To delete data - [http://localhost:8080/mongo/delete](http://localhost:8080/mongo/delete)
 * to view all data - [http://localhost:8080/mongo/](http://localhost:8080/mongo/) 
 * to view customers with name "Vijay" [http://localhost:8080/mongo/vijay](http://localhost:8080/mongo/vijay)



# Requirements

* mongoDB
* java

# License 

MIT