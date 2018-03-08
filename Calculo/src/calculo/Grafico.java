
package calculo;

import static calculo.Calculadora.*;
import java.awt.Color;
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

public class Grafico extends javax.swing.JFrame {
    public static int g;
    public static double[] auxN = new double[20];
    public static int[] auxP = new int[20];
    public static int[] auxO = new int[20];
    public static String funcao;
    
    public Grafico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbInicial = new javax.swing.JLabel();
        lbFinal = new javax.swing.JLabel();
        lbInterv = new javax.swing.JLabel();
        sInicial = new javax.swing.JSlider();
        sFinal = new javax.swing.JSlider();
        sInterv = new javax.swing.JSlider();
        bReset = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        aLista = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULO - Gráfico");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(100, 50));

        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jLabel1.setText("xInicial:");

        jLabel2.setText("xFinal:");

        jLabel3.setText("Interv.:");

        lbInicial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbInicial.setText("-100");

        lbFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbFinal.setText("-100");

        lbInterv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbInterv.setText("-100");

        sInicial.setMinimum(-100);
        sInicial.setValue(0);
        sInicial.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sInicialStateChanged(evt);
            }
        });

        sFinal.setMinimum(-100);
        sFinal.setValue(0);
        sFinal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sFinalStateChanged(evt);
            }
        });

        sInterv.setMaximum(20);
        sInterv.setMinimum(1);
        sInterv.setToolTipText("");
        sInterv.setValue(1);
        sInterv.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sIntervStateChanged(evt);
            }
        });

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bBack.setText("Voltar");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(aLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(sInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sInterv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbInicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbInterv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBack, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(sInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(sInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbInterv))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sInicialStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sInicialStateChanged
        if (sInicial.getValue()<sFinal.getValue())
            criarGrafico(sInicial.getValue(), sFinal.getValue(), sInterv.getValue());
    }//GEN-LAST:event_sInicialStateChanged

    private void sFinalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sFinalStateChanged
        if (sInicial.getValue()<sFinal.getValue())
            criarGrafico(sInicial.getValue(), sFinal.getValue(), sInterv.getValue());
    }//GEN-LAST:event_sFinalStateChanged

    private void sIntervStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sIntervStateChanged
        criarGrafico(sInicial.getValue(), sFinal.getValue(), sInterv.getValue());
    }//GEN-LAST:event_sIntervStateChanged

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        for (k=1; k<20; k++) //valores personalizados do eixo X
            if (num[k]==Double.POSITIVE_INFINITY){
                if (op[k-1]==5){ //exponencial
                    sInicial.setValue(-2);
                    sFinal.setValue(3);
                    sInterv.setValue(1);
                    criarGrafico(-2, 3, 1);
                }
                else if (op[k-1]==6 || op[k-1]==7 || op[k-1]==8){ //raiz, log e ln
                    sInicial.setValue(1);
                    sFinal.setValue(10);
                    sInterv.setValue(1);
                    criarGrafico(1, 10, 1);
                }
                else if (op[k-1]==12){ //fatorial
                    sInicial.setValue(0);
                    sFinal.setValue(5);
                    sInterv.setValue(1);
                    criarGrafico(0, 5, 1);
                }
                else{
                    sInicial.setValue(-10);
                    sFinal.setValue(10);
                    sInterv.setValue(1);
                    criarGrafico(-10, 10, 1);
                }
            }
    }//GEN-LAST:event_bResetActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        dispose();
    }//GEN-LAST:event_bBackActionPerformed

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
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList aLista;
    private javax.swing.JButton bBack;
    private javax.swing.JButton bReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFinal;
    private javax.swing.JLabel lbInicial;
    private javax.swing.JLabel lbInterv;
    public javax.swing.JSlider sFinal;
    public javax.swing.JSlider sInicial;
    public javax.swing.JSlider sInterv;
    // End of variables declaration//GEN-END:variables

    
    public void criarGrafico(int z, int fim, int inter){
        lbInicial.setText(Integer.toString(sInicial.getValue()));
        lbFinal.setText(Integer.toString(sFinal.getValue()));
        lbInterv.setText(Integer.toString(sInterv.getValue()));
        
        criarLista();
        
        //atribuição de pontos no grafico
        XYSeries series = new XYSeries("Ponto");
        while (z<=fim){
            series.add(z,fPontoY(z));
            z=z+inter;
        }
        
        //criaçao das series
        XYSeriesCollection dataset = new XYSeriesCollection(); 
        dataset.addSeries(series);
        
        //propriedades do grafico
        JFreeChart chart = ChartFactory.createXYLineChart("f(x) = "+funcao, 
                "Eixo X", "Eixo Y", dataset, PlotOrientation.VERTICAL, false, false, true);
        chart.setBackgroundPaint(Color.WHITE); 
        
        //PERSONALIZAÇÃO
        XYPlot plot = (XYPlot) chart.getPlot();  //pega o plot (onde o grafico esta)
        XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot.getRenderer();  //pega a linha
        renderer.setSeriesPaint(0, Color.BLUE); //cor da linha
        renderer.setBaseShapesVisible(true); //exibe pontos
        renderer.setBaseItemLabelGenerator(new StandardXYItemLabelGenerator()); //modelo de labels para ediçao
        renderer.setBaseItemLabelsVisible(true); //exibe labels
        renderer.setShapesVisible(true); //naosei
        renderer.setShapesFilled(true); //naosei
        plot.setDomainGridlinePaint(Color.lightGray); //EixoX
        plot.setDomainZeroBaselinePaint(Color.BLACK);
        plot.setDomainZeroBaselineVisible(true);
        plot.setDomainCrosshairPaint(Color.RED); //PontoX
        plot.setDomainCrosshairVisible(true);
        plot.setRangeGridlinePaint(Color.lightGray); //EixoY
        plot.setRangeZeroBaselinePaint(Color.BLACK);
        plot.setRangeZeroBaselineVisible(true);
        plot.setRangeCrosshairPaint(Color.RED); //PontoY
        plot.setRangeCrosshairVisible(true);
        plot.setBackgroundPaint(Color.WHITE); //Cor de Fundo
        plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0)); //margens
        plot.setRenderer(renderer);
        
        //ATUALIZA E EXIBE O GRAFICO NO JPANEL
        ChartPanel jan = new ChartPanel(chart, true);
        jan.setSize(jPanel1.getWidth(),jPanel1.getHeight());
        jan.setVisible(true); 
        jPanel1.setSize(getWidth()-5, 500);
        jPanel1.removeAll();
        jPanel1.add(jan); 
        jPanel1.revalidate();
        jPanel1.repaint(); 
        
        //RESET (valores originais)
        for (g=0; g<20; g++){
            num[g] = auxN[g];
            pri[g] = auxP[g];
            op[g] = auxO[g];
        }
    }
    
    public static double fPontoY(double x){
        for (g=0; g<20; g++){
            num[g] = auxN[g];
            pri[g] = auxP[g];
            op[g] = auxO[g];
        }
        for (g=0; g<20; g++)
            if (num[g]==Double.POSITIVE_INFINITY)
                num[g]=x;
        double y = fIgual();
        return y;
    }
    
    public void criarLista(){
        double a=0, b=0, c=0, d=0, x;
        int i, j=0;
        DefaultListModel l = new DefaultListModel();
        aLista.setModel(l);
        l.addElement("Caso o grafico não esteja centralizado,  ");
        l.addElement("utilize as barras de rolagem ao lado!");
        l.addElement("    LEGENDA:");
        l.addElement("#  x = 0  =>  y = "+fPontoY(0));
        
        //pesquisa por equaçao de segundo grau
        for (i=1; i<19; i++)
            if (auxN[i]==Double.POSITIVE_INFINITY && auxO[i]==5 && auxN[i+1]==2 && auxO[i-1]==3)
                j++;
        if (j>0){ //se encontrou, faça:
        for (i=1; i<19; i++){
            if (auxN[i]==Double.POSITIVE_INFINITY && auxO[i]==5 && auxN[i+1]==2 && auxO[i-1]==3){
                a = auxN[i-1];
                if (i>1 && auxO[i-2]==2)
                    a = -a;
            }
            if (auxN[i]==Double.POSITIVE_INFINITY && auxO[i]!=5 && auxO[i-1]==3){
                b = auxN[i-1];
                if (i>1 && auxO[i-2]==2)
                    b = -b;
            }
            if (auxN[i]!=Double.POSITIVE_INFINITY && auxN[i]!=0 && auxO[i-1]!=5 && auxO[i-1]!=3 && auxO[i]!=3 && auxO[i-1]==1)
                c = c+auxN[i];
            if (auxN[i]!=Double.POSITIVE_INFINITY && auxN[i]!=0 && auxO[i-1]!=5 && auxO[i-1]!=3 && auxO[i]!=3 && auxO[i-1]==2)
                c = c-auxN[i];
        }
        l.addElement(" ");
        d = (b*b)-(4*a*c);
        if (d>0){
            x = (-b+(Math.sqrt(d)))/2*a;
            l.addElement("Raizes: ");
            l.addElement("#  x1 = "+x);
            x = (-b-(Math.sqrt(d)))/2*a;
            l.addElement("#  x2 = "+x);
        }
        else if (d==0){
            x = (-b+(Math.sqrt(d)))/2*a;
            l.addElement("Raiz unica: ");
            l.addElement("#  x = "+x);
        }
        else
            l.addElement("#  Ñ tem raiz Real");
        l.addElement(" ");
        x = (-b)/(2*a);
        l.addElement("Vertices: ");
        l.addElement("#  xv = "+x);
        x = (-d)/(4*a);
        l.addElement("#  xv = "+x);
        l.addElement(" ");
        l.addElement("Outros: ");
        l.addElement("#  a = "+a);
        l.addElement("#  b = "+b);
        l.addElement("#  c = "+c);
        l.addElement("#  delta = "+d);
        l.addElement(" ");
        }
        
        
        /*
        double x1=Math.pow(10, 307), x2=Math.pow(10, 307), h=-100, r;
        
        //Calculo de ponto-a-ponto
        while (h<=100){
            r = fPontoY(h);
            if (r==0 && x1==Math.pow(10, 307))
                x1 = h;
            else if (r==0 && x2==Math.pow(10, 307))
                x2 = h;
            h = h*10;
            h = h + 1;
            h=h/10;
            System.out.println(h);
        }
        if (x1!=Math.pow(10, 307) && x2!=Math.pow(10, 307)){
            l.addElement("Raizes: ");
            l.addElement("#  x1 = "+x1);
            l.addElement("#  x2 = "+x2);
        }
        else if (x1!=Math.pow(10, 307)){
            l.addElement("Raiz unica: ");
            l.addElement("#  x = "+x1);
        }
        else
            l.addElement("#  Ñ tem raiz Real");
         */
        
    } //fim
    
}
