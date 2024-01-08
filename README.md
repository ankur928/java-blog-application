 # Real-Time Blogging Platform

This is a dynamic, real-time blogging platform, leveraging the power of Spring Boot 3, Spring MVC, Thymeleaf, Spring Security 6, and Spring Data JPA. The application is backed by a MySQL database and hosted on Amazon RDS, ensuring scalability and reliability.

## Key Features

- **User Authentication:** Utilizes Spring Security 6 for secure registration and login processes.
- **Blog Post Management:** Create, read, update, and delete blog posts in real-time. This functionality is managed efficiently through Spring Data JPA.
- **Comment System:** An interactive platform enabling users to comment on posts, fostering community engagement.
- **Instant Updates:** Real-time reflection of new posts and comments, eliminating the need for page reloads.
- **Search Functionality:** Simplified navigation and search options for locating specific blog content.
- **Responsive UI:** A user-friendly interface designed with Thymeleaf, adaptable to various devices.

The application emphasizes user interaction, content management, and security, showcasing the integration of various Spring technologies to create a responsive and efficient web application.

## Administrative Access and Database Connection

### Admin Access to the Application

For administrative access:

- **Username:** admin@abcd.com
- **Password:** admin

This admin account provides elevated privileges for application management, including user management and content moderation.

### Amazon RDS Database Connection

- **Username:** admin
- **Password:** 6beu2GVwoTNugoD2exPa
- **Endpoint:** blog-application.chwwtfwl4m1j.us-east-2.rds.amazonaws.com

## Installation and Setup

### Prerequisites

- Java JDK 11 or later
- Maven 3.6 or later
- IntelliJ IDEA (Recommended) or Eclipse IDE (2023-12 version)

### Running the Application in IntelliJ IDEA (Highly Recommended)

1. Open IntelliJ IDEA.
2. Clone the repository or open the downloaded project.
3. Navigate to `src/main/java/com/ankurnow/springbootblogwebapp/SpringbootBlogWebappApplication.java`.
4. Right-click on the file and select 'Run SpringbootBlogWebappApplication'.

### Setting Up and Running the Application in Eclipse

#### Downloading the Project

1. Download the project source code from NYU Brightspace.
2. Extract the project to a known location.

#### Eclipse Setup

1. Install Eclipse IDE version 2023-12.
2. Install Spring Tools 4 extension for Eclipse.
3. Restart Eclipse after installation.

#### Installing Lombok

1. Download Lombok jar (version 1.18.30) and run it.
2. Follow the installation prompts.
3. Restart Eclipse post-installation.

#### Project Setup in Eclipse

1. Import the downloaded project as an 'Existing Maven Project'.
2. Replace the existing pom.xml and src folder with the downloaded ones.
3. Resolve Maven dependencies.

#### Running the Application

Navigate to `src/main/java/com/ankurnow/springbootblogwebapp/SpringbootBlogWebappApplication.java` and run it as a Java Application.

## Video Demonstration

- [IntelliJ IDEA Installation and Setup](https://www.dropbox.com/scl/fi/a1tm29spbd31hggj4qux4/Video-demo.mov?rlkey=gjkds8qza7sm9g3ggxkn05uz7&dl=0)
- [Eclipse Installation and Setup](https://www.dropbox.com/scl/fi/a1tm29spbd31hggj4qux4/Video-demo.mov?rlkey=gjkds8qza7sm9g3ggxkn05uz7&dl=0)
- [Blog Application Demo](https://www.dropbox.com/scl/fi/a1tm29spbd31hggj4qux4/Video-demo.mov?rlkey=gjkds8qza7sm9g3ggxkn05uz7&dl=0)

The video is also available on NYU Brightspace.

