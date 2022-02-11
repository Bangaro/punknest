/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author monge
 */
public class Character implements Serializable{
    private boolean boosterActive;
    private int life = 2;
    private boolean dead = false;
    private int score;
    private String characterName;
    private String nickname;
    private String playerState;

    public Character(boolean boosterActive, int score, String characterName, String nickname, String playerState) {
        this.boosterActive = boosterActive;
        this.score = score;
        this.characterName = characterName;
        this.nickname = nickname;
        this.playerState = playerState;
    }

    public Character() {
    }

    public boolean isBoosterActive() {
        return boosterActive;
    }

    public void setBoosterActive(boolean boosterActive) {
        this.boosterActive = boosterActive;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPlayerState() {
        return playerState;
    }

    public void setPlayerState(String playerState) {
        this.playerState = playerState;
    }
    
    
    
    
    
}
