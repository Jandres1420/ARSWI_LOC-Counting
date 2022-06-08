package edu.escuelaing.app;

import java.io.FileNotFoundException;

/**
 * Class that depending on the input organize if its type is Phy or Loc
 * @author Andrés Pico
 */
public class Organize {
    private String countlines;
    private String type;
    private String file;

    /**
     * Constructor that takes the input of the system and map it
     * @param command
     */
    public Organize(String command){
        String[] parts = command.split(" ");
        countlines = parts[0];
        type = parts[1];
        file = parts[2];
        identify();
    }

    /**
     * Method that identify the type of the input and start the counting depending of the type.
     */
    private void identify(){
        if(type.equals("phy") || type.equals("Phy")){
            Phy phy = new Phy(file);
            try {
                System.out.println("el numero de lineas del archivo " + file  + " es: " +String.valueOf(phy.read()));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }else if(type.equals("loc") || type.equals("Loc")){
            Loc loc = new Loc(file);
            try {
                System.out.println("el numero de lineas sin documentacion del archivo " + file  + " son: " +String.valueOf(loc.read()));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
