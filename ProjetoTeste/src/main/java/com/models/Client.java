package com.models;

import com.enums.Gender;
import java.util.Date;

public class Client extends Person{

    public Client(Integer id, String name, Gender gender, String email, Long cpf, Date dateBirth) {
        super(id, name, gender, email, cpf, dateBirth);
    }    
    
}
