package com.emin;

import com.emin.repository.MusteriRepository;

public class Runner {
    public static void main(String[] args) {


        MusteriRepository musteriRepository =new MusteriRepository();
        musteriRepository.RastMusteriListesiOlustur();
        musteriRepository.getMusterisList();





    }
}
