package edu.escuelaing.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine ();
        Organizar busqueda= new Organizar(entradaTeclado);
    }
}
