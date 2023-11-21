# Hexagonal  architecture Example practice

<p align="center">
  <img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white">
</p>

> Developed by: Bryam Vega
----

Project structure:

```bash
├── main
│         ├── java
│         │         └── com
│         │             └── blocking
│         │                 └── hexagonal
│         │                     ├── HexagonalApplication.java
│         │                     ├── application
│         │                     │         ├── ports
│         │                     │         │         ├── input
│         │                     │         │         │   └── UserIPort.java
│         │                     │         │         └── output
│         │                     │         │             └── UserOPort.java
│         │                     │         └── service
│         │                     │             └── UserService.java
│         │                     ├── domain
│         │                     │     └── User.java
│         │                     └── infrastructure
│         │                         ├── adapters
│         │                         │         ├── input
│         │                         │         │         ├── controller
│         │                         │         │         │      └── UserController.java
│         │                         │         │         ├── dto
│         │                         │         │         │      └── UserDTO.java
│         │                         │         │         └── mapper
│         │                         │         │             └── UserDTOMapper.java
│         │                         │         └── output
│         │                         │             ├── UserAdapter.java
│         │                         │             ├── entity
│         │                         │             │      └── UserEntity.java
│         │                         │             ├── mapper
│         │                         │             │      └── UserEntityMapper.java
│         │                         │             └── repository
│         │                         │                 └── UserRepository.java
│         │                         └── exception
│         │                                └── APIExceptionHandler.java
│         └── resources
│             ├── application.properties
│             ├── static
│             └── templates
└── test
    └── java
        └── com
            └── blocking
                └── hexagonal
                    └── HexagonalApplicationTests.java

```
