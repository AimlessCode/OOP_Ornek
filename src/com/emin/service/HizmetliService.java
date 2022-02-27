package com.emin.service;

import com.emin.repository.HizmetliRepository;
import com.emin.repository.entity.Hizmetli;

public class HizmetliService {

    private HizmetliRepository repository;

    public HizmetliService(){
        repository=new HizmetliRepository();

    }

    public void save(Hizmetli hizmetli)
    {
        repository.save(hizmetli);
        
    }
}
