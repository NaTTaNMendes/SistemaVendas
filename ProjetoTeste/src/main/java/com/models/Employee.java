package com.models;

import com.enums.Gender;
import com.enums.Role;
import java.util.Date;

public class Employee extends Person{
    
    private Role role;
    private String password;
    
    public Employee(Integer id, String name, Gender gender, String email, Long cpf, Date dateBirth, Role role, String password) {
        super(id, name, gender, email, cpf, dateBirth);
        this.role = role;
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean login(String email, String password) {
        String emailCorreto = "adm";
        String senhaCorreta = "adm";
        
        if (email.equals(emailCorreto) && password.equals(senhaCorreta)) {
            return true;
        }
        return false;
    }
    
    
}
