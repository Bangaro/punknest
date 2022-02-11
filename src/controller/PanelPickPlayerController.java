/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author monge
 */
public class PanelPickPlayerController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("quit")) {
            System.exit(0);
        }
        if (e.getActionCommand().equals("backMenu")) {
            FRMGameController.menuActive = true;
        }
        if (e.getActionCommand().equals("personaje1")) {
            //grabar en archhivo la direccion de los aasets, y cargar los assets del personaje 
        }
    }

}
