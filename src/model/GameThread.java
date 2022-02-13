/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.FRMGameController;
import static controller.FRMGameController.menuActive;
import java.util.Random;
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

    public static boolean characterDead = false;
    //booleans para activar transiciones
    public static boolean menuTransicionIn = true;
    public static boolean menuTransicionOut = false;

    public static boolean gameTransicionIn = false;
    public static boolean gameTransicionOut = false;

    //PARA AUMENTAR DE NIVEL, CADA 25 SEGUNDOS ---- ESTAN PUESTOS 18, PERO EN REALIDAD SON 25 POR EL DELAY TOTAL DEL PROGRAMA
    public static int level = 1;
    public static int timeLevel = 18;
    public static int countLevelTimer = 25;

    //PARA COLOCAR ANIMACIONES
    //ANIMACION HERIDO
    public static boolean isHurt = false;
    public static int timeHurt = 2;
    public static int countHurtTimer = 25;

    //ANIMACION BOOSTER DESTROY
    public static int timeBoosterDestroy = 7;
    public static int countBoosterDestroyTimer = 25;

    //ANIMACION ENEMY
    public static int random = 2;
    public static int timeEnemyMovement = 6;
    public static int countEnemyMovement = 25;

    //MUSIC SPECIAL CHANGE
    public static boolean specialMusic = false;

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

                    if (musicActive && !inGame) {
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

                    if (!characterDead) {
                        frame.getPanelGame().score();
                        enemyMovement();
                        frame.getPanelGame().boosterActive();
                        frame.getPanelGame().charactherHurt();

                        if (inGame && !musicActive && !FRMGameController.menuActive) {
                            music(1);
                            musicActive = true;
                            //Asigna la velocidad inicial del juego
                            FRMGame.gameSpeed = 2;
                        }

                        if (frame.getPanelGame().getCharacterInGame().isBoosterActive()) {
                            if (specialMusic) {
                                music(2);
                            }

                            animationBoosterDestroy();
                        }
                        if (isHurt) {
                            animationHurt();
                        }

                        frame.getPanelGame().transitionGame();
                        frame.moveCharacter();

                        setLevel();

                    } else {
                        JOptionPane.showMessageDialog(null,"");
                    }

                }
                sleep(40);
            }
        } catch (Exception e) {

        }
    }

    private void setLevel() {
        if (timeLevel > 0) {
            countLevelTimer = countLevelTimer - 1;
            if (countLevelTimer <= 0) {
                timeLevel = timeLevel - 1;
                countLevelTimer = 25;
            }
        }
        if (timeLevel == 0) {
            level += 1;
            FRMGame.gameSpeed += 1;
            timeLevel = 18;
        }
    }

    private void animationBoosterDestroy() {
        if (timeBoosterDestroy > 0) {
            countBoosterDestroyTimer = countBoosterDestroyTimer - 1;
            if (countBoosterDestroyTimer <= 0) {
                timeBoosterDestroy = timeBoosterDestroy - 1;
                countBoosterDestroyTimer = 25;
            }
        }
        if (timeBoosterDestroy == 0 ) {
            frame.getPanelGame().getCharacterInGame().setBoosterActive(false);
            timeLevel = 18;
            timeBoosterDestroy = 5;
        }
    }

    private void animationHurt() {
        if (timeHurt > 0) {
            countHurtTimer = countHurtTimer - 1;
            if (countHurtTimer <= 0) {
                timeHurt = timeHurt - 1;
                countHurtTimer = 25;
            }
        }
        if (timeHurt == 0) {
            isHurt = false;
            timeHurt = 2;
        }
    }

    private void enemyMovement() {

        frame.getPanelGame().enemyMovement(random);

        if (timeEnemyMovement > 0) {
            countEnemyMovement = countEnemyMovement - 1;
            if (countEnemyMovement <= 0) {
                timeEnemyMovement = timeEnemyMovement - 1;
                countEnemyMovement = 25;
            }
        }
        if (timeEnemyMovement == 0) {
            random = new Random().nextInt(2);
            timeEnemyMovement = 6;
        }

    }

    public void music(int i) {
        if (sound.getClip()) {
            sound.stop();
        }
        sound.setFile(i);
        sound.play();
        sound.loop();
    }

    public Sound getSound() {
        return sound;
    }
}
