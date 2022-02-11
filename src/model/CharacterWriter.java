/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;

/**
 *
 * @author monge
 */
public class CharacterWriter {
  private String fichero;

    public CharacterWriter(String fichero) {
        this.fichero = fichero;
        if(!new File(fichero).exists()){
            crearFichero();
        }
    }
    
    public void crearFichero() {
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(fichero));
            oos.close();
            System.out.println("Archivo creado");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    public void insertarCliente(ArrayList<Character> elementos){
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(fichero));
            for(int i =0; i< elementos.size(); i++){
                 System.out.println(elementos.get(i).getCharacterName());
                 oos.writeUnshared(elementos.get(i));
            }              
           oos.flush();
           oos.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }   
}
