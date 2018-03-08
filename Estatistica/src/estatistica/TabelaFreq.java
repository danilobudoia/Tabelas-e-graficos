
package estatistica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TabelaFreq extends javax.swing.JFrame {
    
    List lista1 = new ArrayList();
    List lista2 = new ArrayList();
    DefaultListModel modellist = new DefaultListModel();
    int i;
    
    public TabelaFreq() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFreq = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESTATISTICA - Tabela de Frequencia");
        setLocation(new java.awt.Point(300, 0));
        setResizable(false);

        jLabel1.setText("Coluna 1");

        jLabel2.setText("Frequencia");

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Analises");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tabelaFreq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coluna 1", "Frequencia", "Porcentagem"
            }
        ));
        jScrollPane1.setViewportView(tabelaFreq);

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lb1.setText("ESTATISTICA - Tabela de Frequencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(txt2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabelaFreq.getModel();
        if (!txt1.getText().trim().equals("") && !txt2.getText().trim().equals("")){
            dtm.addRow(new Object[]{txt1.getText(), txt2.getText(), ""});
            fPorcentagem();
        }
        txt2.setText("");
        txt1.setText("");
        txt1.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabelaFreq.getModel();
        if (tabelaFreq.getSelectedRowCount()>0)
            dtm.removeRow(tabelaFreq.getSelectedRow());
        else if (tabelaFreq.getRowCount()>0)
            dtm.removeRow(tabelaFreq.getRowCount()-1);
        fPorcentagem();
        txt1.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Se voltar você ira perder a tabela atual e todos os seus dados     "
                + "\n\nDeseja continuar?") == JOptionPane.YES_OPTION){
            new GerarTabela().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        lista1.clear();
        lista2.clear();
        //cria lista c valores da tabela
        for (i=0; i<tabelaFreq.getRowCount(); i++)
                lista1.add(tabelaFreq.getValueAt(i, 0));
        for (i=0; i<tabelaFreq.getRowCount(); i++)
                lista2.add(tabelaFreq.getValueAt(i, 1));
        medidasFrequencia();
        new Lista(modellist).setVisible(true);
        
        float t1=0, t2=0;
        for (i=0; i<tabelaFreq.getRowCount(); i++) //total freq
            t1 = t1+Float.parseFloat(tabelaFreq.getValueAt(i, 1).toString());
        for (i=0; i<tabelaFreq.getRowCount(); i++) //total porc
            t2 = t2+Float.parseFloat(tabelaFreq.getValueAt(i, 2).toString());
        t1 = (float)Math.rint(t1*100)/100;
        t2 = (float)Math.rint(t2*100)/100;
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabelaFreq.getModel();
        dtm.addRow(new Object[]{"TOTAL:", t1, t2});
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TabelaFreq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaFreq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaFreq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaFreq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaFreq().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lb1;
    private static javax.swing.JTable tabelaFreq;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables

    public static void fPorcentagem(){
        int i;
        float tot=0;
        for (i=0; i<tabelaFreq.getRowCount(); i++) //total freq
            tot = tot+Float.parseFloat(tabelaFreq.getValueAt(i, 1).toString());
        for (i=0; i<tabelaFreq.getRowCount(); i++) //porcentagem
            tabelaFreq.setValueAt((Math.rint((Float.parseFloat(tabelaFreq.getValueAt(i, 1).toString())/tot)*10000)/100), i, 2);
    }
    
    public void medidasFrequencia(){
        int i;
        float tot=0, tparc=0, media, maior=Float.MIN_VALUE;
        List pos = new ArrayList();
        
        //total freq
        for (i=0; i<lista2.size(); i++)
            tot = tot+Float.parseFloat(lista2.get(i).toString());
        
        modellist.addElement("Média: "); //MEDIA
        for (i=0; i<lista1.size(); i++)
            tparc = tparc + (Float.parseFloat(lista1.get(i).toString())*Float.parseFloat(lista2.get(i).toString()));
        media = (tparc/tot);
        modellist.addElement(" - "+media);
        
        modellist.addElement(" ");
        modellist.addElement("Moda: "); //MODA
        for (i=0; i<lista2.size(); i++)
            if (Float.parseFloat(lista2.get(i).toString())>maior)
                maior = Float.parseFloat(lista2.get(i).toString());
        for (i=0; i<lista2.size(); i++){
            if (Float.parseFloat(lista2.get(i).toString())==maior)
                pos.add(lista1.get(i));
        }
        if (pos.size()==0 || pos.size()==lista2.size())
            modellist.addElement(" - Ñ possui moda");
        else
            for (i=0; i<pos.size(); i++)
                modellist.addElement(" - "+pos.get(i));
        
        modellist.addElement(" ");
        modellist.addElement("Percentis: "); //PERCENTIL
        tparc = 0; //p25
        for (i=0; i<lista2.size(); i++){
            tparc = tparc+Float.parseFloat(lista2.get(i).toString());
            if (tparc+1 > (tot+1)*0.25 && tparc < (tot+1)*0.25){
                modellist.addElement(" - P25 = "+(Float.parseFloat(lista1.get(i).toString())+Float.parseFloat(lista1.get(i+1).toString()))/2);
                i=lista2.size();
            }
            else if (tparc > (tot+1)*0.25){
                modellist.addElement(" - P25 = "+lista1.get(i));
                i=lista2.size();
            }
        }
        tparc = 0; //p50
        for (i=0; i<lista2.size(); i++){
            tparc = tparc+Float.parseFloat(lista2.get(i).toString());
            if (tparc+1 > (tot+1)*0.5 && tparc < (tot+1)*0.5){
                modellist.addElement(" - P50 = "+(Float.parseFloat(lista1.get(i).toString())+Float.parseFloat(lista1.get(i+1).toString()))/2);
                i=lista2.size();
            }
            else if (tparc > (tot+1)*0.5){
                modellist.addElement(" - P50 = "+lista1.get(i));
                i=lista2.size();
            }
        }
        tparc = 0; //p75
        for (i=0; i<lista2.size(); i++){
            tparc = tparc+Float.parseFloat(lista2.get(i).toString());
            if (tparc+1 > (tot+1)*0.75 && tparc < (tot+1)*0.75){
                modellist.addElement(" - P75 = "+(Float.parseFloat(lista1.get(i).toString())+Float.parseFloat(lista1.get(i+1).toString()))/2);
                i=lista2.size();
            }
            else if (tparc > ((tot+1)+1)*0.75){
                modellist.addElement(" - P75 = "+lista1.get(i));
                i=lista2.size();
            }
        }
        
        modellist.addElement(" ");
        modellist.addElement("Desvio Padrão:"); //desvio padrao
        tparc = 0;
        for (i=0; i<lista2.size(); i++)
            tparc = tparc + ((float)Math.pow((Float.parseFloat(lista1.get(i).toString())-media),2)*(Float.parseFloat(lista2.get(i).toString())));
        tparc = (float)Math.rint(Math.sqrt(tparc / tot)*10000)/10000;
        modellist.addElement(" - "+tparc);
        
        modellist.addElement(" ");
        modellist.addElement("Coeficiente de variação:"); // coeficiente de variaçao
        tparc = (float)Math.rint((tparc/media)*10000)/100;
        modellist.addElement(" - "+(tparc)+" %");
    }
    
}
