/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.PanelTopScorersController;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.CharacterReader;
import model.Character;

/**
 * @author monge
 */
public class PanelTopScorers extends javax.swing.JPanel {

    /**
     * Creates new form PanelTopScorers
     */
    PanelTopScorersController controller;
    CharacterReader reader;
    ArrayList<Character> elements;
    ArrayList<Character> elementsSort = new ArrayList();
    int maxValue = 0;

    public PanelTopScorers() {
        initComponents();
        controller = new PanelTopScorersController();
        escuchar(controller);
        reader = new CharacterReader("CHARACTERSCORE.DATA");
        loadCharacters();
        sortCharacters();
        writeScores();
    }

    public void loadCharacters() {
        elements = reader.getCharacters();
    }

    public void sortCharacters() {
        for (int j = 0; elements.size() > 0; j++) {
            for (int i = 0; i < elements.size(); i++) {
                if (maxValue < elements.get(i).getScore()) {
                    maxValue = i;
                }
            }
            elementsSort.add(elements.get(maxValue));
            elements.remove(maxValue);
        }
    }

    public void writeScores() {

        if (elementsSort.size() > 0) {
            if (elementsSort.get(0) != null) {
                score1.setText("Nickname: " + elementsSort.get(0).getNickname() + "  Score: " + elementsSort.get(0).getScore());
            }
        }
        if (elementsSort.size() > 1) {
            if (elementsSort.get(1) != null) {
                score2.setText("Nickname: " + elementsSort.get(1).getNickname() + "  Score: " + elementsSort.get(1).getScore());
            }
        }
        if (elementsSort.size() > 2) {
            if (elementsSort.get(2) != null) {
                score3.setText("Nickname: " + elementsSort.get(2).getNickname() + "  Score: " + elementsSort.get(2).getScore());
            }
        }
        if (elementsSort.size() > 3) {
            if (elementsSort.get(3) != null) {
                score4.setText("Nickname: " + elementsSort.get(3).getNickname() + "  Score: " + elementsSort.get(3).getScore());
            }
        }
        if (elementsSort.size() > 4) {
            if (elementsSort.get(4) != null) {
                score5.setText("Nickname: " + elementsSort.get(4).getNickname() + "  Score: " + elementsSort.get(4).getScore());
            }
        }
        if (elementsSort.size() > 5) {
            if (elementsSort.get(5) != null) {
                score6.setText("Nickname: " + elementsSort.get(5).getNickname() + "  Score: " + elementsSort.get(5).getScore());
            }
        }
        if (elementsSort.size() > 6) {
            if (elementsSort.get(6) != null) {
                score7.setText("Nickname: " + elementsSort.get(6).getNickname() + "  Score: " + elementsSort.get(6).getScore());
            }
        }
        if (elementsSort.size() > 7) {
            if (elementsSort.get(7) != null) {
                score8.setText("Nickname: " + elementsSort.get(7).getNickname() + "  Score: " + elementsSort.get(7).getScore());
            }
        }
        if (elementsSort.size() > 8) {
            if (elementsSort.get(8) != null) {
                score9.setText("Nickname: " + elementsSort.get(8).getNickname() + "  Score: " + elementsSort.get(8).getScore());
            }
        }
        if (elementsSort.size() > 9) {
            if (elementsSort.get(9) != null) {
                score10.setText("Nickname: " + elementsSort.get(9).getNickname() + "  Score: " + elementsSort.get(9).getScore());
            }
        }
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        score1 = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        score3 = new javax.swing.JLabel();
        score4 = new javax.swing.JLabel();
        score5 = new javax.swing.JLabel();
        score6 = new javax.swing.JLabel();
        score7 = new javax.swing.JLabel();
        score8 = new javax.swing.JLabel();
        score9 = new javax.swing.JLabel();
        score10 = new javax.swing.JLabel();
        backMenu = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        topscorers = new javax.swing.JLabel();
        sidewalk = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        sky = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        score1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        score1.setForeground(new java.awt.Color(255, 204, 51));
        add(score1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        score2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        score2.setForeground(new java.awt.Color(255, 204, 51));
        add(score2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        score3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        score3.setForeground(new java.awt.Color(255, 204, 51));
        add(score3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        score4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        score4.setForeground(new java.awt.Color(255, 204, 51));
        add(score4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        score5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        score5.setForeground(new java.awt.Color(255, 204, 51));
        add(score5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        score6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        score6.setForeground(new java.awt.Color(255, 204, 51));
        add(score6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        score7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        score7.setForeground(new java.awt.Color(255, 204, 51));
        add(score7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        score8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        score8.setForeground(new java.awt.Color(255, 204, 51));
        add(score8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        score9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        score9.setForeground(new java.awt.Color(255, 204, 51));
        add(score9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));
        add(score10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        backMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon.png"))); // NOI18N
        backMenu.setActionCommand("backMenu");
        backMenu.setBorderPainted(false);
        backMenu.setContentAreaFilled(false);
        add(backMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/misc/titles/quit.gif"))); // NOI18N
        quit.setActionCommand("quit");
        quit.setBorderPainted(false);
        quit.setContentAreaFilled(false);
        add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        topscorers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/misc/titles/top-scorers.gif"))); // NOI18N
        add(topscorers, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        sidewalk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/sidewalk.png"))); // NOI18N
        add(sidewalk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        city.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/city.png"))); // NOI18N
        add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        sky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fondos/sky.png"))); // NOI18N
        add(sky, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 449));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backMenu;
    private javax.swing.JLabel city;
    private javax.swing.JButton quit;
    private javax.swing.JLabel score1;
    private javax.swing.JLabel score10;
    private javax.swing.JLabel score2;
    private javax.swing.JLabel score3;
    private javax.swing.JLabel score4;
    private javax.swing.JLabel score5;
    private javax.swing.JLabel score6;
    private javax.swing.JLabel score7;
    private javax.swing.JLabel score8;
    private javax.swing.JLabel score9;
    private javax.swing.JLabel sidewalk;
    private javax.swing.JLabel sky;
    private javax.swing.JLabel topscorers;
    // End of variables declaration//GEN-END:variables

    public void escuchar(ActionListener controller) {
        backMenu.addActionListener(controller);
        quit.addActionListener(controller);
    }
}
