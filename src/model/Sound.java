/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author monge
 */
public class Sound {

    Clip clip;
    boolean clipCreated = false;
    URL soundURL[] = new URL[30];

    public Sound() {
        soundURL[0] = getClass().getResource("/assets/music/living-music.wav");
        soundURL[1] = getClass().getResource("/assets/music/main-music.wav");
        soundURL[2] = getClass().getResource("/assets/music/special-music.wav");
        soundURL[3] = getClass().getResource("/assets/music/boosterActive.wav");
        soundURL[4] = getClass().getResource("/assets/music/levelUp5seconds.wav");
    }

    public void setFile(int i) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
            clipCreated = true;
        } catch (Exception e) {
        }
    }

    public void play() {
        clip.start();
    }

    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        clip.stop();
    }

    public boolean getClip() {
        return clipCreated;
    }
}
