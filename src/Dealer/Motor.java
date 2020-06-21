package Dealer;

public class Motor {
    //atribut
    String merek ="Honda";
    String warna ="Black";
    String jenis ="Vario 150";
    int harga = 25000000;
    int kecepatan =60;
    int waktu =3600;
    int jarak =90;
    int tahun =2019;

    //method
    void jalan(){
        System.out.println("Kecepatan motor menuju banjarmasin 60km/jam");
        System.out.println("Warna motor : "+warna);
    }
    void warnaMotor(){
        System.out.print("Pilih warna motor : ");
        System.out.println("Black, White and Red");
    }
    void merekMotor(){
        System.out.print("Pilih merek yang akan anda beli : ");
        System.out.println("Vario dan Scopy");
    }
    int jarakTempuh(){
        int hitungJarak = kecepatan * waktu;
        return hitungJarak;
    }
    int waktuTempuh(){
        int hitungWaktu = jarak / kecepatan;
        return hitungWaktu;
    }
    //method overloading
    void tipeMotor(String merek){
        System.out.println(merek);
    }
    void tipeMotor(String merek, int tahun){
        System.out.println(merek + tahun);
    }
    void tipeMotor(String merek, int harga, int tahun){
        System.out.println(merek + harga + tahun);
    }


    //constructor
    Motor(){
        System.out.println("ngeeeenggg.... brunnn... brunnnn....");
    }
    Motor(String merek){
        System.out.println("constructor 2");
    }
    Motor(String warna, int harga){
        System.out.println("constructor 3");
    }
}
