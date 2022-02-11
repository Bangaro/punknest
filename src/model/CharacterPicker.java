/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author monge
 */
public class CharacterPicker {

    private String fichero;

    public CharacterPicker(String fichero) {
        this.fichero = fichero;
        if (!new File(fichero).exists()) {
            createFile();
        }
    }

    public void createFile() {
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

    public void saveCharacter(String characterName) {
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(fichero));

            System.out.println(characterName);
            oos.writeUnshared(characterName);

            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public String getCharacter() {
        String characterName = "";

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
            characterName =  (String) ois.readObject();

            System.out.println("Reading " + characterName);

            ois.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return characterName;
    }
}
