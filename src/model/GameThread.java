/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.FRMGameController;
import static controller.FRMGameController.menuActive;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.FRMGame;

/**
 *
 * @author monge
 */
public class GameThread extends Thread {

    FRMGame frame;
    Sound sound;

    //booleans para activar transiciones
    public static boolean menuTransicionIn = true;
    public static boolean menuTransicionOut = false;

    public static boolean gameTransicionIn = false;
    public static boolean gameTransicionOut = false;

    public static int level = 1;
    public static int levelTime = 18;
    public static int countTimer = 25;
    
    public static boolean musicActive = true;
    
    public static boolean inGame = false;

    public GameThread(FRMGame frame) {
        this.frame = frame;
        sound = new Sound();
    }

    public void run() {
        try {
            while (true) {
                frame.getCharacterPicked();
                frame.loadCharacter();

                if (FRMGameController.menuActive) {
                    inGame = false;
                    
                    if(musicActive && !inGame){
                        music(0);
                        musicActive = false;
                    }
                    frame.getPanelMenu().setVisible(true);
                    frame.getPanelGame().setVisible(false);
                    frame.getPanelOptions().setVisible(false);
                    frame.getPanelTopScorers().setVisible(false);
                    frame.getPanelPickPlayer().setVisible(false);
              
                    if (menuTransicionIn) {
                        frame.getPanelMenu().transitionIn();
                    }

                }
                if (!FRMGameController.menuActive) {
                    
                    if(inGame && !musicActive){
                        music(1);
                        musicActive = true;
                    }
                    frame.getPanelGame().transitionGame();
                    frame.moveCharacter();

                    setLevel();

                }
                sleep(40);
            }
        } catch (Exception e) {

        }
    }

    private void setLevel() {

        if (levelTime > 0) {

            countTimer = countTimer - 1;
            
            if (countTimer <= 0) {
                levelTime = levelTime - 1;
                countTimer = 25;
            }
        }

        if (levelTime == 0) {
            level += 1;
            FRMGame.gameSpeed += 1;
            levelTime = 18;
        }
    }
    
     public void music(int i){
            if(sound.getClip()){
                sound.stop();
            }
            sound.setFile(i);
            sound.play();
            sound.loop();        
    }

     public Sound getSound(){
         return sound;
     }
}
