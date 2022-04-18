package com.example.on_tap2.model;

import javax.persistence.*;

@Entity(name = "student")
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStudent;
    private String nameStudent;
    private String age;
    private String email;

    @ManyToOne()
    @JoinColumn(name = "id_class", referencedColumnName = "idClass")
    private ClassStudent classStudent;

    public Student() {
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClassStudent getClassStuden() {
        return classStudent;
    }

    public void setClassStuden(ClassStudent classStudentStuden) {
        this.classStudent = classStudentStuden;
    }
}
