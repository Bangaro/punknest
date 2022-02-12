/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.PanelPickPlayerController;
import java.awt.event.ActionListener;

/**
 *
 * @author monge
 */
public class PanelPickPlayer extends javax.swing.JPanel {

    /**
     * Creates new form PanelPickPlayer
     */
    PanelPickPlayerController controller;

    public PanelPickPlayer() {
        initComponents();
        controller = new PanelPickPlayerController(this);
        escuchar(controller);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pickPlayer = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        cyborg = new javax.swing.JButton();
        punk = new javax.swing.JButton();
        dog1 = new javax.swing.JButton();
        dog2 = new javax.swing.JButton();
        biker = new javax.swing.JButton();
        bird = new javax.swing.JButton();
        buildings = new javax.swing.JLabel();
        sidewalk = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        sky = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pickPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/misc/titles/pick-player.gif"))); // NOI18N
        pickPlayer.setActionCommand("pickPlayer");
        pickPlayer.setContentAreaFilled(false);
        pickPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pickPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickPlayerActionPerformed(evt);
            }
        });
        add(pickPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 320, -1));

        quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/misc/titles/quit.gif"))); // NOI18N
        quit.setActionCommand("quit");
        quit.setBorderPainted(false);
        quit.setContentAreaFilled(false);
        quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        cyborg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/personajes/cyborg/presentation.gif"))); // NOI18N
        cyborg.setActionCommand("cyborg");
        cyborg.setBorderPainted(false);
        cyborg.setContentAreaFilled(false);
        add(cyborg, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        punk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/personajes/punk/presentation.gif"))); // NOI18N
        punk.setActionCommand("punk");
        punk.setBorderPainted(false);
        punk.setContentAreaFilled(false);
        add(punk, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        dog1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/personajes/dog1/presentation.gif"))); // NOI18N
        dog1.setActionCommand("dog1");
        dog1.setBorderPainted(false);
        dog1.setContentAreaFilled(false);
        add(dog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        dog2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/personajes/dog2/presentation.gif"))); // NOI18N
        dog2.setActionCommand("dog2");
        dog2.setBorderPainted(false);
        dog2.setContentAreaFilled(false);
        add(dog2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        biker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/personajes/biker/presentation.gif"))); // NOI18N
        biker.setActionCommand("biker");
        biker.setBorderPainted(false);
        biker.setContentAreaFilled(false);
        add(biker, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        bird.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/personajes/bird/presentation.gif"))); // NOI18N
        bird.setActionCommand("bird");
        bird.setBorderPainted(false);
        bird.setContentAreaFilled(false);
        add(bird, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        buildings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/buildings1.png"))); // NOI18N
        add(buildings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        sidewalk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/sidewalk.png"))); // NOI18N
        add(sidewalk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        city.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/city.png"))); // NOI18N
        add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        sky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/sky.png"))); // NOI18N
        add(sky, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 449));
    }// </editor-fold>//GEN-END:initComponents

    private void pickPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickPlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pickPlayerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton biker;
    private javax.swing.JButton bird;
    private javax.swing.JLabel buildings;
    private javax.swing.JLabel city;
    private javax.swing.JButton cyborg;
    private javax.swing.JButton dog1;
    private javax.swing.JButton dog2;
    private javax.swing.JButton pickPlayer;
    private javax.swing.JButton punk;
    private javax.swing.JButton quit;
    private javax.swing.JLabel sidewalk;
    private javax.swing.JLabel sky;
    // End of variables declaration//GEN-END:variables

    public void escuchar(ActionListener controller) {
        bird.addActionListener(controller);
        dog1.addActionListener(controller);
        dog2.addActionListener(controller);
        cyborg.addActionListener(controller);
        biker.addActionListener(controller);
        punk.addActionListener(controller);
        quit.addActionListener(controller);
        pickPlayer.addActionListener(controller);
    }

   
}
