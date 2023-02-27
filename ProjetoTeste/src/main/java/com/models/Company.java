package com.models;

import java.util.ArrayList;

public class Company {
    
    private Integer id;
    private Long cnpj;
    private String name;
    private Long ie;
    private ArrayList<Address> addresses = new ArrayList<>(); 
    private ArrayList<Phone> telephones = new ArrayList<>();
    private String email;

    public Company(Integer id, Long cnpj, String name, Long ie, String email) {
        this.id = id;
        this.cnpj = cnpj;
        this.name = name;
        this.ie = ie;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIe() {
        return ie;
    }

    public void setIe(Long ie) {
        this.ie = ie;
    }
    
    public Address getAdress(Integer id) {
        
        for (int a = 0; a < addresses.size(); a++) {
            if (addresses.get(a).getId() == id) {
                return addresses.get(a);
            }
        }
        return null;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Company{" + "id=" + id + ", cnpj=" + cnpj + ", name=" + name + ", ie=" + ie + ", addresses=" + addresses + ", telephones=" + telephones + ", emails=" + email + '}';
    }
    
    
    
}
