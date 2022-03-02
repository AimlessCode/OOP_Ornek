package com.emin.service;

import com.emin.repository.MuhendisRepository;
import com.emin.repository.entity.Mudur;
import com.emin.repository.entity.Muhendis;

import java.util.List;

public class MuhendisService {

    private MuhendisRepository repository;

    public MuhendisService() {
        repository = new MuhendisRepository();
    }

    public void save(Muhendis muhendis) {

    }

    public List<Muhendis> findAll() {
        return repository.findAll();

    }
}
