package Springboot_DockerCompose_with_MariaDB.Controller;

import Springboot_DockerCompose_with_MariaDB.Entity.Teacher;
import Springboot_DockerCompose_with_MariaDB.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TeacherController
{
    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping("/test")
    public String test()
    {
        return "Docker Compose test with MariaDB";
    }

    @PostMapping("/save")
    public String SaveData(@RequestBody Teacher teacher)
    {
        teacherRepository.save(teacher);
        return "Data Saved";
    }

    @GetMapping("/show")
    public List<Teacher> ShowData()
    {
        return teacherRepository.findAll();
    }

    @GetMapping("/byid/{tid}")
    public Optional<Teacher> ById(@PathVariable int tid)
    {
        return teacherRepository.findById(tid);
    }

    @PutMapping("/update/{tid}")
    public Teacher Update(@RequestBody Teacher teacher, @PathVariable int tid)
    {
        Teacher t = teacherRepository.findById(tid).get();
        t.setTname(teacher.getTname());
        t.setDept(teacher.getDept());
        t.setSub(teacher.getSub());
        t.setSal(teacher.getSal());
        teacherRepository.save(t);
        return t;
    }

    @DeleteMapping("/delete/{tid}")
    public String DeleteData(@PathVariable int tid)
    {
        teacherRepository.deleteById(tid);
        return "Data Deleted";
    }

}
