/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.CharacterPicker;
import view.PanelPickPlayer;

/**
 *
 * @author monge
 */
public class PanelPickPlayerController implements ActionListener {

    CharacterPicker characterPicker;
    PanelPickPlayer panel;

    public PanelPickPlayerController(PanelPickPlayer panel) {
        characterPicker = new CharacterPicker("CHARACTER.DATA");
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("quit")) {
            System.exit(0);
        }
        if (e.getActionCommand().equals("pickPlayer")) {
            FRMGameController.menuActive = true;
            panel.setVisible(false);
        }
        if (e.getActionCommand().equals("bird")) {
            characterPicker.saveCharacter("bird");
            FRMGameController.menuActive = true;
            panel.setVisible(false);
        }
        if (e.getActionCommand().equals("dog1")) {
            characterPicker.saveCharacter("dog1");
            FRMGameController.menuActive = true;
            panel.setVisible(false);
        }
        if (e.getActionCommand().equals("dog2")) {
            characterPicker.saveCharacter("dog2");
            FRMGameController.menuActive = true;
            panel.setVisible(false);
        }
        if (e.getActionCommand().equals("punk")) {
            characterPicker.saveCharacter("punk");
            FRMGameController.menuActive = true;
            panel.setVisible(false);
        }
        if (e.getActionCommand().equals("cyborg")) {
            characterPicker.saveCharacter("cyborg");
            FRMGameController.menuActive = true;
            panel.setVisible(false);
        }
        if (e.getActionCommand().equals("biker")) {
            characterPicker.saveCharacter("biker");
            FRMGameController.menuActive = true;
            panel.setVisible(false);
        }
    }

}
