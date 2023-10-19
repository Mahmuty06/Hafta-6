package io;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ; //Scanner sınıfı tanımlandı.
        System.out.println("METİN GİRİNİZ :  ");  //Kullanıcıdan bir metin istedik
        String metin =  input.nextLine() ;

        // Dosya içine veri yazdırmak içim FileWriter ve PrintWriter sınıfları kullanılır.
    try {
        FileWriter Fwriter = new FileWriter("dosya.txt" , true) ;
        PrintWriter Pwriter = new PrintWriter(Fwriter) ;
        Pwriter.println(" ");    //AŞAGI SATIRA GEÇMEK İÇİN KULLANILDI.
        Pwriter.print(metin);     //DOSYA İÇİNE KULLANICIDAN GELEN METİN YAZILDI
        Pwriter.close ();

    } catch (IOException e) {
        System.out.println(e.getMessage());;
    }
        // Dosya içine verileri okumak için FileReader ve BufferedReader sınıfları kullanılır.
    try {
        FileReader fileReader = new FileReader("dosya.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println("Dosya içindeki metin:");
        String line ;       //DOSYA SATIRLARINDAKİ STRİNG VERİ
        while ((line = bufferedReader.readLine()) != null) {  //SATIRLAR DÖNGÜ İLE KONTROL EDİLEREK EKRANA YAZILDI
        System.out.println(line );
        }bufferedReader.close();
    }
    catch (IOException e) {
    System.out.println(e.getMessage());
}
    }
}