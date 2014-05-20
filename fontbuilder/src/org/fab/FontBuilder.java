/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fab;

import javax.swing.JFrame;

/**
 *
 * @author epmancini
 */
public class FontBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FontJFrame frame = new FontJFrame();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}
