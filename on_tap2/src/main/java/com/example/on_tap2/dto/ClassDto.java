package com.example.on_tap2.dto;

import javax.validation.constraints.Size;

public class ClassDto {

    private Integer idClass;

    @Size(min = 2, max = 45)
    private String nameClass;

    public ClassDto() {
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
