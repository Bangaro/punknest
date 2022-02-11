/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.FRMGameController;
import static controller.FRMGameController.menuActive;
import javax.swing.JFrame;
import view.FRMGame;

/**
 *
 * @author monge
 */
public class GameThread extends Thread {

    FRMGame frame;

    public GameThread(FRMGame frame) {
        this.frame = frame;
    }

    public void run() {
        try {
            while (true) {
                if (FRMGameController.menuActive) {
                    frame.getPanelMenu().setVisible(true);
                    frame.getPanelGame().setVisible(false);
                    frame.getPanelOptions().setVisible(false);
                    frame.getPanelTopScorers().setVisible(false);
                    frame.getPanelPickPlayer().setVisible(false);
                    menuActive = false;
                }
                if (!FRMGameController.menuActive) {
                }
                sleep(20);
            }
        } catch (Exception e) {

        }
    }

}
