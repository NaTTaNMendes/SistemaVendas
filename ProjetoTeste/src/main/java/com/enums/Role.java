package com.enums;

public enum Role {
    CASHIER("C"),
    ADMIN("A"),
    MANAGER("M"),
    SUPPLIER("S");
    
    private final String role;
    
    Role(String role) {
        this.role = role;
    }
    
    public String getRole() {
        return role;
    }
    
}
