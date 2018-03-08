
package calculo;

import static calculo.Calculadora.*;
import javax.swing.DefaultListModel;

public class Limite extends javax.swing.JFrame {
    public static double pont, pp;
    public static double[] res = new double[7];
    public static double[] auxN = new double[20];
    public static int[] auxP = new int[20];
    public static int[] auxO = new int[20];
    public static int s;

    public Limite() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        bcalcula = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txtp = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULO - Limite");
        setLocation(new java.awt.Point(550, 100));

        lb1.setText("Função:");

        lb2.setText("Digite o ponto desejado:");

        lb3.setText("p = ");

        lb4.setText("Limite:");

        bcalcula.setText("Calcular");
        bcalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcalculaActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("OCR A Extended", 2, 18)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt2.setFont(new java.awt.Font("OCR A Extended", 3, 18)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        list1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "# Limites Laterais #" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list1);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb1)
                                    .addComponent(lb4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 81, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lb2)
                                        .addGap(20, 20, 20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bcalcula)))
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(120, 120, 120)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb3)
                            .addComponent(bcalcula)
                            .addComponent(txtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb4)
                        .addGap(1, 1, 1)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(6, 6, 6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//CALCULA
    private void bcalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcalculaActionPerformed
        pont = Double.parseDouble(txtp.getText());
        pp = pont;
        fLim();
        res[0] = fIgual();
        DefaultListModel mlist = new DefaultListModel();
        list1.setModel(mlist);
        
        //TABELA DOS LIMITES
        mlist.addElement("# Limites Laterais #");
        mlist.addElement(" ");
        mlist.addElement(" =>| Esquerda:");
        pp = pont-0.1;
        fLim();
        res[0] = fIgual();
        mlist.addElement(" => "+(Math.rint(res[0]*10000)/10000));
        pp = pont-0.01;
        fLim();
        res[1] = fIgual();
        mlist.addElement(" => "+(Math.rint(res[1]*10000)/10000));
        pp = pont-0.001;
        fLim();
        res[2] = fIgual();
        mlist.addElement(" => "+(Math.rint(res[2]*10000)/10000));
        mlist.addElement(" ");
        mlist.addElement(" |<= Direita:");
        pp = pont+0.1;
        fLim();
        res[3] = fIgual();
        mlist.addElement(" <= "+(Math.rint(res[3]*10000)/10000));
        pp = pont+0.01;
        fLim();
        res[4] = fIgual();
        mlist.addElement(" <= "+(Math.rint(res[4]*10000)/10000));
        pp = pont+0.001;
        fLim();
        res[5] = fIgual();
        mlist.addElement(" <= "+(Math.rint(res[5]*10000)/10000));
        
        //RESERVA
        pp = pont;
        fLim();
        res[6] = fIgual();
        if (Double.isFinite(res[6]) && res[6]==Math.rint(res[2]) && res[6]==Math.rint(res[5]))
            txt2.setText("Limites iguais: "+fArr(res[6]));
        else{
            //RESULTADOS
            if (Math.rint(res[1])==Math.rint(res[2]) && Math.rint(res[1])==Math.rint(res[4]) && Math.rint(res[1])==Math.rint(res[5]))
                txt2.setText("Limites iguais: "+fArr(((res[1]+res[3])/2)));
            else if (Math.rint(res[1])<Math.rint(res[2]) && Math.rint(res[4])<Math.rint(res[5]))
                txt2.setText("Limites iguais: +Infinite");
            else if (Math.rint(res[1])>Math.rint(res[2]) && Math.rint(res[4])>Math.rint(res[5]))
                txt2.setText("Limites iguais: -Infinite");
            /*
            else if (Math.rint(res[1])==Math.rint(res[2]) && Math.rint(res[3])==Math.rint(res[4]))
                txt2.setText("Esq. "+fArr(res[1])+" | Dir. "+fArr(res[3]));
            else if (Math.rint(res[1])<Math.rint(res[2]) && Math.rint(res[3])==Math.rint(res[4]))
                txt2.setText("Esq. +Infinite | Dir. "+fArr(res[3]));
            else if (Math.rint(res[1])>Math.rint(res[2]) && Math.rint(res[3])==Math.rint(res[4]))
                txt2.setText("Esq. -Infinite | Dir. "+fArr(res[3]));
            else if (Math.rint(res[1])==Math.rint(res[2]) && Math.rint(res[3])<Math.rint(res[4]))
                txt2.setText("Esq. "+fArr(res[1])+" | Dir. +Infinite");
            else if (Math.rint(res[1])==Math.rint(res[2]) && Math.rint(res[3])>Math.rint(res[4]))
                txt2.setText("Esq. "+fArr(res[1])+" | Dir. +Infinite");
            else if (Math.rint(res[1])<Math.rint(res[2]) && Math.rint(res[3])>Math.rint(res[4]))
                txt2.setText("Esq. +Infinite | Dir. -Infinite");
            else if (Math.rint(res[1])>Math.rint(res[2]) && Math.rint(res[3])<Math.rint(res[4]))
                txt2.setText("Esq. -Infinite | Dir. +Infinite");
            */
            else
                txt2.setText("Limite inexistente!");
        }
        //RESET (valores originais)
        for (s=0; s<20; s++){
            num[s] = auxN[s];
            pri[s] = auxP[s];
            op[s] = auxO[s];
        }
    }//GEN-LAST:event_bcalculaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Limite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Limite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Limite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Limite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Limite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcalcula;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JList list1;
    public javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JFormattedTextField txtp;
    // End of variables declaration//GEN-END:variables

    public static void fLim(){
        for (s=0; s<20; s++){
            num[s] = auxN[s];
            pri[s] = auxP[s];
            op[s] = auxO[s];
        }
        for (s=0; s<20; s++)
            if (num[s]==Double.POSITIVE_INFINITY)
                num[s]=pp;
    }
    public static double fArr(double x){
        int y;
        y = (int)x;
        if (Double.isNaN(x) || Double.isInfinite(x))
            return x;
        else if ((x-y)>0.9 || (x-y)<0.1011)
            return Math.round(x);
        else{
            x = x*10;
            x = Math.round(x);
            return x/10;
        }
    }
    
}
