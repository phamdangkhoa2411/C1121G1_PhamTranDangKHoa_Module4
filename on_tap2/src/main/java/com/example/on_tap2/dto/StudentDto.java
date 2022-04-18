package com.example.on_tap2.dto;

import com.example.on_tap2.model.ClassStudent;

import javax.validation.constraints.*;

public class StudentDto {

    private Integer idStudent;
    @NotBlank
    @Size(min = 2, max = 45)
    private String nameStudent;
    @NotBlank
    @Min(value = 18, message = "phải trên 18 tuổi")
    @Max(value = 60, message = "quá tuổi đươc học")
    private String age;

    @NotBlank()
    @Email()
    private String email;

    @NotBlank()
    private ClassDto classDto;

    public StudentDto() {
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

    public ClassDto getClassDto() {
        return classDto;
    }

    public void setClassDto(ClassDto classDto) {
        this.classDto = classDto;
    }
}