package estatistica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class GerarAmostras extends javax.swing.JFrame {
    
    DefaultComboBoxModel cbm1 = new DefaultComboBoxModel();
    DefaultListModel modellist2 = new DefaultListModel();
    JTable tabela = new JTable();
    int i;
    
    public GerarAmostras() {
        initComponents();
        cbm1.removeAllElements();
        for (i=0; i<GerarTabela.colunas.size(); i++)
            cbm1.addElement(GerarTabela.colunas.get(i));
        cb1.setModel(cbm1);
    }
    public GerarAmostras(JTable t) {
        initComponents();
        cbm1.removeAllElements();
        for (i=0; i<GerarTabela.colunas.size(); i++)
            cbm1.addElement(GerarTabela.colunas.get(i));
        cb1.setModel(cbm1);
        tabela = t;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cbAlea = new javax.swing.JRadioButton();
        cbSiste = new javax.swing.JRadioButton();
        cbPropor = new javax.swing.JRadioButton();
        bGerar = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        sQtd = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        lbQtd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAmostras = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ESTATISTICA - Amostras");
        setLocation(new java.awt.Point(750, 0));
        setResizable(false);

        jLabel1.setText("Tipo de Amostra:");

        buttonGroup1.add(cbAlea);
        cbAlea.setSelected(true);
        cbAlea.setText("Amostra Aleatoria");

        buttonGroup1.add(cbSiste);
        cbSiste.setText("Amostra Sistemática");

        buttonGroup1.add(cbPropor);
        cbPropor.setText("Amostra Proporcional");

        bGerar.setText("Gerar");
        bGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGerarActionPerformed(evt);
            }
        });

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        sQtd.setMaximum(20);
        sQtd.setMinimum(1);
        sQtd.setValue(10);
        sQtd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sQtdStateChanged(evt);
            }
        });

        jLabel2.setText("Tamanho:");

        lbQtd.setText("10");

        jScrollPane1.setViewportView(listaAmostras);

        jLabel3.setText("Variavel p/ amostra:");

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPropor)
                            .addComponent(cbSiste)
                            .addComponent(jLabel1)
                            .addComponent(cbAlea)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(bGerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVoltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbAlea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSiste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbPropor)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbQtd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bVoltar)
                            .addComponent(bGerar))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sQtdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sQtdStateChanged
        lbQtd.setText(Integer.toString(sQtd.getValue()));
    }//GEN-LAST:event_sQtdStateChanged

    private void bGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGerarActionPerformed
        int i, j, inter;
        Random aleatorio = new Random();
        List lista1 = new ArrayList();
        modellist2 = new DefaultListModel();
        listaAmostras.setModel(modellist2);
        
        //cria lista c valores da tabela
        lista1.clear();
        for (i=0; i<tabela.getRowCount(); i++)
                lista1.add(tabela.getValueAt(i, cb1.getSelectedIndex()+1)); 
        inter = lista1.size()/sQtd.getValue();
        
        if (cbAlea.isSelected()){ //AMOSTRA ALEATORIA
            modellist2.addElement("# Amostra Aleatória #");
            modellist2.addElement(" ");
            for (i=0; i<sQtd.getValue(); i++){
                j = aleatorio.nextInt(lista1.size());
                modellist2.addElement(" - "+lista1.get(j)+" ("+(j+1)+")");
            }
        }
        if (cbSiste.isSelected()){ //AMOSTRA SISTEMATICA
            j = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posição inicial: "));
            modellist2.addElement("# Amostra Sistemática #");
            modellist2.addElement("Posição Inicial: "+j);
            modellist2.addElement(" ");
            for (i=0; i<sQtd.getValue(); i++){
                modellist2.addElement(" - "+lista1.get(j-1)+" ("+(j)+")");
                j = j+inter;
                if (j>lista1.size())
                    j = j-lista1.size();
            }
        }
        if (cbPropor.isSelected()) //AMOSTRA PROPORCIONAL
            amostraProporcional(lista1, sQtd.getValue(), inter);
        
    }//GEN-LAST:event_bGerarActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(GerarAmostras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerarAmostras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerarAmostras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerarAmostras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerarAmostras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGerar;
    private javax.swing.JButton bVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox cb1;
    private javax.swing.JRadioButton cbAlea;
    private javax.swing.JRadioButton cbPropor;
    private javax.swing.JRadioButton cbSiste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbQtd;
    public javax.swing.JList listaAmostras;
    private javax.swing.JSlider sQtd;
    // End of variables declaration//GEN-END:variables


    public void amostraProporcional(List lista1, int tamanho, int intervalo){
        int i, j, pos, qtd;
        float tot=0;
        List lista2 = new ArrayList();
        List lista3 = new ArrayList();
        //edita a lista para frequencia
        for (i=0; i<lista1.size(); i++){
            qtd=1;
            for (j=i+1; j<lista1.size(); j++)
                if (lista1.get(i).toString().equals(lista1.get(j).toString())){
                    qtd++;
                    lista1.remove(j);
                    j--;
                }
            lista2.add(qtd);
            }
        //gera a lista de porcentagem
        for (i=0; i<lista2.size(); i++)
            tot = tot+Float.parseFloat(lista2.get(i).toString());
        for (i=0; i<lista2.size(); i++)
            lista3.add(Float.parseFloat(lista2.get(i).toString())/tot);
        //qtidades por elemento da lista1, na lista2
        lista2.clear();
        for (i=0; i<lista3.size(); i++)
            lista2.add(Math.rint(tamanho*Float.parseFloat(lista3.get(i).toString())));
        //cria lista c valores da tabela, na lista3
        lista3.clear();
        for (i=0; i<tabela.getRowCount(); i++)
                lista3.add(tabela.getValueAt(i, cb1.getSelectedIndex()+1));
        //tamanho
        tamanho=0;
        for (i=0; i<lista2.size(); i++)
            tamanho = tamanho + (int)(Float.parseFloat(lista2.get(i).toString()));
        
        //gera lista de amortra proporcional
        pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posição inicial: "));
        modellist2.addElement("# Amostra Proporcional #");
        modellist2.addElement("Posição Inicial: "+pos);
        modellist2.addElement(" ");
        for (i=0; i<tamanho; i++){
            qtd=0;
            for (j=0; j<lista1.size(); j++){
                if (lista1.get(j).toString().equals(lista3.get(pos-1).toString()) && Float.parseFloat(lista2.get(j).toString())>0){
                    modellist2.addElement(" - "+lista3.get(pos-1)+" ("+(pos)+")");
                    lista2.set(j, (Float.parseFloat(lista2.get(j).toString())-1));
                    qtd++;
                    j = lista2.size();
                    pos = pos+intervalo;
                    if (pos>lista3.size())
                        pos = pos-lista3.size();
                }
            }
            if (qtd==0){
                i--;
                pos++;
                if (pos>lista3.size())
                    pos = pos-lista3.size();
            }
        }
    }
        
        

}
