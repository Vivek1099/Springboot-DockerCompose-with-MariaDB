package Springboot_DockerCompose_with_MariaDB.Repository;

import Springboot_DockerCompose_with_MariaDB.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
