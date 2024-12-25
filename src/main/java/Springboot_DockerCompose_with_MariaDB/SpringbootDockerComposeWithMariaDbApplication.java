package Springboot_DockerCompose_with_MariaDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// first build your image of your application {docker compose up --build}
// then use docker compose up
// for accessing mariadb {docker exec -it container_name mariadb -u root -p}

//docker run --name my-mariadb -e MARIADB_ROOT_PASSWORD=root -e MYSQL_DATABASE=mydb -p 3306:3306 -d mariadb:latest
@SpringBootApplication
public class SpringbootDockerComposeWithMariaDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerComposeWithMariaDbApplication.class, args);
	}
}
