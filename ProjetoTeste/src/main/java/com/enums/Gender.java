package com.enums;

public enum Gender {
    MASCULINO("M"),
    FEMININO("F"),
    OUTRO("O");
    
    private final String gender;
    
    Gender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return gender;
    }
    
}
