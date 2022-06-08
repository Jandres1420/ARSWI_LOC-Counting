package edu.escuelaing.app;

import java.io.FileNotFoundException;

public class Organizar {
    private String countlines;
    private String type;
    private String file;

    public Organizar(String command){
        String[] parts = command.split(" ");
        countlines = parts[0];
        type = parts[1];
        file = parts[2];
        identify();
    }

    private void identify(){
        if(type.equals("phy") || type.equals("Phy")){
            Phy phy = new Phy(file);
            try {
                System.out.println("el numero de lineas son " + String.valueOf(phy.read()));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }else if(type.equals("loc") || type.equals("Loc")){
            Loc loc = new Loc(file);
            try {
                System.out.println(loc.read());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
