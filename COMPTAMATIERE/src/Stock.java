/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import formulaire.article.*;

/**
 *
 * @author ADEBO
 */
public class Stock extends javax.swing.JPanel {

    /**
     * Creates new form Stock
     */
    public Stock() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        btnEntree7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jList1.setForeground(new java.awt.Color(0, 0, 153));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Gestion des Sortie", "Gestion des Entree", "Validations des Deux Ordres" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        btnEntree7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bc1.png"))); // NOI18N
        btnEntree7.setToolTipText(". Enregistrement des Bons de Commandes\n . Enregistrement des Dons\n. Visualisation et impression des ordres D entrees");
        btnEntree7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), null));
        btnEntree7.setContentAreaFilled(false);
        btnEntree7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntree7MouseEntered(evt);
            }
        });
        btnEntree7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntree7ActionPerformed(evt);
            }
        });

        jLabel1.setText("Gestion Entrées");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 148, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEntree7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEntree7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntree7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntree7MouseEntered
        // TODO add your handling code here:
       // Icon rolloverIcon = new ImageIcon("../images/val.png");
       // btnEntree7.setRolloverIcon(rolloverIcon);
        //btnEntree7.setBackground(Color.red);
    }//GEN-LAST:event_btnEntree7MouseEntered

    private void btnEntree7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntree7ActionPerformed
      //  Bon b = new Bon();
       // b.setVisible(true);
    }//GEN-LAST:event_btnEntree7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntree7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
