package com.emin.repository;

import com.emin.repository.entity.Muhendis;
import com.emin.utility.StaticValues;

import java.util.List;

public class MuhendisRepository {
    public void save(Muhendis muhendis) {
        StaticValues.muhendisList.add(muhendis);
    }

    public List<Muhendis> findAll() {
        return StaticValues.muhendisList;

    }
}
