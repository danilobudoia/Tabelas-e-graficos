
package estatistica;

import javax.swing.*;
import java.util.*;

public class Tabela extends javax.swing.JFrame {
    
    JLabel[] lb = new JLabel[10];
    JTextField[] txt = new JTextField[10];
    int i;
    
    public Tabela() {
        initComponents();
        for (i=0; i<10; i++){
            lb[i] = new JLabel("");
            txt[i] = new JTextField("");
            add(lb[i]);
            add(txt[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lstObjetos = new LinkedList();
        lbNome = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bDel = new javax.swing.JButton();
        bHelp = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        aTabela = new javax.swing.JTable();
        bAmostra = new javax.swing.JButton();
        bResumo = new javax.swing.JButton();
        hack = new javax.swing.JToggleButton();

        lstObjetos = org.jdesktop.observablecollections.ObservableCollections.observableList(lstObjetos);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESTATISTICA - Tabela 1");
        setLocation(new java.awt.Point(100, 0));
        setResizable(false);

        lbNome.setText("Tabela 1");

        bAdd.setText("Adicionar");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bEdit.setText("Editar");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bDel.setText("Excluir");
        bDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelActionPerformed(evt);
            }
        });

        bHelp.setText("AJUDA");
        bHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHelpActionPerformed(evt);
            }
        });

        bExit.setText("Voltar");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        aTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        aTabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(aTabela);

        bAmostra.setText("Pegar Amostragem");
        bAmostra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAmostraActionPerformed(evt);
            }
        });

        bResumo.setText("Tabelas Resumo e Analises");
        bResumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResumoActionPerformed(evt);
            }
        });

        hack.setText("hack");
        hack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bDel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hack)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAmostra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbNome))
                    .addComponent(hack))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bEdit)
                            .addComponent(bDel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bResumo)
                    .addComponent(bAmostra)
                    .addComponent(bHelp)
                    .addComponent(bExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Adicionar
    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)aTabela.getModel();
        dtm.addRow(new Object[]{});
        for (i=0; i<aTabela.getColumnCount(); i++)
            if (!txt[i].getText().trim().equals("")){
                aTabela.setValueAt(txt[i].getText(), aTabela.getRowCount()-1, i+1);
                txt[i].setText("");
            }
        numeroLinhas();
        txt[0].requestFocus();
    }//GEN-LAST:event_bAddActionPerformed
//Excluir
    private void bDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDelActionPerformed
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)aTabela.getModel();
        if (aTabela.getSelectedRowCount()>0)
            dtm.removeRow(aTabela.getSelectedRow());
        else if (aTabela.getRowCount()>0)
            dtm.removeRow(aTabela.getRowCount()-1);
        numeroLinhas();
        txt[0].requestFocus();
    }//GEN-LAST:event_bDelActionPerformed
//Fechar
    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Se voltar você ira perder a tabela atual e todos os seus dados     "
                + "\n\nDeseja continuar?") == JOptionPane.YES_OPTION){
            new GerarTabela().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_bExitActionPerformed
//AJUDA
    private void bHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHelpActionPerformed
        JOptionPane.showMessageDialog(null, "TableGerator2000\n\n- Adicionar: Digite nos respectivos campos os valores "
                + "que deseja inserir na tabela e clique em 'Adicionar'.\n\n"
                + "- Editar: Selecione uma linha da tabela, digite nos seus respectivos campos os valores que deseja alterar, "
                + " clique em 'Editar';\n          OBS: Deixe em branco os campos que não deseja rezlizar alteração.\n\n"
                + "- Excluir: Selecione a linha que deseja apagar e clique no botão 'Excluir';\n"
                + "          OBS: Se não houver linha selecionada, sera excluida a ultima linha da tabela.\n\n"
                + "- Pegar Amostragem: Utilize esta opção para pegar uma amostra da tabela:\n"
                + "          1º Selecione o tipo de amostra;\n          2º Sete o tamanho da amostra na barra de rolagem;\n"
                + "          3º Escolha a coluna que deseja pegar uma amostra;\n          4º Clique em 'Gerar';\n"
                + "          5º Caso necessário, digite a posição inicial da amostra.\n\n"
                + "- Gerar Resumo e Analises: Utilize esta opção para visualizar uma tabela de resumo e suas analises:\n"
                + "          1º Selecione o tipo da tabela de resumo;\n"
                + "          2º Escolha as colunas da tabela que serão realizadas as analises;\n"
                + "          3º Clique no botão 'Gerar'.\n\nOBS: Os campos da tabela que estiver em branco"
                + "serão substituidos por 0 (zero);\n          Exclua-os e evite possíveis erros nas analises.\n\n"
                + "Quaisquer outras duvidas, consulte o desenvolvedor!\n\n");
    }//GEN-LAST:event_bHelpActionPerformed
//EDitar
    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        for (i=0; i<aTabela.getColumnCount(); i++)
            if (!txt[i].getText().trim().equals("")){
                aTabela.setValueAt(txt[i].getText(), aTabela.getSelectedRow(), i+1);
                txt[i].setText("");
            }
        txt[0].requestFocus();
    }//GEN-LAST:event_bEditActionPerformed

    private void bAmostraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAmostraActionPerformed
        verificarItens();
        new GerarAmostras(aTabela).setVisible(true);
    }//GEN-LAST:event_bAmostraActionPerformed

    private void bResumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResumoActionPerformed
        verificarItens();
        new GerarResumo(aTabela).setVisible(true);
    }//GEN-LAST:event_bResumoActionPerformed
//hack
    private void hackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hackActionPerformed
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)aTabela.getModel();
        if (hack.isSelected()==true){
        dtm.addRow(new Object[]{"1","20","Ens Medio","16.9","61","Amarelo","0","Fev","2.08"});
        dtm.addRow(new Object[]{"2","22","Ens Fundamental","15.5","63","Amarelo","0","Abr","1.37"});
        dtm.addRow(new Object[]{"3","25","Superior","18.3","80","Amarelo","2","Jun","1.80"});
        dtm.addRow(new Object[]{"4","21","Ens Fundamental","16.3","82","Amarelo","1","Jun","1.58"});
        dtm.addRow(new Object[]{"5","24","Superior","16","50","Preto","0","Mar","2.07"});
        dtm.addRow(new Object[]{"6","25","Superior","16","60","Amarelo","1","Abr","1.18"});
        dtm.addRow(new Object[]{"7","23","Ens Medio","16.5","85","Amarelo","0","Mar","2.13"});
        dtm.addRow(new Object[]{"8","24","Ens Medio","16","83","Amarelo","2","Mai","1.85"});
        dtm.addRow(new Object[]{"9","20","Superior Incomp.","17.3","105","Preto","0","Fev","2.08"});
        dtm.addRow(new Object[]{"10","21","Superior Incomp.","15.7","48","Amarelo","1","Mar","1.40"});
        dtm.addRow(new Object[]{"11","25","Superior Incomp.","17.1","58","Vermelho","0","Mai","1.72"});
        dtm.addRow(new Object[]{"12","24","Superior Incomp.","17","65","Preto","3","Abr","1.70"});
        dtm.addRow(new Object[]{"13","21","Superior Incomp.","17.2","75","Amarelo","0","Jun","2.15"});
        dtm.addRow(new Object[]{"14","20","Ens Medio","17.5","60","Amarelo","1","Fev","1.08"});
        dtm.addRow(new Object[]{"15","25","Superior","16.5","55","Amarelo","0","Jun","1.07"});
        dtm.addRow(new Object[]{"16","24","Superior","16.3","51","Preto","2","Jun","1.93"});
        dtm.addRow(new Object[]{"17","23","Superior","18.2","86","Vermelho","0","Jan","2.04"});
        dtm.addRow(new Object[]{"18","25","Superior","15.4","45","Preto","2","Mar","1.68"});
        dtm.addRow(new Object[]{"19","21","Ens Medio","17.6","75","Amarelo","1","Jan","2.21"});
        dtm.addRow(new Object[]{"20","24","Superior","18.6","69","Preto","1","Jun","1.81"});
        dtm.addRow(new Object[]{"21","25","Superior Incomp.","16.4","60","Amarelo","1","Jan","1.95"});
        dtm.addRow(new Object[]{"22","25","Ens Medio","16.3","53","Amarelo","0","Jun","1.85"});
        dtm.addRow(new Object[]{"23","23","Superior Incomp.","17.8","82","Preto","0","Mar","1.56"});
        dtm.addRow(new Object[]{"24","25","Superior","18","90","Preto","2","Abr","2.03"});
        dtm.addRow(new Object[]{"25","22","Ens Medio","16.8","80","Amarelo","2","Mai","2.07"});
        dtm.addRow(new Object[]{"26","25","Pos Graduado","17","76","Vermelho","0","Mai","1.63"});
        dtm.addRow(new Object[]{"27","23","Ens Fundamental","17.1","75","Amarelo","0","Jun","1.22"});
        dtm.addRow(new Object[]{"28","25","Superior Incomp.","16.5","68","Preto","1","Mar","2.27"});
        dtm.addRow(new Object[]{"29","23","Ens Medio","16.8","69","Amarelo","3","Jan","2.09"});
        dtm.addRow(new Object[]{"30","24","Superior Incomp.","17.4","65","Amarelo","0","Fev","2.08"});
        dtm.addRow(new Object[]{"31","20","Ens Medio","18.2","70","Branco","1","Jun","1.37"});
        dtm.addRow(new Object[]{"32","25","Superior Incomp.","15.9","59","Vermelho","0","Mai","1.80"});
        dtm.addRow(new Object[]{"33","25","Superior Incomp.","17.8","71","Amarelo","1","Mar","1.58"});
        dtm.addRow(new Object[]{"34","25","Pos Graduado","17.7","69","Vermelho","0","Fev","2.07"});
        dtm.addRow(new Object[]{"35","24","Pos Graduado","16.4","64","Vermelho","","Jan","1.18"});
        dtm.addRow(new Object[]{"36","21","Ens Medio","16.9","58","Amarelo","","Jun","2.13"});
        dtm.addRow(new Object[]{"37","22","Ens Medio","15.8","57","Amarelo","","Jan","1.85"});
        dtm.addRow(new Object[]{"38","24","Pos Graduado","18.1","82","Vermelho","","","2.08"});
        dtm.addRow(new Object[]{"39","20","Superior Incomp.","18.3","","Amarelo","","",""});
        dtm.addRow(new Object[]{"40","22","Superior Incomp.","19","","Amarelo","","",""});
        dtm.addRow(new Object[]{"41","25","Pos Graduado","17.2","","Amarelo","","",""});
        dtm.addRow(new Object[]{"42","22","Ens Medio","17.5","","Amarelo","","",""});
        dtm.addRow(new Object[]{"43","","","17.1","","Branco","","",""});
        dtm.addRow(new Object[]{"44","","","16.3","","Amarelo","","",""});
        dtm.addRow(new Object[]{"45","","","16.8","","Preto","","",""});
        }
        else
            dtm.setRowCount(0);
    }//GEN-LAST:event_hackActionPerformed

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
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable aTabela;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bAmostra;
    private javax.swing.JButton bDel;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bHelp;
    private javax.swing.JButton bResumo;
    private javax.swing.JToggleButton hack;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lbNome;
    private java.util.List lstObjetos;
    // End of variables declaration//GEN-END:variables

    public void verificarItens(){
        for (i=0; i<aTabela.getColumnCount(); i++)
            for (int j=0; j<aTabela.getRowCount(); j++)
                if (aTabela.getValueAt(j, i)==null || aTabela.getValueAt(j, i).toString().isEmpty())
                    aTabela.setValueAt("0", j, i);
        aTabela.removeEditor();
    }
    
    public void numeroLinhas(){
        int numero=1;
        for (i=0; i<aTabela.getRowCount(); i++){
            aTabela.setValueAt(numero, i, 0);
            numero++;
        }
    }
    
}
