/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.FRMGameController;
import model.GameThread;
import model.Sound;

/**
 *
 * @author monge
 */
public class FRMGame extends javax.swing.JFrame {

    PanelMenuPrincipal panelMenu;
    PanelGame panelGame;
    PanelOptions panelOptions;
    PanelTopScorers panelTopScorers;
    PanelPickPlayer panelPickPlayer;

    FRMGameController frmGameController;

    GameThread thread;

    Sound sound;

    /**
     * Creates new form FRMGame
     */
    public FRMGame() {
        initComponents();
        this.setSize(800, 450);

        panelMenu = new PanelMenuPrincipal();
        panelGame = new PanelGame();
        panelOptions = new PanelOptions();
        panelTopScorers = new PanelTopScorers();
        panelPickPlayer = new PanelPickPlayer();
        this.add(panelOptions);
        this.add(panelTopScorers);
        this.add(panelMenu);
        this.add(panelGame);
        this.add(panelPickPlayer);

        panelGame.setVisible(false);
        panelOptions.setVisible(false);
        panelTopScorers.setVisible(false);
        panelPickPlayer.setVisible(false);
        panelMenu.setVisible(true);

        frmGameController = new FRMGameController(this);
        escucharPaneles();

        sound = new Sound();
        if (FRMGameController.menuActive) {
            sound.setFile(0);
            sound.play();
            sound.loop();
        }

        thread = new GameThread(this);
        thread.start();

    }

    public void escucharPaneles() {
        this.panelMenu.escuchar(frmGameController);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMGame().setVisible(true);
            }
        });
    }

    public PanelMenuPrincipal getPanelMenu() {
        return panelMenu;
    }

    public PanelGame getPanelGame() {
        return panelGame;
    }

    public PanelOptions getPanelOptions() {
        return panelOptions;
    }

    public PanelTopScorers getPanelTopScorers() {
        return panelTopScorers;
    }

    public PanelPickPlayer getPanelPickPlayer() {
        return panelPickPlayer;
    }

    public Sound getSound() {
        return sound;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
