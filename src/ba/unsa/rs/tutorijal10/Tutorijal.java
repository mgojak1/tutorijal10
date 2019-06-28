package ba.unsa.rs.tutorijal10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Tutorijal {

    public static void main(String[] args) {
        ArrayList<Grad> gradovi = ucitajGradove();
        for (Grad grad: gradovi) {
            System.out.println(grad.toString());
        }
    }

    public static ArrayList<Grad> ucitajGradove() {
        ArrayList<Grad> gradovi = new ArrayList<>();
        BufferedReader ulaz;
        try {
            ulaz = new BufferedReader(new FileReader("mjerenja.txt"));
            String line;
            while((line = ulaz.readLine()) != null) {
                short i = -1;
                String naziv = new String();
                ArrayList<Double> temperature = new ArrayList<>();
                for(String word: line.split(",")) {
                    if (i == -1) {
                        naziv = word;
                        i++;
                    } else {
                        temperature.add(Double.parseDouble(word));
                        i++;
                    }
                    if ( i == 1000) {
                        break;
                    }
                }

                gradovi.add(new Grad(naziv, null, temperature));
            }
            ulaz.close();
        } catch (FileNotFoundException e) {
            System.out.println("Datoteka ulaz.txt ne postoji ili se ne može otvoriti");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gradovi;
    }

    public static void ucitajXml() {}





}