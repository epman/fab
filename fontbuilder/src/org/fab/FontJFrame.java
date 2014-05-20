/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fab;

import com.sun.imageio.plugins.png.PNGImageWriter;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author epmancini
 */
public class FontJFrame extends javax.swing.JFrame {

    private final FontManager fman = new FontManager();
    private void updateStatus() {
        jLabelInfo.setText("Font:" + fman.font.getFontName()+" - Size:" + fman.font.getSize()+
                   " - File:"+fman.fname.getName());
    }
    
    /**
     * Creates new form FontJFrame
     */
    public FontJFrame() {
        initComponents();
        updateStatus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jToggleButtonFont = new javax.swing.JToggleButton();
        jToggleButtonRegenerate = new javax.swing.JToggleButton();
        jButtonUp = new javax.swing.JButton();
        jButtonDown = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldWidth = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldHeight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCols = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldRows = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxShowGrid = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabelInfo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelFont = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSave = new javax.swing.JMenuItem();
        jMenuItemSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemRegenerate = new javax.swing.JMenuItem();
        jMenuItemSetFont = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fab");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel4.setLayout(new java.awt.BorderLayout());

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");

        jToggleButtonFont.setText("Font");
        jToggleButtonFont.setToolTipText("Select font and regenerate");
        jToggleButtonFont.setFocusable(false);
        jToggleButtonFont.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonFont.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButtonFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonFontActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButtonFont);

        jToggleButtonRegenerate.setText("Regenerate");
        jToggleButtonRegenerate.setFocusable(false);
        jToggleButtonRegenerate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonRegenerate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToggleButtonRegenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRegenerateActionPerformed(evt);
            }
        });
        jToolBar1.add(jToggleButtonRegenerate);

        jButtonUp.setText("Up");
        jButtonUp.setFocusable(false);
        jButtonUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonUp);

        jButtonDown.setText("Down");
        jButtonDown.setFocusable(false);
        jButtonDown.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDown.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDownActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonDown);

        jPanel4.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new java.awt.GridLayout(3, 4));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Width (px):");
        jPanel2.add(jLabel1);

        jTextFieldWidth.setText("512");
        jPanel2.add(jTextFieldWidth);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Height (px):");
        jPanel2.add(jLabel2);

        jTextFieldHeight.setText("512");
        jPanel2.add(jTextFieldHeight);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Columns:");
        jPanel2.add(jLabel3);

        jTextFieldCols.setText("8");
        jPanel2.add(jTextFieldCols);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Rows:");
        jPanel2.add(jLabel4);

        jTextFieldRows.setText("8");
        jPanel2.add(jTextFieldRows);
        jPanel2.add(jLabel5);

        jCheckBoxShowGrid.setSelected(true);
        jCheckBoxShowGrid.setText("Show grid");
        jCheckBoxShowGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowGridActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxShowGrid);

        jPanel4.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabelInfo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelInfo.setText("font.png");
        jPanel3.add(jLabelInfo, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabelFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/fab/fontplaceholder.png"))); // NOI18N
        jPanel1.add(jLabelFont, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        jMenuItemSave.setText("Save");
        jMenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSave);

        jMenuItemSaveAs.setText("Save as...");
        jMenuItemSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSaveAs);
        jMenu1.add(jSeparator1);

        jMenuItemExit.setText("Quit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItemRegenerate.setText("Regenerate");
        jMenuItemRegenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegenerateActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemRegenerate);

        jMenuItemSetFont.setText("Font");
        jMenuItemSetFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSetFontActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemSetFont);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveAsActionPerformed
        final JFileChooser chooser = new JFileChooser();
        final FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "PNG Images", "png");
        chooser.setFileFilter(filter);
        final int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            fman.fname = chooser.getSelectedFile();
            fman.save();
            updateStatus();
        }

    }//GEN-LAST:event_jMenuItemSaveAsActionPerformed

    private void jMenuItemRegenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegenerateActionPerformed
        try {
            final int w = Integer.parseInt( jTextFieldWidth.getText() );
            final int h = Integer.parseInt( jTextFieldHeight.getText() );
            final int r = Integer.parseInt( jTextFieldRows.getText() );
            final int c = Integer.parseInt( jTextFieldCols.getText() );
            final Image img = fman.generateBmp(w, h, r, c);
            jLabelFont.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemRegenerateActionPerformed

    private void jMenuItemSetFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSetFontActionPerformed
        final JFontChooser fontChooser = new JFontChooser();
        int result = fontChooser.showDialog(this);
        if (result == JFontChooser.OK_OPTION)
        {
           final java.awt.Font font = fontChooser.getSelectedFont();
           fman.font = font;
           //window.pack();
           updateStatus();
           jMenuItemRegenerateActionPerformed(evt);
        }        
    }//GEN-LAST:event_jMenuItemSetFontActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jToggleButtonFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonFontActionPerformed
        jMenuItemSetFontActionPerformed(evt);
    }//GEN-LAST:event_jToggleButtonFontActionPerformed

    private void jToggleButtonRegenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRegenerateActionPerformed
       jMenuItemRegenerateActionPerformed(evt);
    }//GEN-LAST:event_jToggleButtonRegenerateActionPerformed

    private void jCheckBoxShowGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowGridActionPerformed
       fman.showgrid = jCheckBoxShowGrid.isSelected();
       jMenuItemRegenerateActionPerformed(evt);
    }//GEN-LAST:event_jCheckBoxShowGridActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

    private void jButtonUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpActionPerformed
         fman.dy += 1;
         jMenuItemRegenerateActionPerformed(null);
    }//GEN-LAST:event_jButtonUpActionPerformed

    private void jButtonDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDownActionPerformed
         fman.dy -= 1;
         jMenuItemRegenerateActionPerformed(null);
    }//GEN-LAST:event_jButtonDownActionPerformed

    private void jMenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveActionPerformed
            fman.save();
            updateStatus();
    }//GEN-LAST:event_jMenuItemSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FontJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FontJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FontJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FontJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FontJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDown;
    private javax.swing.JButton jButtonUp;
    private javax.swing.JCheckBox jCheckBoxShowGrid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFont;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemRegenerate;
    private javax.swing.JMenuItem jMenuItemSave;
    private javax.swing.JMenuItem jMenuItemSaveAs;
    private javax.swing.JMenuItem jMenuItemSetFont;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCols;
    private javax.swing.JTextField jTextFieldHeight;
    private javax.swing.JTextField jTextFieldRows;
    private javax.swing.JTextField jTextFieldWidth;
    private javax.swing.JToggleButton jToggleButtonFont;
    private javax.swing.JToggleButton jToggleButtonRegenerate;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
