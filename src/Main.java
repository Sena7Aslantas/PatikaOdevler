// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int Mat,Turkce,Muzik,Kimya,Tarih,İng;
        double ort;
        Scanner gir= new Scanner(System.in);
        System.out.print("Matematik:");
        Mat=gir.nextInt();
        System.out.print("Muzik:");
        Muzik=gir.nextInt();

        System.out.print("Turkce:");
        Turkce=gir.nextInt();
        System.out.print("Kimya:");
        Kimya=gir.nextInt();

        System.out.print("Tarih:");
        Tarih=gir.nextInt();
        System.out.print("İngilizce:");
        İng=gir.nextInt();

        ort=(Turkce+Muzik+Mat+Kimya+Tarih+İng)/6;
        System.out.print(ort);

        String sonuc=(ort>=50)?"GECTİNİZ":"KALDİNİZ";
        System.out.print(sonuc);


        }
    }

