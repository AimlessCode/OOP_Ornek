package com.emin.repository;

import com.emin.repository.entity.Hizmetli;
import com.emin.utility.StaticValues;

import java.util.List;

public class HizmetliRepository {
    public void save(Hizmetli hizmetli){
        StaticValues.hizmetliList.add(hizmetli);
    }
    public List<Hizmetli> findAll(){

        return StaticValues.hizmetliList;
    }

}
