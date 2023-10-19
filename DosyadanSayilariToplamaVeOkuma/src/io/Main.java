package io;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        try {
        FileReader FReader = new FileReader("dosya.txt") ;
        BufferedReader Breader = new BufferedReader(FReader) ;

            String line ;
            while ((line = Breader.readLine()) !=null) {
                toplam = toplam +Integer.parseInt(line);
            }
            System.out.println(toplam );
        } catch (Exception e) {
            e.printStackTrace(); ;
        }


    }
}