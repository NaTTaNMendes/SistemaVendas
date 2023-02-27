package com.models;

import com.enums.Gender;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.Instant;
import java.time.ZoneId;

public class Person {
    
    private Integer id;
    private String name;
    private Gender gender;
    private String email;
    private Long cpf;
    private Date dateBirth;
    private ArrayList<Phone> telephones = new ArrayList<>();
    private ArrayList<Address> addresses = new ArrayList<>();

    public Person(Integer id, String name, Gender gender, String email, Long cpf, Date dateBirth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.cpf = cpf;
        this.dateBirth = dateBirth;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
    
    public boolean addAddress(Address address) {
        
        try {
            addresses.add(address);
            return true;
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        }    
                
    }
    
    public boolean removeAddress(Integer id) {
        
        for (int a = 0; a < addresses.size(); a++) {
            if (addresses.get(a).getId() == id) {
                addresses.remove(a);
                return true;
            }
        }
        return false;
        
    }
    
    public Address getAdress(Integer id) {
        
        for (int a = 0; a < addresses.size(); a++) {
            if (addresses.get(a).getId() == id) {
                return addresses.get(a);
            }
        }
        return null;
    }
    
    public Phone getCellphone (Integer id){
        for (int a = 0; a < telephones.size(); a++) {
            if (telephones.get(a).getId() == id) {
                return telephones.get(a);
            }
        }
        return null;
    }
    
    public boolean addCellphone(Phone cellphone){
        try {
            telephones.add(cellphone);
            return true;
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return false;
        }
    }
    
    public boolean removeCellphone(Integer id){
        
        for (int a = 0; a < telephones.size(); a++) {
            if (telephones.get(a).getId() == id) {
                telephones.remove(a);
                return true;
            }
        }
        return false;
    }

    protected Integer calculateAge() {
        LocalDate today = LocalDate.now();
        Instant instant = dateBirth.toInstant();
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        
        return Period.between(localDate, today).getYears();
    } 
    
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", cpf=" + cpf + ", dateBirth=" + dateBirth + ", telephones=" + telephones + ", addresses=" + addresses + '}';
    }    
        
}
