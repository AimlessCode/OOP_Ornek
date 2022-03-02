package com.emin;

public class ObjeFabrika {

    public static void main(String[] args) {
        kalem ilkkalem = new kalem();
        ilkkalem.color="mavi";
        ilkkalem.boy=10;

        String mesaj = "ilk kalem üretildi.";

        ilkkalem.yazilenmesaj(mesaj);

        kalem ikikalem = new kalem();
        ikikalem.color="pembe";
        ikikalem.boy=6;
        ikikalem.yazilenmesaj(ikikalem.color+" "+ikikalem.boy);

        car car =new car();
        car.koltuksayisi=5;
        car.tekersayisi=4;
        bicycle bicycle=new bicycle();
        bicycle.koltuksayisi =2;
        bicycle.tekersayisi=2;

        Vehicle car2=new car();
        car.start();
        bicycle.start();
         car2.Stop();





    }

}
