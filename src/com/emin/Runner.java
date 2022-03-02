package com.emin;

import com.emin.repository.MusteriRepository;
import com.emin.repository.Satisrepository;
import com.emin.repository.UrunRepository;
import com.emin.repository.entity.Musteri;
import com.emin.repository.entity.Satis;
import com.emin.repository.entity.Urun;
import com.emin.service.SatisService;
import com.emin.service.UrunService;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        /**
         * Presentation Layer - Sunum katmanı - Garson
         * Services Layer - Aşçı -
         * Data Access Layer - Ürün temin edildigi yer -Veri latmanı
         */

        SatisService satisService=new SatisService();
        satisService.satisYap();





    }

}
