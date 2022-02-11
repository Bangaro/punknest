/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author monge
 */
public class CharacterReader {
     private String fichero;

    public CharacterReader(String fichero) {
        this.fichero = fichero;
    }
   public ArrayList<Character> getClientes(){
       ArrayList<Character> objetos = new ArrayList();
      
       try{
           ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
           Character aux = (Character)ois.readObject();
           while(aux!=null){
               System.out.println("Leyendo " + aux.getCharacterName());
               objetos.add(aux);
               aux = (Character)ois.readObject();
           };
           ois.close();           
       }catch(Exception ex){
           System.out.println(ex.getMessage());
       }
       return objetos;
   }    
}
