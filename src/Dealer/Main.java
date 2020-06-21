package Dealer;

public class Main {

    public static void main(String[] args) {
        Motor objek = new Motor();

        //panggil method
        objek.jalan();
        objek.warnaMotor();
        objek.merekMotor();

        int menghitungJarak = objek.jarakTempuh();
        System.out.println("Jarak tempuh adalah = "+menghitungJarak);

        int menghitungWaktu = objek.waktuTempuh();
        System.out.println("Waktu tempuh adalah = "+menghitungWaktu);

        //pangil method overloading
        objek.tipeMotor("Honda Vario 150");
        objek.tipeMotor("Honda Vario 150 ",2019);
        objek.tipeMotor("Honda Vario 150 ",25000000 ,2019);

        //panggil constructor
        Motor objek1 = new Motor();
        Motor objek2 = new Motor("scopy");
        Motor objek3 = new Motor("Black",25000000);
    }
}
