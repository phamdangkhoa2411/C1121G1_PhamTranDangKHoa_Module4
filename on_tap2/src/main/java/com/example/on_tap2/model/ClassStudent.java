package com.example.on_tap2.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "class")
@Table
public class ClassStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClass;
    private String nameClass;

    @OneToMany(mappedBy = "classStuden")
    private List<Student> studentList;
    public ClassStudent() {
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Integer getIdClass() {
        return idClass;
    }

    public void setIdClass(Integer idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
}
