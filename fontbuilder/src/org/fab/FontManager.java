/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fab;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
/**
 *
 * @author epman
 */
public class FontManager {
   public Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 32);
   public File fname = new File("font.png");
   public int dy = 0;
   public boolean showgrid = true;
   public int width, height, ncols, nrows;
   
   private final static String CONF_FNAME = "fontbuilder.dat";
   public FontManager()  {
       try {
            final BufferedReader r = new BufferedReader(new FileReader( CONF_FNAME ) );
            
            final String fn = r.readLine();
            final int fst = Integer.parseInt( r.readLine() );
            final int fsz = Integer.parseInt( r.readLine() );
            font = new Font(fn, fst, fsz);
            
            fname  = new File(r.readLine());
            dy = Integer.parseInt( r.readLine() );
            showgrid = Boolean.parseBoolean(r.readLine() );
            width = Integer.parseInt( r.readLine() );
            height = Integer.parseInt( r.readLine() );
            ncols = Integer.parseInt( r.readLine() );
            nrows = Integer.parseInt( r.readLine() );
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   public void save()  {
       try {
            final PrintWriter pw = new PrintWriter(CONF_FNAME);
            pw.println(font.getFontName());
            pw.println(font.getStyle());
            pw.println(font.getSize());
            pw.println(fname.getAbsolutePath());
            pw.println(dy);
            pw.println(showgrid);
            pw.println(width);
            pw.println(height);
            pw.println(ncols);
            pw.println(nrows);
            pw.close();
            ImageIO.write(img, "png", fname);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   private BufferedImage img;
   
   public Image generateBmp(final int w, final int h, final int rows, final int cols) {
       img = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
       final Graphics2D g = img.createGraphics();
       if (showgrid) {
            g.setColor(Color.RED);
            for (int r=0; r<=rows; r++) {
                final int y = h * r / rows;
                g.drawLine(0, y, w, y);
            }
            for (int c=0; c<=cols; c++) {
                final int x = w * c / cols;
                g.drawLine(x, 0, x, h);
            }
       }
       
       char ch = ' ';
       g.setColor(Color.BLACK);
       g.setFont(font);
       //g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
        RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
       final double CW = (double)w / (double)cols;
       final double CH = (double)h / (double)rows;
       final FontMetrics fm = g.getFontMetrics(font);
       for (int r=0; r<rows; r++) {
            for (int c=0; c<cols; c++) {
                final String s = Character.toString(ch);
                final Rectangle2D rct = fm.getStringBounds(s, g );
                
                final double x = (double)w * (double)c / (double)cols + (CW - fm.charWidth(ch))/2.0;
                final double y = dy + (double)h * (double)r / (double)rows + (CH - fm.getLeading())/2.0;
                g.drawString(s, (int)x, (int)y);
                ch++;
            }
       }
       return img;
   }
}
