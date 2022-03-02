package com.emin.service;

import com.emin.repository.MudurRepository;
import com.emin.repository.entity.Mudur;

import java.util.List;

public class MudurService {

    private MudurRepository repository;

    public MudurService() {
        repository = new MudurRepository();
    }

    public void save(Mudur mudur) {
        repository.save(mudur);
    }

    public List<Mudur> findAll() {
        return repository.findAll();

    }
}
