package com.emin.repository;

import com.emin.repository.entity.Satis;

import java.util.ArrayList;
import java.util.List;

public class Satisrepository {
    List<Satis> satisList = new ArrayList<>();

    /**
     * Satiş bilgileri verilen nesneyi listeye ekler.
     */

    public void save(Satis satis) {
        satisList.add(satis);

    }

}
