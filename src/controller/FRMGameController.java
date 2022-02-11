/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.GameThread;
import view.FRMGame;

/**
 *
 * @author monge
 */
public class FRMGameController implements ActionListener {
    
    FRMGame frmGame;
    public static boolean menuActive = true;
    
    public FRMGameController(FRMGame frmGame) {
        this.frmGame = frmGame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("start")) {
            frmGame.getPanelGame().setVisible(true);
            frmGame.getPanelMenu().setVisible(false);
            frmGame.getPanelOptions().setVisible(false);
            frmGame.getPanelTopScorers().setVisible(false);
            frmGame.getPanelPickPlayer().setVisible(false);
            menuActive = false;
            
            frmGame.getPanelGame().musica(frmGame.getSound());
        }
        if (e.getActionCommand().equals("pause")) {
            
        }
        
        if (e.getActionCommand().equals("options")) {
            GameThread.menuTransicionIn = true;
            
            frmGame.getPanelGame().setVisible(false);
            frmGame.getPanelMenu().setVisible(false);
            frmGame.getPanelOptions().setVisible(true);
            frmGame.getPanelTopScorers().setVisible(false);
            frmGame.getPanelPickPlayer().setVisible(false);
            menuActive = false;
        }
        if (e.getActionCommand().equals("pickPlayer")) {
            GameThread.menuTransicionIn = true;
            
            frmGame.getPanelGame().setVisible(false);
            frmGame.getPanelMenu().setVisible(false);
            frmGame.getPanelOptions().setVisible(false);
            frmGame.getPanelTopScorers().setVisible(false);
            frmGame.getPanelPickPlayer().setVisible(true);
            menuActive = false;
            
        }
        if (e.getActionCommand().equals("topScorers")) {
            frmGame.getPanelGame().setVisible(false);
            frmGame.getPanelMenu().setVisible(false);
            frmGame.getPanelOptions().setVisible(false);
            frmGame.getPanelTopScorers().setVisible(true);
            frmGame.getPanelPickPlayer().setVisible(false);
            menuActive = false;
        }
        
        if (e.getActionCommand().equals("quit")) {
            System.exit(0);
        }
    }
    
}
