# coding-assignment
Readme for Coding Assignment

This is a Springboot REST API (backend) implementation for a Stock data Application.

API Documentation can be viewd at here.

Tech Stack used

- Spring Boot REST API, Spring batch, Apache Camel, Spring JBA, In memory H2 Database
================================================
- End points Included in Implementation (Swagger.yml created)
================================================
	- /stocks/{ticker} (GET) - Application on startup loads initial dataset to replicate the scenario that there is some pre-existing data for user to fetch details. 
	GET operation exposed, helps to fetch that data using ticker ID.
	- /stocks/add/bulk/file (POST) - This operation lets user upload the file from UI (postman) and gets stored on TEMP server location for spring batch to pickup. 
	It returns 200 OK response as implemented. In project scenario, it would return a tracking ID for consumer which will be stored in DB and user can get processing status
	using this tracking ID information as a part of GET operation exposed.
	- /stocks/add/single (POST)
	This accepts single dataset record in JSON format and returns 200 OK response in current implementation. In project scenario, it would return a confirmation Id for consumer 
	which will be stored in DB for future reference and user can fetch details about this using GET operation exposed. 
	- Swagger schema definition implementation includes only couple of sample errors with description.

================================================	
- End point for future iterations (NOT IMPLEMENTED)
================================================
	- /stocks/add/bulk/location 
	For huge load and concurrency purpose - Client's file can be saved on secured storage location SAN drive/blob storage etc. and file pointer can be passed in request, 
	which can be accessed by API during processing. This will keep the request traffic light weight size as limited amount of data can be passed over HTTP.
	- Another way is to add callback api url which can be passed by user/application in the request which will be called by stock application once file processing is complete.


Implementation Details:	
- Spring Batch for file processing in batch mode. This is executed at the start to load the base dataset as well as after user uploads a file for bulk upload functionality (implemented)
- Apache Camel is used as scheduler and launcher in a futuristic way which can also be used for exchanging messaged between different systems if required in future.
- logback is used to create application log file. Performance and Audit logs to be added in future.

================================================
Additional Design Recommnedations for project-scenario
================================================
- OAuth Secutity to be implemented in real project scenario.
- Future implementation includes multithreaded file processing for bulk dataset once uploaded for performance improvement.
- Swagger schema definition for error handling scenario which will include HTTP status information, application custom error code, custom detailed error message
- Additional purge jobs for flushing the stored datasets and database records after business defined time period.
 
