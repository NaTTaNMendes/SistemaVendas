package com.models;

public class Phone {
    
    private Integer id;
    private Integer ddd;
    private Integer countryID;
    private Long number;

    public Phone(Integer id, Integer ddd, Integer countryID, Long number) {
        this.id = id;
        this.ddd = ddd;
        this.countryID = countryID;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }   
    
    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getCountryID() {
        return countryID;
    }

    public void setCountryID(Integer countryID) {
        this.countryID = countryID;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
    
    private Boolean isValid() {
        return true;// DEPOIS COLOCAR A VERIFICACAO REAL
    }

    @Override
    public String toString() {
        return "Phone{" + "id=" + id + ", ddd=" + ddd + ", countryID=" + countryID + ", number=" + number + '}';
    }

    
}
