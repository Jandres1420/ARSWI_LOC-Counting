package edu.escuelaing.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loc {
    private String file;

    /**
     * Class
     * @param file
     */
    public Loc(String file){
        this.file = file;
    }

    /**
     *
     * @return The number of line that are not documentated
     * @throws FileNotFoundException
     */
    public int read() throws FileNotFoundException {
        int cont = 0;
        File x = new File(file);
        Scanner sc = new Scanner(x);
        String entradaTeclado = "";
        while (sc.hasNextLine()){
            entradaTeclado = sc.nextLine();
            if(verifyDoc(entradaTeclado)){
                cont++;
            }else{
                while(!entradaTeclado.equals(" */")){
                    entradaTeclado = sc.nextLine();
                }
            }
        }
        return cont;
    }

    /**
     * Method that verify one line read from the file, and identify if its documentation
     * @param line
     * @return boolean flag
     */
    public boolean verifyDoc(String line){
        boolean flag = true;
        if(line.equals("/**") || line.equals("//")){
            flag = false;
        }
        return flag;
    }
}
