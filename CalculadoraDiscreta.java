// CALCULADORA DISCRETA para operaciones de SUMA y RESTA de numeros NATURALES y BINARIOS

import java.awt.Color;
import javax.swing.JOptionPane;

public class CalculadoraDiscreta extends javax.swing.JFrame {

    // VARIABLES
    String decimal1, decimal2, decimal;
    String binario1, binario2, binario;
    String operacion = "";
    int resultado;
    boolean binarioNegativo = false;

    // METODOS 
    public void borrar() {
        operacion = "";
        binarioNegativo = false;
        jLabelD1.setText("");
        jLabelD2.setText("");
        jLabelDres.setText("");
        jLabelB1.setText("binario 1");
        jLabelB2.setText("binario 2");
        jLabelBres.setText("binario");
        jLabel6.setText("+ / -");
        jLabel11.setText("+ / -");
        jLabelDres.setForeground(Color.black);
        jLabelBres.setForeground(Color.black);
    }

    public void verificar() {
        if (!jLabelDres.getText().equals("")) {
            borrar();
        }
    }

    public String decimalAbinario(String numero) {
        String numeroB = "";
        if (numero.equals("0") || numero.equals("1")) {
            numeroB = numero;
        } else {
            int dividendo = Integer.parseInt(numero);
            String binarioINV = "";
            int resto;
            do {
                resto = dividendo % 2;
                binarioINV = binarioINV + String.valueOf(resto);
                dividendo = dividendo / 2;
            } while (dividendo > 1);
            binarioINV = binarioINV + "1";
            for (int i = binarioINV.length() - 1; i >= 0; i--) {
                numeroB = numeroB + binarioINV.charAt(i);
            }
        }
        return numeroB;
    }

    public String sumar(String binario1, String binario2) {
        System.out.println("binario1 = " + binario1);
        System.out.println("binario2 = " + binario2);

        String aux, caracter = "", suma = "", carry = "0";

        if (binario1.length() < binario2.length()) {
            aux = binario1;
            binario1 = binario2;
            binario2 = aux;
        }
        int diferencia = binario1.length() - binario2.length();
        for (int i = 0; i < diferencia; i++) {
            binario2 = "0" + binario2;
        }
        System.out.println("binario1 = " + binario1);
        System.out.println("binario2 = " + binario2);

        for (int i = binario1.length() - 1; i >= 0; i--) {
            if (carry.equals("0")) {
                if (binario1.charAt(i) == '0' && binario2.charAt(i) == '0') {
                    caracter = "0";
                    carry = "0";
                } else if ((binario1.charAt(i) == '0' && binario2.charAt(i) == '1')
                        || (binario1.charAt(i) == '1' && binario2.charAt(i) == '0')) {
                    caracter = "1";
                    carry = "0";
                } else {
                    caracter = "0";
                    carry = "1";
                }
            } else {
                if (binario1.charAt(i) == '0' && binario2.charAt(i) == '0') {
                    caracter = "1";
                    carry = "0";
                } else if ((binario1.charAt(i) == '0' && binario2.charAt(i) == '1')
                        || (binario1.charAt(i) == '1' && binario2.charAt(i) == '0')) {
                    caracter = "0";
                    carry = "1";
                } else {
                    caracter = "1";
                    carry = "1";
                }
            }

            suma = caracter + suma;

            System.out.println("i = " + i + " - " + binario1.charAt(i) + " - " + binario2.charAt(i) + " - " + caracter + " - suma = " + suma);
        }

        if (carry.equals("1")) {
            suma = carry + suma;
        }
        
        return suma;
    }

    public String restar(String binario1, String binario2) {
        String resta;
        // añado el bit de signo e igualo la cantidad de bits
        binario1 = "0" + binario1;
        int diferencia = binario1.length() - binario2.length();
        for (int i = 0; i < diferencia; i++) {
            binario2 = "0" + binario2;
        }
        System.out.println("RESTA");
        System.out.println("binario1 = " + binario1);
        System.out.println("binario2 = " + binario2);

        // aplico el complemento a 1
        binario2 = binario2.replaceAll("1", "u");
        binario2 = binario2.replaceAll("0", "1");
        binario2 = binario2.replaceAll("u", "0");
        System.out.println("binario2 = " + binario2);

        // aplico el complemento a 2
        binario2 = sumar(binario2, "1");

        resta = sumar(binario1, binario2);
        resta = resta.substring(2);
        return resta;
    }
    

    
    // ======================================================================================================
    // INTERFAZ GRAFICA 
    public CalculadoraDiscreta() {
        initComponents();
        this.setLocationRelativeTo(null);  // centro la VENTANA en la pantalla
        jLabel6.setText("+ / -");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabelD1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelD2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelDres = new javax.swing.JLabel();
        jLabelB1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelB2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelBres = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora DISCRETA");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DECIMAL");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BINARIO");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("(ingrese numeros decimales)");

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 0, 51));
        jButton11.setText("C");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton12.setText("+");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton13.setText("-");
        jButton13.setMaximumSize(new java.awt.Dimension(73, 25));
        jButton13.setMinimumSize(new java.awt.Dimension(73, 25));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 255));
        jButton14.setText("=");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabelD1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabelD2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("------------------");

        jLabelDres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabelB1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelB1.setText("binario 1");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("+ / -");

        jLabelB2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelB2.setText("binario 2");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("------------------------------------");

        jLabelBres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelBres.setText("binario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(jLabelDres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabelD1)
                    .addComponent(jLabelB1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jLabelD2)
                    .addComponent(jLabelB2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14)
                    .addComponent(jLabelDres)
                    .addComponent(jLabelBres))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // BOTONES numericos -----------------------------------------------------------------------------------
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verificar();
        if (operacion.equals("")) {
            jLabelD1.setText(jLabelD1.getText() + "1");
        } else {
            jLabelD2.setText(jLabelD2.getText() + "1");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        verificar();
        if (operacion.equals("")) {
            jLabelD1.setText(jLabelD1.getText() + "2");
        } else {
            jLabelD2.setText(jLabelD2.getText() + "2");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        verificar();
        if (operacion.equals("")) {
            jLabelD1.setText(jLabelD1.getText() + "3");
        } else {
            jLabelD2.setText(jLabelD2.getText() + "3");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        verificar();
        if (operacion.equals("")) {
            jLabelD1.setText(jLabelD1.getText() + "4");
        } else {
            jLabelD2.setText(jLabelD2.getText() + "4");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        verificar();
        if (operacion.equals("")) {
            jLabelD1.setText(jLabelD1.getText() + "5");
        } else {
            jLabelD2.setText(jLabelD2.getText() + "5");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        verificar();
        if (operacion.equals("")) {
            jLabelD1.setText(jLabelD1.getText() + "6");
        } else {
            jLabelD2.setText(jLabelD2.getText() + "6");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        verificar();
        if (operacion.equals("")) {
            jLabelD1.setText(jLabelD1.getText() + "7");
        } else {
            jLabelD2.setText(jLabelD2.getText() + "7");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        verificar();
        if (operacion.equals("")) {
            jLabelD1.setText(jLabelD1.getText() + "8");
        } else {
            jLabelD2.setText(jLabelD2.getText() + "8");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        verificar();
        if (operacion.equals("")) {
            jLabelD1.setText(jLabelD1.getText() + "9");
        } else {
            jLabelD2.setText(jLabelD2.getText() + "9");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        verificar();
        if (operacion.equals("")) {
            jLabelD1.setText(jLabelD1.getText() + "0");
        } else {
            jLabelD2.setText(jLabelD2.getText() + "0");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    
    // BOTONES de operaciones -------------------------------------------------------------------------------
    // boton SUMA
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (binarioNegativo) {
            borrar();
        } else {
            if (!jLabelDres.getText().equals("")) {
                decimal1 = jLabelDres.getText();
                borrar();
                jLabelD1.setText(decimal1);
            }
            operacion = "suma";
            jLabel6.setText("+");
            jLabel11.setText("+");
            decimal1 = jLabelD1.getText();
            binario1 = decimalAbinario(decimal1);
            jLabelB1.setText(binario1);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    // boton RESTA
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (binarioNegativo) {
            borrar();
        } else {
            if (!jLabelDres.getText().equals("")) {
                if (binarioNegativo) {
                    jLabelBres.setForeground(Color.black);
                    borrar();
                    binarioNegativo = false;
                } else {
                    decimal1 = jLabelDres.getText();
                    borrar();
                    jLabelD1.setText(decimal1);
                }
            }
            operacion = "resta";
            jLabel6.setText("-");
            jLabel11.setText("-");
            decimal1 = jLabelD1.getText();
            binario1 = decimalAbinario(decimal1);
            jLabelB1.setText(binario1);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    // boton IGUAL
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (operacion.equals("")) {
            JOptionPane.showMessageDialog(this, "NO has ingresado ningun valor ...");
            borrar();
        } else {
            if (!jLabelD2.getText().equals("")) {
                decimal2 = jLabelD2.getText();
                System.out.println("decimal2 = " + decimal2);
                binario2 = decimalAbinario(decimal2);
                System.out.println("binario2 = " + binario2);
                jLabelB2.setText(binario2);
                if (operacion.equals("suma")) {
                    resultado = Integer.parseInt(decimal1) + Integer.parseInt(decimal2);
                    // suma binaria
                    binario = sumar(binario1, binario2);

                } else {
                    resultado = Integer.parseInt(decimal1) - Integer.parseInt(decimal2);
                    // resta binaria
                    if (Integer.parseInt(decimal1) < Integer.parseInt(decimal2)) {
                        jLabelDres.setForeground(Color.red);
                        jLabelBres.setForeground(Color.red);
                        binarioNegativo = true;
                        String aux = binario1;
                        binario1 = binario2;
                        binario2 = aux;
                    }
                    binario = restar(binario1, binario2);
                    
                    // quito los ceros '0' a la izquierda
                    do {
                            binario = binario.substring(1);
                        } while (binario.charAt(0) == '0');
                    
                    if (binarioNegativo) {                                          
                        binario = "BNeg.: 1 " + binario;
                    }
                    
                }

                jLabelBres.setText(binario);
                jLabelDres.setText(String.valueOf(resultado));

                operacion = "";
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    // boton BORRAR 
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        borrar();
    }//GEN-LAST:event_jButton11ActionPerformed

    
    
    // =====================================================================================================
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CalculadoraDiscreta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDiscreta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDiscreta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDiscreta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraDiscreta().setVisible(true);
            }
        });
    }
    
    

    // ======================================================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelB1;
    private javax.swing.JLabel jLabelB2;
    private javax.swing.JLabel jLabelBres;
    private javax.swing.JLabel jLabelD1;
    private javax.swing.JLabel jLabelD2;
    private javax.swing.JLabel jLabelDres;
    // End of variables declaration//GEN-END:variables
}
