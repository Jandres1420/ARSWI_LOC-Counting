package edu.escuelaing.app;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Phy {
    private String file;
    public Phy(String file){
        this.file= file;
    }

    public int read() throws FileNotFoundException {
        int cont = 0;
        File x = new File(file);
        Scanner sc = new Scanner(x);
        while (sc.hasNextLine()){
            sc.nextLine();
            cont++;
        }
        return cont;
    }
}
