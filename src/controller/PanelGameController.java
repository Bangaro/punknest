/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.GameThread;
import view.PanelGame;

/**
 *
 * @author monge
 */
public class PanelGameController implements ActionListener {

    PanelGame panel;
    public PanelGameController(PanelGame panel){
        this.panel = panel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("pause")) {
            System.exit(0);
        }
        if (e.getActionCommand().equals("backMenu")) {
            FRMGameController.menuActive = true;
             panel.setVisible(false);
             GameThread.musicActive = true;
        }
    }
  

}
