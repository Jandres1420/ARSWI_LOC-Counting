package edu.escuelaing.app;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Class that reads a file and counts the number of lines taking into account
 * the documentation
 * @author Andrés Pico
 */
public class Phy {
    private String file;

    /**
     * Constructor where is passed the file by a String
     * @param file type String
     */
    public Phy(String file){
        this.file= file;
    }

    /**
     *
     * @return int with lines read with phy class
     * @throws FileNotFoundException
     */
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
