package Springboot_DockerCompose_with_MariaDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// first build your image of your application {docker build -t "image_name"}
// then use docker compose up
// for accessing mariadb {docker exec -it container_name mariadb -u root -p}
@SpringBootApplication
public class SpringbootDockerComposeWithMariaDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerComposeWithMariaDbApplication.class, args);
	}
}
