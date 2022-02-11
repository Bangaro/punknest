/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.PanelOptionsController;
import java.awt.event.ActionListener;

/**
 *
 * @author monge
 */
public class PanelOptions extends javax.swing.JPanel {

    /**
     * Creates new form PanelOptions
     */
    PanelOptionsController controller;

    public PanelOptions() {
        initComponents();
        controller = new PanelOptionsController();
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

        backMenu = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        topscorers = new javax.swing.JLabel();
        sidewalk = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        sky = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon.png"))); // NOI18N
        backMenu.setActionCommand("backMenu");
        backMenu.setBorderPainted(false);
        backMenu.setContentAreaFilled(false);
        add(backMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/misc/titles/quit.gif"))); // NOI18N
        quit.setActionCommand("quit");
        quit.setBorderPainted(false);
        quit.setContentAreaFilled(false);
        add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        topscorers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/misc/titles/options.gif"))); // NOI18N
        add(topscorers, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

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
    private javax.swing.JLabel sidewalk;
    private javax.swing.JLabel sky;
    private javax.swing.JLabel topscorers;
    // End of variables declaration//GEN-END:variables
public void escuchar(ActionListener controller) {
        quit.addActionListener(controller);
        backMenu.addActionListener(controller);
    }
}