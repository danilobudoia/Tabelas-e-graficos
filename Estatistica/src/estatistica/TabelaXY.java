
package estatistica;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;


public class TabelaXY extends javax.swing.JFrame {
    
    List lista1 = new ArrayList();
    List lista2 = new ArrayList();
    DefaultListModel modellist = new DefaultListModel();
    int i;
    
    public TabelaXY() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESTATISTICA - Tabela XY");
        setLocation(new java.awt.Point(300, 0));
        setResizable(false);

        lb1.setText("ESTATISTICA - Tabela Correlação e Regreção");

        jLabel1.setText("Campo X");

        jLabel2.setText("Campo Y");

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

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campo X", "Campo Y"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(txt1)
                                    .addComponent(txt2))
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
        if (!txt1.getText().trim().equals("") && !txt2.getText().trim().equals("")){
            dtm.addRow(new Object[]{txt1.getText(), txt2.getText()});
        }
        txt2.setText("");
        txt1.setText("");
        txt1.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)tabela.getModel();
        if (tabela.getSelectedRowCount()>0)
            dtm.removeRow(tabela.getSelectedRow());
        else if (tabela.getRowCount()>0)
            dtm.removeRow(tabela.getRowCount()-1);
        txt1.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        lista1.clear();
        lista2.clear();
        //cria lista c valores da tabela
        for (i=0; i<tabela.getRowCount(); i++)
                lista1.add(tabela.getValueAt(i, 0));
        for (i=0; i<tabela.getRowCount(); i++)
                lista2.add(tabela.getValueAt(i, 1));
        medidasCorr();
        new Lista(modellist).setVisible(true);
        new Grafico(lista1, lista2).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Se voltar você ira perder a tabela atual e todos os seus dados     "
            + "\n\nDeseja continuar?") == JOptionPane.YES_OPTION){
            new GerarTabela().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TabelaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaXY().setVisible(true);
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
    private static javax.swing.JTable tabela;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables

    
    public void medidasCorr(){
        int i;
        float r, sxy, sx, sy, somaxy=0, somax=0, somay=0, sqx=0, sqy=0, n=lista1.size();
        
        //somaxy = soma sx*sy
        for (i=0; i<lista1.size(); i++)
            somaxy = somaxy +(Float.parseFloat(lista1.get(i).toString())*Float.parseFloat(lista2.get(i).toString()));
        //somax e somay = soma deles
        for (i=0; i<lista1.size(); i++)
            somax = somax +Float.parseFloat(lista1.get(i).toString());
        for (i=0; i<lista2.size(); i++)
            somay = somay +Float.parseFloat(lista2.get(i).toString());
        //sqx e sqy = soma dele ao quadrado | s(x^2)
        for (i=0; i<lista1.size(); i++)
            sqx = sqx + (float)Math.pow(Float.parseFloat(lista1.get(i).toString()),2);
        for (i=0; i<lista2.size(); i++)
            sqy = sqy + (float)Math.pow(Float.parseFloat(lista2.get(i).toString()),2);
        
        sxy = somaxy-((somax*somay)/n);
        sx = sqx-((float)Math.pow(somax, 2)/n);
        sy = sqy-((float)Math.pow(somay, 2)/n);
        r = sxy / (float)(Math.sqrt(sx*sy));
        r = (float) ((Math.rint(r*10000))/10000); //arredondar
        modellist.addElement("Correlação: ");
        modellist.addElement(" - r = "+r);
        modellist.addElement(" ");
        if (r>0){
            if (r>0.8)
                modellist.addElement(" - Relac. Forte ");
            else if (r>0.5)
                modellist.addElement(" - Relac. Médio ");
            else
                modellist.addElement(" - Relac. Fraco ");
            modellist.addElement(" - Diretamente proporc.");
        }
        else if (r<0){
            if (r<-0.8)
                modellist.addElement(" - Relac. Forte ");
            else if (r<-0.5)
                modellist.addElement(" - Relac. Médio ");
            else
                modellist.addElement(" - Relac. Fraco ");
            modellist.addElement(" - Inversamente proporc.");
        }
        else 
            modellist.addElement(" - Ñ possui relacionamento");
        
        modellist.addElement(" ");
        modellist.addElement("Coef. de Explicação: ");
        r = (float) (Math.pow(r, 2))*100;
        r = (float) ((Math.rint(r*100))/100); //arredondar
        modellist.addElement(" - R = "+r+" %");
        modellist.addElement(" ");
        
        modellist.addElement(" ");
        modellist.addElement("Reta de Regreção: ");
        r = sxy/sx; //a
        r = (float) ((Math.rint(r*10000))/10000); //arredondar
        sx = somax/n; //media x
        sy = somay/n; //media y
        n = sy - (r*sx); //b
        n = (float) ((Math.rint(n*10000))/10000); //arredondar
        modellist.addElement(" # y = "+r+" x + "+n);
    }
    
}
