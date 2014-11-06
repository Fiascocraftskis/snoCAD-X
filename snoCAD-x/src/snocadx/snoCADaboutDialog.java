/*
 * Copyright 2007-2014 Daniel Graf (https://github.com/danielgraf)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * snoCADaboutDialog.java
 *
 * Created on 25 April 2007, 13:23
 */

package snocadx;

/**
 *
 * @author  dgraf
 */
public class snoCADaboutDialog extends javax.swing.JPanel {
    
    /** Creates new form snoCADaboutDialog */
    public snoCADaboutDialog() 
    {
        
        initComponents();
        this.setSize(400, 250);

        
    }

    public void paintComponent(java.awt.Graphics g)
    {
        super.paintComponent(g);
        javax.swing.ImageIcon iconImage = new javax.swing.ImageIcon(this.getClass().getResource("images/xxxyyxxx.png")); 
        java.awt.Image img = iconImage.getImage();
        java.awt.Graphics2D g2d = (java.awt.Graphics2D)g;
        g2d.drawImage(img,0,0,this);
        g2d.drawString("snoCAD-X " + Main.version + " (c) 2007-2008 Dan Graf", 10, 200);
        g2d.drawString("www.grafsnowboards.com", 10, 220);
        g2d.drawString("Not for commercial use", 10, 240);
    } 
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
