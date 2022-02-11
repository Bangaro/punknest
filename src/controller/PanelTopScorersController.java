/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author monge
 */
public class PanelTopScorersController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("backMenu")) {
            FRMGameController.menuActive = true;
        }

        if (e.getActionCommand().equals("quit")) {
            System.exit(0);
        }
    }

}
