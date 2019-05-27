package ba.unsa.rs.tutorijal10;


import java.io.*;
import java.nio.file.Files;

public class Tutorijal{

    static void ucitajGradove(){
        File file = new File("mjerenja.txt");
        try {
            Files.lines(file.toPath())
                    
                    .map(l -> l.split(" "))
                    .forEach(a -> createGraphe(a[0], a[1], a[2]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

    }
}x

