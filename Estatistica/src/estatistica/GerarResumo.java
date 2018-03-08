package estatistica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GerarResumo extends javax.swing.JFrame {
    
    List lista1 = new ArrayList();
    List lista2 = new ArrayList();
    List lista3 = new ArrayList();
    DefaultComboBoxModel cbm1 = new DefaultComboBoxModel();
    DefaultComboBoxModel cbm2 = new DefaultComboBoxModel();
    DefaultListModel modellist = new DefaultListModel();
    DefaultTableModel model2 = new DefaultTableModel();
    JTable tabela;
    int i;
    
    public GerarResumo() {
        initComponents();
        cbm1.removeAllElements();
        cbm2.removeAllElements();
        for (i=0; i<GerarTabela.colunas.size(); i++){
            cbm1.addElement(GerarTabela.colunas.get(i));
            cbm2.addElement(GerarTabela.colunas.get(i));
        }
        cbCampo1.setModel(cbm1);
        cbCampo2.setModel(cbm2);
        lb2.setVisible(false);
        cbCampo2.setVisible(false);
    }
    public GerarResumo(JTable t) {
        initComponents();
        cbm1.removeAllElements();
        cbm2.removeAllElements();
        for (i=0; i<GerarTabela.colunas.size(); i++){
            cbm1.addElement(GerarTabela.colunas.get(i));
            cbm2.addElement(GerarTabela.colunas.get(i));
        }
        cbCampo1.setModel(cbm1);
        cbCampo2.setModel(cbm2);
        lb2.setVisible(false);
        cbCampo2.setVisible(false);
        tabela = t;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNomeResumo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbTipo1 = new javax.swing.JRadioButton();
        rbTipo2 = new javax.swing.JRadioButton();
        rbTipo3 = new javax.swing.JRadioButton();
        rbTipo4 = new javax.swing.JRadioButton();
        bGerar = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        cbCampo1 = new javax.swing.JComboBox();
        lb2 = new javax.swing.JLabel();
        cbCampo2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ESTATISTICA - Gerar tabela de resumo de dados");
        setLocation(new java.awt.Point(750, 0));
        setResizable(false);

        jLabel1.setText("Nome da Tabela de Resumo de Dados:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIPO DE TABELA");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DADOS DA TABELA");

        buttonGroup1.add(rbTipo1);
        rbTipo1.setSelected(true);
        rbTipo1.setText("Tabela de Frequencia");
        rbTipo1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbTipo1StateChanged(evt);
            }
        });

        buttonGroup1.add(rbTipo2);
        rbTipo2.setText("Tabela de Freq. com Intervalo");
        rbTipo2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbTipo2StateChanged(evt);
            }
        });

        buttonGroup1.add(rbTipo3);
        rbTipo3.setText("Tabela de Analise Temporal");
        rbTipo3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbTipo3StateChanged(evt);
            }
        });

        buttonGroup1.add(rbTipo4);
        rbTipo4.setText("Análises de Correlação e Regreção");
        rbTipo4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbTipo4StateChanged(evt);
            }
        });

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

        jLabel4.setText("OBS: A Porcentagem dos campos são geradas automaticamente");

        lb1.setText("Campo 1:");

        cbCampo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lb2.setText("Campo 2:");

        cbCampo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbTipo2)
                                    .addComponent(rbTipo3)
                                    .addComponent(rbTipo4)
                                    .addComponent(rbTipo1))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lb2)
                                        .addComponent(cbCampo1, 0, 150, Short.MAX_VALUE)
                                        .addComponent(cbCampo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNomeResumo)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(bGerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVoltar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNomeResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbTipo1)
                                    .addComponent(lb1))
                                .addGap(18, 18, 18)
                                .addComponent(rbTipo2))
                            .addComponent(cbCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbTipo3)
                            .addComponent(lb2))
                        .addGap(18, 18, 18)
                        .addComponent(rbTipo4))
                    .addComponent(cbCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGerar)
                    .addComponent(bVoltar))
                .addGap(16, 16, 16))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGerarActionPerformed
        TabelaResumo r = new TabelaResumo(tabela);
        lista1.clear();
        lista2.clear();
        lista3.clear();
        modellist = new DefaultListModel();
        r.listaMedidas.setModel(modellist);
        model2 = new DefaultTableModel();
        r.aTabResumo.setModel(model2);
        
        //pegar nome da tabela
        if (txtNomeResumo.getText().trim().equals("")) 
            txtNomeResumo.setText("Tabela 2");
        r.setTitle("ESTATISTICA - "+txtNomeResumo.getText());
        r.jLabel1.setText(txtNomeResumo.getText());
        //gerar novas tabelas
        if (rbTipo1.isSelected()==true){ //TABELA DE FREQUENCIA
            model2.addColumn(cbCampo1.getSelectedItem());
            model2.addColumn("Quantidade");
            model2.addColumn("Porcentagem");
            tableItensFrequencia(cbCampo1.getSelectedIndex()+1);
        }
        if (rbTipo2.isSelected()==true){ //TABELA DE FREQUENCIA COM INTERVALO
            model2.addColumn(cbCampo1.getSelectedItem());
            model2.addColumn("|-");
            model2.addColumn("Quantidade");
            model2.addColumn("Porcentagem");
            tableItensIntervalo(cbCampo1.getSelectedIndex()+1);
        }
        if (rbTipo3.isSelected()==true){ //TABELA DE ANALISE TEMPORAL
            model2.addColumn(cbCampo1.getSelectedItem());
            model2.addColumn(cbCampo2.getSelectedItem());
            model2.addColumn("Porcentagem");
            tableItensTemporal(cbCampo1.getSelectedIndex()+1, cbCampo2.getSelectedIndex()+1);
        }
        if (rbTipo4.isSelected()){ //TABELA DE CORRELAÇÃO E REGREÇÃO
            model2.addColumn(cbCampo1.getSelectedItem());
            model2.addColumn(cbCampo2.getSelectedItem());
            tableItensCorr(cbCampo1.getSelectedIndex()+1, cbCampo2.getSelectedIndex()+1);
            new Grafico(lista1, lista2).setVisible(true);
        }
        //centralizar colunas
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i=0; i<r.aTabResumo.getColumnCount(); i++)
            r.aTabResumo.getColumnModel().getColumn(i).setCellRenderer(centralizado);
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_bGerarActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void rbTipo1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbTipo1StateChanged
        if (rbTipo1.isSelected()==true){
            lb1.setText("Campo 1:");
            lb2.setText("Campo 2:");
            lb2.setVisible(false);
            cbCampo2.setVisible(false);
        }
    }//GEN-LAST:event_rbTipo1StateChanged

    private void rbTipo2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbTipo2StateChanged
        if (rbTipo2.isSelected()==true){
            lb1.setText("Campo 1:");
            lb2.setText("Campo 2:");
            lb2.setVisible(false);
            cbCampo2.setVisible(false);
        }
    }//GEN-LAST:event_rbTipo2StateChanged

    private void rbTipo3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbTipo3StateChanged
        if (rbTipo3.isSelected()==true){
            lb1.setText("Campo ref. Tempo:");
            lb2.setText("Campo 2:");
            lb2.setVisible(true);
            cbCampo2.setVisible(true);
        }
    }//GEN-LAST:event_rbTipo3StateChanged

    private void rbTipo4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbTipo4StateChanged
        if (rbTipo4.isSelected()==true){
            lb1.setText("Campo X:");
            lb2.setText("Campo Y:");
            lb2.setVisible(true);
            cbCampo2.setVisible(true);
        }
    }//GEN-LAST:event_rbTipo4StateChanged

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
            java.util.logging.Logger.getLogger(GerarResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerarResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerarResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerarResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerarResumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGerar;
    private javax.swing.JButton bVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox cbCampo1;
    public static javax.swing.JComboBox cbCampo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JRadioButton rbTipo1;
    private javax.swing.JRadioButton rbTipo2;
    private javax.swing.JRadioButton rbTipo3;
    private javax.swing.JRadioButton rbTipo4;
    private javax.swing.JTextField txtNomeResumo;
    // End of variables declaration//GEN-END:variables

    public void tableItensFrequencia(int c){
        int i, j, qtd;
        float tot=0, totP=0;
        //cria lista c valores da tabela
        for (i=0; i<tabela.getRowCount(); i++)
                lista1.add(tabela.getValueAt(i, c));
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
        ordenar();
        //gera a tabela de frequencia
        for (i=0; i<lista2.size(); i++) //total freq
            tot = tot+Float.parseFloat(lista2.get(i).toString());
        for (i=0; i<lista2.size(); i++){ //porcentagem
            lista3.add(Math.rint((Float.parseFloat(lista2.get(i).toString())/tot)*10000)/100);
            totP = totP+Float.parseFloat(lista3.get(i).toString());
        }
        totP = (float)(Math.rint(totP*100)/100);
        for (i=0; i<lista1.size(); i++) //add linhas na tabela
            model2.addRow(new Object[]{lista1.get(i), lista2.get(i), lista3.get(i)+" %"});
        model2.addRow(new Object[]{"TOTAL: ", tot, totP+" %"});
        medidasFrequencia(tot);
    }
    
    public void tableItensIntervalo(int c){
        int i, qtd;
        float max=Float.MIN_VALUE, min=Float.MAX_VALUE, inter=0, tot=0, totP=0;
        //cria lista c valores da tabela
        for (i=0; i<tabela.getRowCount(); i++)
                lista1.add(tabela.getValueAt(i, c));
        //amplitude de intervalo
        for (i=0; i<lista1.size(); i++)
            if (Float.parseFloat((String)lista1.get(i))>max)
                max = Float.parseFloat((String)lista1.get(i));
        for (i=0; i<lista1.size(); i++)
            if (Float.parseFloat((String)lista1.get(i))<min)
                min = Float.parseFloat((String)lista1.get(i));
        float y1 = (Float.parseFloat((String)lista1.get(0))-(int)Float.parseFloat(lista1.get(0).toString()))*10;
        float y2 = (Float.parseFloat((String)lista1.get(1))-(int)Float.parseFloat(lista1.get(1).toString()))*10;
        if (y1>0 || y2>0){
            inter = ((max-min)/((float)Math.rint(Math.sqrt(lista1.size()))));
            inter = (float)(Math.rint((inter+0.1f)*10))/10;
        }
        else{
            inter = ((max-min)/((float)Math.rint(Math.sqrt(lista1.size()))));
            inter = (float)Math.rint(inter+1);
        }
        //edita a lista para freq com intervalo
        while (!lista1.isEmpty()){
            qtd = 0;
            y1 = (float)Math.rint((min+inter)*10)/10;
            for (i=0; i<lista1.size(); i++)
                if (Float.parseFloat((String)lista1.get(i))>=min && Float.parseFloat((String)lista1.get(i))<y1){
                    qtd++;
                    lista1.remove(i);
                    i--;
                }
            lista2.add(qtd);
            lista3.add(min);
            min = y1;
        }
        //gera a tabela de freq com intervalo
        for (i=0; i<lista2.size(); i++) //total freq
            tot = tot+Float.parseFloat(lista2.get(i).toString());
        for (i=0; i<lista2.size(); i++){ //porcentagem
            lista1.add(Math.rint((Float.parseFloat(lista2.get(i).toString())/tot)*10000)/100);
            totP = totP+Float.parseFloat(lista1.get(i).toString());
        }
        totP = (float)(Math.rint(totP*100)/100);
        for (i=0; i<lista1.size(); i++){ //add linhas na tabela
            y1 = (float)Math.rint((Float.parseFloat(lista3.get(i).toString())+inter)*10)/10;
            model2.addRow(new Object[]{lista3.get(i), y1, lista2.get(i), lista1.get(i)+" %"});
        }
        model2.addRow(new Object[]{"", "TOTAL: ", tot, totP+" %"});
        medidasIntervalo(tot, inter);
    }
    
    public void tableItensTemporal(int c1, int c2){
        int i, j;
        float tot=0, totP=0, qtd;
        List aux = new ArrayList();
        //cria listas c valores da tabela
        for (i=0; i<tabela.getRowCount(); i++)
                lista1.add(tabela.getValueAt(i, c1));
        for (i=0; i<tabela.getRowCount(); i++)
                lista2.add(tabela.getValueAt(i, c2));
        //edita as listas para analise temporal
        for (i=0; i<lista1.size(); i++){
            qtd = 1;
            for (j=i+1; j<lista1.size(); j++){
                if (lista1.get(i).toString().equals(lista1.get(j).toString())){
                    lista2.set(i, Float.parseFloat(lista2.get(i).toString())+Float.parseFloat(lista2.get(j).toString()));
                    lista2.remove(j);
                    lista1.remove(j);
                    j--;
                    qtd++;
                }
            }
            aux.add(qtd);
        }
        ordenar();
        //gera a tabela de frequencia
        for (i=0; i<lista2.size(); i++) //total freq
            tot = tot+Float.parseFloat(lista2.get(i).toString());
        for (i=0; i<lista2.size(); i++){ //porcentagem
            lista3.add(Math.rint((Float.parseFloat(lista2.get(i).toString())/tot)*10000)/100);
            totP = totP+Float.parseFloat(lista3.get(i).toString());
        }
        totP = (float)(Math.rint(totP*100)/100);
        for (i=0; i<lista1.size(); i++) //add linhas na tabela
            model2.addRow(new Object[]{lista1.get(i), lista2.get(i), lista3.get(i)+" %"});
        model2.addRow(new Object[]{"TOTAL: ", tot, totP+" %"});
        medidasTemporal(aux);
    }
    
    public void tableItensCorr (int c1, int c2){
        int i;
        //cria listas c valores da tabela
        for (i=0; i<tabela.getRowCount(); i++)
                lista1.add(tabela.getValueAt(i, c1));
        for (i=0; i<tabela.getRowCount(); i++)
                lista2.add(tabela.getValueAt(i, c2));
        //gera a tabela de correlaçao/regreçao
        for (i=0; i<lista1.size(); i++) //add linhas na tabela
            model2.addRow(new Object[]{lista1.get(i), lista2.get(i)});
        medidasCorr();
    }
    
    public void ordenar(){
        int i, j;
        Object aux;
        //deixar em ordem crescente
        try{
            for (j=0; j<lista1.size();j++)
                for (i=0; i<lista1.size()-1; i++)
                    if (Float.parseFloat((String)lista1.get(i))>Float.parseFloat((String)lista1.get(i+1))){
                        aux = lista1.get(i);
                        lista1.set(i, lista1.get(i+1));
                        lista1.set(i+1, aux);
                        aux = lista2.get(i);
                        lista2.set(i, lista2.get(i+1));
                        lista2.set(i+1, aux);
                    }
        } catch (NumberFormatException e) {}
    }
    
    //Analises
    public void medidasFrequencia(float tot){
        int i;
        float tparc=0, media, maior=Float.MIN_VALUE;
        List pos = new ArrayList();
        
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
    
    public void medidasIntervalo(float tot, float inter){
        int i, j;
        float tparc=0, media, maior=Float.MIN_VALUE, fmo, fant, fpost;
        List pos = new ArrayList();
        
        modellist.addElement("Média: "); //MEDIA
        for (i=0; i<lista3.size(); i++)
            tparc = tparc + ((((Float.parseFloat(lista3.get(i).toString())*2)+inter)/2)*Float.parseFloat(lista2.get(i).toString()));
        media = (tparc/tot);
        modellist.addElement(" - "+media);
        
        modellist.addElement(" ");
        modellist.addElement("Moda: "); //MODA
        for (i=0; i<lista2.size(); i++)
            if (Float.parseFloat(lista2.get(i).toString())>maior)
                maior = Float.parseFloat(lista2.get(i).toString());
        for (i=0; i<lista2.size(); i++){
            if (Float.parseFloat(lista2.get(i).toString())==maior)
                pos.add(lista3.get(i));
        }
        if (pos.size()==0 || pos.size()==lista2.size())
            modellist.addElement(" - Ñ possui moda");
        else
            for (i=0; i<pos.size(); i++)
                for (j=0; j<lista3.size(); j++)
                    if (pos.get(i).toString().equals(lista3.get(j).toString())){
                        fmo = Float.parseFloat(lista2.get(j).toString());
                        if (j==0)
                            fant = 0;
                        else
                            fant = Float.parseFloat(lista2.get(j-1).toString());
                        if (j==lista3.size()-1)
                            fpost = 0;
                        else
                            fpost = Float.parseFloat(lista2.get(j+1).toString());
                        maior = Float.parseFloat(lista3.get(j).toString()) + (((fmo-fant)*inter)/(2*fmo-fant-fpost));
                        modellist.addElement(" - "+maior);
                    }
        
        modellist.addElement(" ");
        modellist.addElement("Percentis: "); //PERCENTIL
        tparc = 0; //p25
        for (i=0; i<lista2.size(); i++){
            tparc = tparc+Float.parseFloat(lista2.get(i).toString());
            if (tparc >= (tot+1)*0.25){
                maior = Float.parseFloat(lista3.get(i).toString()) + (((((tot+1)*0.25f)-(tparc-Float.parseFloat(lista2.get(i).toString())))*inter)/Float.parseFloat(lista2.get(i).toString()));
                modellist.addElement(" - P25 = "+maior);
                i=lista2.size();
            }
        }
        tparc = 0; //p50
        for (i=0; i<lista2.size(); i++){
            tparc = tparc+Float.parseFloat(lista2.get(i).toString());
            if (tparc >= (tot+1)*0.5){
                maior = Float.parseFloat(lista3.get(i).toString()) + (((((tot+1)*0.5f)-(tparc-Float.parseFloat(lista2.get(i).toString())))*inter)/Float.parseFloat(lista2.get(i).toString()));
                modellist.addElement(" - P50 = "+maior);
                i=lista2.size();
            }
        }
        tparc = 0; //p75
        for (i=0; i<lista2.size(); i++){
            tparc = tparc+Float.parseFloat(lista2.get(i).toString());
            if (tparc >= (tot+1)*0.75){
                maior = Float.parseFloat(lista3.get(i).toString()) + (((((tot+1)*0.75f)-(tparc-Float.parseFloat(lista2.get(i).toString())))*inter)/Float.parseFloat(lista2.get(i).toString()));
                modellist.addElement(" - P75 = "+maior);
                i=lista2.size();
            }
        }
        
        modellist.addElement(" ");
        modellist.addElement("Desvio Padrão:"); //desvio padrao
        tparc = 0;
        for (i=0; i<lista2.size(); i++)
            tparc = tparc + ((float)Math.pow((((Float.parseFloat(lista3.get(i).toString())+inter)/2)-media),2)*(Float.parseFloat(lista2.get(i).toString())));
        tparc = (float)Math.rint(Math.sqrt(tparc / tot)*10000)/10000;
        modellist.addElement(" - "+tparc);
        
        modellist.addElement(" ");
        modellist.addElement("Coeficiente de variação:"); // coeficiente de variaçao
        tparc = (float)Math.rint((tparc/media)*10000)/100;
        modellist.addElement(" - "+(tparc)+" %");
    }
    
    public void medidasTemporal(List aux){
        int i;
        float media;
        modellist.addElement("Média: "); //MEDIA
        modellist.addElement("Tempo | media ");
        for (i=0; i<aux.size(); i++){
            media = (Float.parseFloat(lista2.get(i).toString())/Float.parseFloat(aux.get(i).toString()));
            modellist.addElement(" - "+lista1.get(i)+" = "+Math.rint(media*10000)/10000);
        }
    }
    
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