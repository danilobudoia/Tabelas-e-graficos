
package estatistica;

import java.awt.Color;
import java.util.List;
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
    
    public void criarGrafico(List lista1, List lista2){
        int i;
        //atribuição de pontos no grafico
        XYSeries series = new XYSeries("Ponto");
        for (i=0; i<lista1.size(); i++)
            series.add(Float.parseFloat(lista1.get(i).toString()), Float.parseFloat(lista2.get(i).toString()));
        //criaçao das series
        XYSeriesCollection dataset = new XYSeriesCollection(); 
        dataset.addSeries(series);
        //propriedades do grafico
        JFreeChart chart = ChartFactory.createXYLineChart("Grafico Estatistico", 
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
        jPanel1.removeAll();
        jPanel1.add(jan); 
        jPanel1.revalidate();
        jPanel1.repaint(); 
    }
    
    public Grafico() {
        initComponents();
    }
    public Grafico(List l1, List l2) {
        initComponents();
        criarGrafico(l1, l2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grafico");
        setLocation(new java.awt.Point(300, 0));

        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
