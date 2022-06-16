package JavaOdev2;

//Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.


import java.util.Scanner;

public class KdvHesaplayici {
    public static void main(String[] args) {
        Scanner tl = new Scanner(System.in);

        double tutar,kdvOrani,kdvTutar,kdvliTutar;
        boolean kdvDurumu;
        
        System.out.print("Tutarı Giriniz:");
        tutar = tl.nextDouble();

        kdvDurumu = (0<tutar) && (1000<tutar);
        kdvOrani =  kdvDurumu ? 0.08 : 0.18;

        kdvTutar=tutar*kdvOrani;
        kdvliTutar=kdvTutar+tutar;

        System.out.println("KDV Oranı:" + kdvOrani);
        System.out.println("KDV Tutari:" + kdvTutar);
        System.out.println("KDV'li Tutar:" + kdvliTutar);
        
        
        



    }
    
}
