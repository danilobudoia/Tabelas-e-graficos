package estatistica;

import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GerarTabela extends javax.swing.JFrame {
    
    int c=0, i;
    JLabel[] labs = new JLabel[10];
    public static List colunas = new ArrayList();
    
    public GerarTabela() {
        initComponents();
        colunas.clear();
        for (i=0; i<10; i++){
            labs[i] = new JLabel("");
            add(labs[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtCol = new javax.swing.JTextField();
        bNewCollum = new javax.swing.JButton();
        bContinue = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bExit = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        bHelp = new javax.swing.JButton();
        rbT1 = new javax.swing.JRadioButton();
        rbT2 = new javax.swing.JRadioButton();
        rbT3 = new javax.swing.JRadioButton();
        rbT4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESTATISTICA - Gerar tabela principal");
        setLocation(new java.awt.Point(500, 150));
        setResizable(false);

        jLabel1.setText("Nova Coluna:");

        bNewCollum.setText("Nova");
        bNewCollum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewCollumActionPerformed(evt);
            }
        });

        bContinue.setText("Continuar");
        bContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bContinueActionPerformed(evt);
            }
        });

        jLabel2.setText("COLUNAS:");

        bExit.setText("Sair");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bClear.setText("Limpar");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome da Tabela:");

        bHelp.setText("AJUDA");
        bHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHelpActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbT1);
        rbT1.setSelected(true);
        rbT1.setText("Tabela Dinamica (Amostra)");
        rbT1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbT1StateChanged(evt);
            }
        });

        buttonGroup1.add(rbT2);
        rbT2.setText("Tabela de Frequencia");
        rbT2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbT2StateChanged(evt);
            }
        });

        buttonGroup1.add(rbT3);
        rbT3.setText("Tabela de Freq. c/ Intervalo");
        rbT3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbT3StateChanged(evt);
            }
        });

        buttonGroup1.add(rbT4);
        rbT4.setText("Tabela de XY c/ Graficos");
        rbT4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbT4StateChanged(evt);
            }
        });

        jLabel4.setText("Tabelas prontas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(bContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rbT4)
                    .addComponent(rbT2)
                    .addComponent(jLabel3)
                    .addComponent(rbT3)
                    .addComponent(rbT1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCol, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(bNewCollum, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bClear)))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbT1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNewCollum)
                    .addComponent(bClear))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addComponent(rbT2)
                .addGap(18, 18, 18)
                .addComponent(rbT3)
                .addGap(18, 18, 18)
                .addComponent(rbT4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bExit)
                    .addComponent(bHelp)
                    .addComponent(bContinue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNewCollumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewCollumActionPerformed
        if (c<10){
            if (!txtCol.getText().trim().equals("")){
                colunas.add(txtCol.getText());
                labs[c].setText(txtCol.getText());
                labs[c].setBounds(210, 130+(20*c), 100, 25);
                labs[c].setVisible(true);
                c++;
                txtCol.setText("");
                txtCol.requestFocus();
                repaint();
            }
            else
                JOptionPane.showMessageDialog(null, "ERROR 13.69-E\nDigite um nome válido para a coluna!");
        }
        else
            JOptionPane.showMessageDialog(null, "ERROR 24.11-E\nQuantidade maxima de colunas alcançada!");
    }//GEN-LAST:event_bNewCollumActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        colunas.clear();
        for (i=0; i<c; i++){
            labs[i].setText("");
            labs[i].setVisible(false);
        }
        c=0;
        txtCol.setText("");
        txtCol.requestFocus();
    }//GEN-LAST:event_bClearActionPerformed

    private void bContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bContinueActionPerformed
        if (rbT1.isSelected()){
            Tabela t = new Tabela();
            t.setVisible(true);
            DefaultTableModel model = new DefaultTableModel();
            t.aTabela.setModel(model);
            if (txtNome.getText().trim().equals("")) //Pegar Nome da Tabela
                txtNome.setText("Tabela 1");
            t.setTitle("ESTATISTICA - "+txtNome.getText());
            t.lbNome.setText(txtNome.getText());
        
            //criar colunas
            model.addColumn("Nº");
            for (i=0; i<colunas.size(); i++){
                model.addColumn(colunas.get(i));
                t.lb[i].setText((String)colunas.get(i));
                t.lb[i].setBounds(10, 120+(50*i), 150, 25);
                t.lb[i].setVisible(true);
                t.txt[i].setBounds(10, 140+(50*i), 150, 25);
                t.txt[i].setVisible(true);
            }
            //centralizar colunas
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            for (i=0; i<t.aTabela.getColumnCount(); i++)
                t.aTabela.getColumnModel().getColumn(i).setCellRenderer(centralizado);
            t.aTabela.getColumnModel().getColumn(0).setMaxWidth(30);
            dispose();
        }
        if (rbT2.isSelected()){
            TabelaFreq f = new TabelaFreq();
            if (txtNome.getText().trim().equals("")) //Pegar Nome da Tabela
                txtNome.setText("ESTATISTICA - Tabela de Frequencia");
            f.setTitle(txtNome.getText());
            f.lb1.setText(txtNome.getText());
            f.setVisible(true);
            dispose();
        }
        if (rbT3.isSelected()){
            TabelaInterv in = new TabelaInterv();
            if (txtNome.getText().trim().equals("")) //Pegar Nome da Tabela
                txtNome.setText("ESTATISTICA - Tabela de Freq com Intervalo");
            in.setTitle(txtNome.getText());
            in.lb1.setText(txtNome.getText());
            in.setVisible(true);
            dispose();
        }
        if (rbT4.isSelected()){
            TabelaXY xy = new TabelaXY();
            if (txtNome.getText().trim().equals("")) //Pegar Nome da Tabela
                txtNome.setText("ESTATISTICA - Tabela de Correlação e Regreção");
            xy.setTitle(txtNome.getText());
            xy.lb1.setText(txtNome.getText());
            xy.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_bContinueActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed

    private void bHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHelpActionPerformed
        JOptionPane.showMessageDialog(null, "TableGerator2000\n\nComo Usar:\nDe um nome a tabela e escolha o seu tipo;\n\n"
                + "Tabelas Prontas:\nUtilize estas opçoes para realizar analises em tabelas de resumo ja prontas\n\n"
                + "Tabela Dinamica:\nUtilize esta opção para entrar com uma amostra (tabela) com qtas colunas desejar;\n"
                + " - Digite o nome da coluna e clique no botão 'Nova Coluna';\n"
                + " - Repita o processo anterior até que todas as colunas desejadas tenham sido adicionadas;\n"
                + " - Após todas as colunas adicionadas, clique no botao 'Continuar' para gerar a tabela.\n"
                + "OBS: Caso necessário, utilize o botão 'Limpar' para corrigir as colunas.\n\n"
                + "Desenvolvido por:\nDanilo W. Budoia");
    }//GEN-LAST:event_bHelpActionPerformed

    private void rbT1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbT1StateChanged
        if (rbT1.isSelected()){
            txtCol.setEnabled(true);
            bNewCollum.setEnabled(true);
            bClear.setEnabled(true);
        }
    }//GEN-LAST:event_rbT1StateChanged

    private void rbT2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbT2StateChanged
        if (rbT2.isSelected()){
            txtCol.setEnabled(false);
            bNewCollum.setEnabled(false);
            bClear.setEnabled(false);
        }
    }//GEN-LAST:event_rbT2StateChanged

    private void rbT3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbT3StateChanged
        if (rbT3.isSelected()){
            txtCol.setEnabled(false);
            bNewCollum.setEnabled(false);
            bClear.setEnabled(false);
        }
    }//GEN-LAST:event_rbT3StateChanged

    private void rbT4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbT4StateChanged
        if (rbT4.isSelected()){
            txtCol.setEnabled(false);
            bNewCollum.setEnabled(false);
            bClear.setEnabled(false);
        }
    }//GEN-LAST:event_rbT4StateChanged

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
            java.util.logging.Logger.getLogger(GerarTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerarTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerarTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerarTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerarTabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClear;
    private javax.swing.JButton bContinue;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bHelp;
    private javax.swing.JButton bNewCollum;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton rbT1;
    private javax.swing.JRadioButton rbT2;
    private javax.swing.JRadioButton rbT3;
    private javax.swing.JRadioButton rbT4;
    private javax.swing.JTextField txtCol;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
