package Springboot_DockerCompose_with_MariaDB.Entity;

import jakarta.persistence.*;

@Entity(name = "teacherdata")
public class Teacher
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TeacherID")
    int tid;
    @Column(name = "TeacherName")
    String tname;
    @Column(name = "Department")
    String dept;
    @Column(name = "Subject")
    String sub;
    @Column(name = "Salary")
    int sal;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
