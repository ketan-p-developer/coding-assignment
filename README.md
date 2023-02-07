# coding-assignment
Readme for Coding Assignment

This is a Springboot REST API (backend) implementation for a Stock data Application.

API Documentation can be viewd at here.

Tech Stack used

- Spring Boot REST API
- Spring Batch for file processing in batch mode. This is executed at the start to load the base dataset as well as after user uploads a file for bulk upload functionality (implemented)
- Future implementation includes multithreaded file processing for bulk dataset.
- Apache Camel is used as scheduler and launcher in a futuristic way which can also be used for exchanging messaged between different systems if required in future.
- OAuth Secutity to be implemented in future
- logback is used to create application log file. Performance and Audit logs to be added in future.
