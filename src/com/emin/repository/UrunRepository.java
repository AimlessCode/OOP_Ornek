package com.emin.repository;

import com.emin.repository.entity.Urun;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UrunRepository {
    private List<Urun> urunList=new ArrayList<>();
     Random random =new Random();
    public void RestGelenUrunOlustur() {
        for (long i =1;i<25;i++){
            Urun urun=
                    new Urun(i,"ürün-"+i,
                                "a marka",
                                "C model",
                                "adet",
                                random.nextInt(100),
                                2800,
                                3680,
                                18);
                                urunList.add(urun);
                            urunList.add(urun);

        }

    }

}
