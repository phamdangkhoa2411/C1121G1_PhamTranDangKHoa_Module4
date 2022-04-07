package com.example.form_user.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserDto {
    private Integer id;

    @NotBlank
    @Size(min = 5, max = 45)
    private String firstName;

    @NotBlank
    @Size(min = 5, max = 45)
    private String lastname;

    @Pattern(regexp = "[0-9]{10}", message = "vui lòng nhập đúng định dạng")
    private String phone;

    @Min(value = 18,message = "phải trên 18 tuổi")
    private Integer age;

    @NotBlank
    @Email(message = "[a-z]@[a-z].com")
    private String Email;

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

