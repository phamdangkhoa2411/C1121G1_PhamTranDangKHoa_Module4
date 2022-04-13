package com.example.form_user.dto;

import javax.validation.constraints.*;

public class UserDto {
    private Integer id;

    @NotBlank
    @Size(min = 2, max = 45)
    private String firstName;

    @NotBlank
    @Size(min = 1, max = 45)
    private String lastName;

    @Pattern(regexp = "[0-9]{10}", message = "vui lòng nhập đúng định dạng")
    private String phone;

    @Min(value = 18,message = "phải trên 18 tuổi")
    @Max(value = 60,message = "quá tuỏio quy định")
//    @NotBlank
    private Integer age;


    @Email()
    @NotBlank()
    private String email;

    public UserDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

