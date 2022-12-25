# Political Figure Profiling System

Welcome to the Political Figure Profiling System! This project is a web application for profiling political figures in Malaysia. It is built using Java Spring Boot for the back-end and Angular for the front-end.

## Features

### Create, view, update, and delete profiles for political figures
- 📝 Add new political figures to the system
- 🔍 View political figure profiles
- 📝 Update political figure profiles
- ❌ Delete political figure profiles

### Search for political figures by name, political party, and location
- 🔍 Search for political figures by name
- 🔍 Search for political figures by political party
- 🔍 Search for political figures by location

### Add skills and achievements to political figure profiles
- 🏆 Add skills to political figure profiles
- 🏆 Add achievements to political figure profiles

### View a list of all political figures and filter by political party
- 🔍 View a list of all political figures
- 🔍 Filter political figures by political party

### Add knowledge to political figure profiles, including prerequisites for each knowledge
- 📚 Add knowledge to political figure profiles
- 📚 Add prerequisites for knowledge to political figure profiles

### View a list of qualifications for each political figure and calculate their rating score towards successful political point
- 📜 View a list of qualifications for each political figure
- 📊 Calculate rating score towards successful political point
- 📈 View progress towards political goals based on qualifications and rating score


## Getting Started

To get started with the project, you will need to have the following software installed on your machine:

- 💻 Java 8 or higher
- 📦 Maven
- 💻 Node.js and npm
- 💻 Angular CLI


You will also need to have a database set up and configure the application to connect to it. This can be done by modifying the `application.properties` file in the `src/main/resources` directory. If you are using a MySQL database, you will need to specify the connection details as follows:

    spring.datasource.url=jdbc:mysql://localhost:3306/database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password

Once you have the required software installed and the database configured, you can start the application by running the following command in the root directory of the project:

    mvn spring-boot:run

This will start the back-end server and the front-end server. The front-end will be available at http://localhost:4200.

## Contributing

We welcome contributions to the project! If you have an idea for a new feature or a bug fix, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.