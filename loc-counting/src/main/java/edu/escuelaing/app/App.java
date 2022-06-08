package edu.escuelaing.app;

import java.util.Scanner;

/**
 * Class that starts the app
 * @author Andrés Pico
 */
public class App 
{
    public static void main( String[] args )
    {

        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine ();
        Organize organize= new Organize(entradaTeclado);
    }
}
