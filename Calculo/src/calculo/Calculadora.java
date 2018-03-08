package calculo;

import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {

    public static ArrayList<Double> num = new ArrayList<Double>();
    public static ArrayList<Integer> pri = new ArrayList<Integer>();
    public static ArrayList<Integer> ope = new ArrayList<Integer>();

    public static double xis = Double.POSITIVE_INFINITY;
    public static int c=0, p=1, o, i, j, k, l, f, cp=1;
    // c = Controle de variaveis
    // p = Controle de prioridade
    // o = Controle de operação
    // i = (for) laços diversos 
    // j = (for) fIgual
    // k = (for) fIgual e diversos
    // l = (for) fOut
    // f = (for) fExp //fatorial

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bn1 = new javax.swing.JButton();
        bn2 = new javax.swing.JButton();
        bn3 = new javax.swing.JButton();
        bn4 = new javax.swing.JButton();
        bn5 = new javax.swing.JButton();
        bn6 = new javax.swing.JButton();
        bn7 = new javax.swing.JButton();
        bn8 = new javax.swing.JButton();
        bn9 = new javax.swing.JButton();
        bn0 = new javax.swing.JButton();
        bpo = new javax.swing.JButton();
        bigual = new javax.swing.JButton();
        blog = new javax.swing.JButton();
        bln = new javax.swing.JButton();
        braiz = new javax.swing.JButton();
        bxis = new javax.swing.JButton();
        bsen = new javax.swing.JButton();
        bcos = new javax.swing.JButton();
        bpi = new javax.swing.JButton();
        bquad = new javax.swing.JButton();
        belev = new javax.swing.JButton();
        bee = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        bo1 = new javax.swing.JButton();
        bo2 = new javax.swing.JButton();
        bo3 = new javax.swing.JButton();
        bo4 = new javax.swing.JButton();
        bdel = new javax.swing.JButton();
        bapagar = new javax.swing.JButton();
        bajuda = new javax.swing.JButton();
        bp1 = new javax.swing.JButton();
        bp2 = new javax.swing.JButton();
        bgrafico = new javax.swing.JButton();
        blimite = new javax.swing.JButton();
        bderivada = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btan = new javax.swing.JButton();
        bfat = new javax.swing.JButton();
        bec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA");
        setLocation(new java.awt.Point(100, 100));

        bn1.setText("1");
        bn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn1ActionPerformed(evt);
            }
        });

        bn2.setText("2");
        bn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn2ActionPerformed(evt);
            }
        });

        bn3.setText("3");
        bn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn3ActionPerformed(evt);
            }
        });

        bn4.setText("4");
        bn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn4ActionPerformed(evt);
            }
        });

        bn5.setText("5");
        bn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn5ActionPerformed(evt);
            }
        });

        bn6.setText("6");
        bn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn6ActionPerformed(evt);
            }
        });

        bn7.setText("7");
        bn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn7ActionPerformed(evt);
            }
        });

        bn8.setText("8");
        bn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn8ActionPerformed(evt);
            }
        });

        bn9.setText("9");
        bn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn9ActionPerformed(evt);
            }
        });

        bn0.setText("0");
        bn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bn0ActionPerformed(evt);
            }
        });

        bpo.setText(",");
        bpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpoActionPerformed(evt);
            }
        });

        bigual.setText("=");
        bigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigualActionPerformed(evt);
            }
        });

        blog.setText("log");
        blog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogActionPerformed(evt);
            }
        });

        bln.setText("ln");
        bln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blnActionPerformed(evt);
            }
        });

        braiz.setText("√");
        braiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                braizActionPerformed(evt);
            }
        });

        bxis.setText("X");
        bxis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxisActionPerformed(evt);
            }
        });

        bsen.setText("sen");
        bsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsenActionPerformed(evt);
            }
        });

        bcos.setText("cos");
        bcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcosActionPerformed(evt);
            }
        });

        bpi.setText("π");
        bpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpiActionPerformed(evt);
            }
        });

        bquad.setText("n²");
        bquad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquadActionPerformed(evt);
            }
        });

        belev.setText("n^");
        belev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belevActionPerformed(evt);
            }
        });

        bee.setText("e^");
        bee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beeActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txt2.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        bo1.setText("+");
        bo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo1ActionPerformed(evt);
            }
        });

        bo2.setText("-");
        bo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo2ActionPerformed(evt);
            }
        });

        bo3.setText("*");
        bo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo3ActionPerformed(evt);
            }
        });

        bo4.setText("/");
        bo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bo4ActionPerformed(evt);
            }
        });

        bdel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculo/icones/icone_seta.png"))); // NOI18N
        bdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdelActionPerformed(evt);
            }
        });

        bapagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculo/icones/icone_limpar.png"))); // NOI18N
        bapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bapagarActionPerformed(evt);
            }
        });

        bajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculo/icones/icone_ajuda.png"))); // NOI18N
        bajuda.setText(" AJUDA");
        bajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajudaActionPerformed(evt);
            }
        });

        bp1.setText("(");
        bp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bp1ActionPerformed(evt);
            }
        });

        bp2.setText(")");
        bp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bp2ActionPerformed(evt);
            }
        });

        bgrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculo/icones/icone_grafico.png"))); // NOI18N
        bgrafico.setText("Gráfico");
        bgrafico.setEnabled(false);
        bgrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgraficoActionPerformed(evt);
            }
        });

        blimite.setText("Limite");
        blimite.setEnabled(false);
        blimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blimiteActionPerformed(evt);
            }
        });

        bderivada.setText("Derivada");
        bderivada.setEnabled(false);
        bderivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bderivadaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculo/icones/icone_calculadora.png"))); // NOI18N

        btan.setText("tan");
        btan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanActionPerformed(evt);
            }
        });

        bfat.setText("!");
        bfat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfatActionPerformed(evt);
            }
        });

        bec.setText("e");
        bec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                becActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bn7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bn8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bn9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bo1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bn4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bn5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bn6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bo2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bn1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bn2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bn3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bo3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bee, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(braiz, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(bquad, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(blog, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(belev, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bln, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bsen, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                        .addComponent(bcos, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                        .addComponent(btan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bn0, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bpo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bxis, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bo4, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bpi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bigual, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bp1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bp2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bdel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bfat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bajuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bgrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(blimite, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bderivada, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bcos, bdel, bec, bee, belev, bfat, bln, blog, bn0, bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bo1, bo2, bo3, bo4, bp1, bp2, bpi, bpo, bquad, braiz, bsen, btan, bxis});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bn7)
                            .addComponent(bn8)
                            .addComponent(bn9)
                            .addComponent(bo1)
                            .addComponent(blog)
                            .addComponent(bquad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bn5)
                            .addComponent(bn6)
                            .addComponent(bn4)
                            .addComponent(bln)
                            .addComponent(belev)
                            .addComponent(bo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bn1)
                            .addComponent(bn2)
                            .addComponent(bn3)
                            .addComponent(bee)
                            .addComponent(bo3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bsen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btan)
                            .addComponent(braiz))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bxis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bn0)
                        .addComponent(bpo)
                        .addComponent(bo4)
                        .addComponent(bpi)
                        .addComponent(bfat)
                        .addComponent(bec)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bigual)
                            .addComponent(bp1)
                            .addComponent(bp2)
                            .addComponent(bdel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bgrafico, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bderivada)
                                .addComponent(blimite))))
                    .addComponent(bapagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bajuda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn0ActionPerformed
        if (!"x".equals(txt1.getText()) && !"e".equals(txt1.getText()) && !"π".equals(txt1.getText()))
            txt1.setText(txt1.getText() + "0");
    }//GEN-LAST:event_bn0ActionPerformed

    private void bn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn1ActionPerformed
        if (!"x".equals(txt1.getText()) && !"e".equals(txt1.getText()) && !"π".equals(txt1.getText()))
            txt1.setText(txt1.getText() + "1");
    }//GEN-LAST:event_bn1ActionPerformed

    private void bn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn4ActionPerformed
        if (!"x".equals(txt1.getText()) && !"e".equals(txt1.getText()) && !"π".equals(txt1.getText()))
            txt1.setText(txt1.getText() + "4");
    }//GEN-LAST:event_bn4ActionPerformed

    private void bn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn2ActionPerformed
        if (!"x".equals(txt1.getText()) && !"e".equals(txt1.getText()) && !"π".equals(txt1.getText()))
            txt1.setText(txt1.getText() + "2");
    }//GEN-LAST:event_bn2ActionPerformed

    private void bn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn3ActionPerformed
        if (!"x".equals(txt1.getText()) && !"e".equals(txt1.getText()) && !"π".equals(txt1.getText()))
            txt1.setText(txt1.getText() + "3");
    }//GEN-LAST:event_bn3ActionPerformed

    private void bn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn5ActionPerformed
        if (!"x".equals(txt1.getText()) && !"e".equals(txt1.getText()) && !"π".equals(txt1.getText()))
            txt1.setText(txt1.getText() + "5");
    }//GEN-LAST:event_bn5ActionPerformed

    private void bn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn6ActionPerformed
        if (!"x".equals(txt1.getText()) && !"e".equals(txt1.getText()) && !"π".equals(txt1.getText()))
            txt1.setText(txt1.getText() + "6");
    }//GEN-LAST:event_bn6ActionPerformed

    private void bn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn7ActionPerformed
        if (!"x".equals(txt1.getText()) && !"e".equals(txt1.getText()) && !"π".equals(txt1.getText()))
            txt1.setText(txt1.getText() + "7");
    }//GEN-LAST:event_bn7ActionPerformed

    private void bn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn8ActionPerformed
        if (!"x".equals(txt1.getText()) && !"e".equals(txt1.getText()) && !"π".equals(txt1.getText()))
            txt1.setText(txt1.getText() + "8");
    }//GEN-LAST:event_bn8ActionPerformed

    private void bn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bn9ActionPerformed
        if (!"x".equals(txt1.getText()) && !"e".equals(txt1.getText()) && !"π".equals(txt1.getText()))
            txt1.setText(txt1.getText() + "9");
    }//GEN-LAST:event_bn9ActionPerformed

    private void bpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpoActionPerformed
        if (!"x".equals(txt1.getText()) && !"e".equals(txt1.getText()) && !"π".equals(txt1.getText()) && !txt1.getText().equals(""))
            txt1.setText(txt1.getText() + ".");
    }//GEN-LAST:event_bpoActionPerformed
//LIMPAR
    private void bapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bapagarActionPerformed
        txt1.setText("");
        txt2.setText("");
        c = 0;
        p = 1;
        o = 0;
        k = 0;
        xis = Double.POSITIVE_INFINITY;
        num.clear();
        pri.clear();
        ope.clear();
        bigual.setEnabled(true);
        bgrafico.setEnabled(false);
        blimite.setEnabled(false);
        bderivada.setEnabled(false);
    }//GEN-LAST:event_bapagarActionPerformed
//IGUAL
    private void bigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigualActionPerformed
        fIn();
        //Verificação de X
        for (k=0; k<num.size(); k++)
            if (num.get(k) == Double.POSITIVE_INFINITY){
                xis = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X"));
                k=num.size();
                txt2.setText(txt2.getText()+" | x="+xis);
            }
        for (k=0; k<num.size(); k++)
            if (num.get(k) == Double.POSITIVE_INFINITY)
                num.set(k, xis);
        //Resultado
        txt1.setText(Double.toString(fIgual()));
        
        bigual.setEnabled(false);
        bgrafico.setEnabled(false);
        blimite.setEnabled(false);
        bderivada.setEnabled(false);
    }//GEN-LAST:event_bigualActionPerformed
//OPERAÇÕES
    private void bo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo1ActionPerformed
        if (txt1.getText().trim().equals(""))
            txt1.setText("+");
        else {
            getNum();
            ope.add(1);
            txt2.setText(txt2.getText() + txt1.getText() + "+");
            txt1.setText("");
        }
    }//GEN-LAST:event_bo1ActionPerformed

    private void bo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo2ActionPerformed
        if (txt1.getText().trim().equals(""))
            txt1.setText("-");
        else {
            getNum();
            ope.add(2);
            txt2.setText(txt2.getText() + txt1.getText() + "-");
            txt1.setText("");
        }
    }//GEN-LAST:event_bo2ActionPerformed

    private void bo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo3ActionPerformed
        if (txt1.getText().trim().equals("")) 
            txt1.setText("1");
        getNum();
        ope.add(3);
        txt2.setText(txt2.getText() + txt1.getText() + "*");
        txt1.setText("");
    }//GEN-LAST:event_bo3ActionPerformed

    private void bo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bo4ActionPerformed
        if (txt1.getText().trim().equals("")) 
            txt1.setText("1");
        getNum();
        ope.add(4);
        txt2.setText(txt2.getText() + txt1.getText() + "/");
        txt1.setText("");
    }//GEN-LAST:event_bo4ActionPerformed
//log
    private void blogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogActionPerformed
        mIso();
        ope.add(7);
        txt2.setText(txt2.getText() + "log(");
    }//GEN-LAST:event_blogActionPerformed
//ln
    private void blnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blnActionPerformed
        mIso();
        ope.add(8);
        txt2.setText(txt2.getText() + "ln(");
    }//GEN-LAST:event_blnActionPerformed
//RAIZ
    private void braizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_braizActionPerformed
        mIso();
        ope.add(6);
        txt2.setText(txt2.getText() + "√(");
    }//GEN-LAST:event_braizActionPerformed
//X
    private void bxisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxisActionPerformed
        mCons();
        txt1.setText(txt1.getText()+"x");
        bgrafico.setEnabled(true);
        blimite.setEnabled(true);
        bderivada.setEnabled(true);
    }//GEN-LAST:event_bxisActionPerformed
//sen
    private void bsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsenActionPerformed
        mIso();
        ope.add(9);
        txt2.setText(txt2.getText() + "sin(");
    }//GEN-LAST:event_bsenActionPerformed
//cos
    private void bcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcosActionPerformed
        mIso();
        ope.add(10);
        txt2.setText(txt2.getText() + "cos(");
    }//GEN-LAST:event_bcosActionPerformed
//exponenciais
    private void bquadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bquadActionPerformed
        if (txt1.getText().trim().equals("+") || txt1.getText().trim().equals("-"))
            txt1.setText(txt1.getText()+"1");
        if (txt1.getText().trim().equals(""))
            txt1.setText("1");
        getNum();
        ope.add(5);
        num.add(2d);
        pri.add(p);
        txt2.setText(txt2.getText() + txt1.getText() + "^2");
        txt1.setText("");
    }//GEN-LAST:event_bquadActionPerformed

    private void belevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belevActionPerformed
        if (txt1.getText().trim().equals("+") || txt1.getText().trim().equals("-"))
            txt1.setText(txt1.getText()+"1");
        if (txt1.getText().trim().equals(""))
            txt1.setText("1");
        getNum();
        ope.add(5);
        txt2.setText(txt2.getText() + txt1.getText() + "^");
        txt1.setText("");
    }//GEN-LAST:event_belevActionPerformed

    private void beeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beeActionPerformed
        mCons();
        num.add(Math.E);
        pri.add(p);
        ope.add(5);
        txt2.setText(txt2.getText() + txt1.getText() + "e^");
        txt1.setText("");
    }//GEN-LAST:event_beeActionPerformed
//pi
    private void bpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpiActionPerformed
        mCons();
        txt1.setText(txt1.getText()+"π");
    }//GEN-LAST:event_bpiActionPerformed
//PARENTESES
    private void bp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bp1ActionPerformed
        if (txt1.getText().trim().equals("")) 
            txt2.setText(txt2.getText() + txt1.getText() + "(");
        else {
            getNum();
            ope.add(3);
            txt2.setText(txt2.getText() + txt1.getText() + "*(");
            txt1.setText("");
        }
        p++;
    }//GEN-LAST:event_bp1ActionPerformed

    private void bp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bp2ActionPerformed
        if (p > 1 && ope.get(c-1)==5) {
            getNum();
            p--;
            txt2.setText(txt2.getText() + txt1.getText() + ")");
            txt1.setText("");
        } 
        else if (p > 1) {
            p--;
            getNum();
            txt2.setText(txt2.getText() + txt1.getText() + ")");
            txt1.setText("");
        } 
        else
            JOptionPane.showMessageDialog(null, "ERRO! \nParenteses ñ aberto");
    }//GEN-LAST:event_bp2ActionPerformed

    private void bdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdelActionPerformed
        txt1.setText("");
    }//GEN-LAST:event_bdelActionPerformed
//AJUDA
    private void bajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajudaActionPerformed
        if (JOptionPane.showConfirmDialog(null, "                                CALCULADORA MAXGRAPHIC XXI"
                + "\n\n           Como usar:"
                + "\n1º Insira as contas desejadas utilizando os numeros e botões disponíveis;"
                + "\n2º Escolha uma das opções: "
                + "\n   -  Igual (=):  Calcula o resultado da operação;"
                + "\n   -  Grafico:  Mostra o gráfico da função fornecida;"
                + "\n   -  Limite:  Calcula o Limite da função no ponto 'p' desejado;"
                + "\n   -  Derivada:  Gera a função derivada;"
                + "\n\nBotão 'X': Utilize para criação de funções, liberando tambem outras opções;"
                + "\n  - Exemplo 1:  f(x) = (2x²)*(10x)-5; \n  - Exemplo 2:  f(x) = (x^5)*(1/2); "
                + "\n  - Exemplo 3:  f(x) = ((x²)-(10x)+16) / (x-8) \n  - Exemplo 4:  f(x) = 10x^3+√(x+)"
                + "\n  - Exemplo 5:  f(x) = 50-(sen(x)+cos(x-10)) \nOBS: 'sen', 'cos' e 'tan' em Radianos;"
                + "\n\nBotão 'SETA':  Apaga os ultimos numeros sem perder as operações anterioes;               "
                + "\nBotão 'LIMPAR':  Apaga todas as informações digitadas e zera a calculadora;"
                + "\n\n                       SEMPRE USE O BOTãO 'LIMPAR' APóS UMA OPERAÇãO!"
                + "\n                               UTILIZE OS PARENTESES SEMPRE Q POSSíVEL!"
                + "\n\n                Deseja abrir o PDF de Ajuda com informações mais detalhadas?") == JOptionPane.YES_OPTION){
            //ABRE O PDF
            try { 
                Desktop.getDesktop().open(new File("AJUDA.pdf")); 
            } catch(Exception ex) {      
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_bajudaActionPerformed
//DERIVADA
    private void bderivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bderivadaActionPerformed
        fIn();
        Derivada der = new Derivada();
        der.setVisible(true);
        der.setResizable(false);
        der.setDefaultCloseOperation(2);
        der.txt1.setText(txt2.getText());
        der.txt2.setText(der.Derivar(txt2.getText()));
        
    }//GEN-LAST:event_bderivadaActionPerformed
//LIMITE
    private void blimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blimiteActionPerformed
        fIn();
        Limite lim = new Limite();
        lim.setVisible(true);
        lim.setResizable(false);
        lim.setDefaultCloseOperation(2);
        lim.txt1.setText(txt2.getText());
        
        for (k=0; k<20; k++) {
            lim.auxN[k] = num[k];
            lim.auxP[k] = pri[k];
            lim.auxO[k] = op[k];
        }
    }//GEN-LAST:event_blimiteActionPerformed
//GRAFICO
    private void bgraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgraficoActionPerformed
        fIn();
        Grafico gra = new Grafico();
        gra.setVisible(true);
        gra.setResizable(false);
        gra.setDefaultCloseOperation(2);
        gra.funcao = txt2.getText();
        
        for (k=0; k<20; k++) {
            gra.auxN[k] = num[k];
            gra.auxP[k] = pri[k];
            gra.auxO[k] = op[k];
        }
        
        for (k=1; k<20; k++) //valores personalizados do eixo X
            if (num[k]==Double.POSITIVE_INFINITY){
                if (op[k-1]==5){ //exponencial
                    gra.sInicial.setValue(-2);
                    gra.sFinal.setValue(3);
                    gra.sInterv.setValue(1);
                    gra.criarGrafico(-2, 3, 1);
                }
                else if (op[k-1]==6 || op[k-1]==7 || op[k-1]==8){ //raiz, log e ln
                    gra.sInicial.setValue(1);
                    gra.sFinal.setValue(10);
                    gra.sInterv.setValue(1);
                    gra.criarGrafico(1, 10, 1);
                }
                else if (op[k-1]==12){ //fatorial
                    gra.sInicial.setValue(0);
                    gra.sFinal.setValue(5);
                    gra.sInterv.setValue(1);
                    gra.criarGrafico(0, 5, 1);
                }
                else{
                    gra.sInicial.setValue(-10);
                    gra.sFinal.setValue(10);
                    gra.sInterv.setValue(1);
                    gra.criarGrafico(-10, 10, 1);
                }
            }
    }//GEN-LAST:event_bgraficoActionPerformed
//outros (ñ necessarios)
    private void btanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanActionPerformed
        o=11;
        mIso();
        txt2.setText(txt2.getText() + "tan(");
    }//GEN-LAST:event_btanActionPerformed

    private void bfatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfatActionPerformed
        o=12;
        mIso();
        txt2.setText(txt2.getText() + "!(");
    }//GEN-LAST:event_bfatActionPerformed

    private void becActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_becActionPerformed
        mCons();
        txt1.setText(txt1.getText()+"e");
    }//GEN-LAST:event_becActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bajuda;
    private javax.swing.JButton bapagar;
    private javax.swing.JButton bcos;
    private javax.swing.JButton bdel;
    private javax.swing.JButton bderivada;
    private javax.swing.JButton bec;
    private javax.swing.JButton bee;
    private javax.swing.JButton belev;
    private javax.swing.JButton bfat;
    private javax.swing.JButton bgrafico;
    private javax.swing.JButton bigual;
    private javax.swing.JButton blimite;
    private javax.swing.JButton bln;
    private javax.swing.JButton blog;
    private javax.swing.JButton bn0;
    private javax.swing.JButton bn1;
    private javax.swing.JButton bn2;
    private javax.swing.JButton bn3;
    private javax.swing.JButton bn4;
    private javax.swing.JButton bn5;
    private javax.swing.JButton bn6;
    private javax.swing.JButton bn7;
    private javax.swing.JButton bn8;
    private javax.swing.JButton bn9;
    private javax.swing.JButton bo1;
    private javax.swing.JButton bo2;
    private javax.swing.JButton bo3;
    private javax.swing.JButton bo4;
    private javax.swing.JButton bp1;
    private javax.swing.JButton bp2;
    private javax.swing.JButton bpi;
    private javax.swing.JButton bpo;
    private javax.swing.JButton bquad;
    private javax.swing.JButton braiz;
    private javax.swing.JButton bsen;
    private javax.swing.JButton btan;
    private javax.swing.JButton bxis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    // End of variables declaration//GEN-END:variables

    public void getNum() {
        if (txt1.getText().trim().equals("+") || txt1.getText().trim().equals("-"))
            txt1.setText(txt1.getText()+"1");
        if (txt1.getText().trim().equals("π")){
            num.add(Math.PI);
            pri.add(p);
        }
        else if (txt1.getText().trim().equals("x")){
            num.add(Double.POSITIVE_INFINITY);
            pri.add(p);
        }
        else if (txt1.getText().trim().equals("e")){
            num.add(Math.E);
            pri.add(p);
        }
        else if (!txt1.getText().trim().equals("")){
            num.add(Double.parseDouble(txt1.getText()));
            pri.add(p);
        }
    }
    public void mIso() {
        if (!txt1.getText().trim().equals("")){
            getNum();
            ope.add(3);
            txt2.setText(txt2.getText() +txt1.getText()+"*");
            txt1.setText("");
        }
        p++;
        num.add(1d);
        pri.add(p);
    }
    public void mCons() {
        if (txt1.getText().trim().equals("") && num.isEmpty()){
            num.add(1d);
            pri.add(p);
        }
        if (!txt1.getText().trim().equals("")){
            getNum();
            ope.add(3);
            txt2.setText(txt2.getText() + txt1.getText());
            txt1.setText("");
        }
    }
    
    public void fIn() {
        getNum();
        txt2.setText(txt2.getText() + txt1.getText());
        txt1.setText("");
        while (p > 1) {
            p--;
            txt2.setText(txt2.getText() + ")");
        }
    }
    
    public static double fIgual() {
        k=0;
        for (k = 0; k < ope.size(); k++) //nao sei, mas adianta
            for (j = 10; j > 0; j--) { //controle de prioridade, decrescente
                for (i = 0; i < ope.size(); i++) {
                    if (pri.get(i) == j) {
                        if (ope.get(i) == 5) { //exponencial
                            num.set(i, Math.pow(num.get(i), num.get(i+1)));
                            fOut();
                        }
                    }
                }
                for (i = 0; i < ope.size(); i++) {
                    if (pri.get(i) == j) {
                        if (ope.get(i) == 3) { //multiplicação
                            num.set(i, num.get(i) * num.get(i+1));
                            fOut();
                        }
                        if (ope.get(i) == 4) { //divisão
                            num.set(i, num.get(i) / num.get(i+1));
                            fOut();
                        }
                    }
                }
                for (i = 0; i < ope.size(); i++){
                    if (pri.get(i) == j) {
                        if (ope.get(i) == 1) { //soma
                            num.set(i, num.get(i) + num.get(i+1));
                            fOut();
                        }
                        if (ope.get(i) == 2) { //subtração
                            num.set(i, num.get(i) - num.get(i+1));
                            fOut();
                        }
                    }
                }
                for (i = 0; i < ope.size(); i++){
                    if (pri.get(i) == j) {
                        fIgualOutros();
                    }
                }
            }
        return num.get(0);
    }
    public static void fIgualOutros() {
        if (ope.get(i) == 6) { //raiz
            num.set(i, Math.sqrt(num.get(+1)));
            fOut();
        }
        if (ope.get(i) == 7) { //log
            num.set(i, Math.log10(num.get(+1)));
            fOut();
        }
        if (ope.get(i) == 8) { //ln
            num.set(i, Math.log(num.get(+1)));
            fOut();
        }
        if (ope.get(i) == 9) { //sen
            num.set(i, Math.sin(num.get(+1)));
            fOut();
        }
        if (ope.get(i) == 10) { //cos
            num.set(i, Math.cos(num.get(+1)));
            fOut();
        }
        if (ope.get(i) == 11) { //tan
            num.set(i, Math.tan(num.get(+1)));
            fOut();
        }
        if (ope.get(i) == 12) { //fatorial
            for (f = (int)(num.get(+1)-1); f>0; f--){
                num.set(i, num.get(+1)*f);
            }
            num.set(i, num.get(+1));
            fOut();
        }
    }
    public static void fOut() {
        pri.set(i, pri.get(i+1));
        num.remove(i+1);
        pri.remove(i+1);
        if (i < ope.size()-1)
            ope.remove(i+1);
        if (i > 0)
            i--;
    }
    
}
