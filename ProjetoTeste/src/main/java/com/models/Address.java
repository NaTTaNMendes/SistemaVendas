package com.models;

import com.enums.State;

public class Address {
    
    private Integer id;
    private String street;
    private Integer cep;
    private State state;
    private Integer number;
    private String complement;

    public Address(Integer id, String street, Integer cep, State state, Integer number, String complement) {
        this.id = id;
        this.street = street;
        this.cep = cep;
        this.state = state;
        this.number = number;
        this.complement = complement;
    }

    public Integer getId() {
        return id;
    }  
        
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    } 

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", street=" + street + ", cep=" + cep + ", state=" + state + ", number=" + number + ", complement=" + complement + '}';
    }
        
}
