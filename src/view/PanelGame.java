/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.event.ActionListener;

/**
 *
 * @author monge
 */
public class PanelGame extends javax.swing.JPanel {

    /**
     * Creates new form PanelGame
     */
    public PanelGame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pause = new javax.swing.JButton();
        boosterAnnouncement = new javax.swing.JLabel();
        character = new javax.swing.JLabel();
        enemy = new javax.swing.JLabel();
        obstacle2 = new javax.swing.JLabel();
        obstacle1 = new javax.swing.JLabel();
        booster3 = new javax.swing.JLabel();
        booster2 = new javax.swing.JLabel();
        booster1 = new javax.swing.JLabel();
        characterLife = new javax.swing.JLabel();
        npc = new javax.swing.JLabel();
        backMenu = new javax.swing.JLabel();
        buildings2 = new javax.swing.JLabel();
        buildings1 = new javax.swing.JLabel();
        sidewalk = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        sky = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(800, 460));
        setPreferredSize(new java.awt.Dimension(800, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/misc/titles/pause.png"))); // NOI18N
        pause.setActionCommand("pause");
        pause.setBorderPainted(false);
        pause.setContentAreaFilled(false);
        add(pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        boosterAnnouncement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/misc/titles/announcement/booster-active.gif"))); // NOI18N
        add(boosterAnnouncement, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/personajes/biker/stop.gif"))); // NOI18N
        add(character, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 378, -1, 50));

        enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/personajes/enemigos/slow.gif"))); // NOI18N
        add(enemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 338, -1, 50));

        obstacle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/obstaculos/tile002.png"))); // NOI18N
        add(obstacle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, -1, -1));

        obstacle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/obstaculos/tile000.png"))); // NOI18N
        add(obstacle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, -1, 50));

        booster3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/boosters/life.gif"))); // NOI18N
        add(booster3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        booster2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/boosters/change-music.gif"))); // NOI18N
        add(booster2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        booster1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/boosters/piano.png"))); // NOI18N
        add(booster1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        characterLife.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/misc/life/life-2.png"))); // NOI18N
        add(characterLife, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        npc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/npcs/civil1.gif"))); // NOI18N
        add(npc, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, -1, -1));

        backMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon.png"))); // NOI18N
        add(backMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        buildings2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/buildings2.png"))); // NOI18N
        add(buildings2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 440));

        buildings1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/buildings1.png"))); // NOI18N
        add(buildings1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        sidewalk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/sidewalk.png"))); // NOI18N
        add(sidewalk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        city.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/city.png"))); // NOI18N
        add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        sky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/sky.png"))); // NOI18N
        add(sky, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 449));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backMenu;
    private javax.swing.JLabel booster1;
    private javax.swing.JLabel booster2;
    private javax.swing.JLabel booster3;
    private javax.swing.JLabel boosterAnnouncement;
    private javax.swing.JLabel buildings1;
    private javax.swing.JLabel buildings2;
    private javax.swing.JLabel character;
    private javax.swing.JLabel characterLife;
    private javax.swing.JLabel city;
    private javax.swing.JLabel enemy;
    private javax.swing.JLabel npc;
    private javax.swing.JLabel obstacle1;
    private javax.swing.JLabel obstacle2;
    private javax.swing.JButton pause;
    private javax.swing.JLabel sidewalk;
    private javax.swing.JLabel sky;
    // End of variables declaration//GEN-END:variables
 public void escuchar(ActionListener controller) {
        pause.addActionListener(controller);
    }
}
