package edu.escuelaing.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loc {
    private String file;
    public Loc(String file){
        this.file = file;
    }
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

                    System.out.println("no entiendo");
                    System.out.println(entradaTeclado);
                    entradaTeclado = sc.nextLine();

                }
            }

            ;
        }
        return cont;
    }

    public boolean verifyDoc(String line){
        boolean flag = true;
        if(line.equals("/**") || line.equals("//")){
            flag = false;
        }
        return flag;
    }
}
