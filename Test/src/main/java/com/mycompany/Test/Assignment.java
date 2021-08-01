/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labassignment2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.Timer;

/**
 *
 * @author ayseguleyrice
 */
public class Assignment extends javax.swing.JFrame implements ActionListener {
    Timer myTimer = new Timer(200, this);
    int x, y;
    
    
    public void paint(Graphics g){
        
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillOval(x,x,40,60);
        myTimer.start();
        
        
        
    }
    public void actionPerformed(ActionEvent e) {
        Random num = new Random();
        int value;
        int height;
        
        value = num.nextInt(400);
        height = num.nextInt(250);
        x = value;
        y = height;
        value = num.nextInt(500);
        height = num.nextInt(350);
        
        repaint();
        
        
    }
    
    public static void main(String[] args) {
        JFrame frame = new Assignment();   
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(600, 400);       
        frame.setVisible(true);
        
}

    
    public Assignment() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
}
    /**
     * @param args the command line arguments
     */
    

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

