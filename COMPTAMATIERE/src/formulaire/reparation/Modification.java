/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formulaire.reparation;

import comptamatiere.REPARATION;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author OBAM
 */
public class Modification extends javax.swing.JFrame {
  String reqpart="select idIMMOBILISATIONMATERIEL ,LIBARTICLE,utilisateur,CODEMATERIEL,libetat,libbur as BUREAU,categorie.dureevie,DMS,DATACQ,immobilisationmateriel.puacq,budget from etat,immobilisationmateriel,article,categorie,bureau,utilisateur "
           + "where BUREAU.idbureau=IMMOBILISATIONMATERIEL.idbureau AND immobilisationmateriel.idarticle=article.idarticle and article.idcategorie=categorie.idcategorie and immobilisationmateriel.etat=etat.idetat"
           + " and immobilisationmateriel.idutilisateur=utilisateur.idutilisateur";
 
    public Modification() {
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

        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblRechercherA = new javax.swing.JLabel();
        txtComptePrincipalA = new javax.swing.JTextField();
        cmbSearchA = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaterielService = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtMontant = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBureau = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbPrestatataire = new javax.swing.JComboBox();
        txtNatureIntervention = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUtilisateur = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodeMateriel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIdImmo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtArticle = new javax.swing.JTextField();
        txtCodePrestataire = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton2.setText("Appliquer les modifications");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "RECHERCHE", 1, 2, new java.awt.Font("Wide Latin", 1, 10), java.awt.Color.black)); // NOI18N

        lblRechercherA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRechercherA.setText("Article");

        txtComptePrincipalA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true));
        txtComptePrincipalA.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtComptePrincipalACaretUpdate(evt);
            }
        });

        cmbSearchA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BUREAU", "LIBARTICLE", "LIBETAT", "UTILISATEUR", "" }));
        cmbSearchA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSearchAActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1617.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Critère:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSearchA, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRechercherA, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtComptePrincipalA, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtComptePrincipalA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbSearchA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRechercherA))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tableMaterielService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Designation", "Immatriculation", "Etat", "Bureau", "Utilisateur", "Categorie", "Cpte Nom.", "Date MS", "Date Acq"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMaterielService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMaterielServiceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMaterielService);

        jLabel7.setText("Date intervention");

        txtBureau.setEditable(false);
        txtBureau.setForeground(new java.awt.Color(255, 0, 0));
        txtBureau.setText("1");

        jLabel2.setText("Prestataire");

        jLabel6.setText("Montant");

        cmbPrestatataire.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPrestatataire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPrestatataireActionPerformed(evt);
            }
        });

        txtNatureIntervention.setForeground(new java.awt.Color(255, 0, 0));

        txtDate.setDateFormatString("dd/MM/yyyy");

        jLabel3.setText("Bureau");

        jLabel5.setText("Nature intervention");

        jLabel9.setText("Détenteur");

        txtUtilisateur.setEditable(false);

        jLabel10.setText("Code Matériel");

        txtCodeMateriel.setEditable(false);
        txtCodeMateriel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel11.setText("ID");
        jLabel11.setEnabled(false);

        txtIdImmo.setEnabled(false);

        jLabel12.setText("Matériel");

        txtArticle.setEditable(false);

        txtCodePrestataire.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNatureIntervention, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBureau, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbPrestatataire, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodePrestataire, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtMontant, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdImmo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodeMateriel)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtBureau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodeMateriel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbPrestatataire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(txtMontant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(txtCodePrestataire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdImmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNatureIntervention, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-942)/2, (screenSize.height-528)/2, 942, 528);
    }// </editor-fold>//GEN-END:initComponents
    public REPARATION ra=new REPARATION();  
    public String idReparation,codePrestataire;
    ArrayList alP;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int reponse= JOptionPane.showConfirmDialog(this,"voulez-vous modifiez?","confirmation",JOptionPane.YES_NO_OPTION);
        if(reponse==JOptionPane.YES_OPTION){
            try {
                String champ[]={"IDIMMOBILISATIONMATERIEL", "idPRESTATAIRE", "LIBREPARATION", "MONTANT", "DATEREPARATION"};
                String valeur[]={txtIdImmo.getText(),txtCodePrestataire.getText(),txtNatureIntervention.getText(),txtMontant.getText(),ra.getDateChoisie(txtDate)};
                int i=ra.updateTable("REPARATION", champ, valeur,"where idreparation="+ra.idREPARATION);
                JOptionPane.showMessageDialog(this, i+" intervation sur "+txtArticle.getText()+" modifiée");
                 if(i==1){    
                    txtIdImmo.setText("");txtNatureIntervention.setText("");txtMontant.setText("");txtDate.setDate(null);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       try {
            REPARATION r=ra.getObjetREPARATION(idReparation);        
            txtNatureIntervention.setText(r.LIBREPARATION);   
            txtMontant.setText(String.valueOf(r.MONTANT));            
            ra.setAfficherDate(txtDate, r.DATEREPARATION.toString());
            txtIdImmo.setText(r.IDIMMOBLISATIIONMATERIEL);
            txtCodePrestataire.setText(ra.IDPRESTATAIRE);
            alP=r.getComboELement("select idPrestataire,libprestataire from prestataire order by libprestataire",cmbPrestatataire); 
            cmbPrestatataire.setSelectedItem(r.getOneResult("select libprestataire from prestataire where idprestataire="+r.IDPRESTATAIRE));
            ResultSet rs =ra.getResultSet(reqpart+" and idimmobilisationmateriel="+r.IDIMMOBLISATIIONMATERIEL);
            rs.next();
            txtUtilisateur.setText(rs.getString("utilisateur"));
            txtCodeMateriel.setText(rs.getString("codemateriel"));
            txtArticle.setText(rs.getString("libarticle"));
            txtBureau.setText(rs.getString("bureau"));
            r.setRemplirJtable(tableMaterielService, reqpart);       
            rs.close();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (ParseException ex) {
         JOptionPane.showMessageDialog(this, ex.getMessage());
        }
       
     
    }//GEN-LAST:event_formComponentShown

    private void txtComptePrincipalACaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtComptePrincipalACaretUpdate
        if(txtComptePrincipalA.getText()!=""){
            String a= cmbSearchA.getSelectedItem().toString();
            if(a.equalsIgnoreCase("bureau"))
            a="libbur";
            try {
                ra.setRemplirJtable(tableMaterielService,reqpart+ " and "+a+" like '%"+txtComptePrincipalA.getText()+"%'");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }//GEN-LAST:event_txtComptePrincipalACaretUpdate

    private void cmbSearchAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSearchAActionPerformed
        lblRechercherA.setText(cmbSearchA.getSelectedItem().toString());
    }//GEN-LAST:event_cmbSearchAActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tableMaterielServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMaterielServiceMouseClicked
     int reponse=JOptionPane.showConfirmDialog(this, "Voulez-vous changer le matériel dépanné?","Attention",JOptionPane.YES_NO_OPTION);
     if(reponse==JOptionPane.YES_OPTION){
        txtIdImmo.setText(tableMaterielService.getValueAt(tableMaterielService.getSelectedRow(), ra.getColumnByName(tableMaterielService, "idimmobilisationmateriel")).toString());
        txtBureau.setText(tableMaterielService.getValueAt(tableMaterielService.getSelectedRow(), ra.getColumnByName(tableMaterielService, "bureau")).toString());
        txtUtilisateur.setText(tableMaterielService.getValueAt(tableMaterielService.getSelectedRow(), ra.getColumnByName(tableMaterielService, "utilisateur")).toString());
        txtCodeMateriel.setText(tableMaterielService.getValueAt(tableMaterielService.getSelectedRow(), ra.getColumnByName(tableMaterielService, "codemateriel")).toString());
        txtArticle.setText(tableMaterielService.getValueAt(tableMaterielService.getSelectedRow(), ra.getColumnByName(tableMaterielService, "libarticle")).toString());
     } 
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMaterielServiceMouseClicked

    private void cmbPrestatataireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPrestatataireActionPerformed
        codePrestataire= alP.get(cmbPrestatataire.getSelectedIndex()).toString();
        txtCodePrestataire.setText(codePrestataire);
    }//GEN-LAST:event_cmbPrestatataireActionPerformed

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
            java.util.logging.Logger.getLogger(Modification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modification().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbPrestatataire;
    private javax.swing.JComboBox cmbSearchA;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRechercherA;
    private javax.swing.JTable tableMaterielService;
    private javax.swing.JTextField txtArticle;
    private javax.swing.JTextField txtBureau;
    private javax.swing.JTextField txtCodeMateriel;
    private javax.swing.JTextField txtCodePrestataire;
    private javax.swing.JTextField txtComptePrincipalA;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtIdImmo;
    private javax.swing.JTextField txtMontant;
    private javax.swing.JTextField txtNatureIntervention;
    private javax.swing.JTextField txtUtilisateur;
    // End of variables declaration//GEN-END:variables
}
