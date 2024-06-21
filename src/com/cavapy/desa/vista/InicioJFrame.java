/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cavapy.desa.vista;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javafx.scene.control.ProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author RodrigoRamirez
 */
public class InicioJFrame extends javax.swing.JFrame {

    /**
     * Variable global que permite identificar el directorio sobre el cual se va
     * a trabajar
     */
    File file;
    Preferences prefs;

    /**
     * Creates new form InicioJFrame
     */
    public InicioJFrame() {

        initComponents();
        pack();
        setLocationRelativeTo(null);
        //jTextFieldPrefijoDelPDF.setVisible(false);
        //jLabelPrefijoDelPDF.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/icono/LOGO.png")).getImage());
        ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/icono/cavapy.jpg"));
        Image imagen = imageIcon.getImage();
        ImageIcon iconoEscalado = new ImageIcon(imagen.getScaledInstance(300, 80, Image.SCALE_SMOOTH));
        jLabelLogoCavapy.setIcon(iconoEscalado);
        prefs = Preferences.userNodeForPackage(InicioJFrame.class);
        jTextFieldCarpetaContenedora.setText(prefs.get("carpetaContenedora", ""));
        if (!jTextFieldCarpetaContenedora.getText().equals("")) {
            file = new File(jTextFieldCarpetaContenedora.getText());
        }
        jTextFieldPrefijoDelPDF.setText(prefs.get("prefijoDelPDF", ""));
        jTextFieldNuevoNombrePDF.setText(jTextFieldNuevoNombrePDF.getText().toUpperCase());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabelPrefijoDelPDF = new javax.swing.JLabel();
        jTextFieldPrefijoDelPDF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPDFInicial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCarpetaContenedora = new javax.swing.JTextField();
        jButtonExaminar = new javax.swing.JButton();
        jButtonProcesar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNuevoNombrePDF = new javax.swing.JTextField();
        jLabelLogoCavapy = new javax.swing.JLabel();
        jSpinnerInicioNum = new javax.swing.JSpinner();
        jSpinnerCantidad = new javax.swing.JSpinner();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAVAPY - RenamePDF");
        setBackground(new java.awt.Color(0, 0, 102));

        jLabelPrefijoDelPDF.setText("Prefijo del PDF");

        jTextFieldPrefijoDelPDF.setToolTipText("Nombre del archivo PDF");
        jTextFieldPrefijoDelPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPrefijoDelPDFMouseClicked(evt);
            }
        });
        jTextFieldPrefijoDelPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrefijoDelPDFActionPerformed(evt);
            }
        });
        jTextFieldPrefijoDelPDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPrefijoDelPDFKeyPressed(evt);
            }
        });

        jLabel1.setText("PDF inicial");

        jTextFieldPDFInicial.setToolTipText("Nombre final del PDF");
        jTextFieldPDFInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPDFInicialMouseClicked(evt);
            }
        });
        jTextFieldPDFInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPDFInicialActionPerformed(evt);
            }
        });
        jTextFieldPDFInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPDFInicialKeyPressed(evt);
            }
        });

        jLabel2.setText("Inicio numeración");

        jLabel3.setText("Cantidad");

        jLabel4.setText("Carpera contenedora");

        jTextFieldCarpetaContenedora.setEnabled(false);

        jButtonExaminar.setText("Examinar");
        jButtonExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExaminarActionPerformed(evt);
            }
        });

        jButtonProcesar.setText("Procesar");
        jButtonProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcesarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("Nuevo nombre PDF");

        jTextFieldNuevoNombrePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNuevoNombrePDFActionPerformed(evt);
            }
        });
        jTextFieldNuevoNombrePDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNuevoNombrePDFKeyPressed(evt);
            }
        });

        jSpinnerInicioNum.setModel(new SpinnerNumberModel(1, 0, 999999999, 1));
        jSpinnerInicioNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSpinnerInicioNumKeyPressed(evt);
            }
        });

        jSpinnerCantidad.setModel(new SpinnerNumberModel(0, 0, 999999999, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerInicioNum, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNuevoNombrePDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldPDFInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(jLabelLogoCavapy, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldCarpetaContenedora, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonExaminar))
                                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelPrefijoDelPDF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPrefijoDelPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jButtonProcesar))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(71, 71, 71)
                                .addComponent(jButtonSalir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrefijoDelPDF)
                    .addComponent(jTextFieldPrefijoDelPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldPDFInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNuevoNombrePDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jSpinnerInicioNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelLogoCavapy, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCarpetaContenedora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExaminar))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProcesar)
                    .addComponent(jButtonSalir))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrefijoDelPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPrefijoDelPDFMouseClicked
        // TODO add your handling code here:
        jTextFieldPrefijoDelPDF.enable();
    }//GEN-LAST:event_jTextFieldPrefijoDelPDFMouseClicked

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExaminarActionPerformed
        // TODO add your handling code here:
        JFileChooser select = new JFileChooser();
        select.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        select.setCurrentDirectory(new File(prefs.get("carpetaContenedora", ".")));
        int response = select.showOpenDialog(this);
        if (response == JFileChooser.APPROVE_OPTION) {
            file = select.getSelectedFile();
            jTextFieldCarpetaContenedora.setText(file.getAbsolutePath());
            prefs.put("carpetaContenedora", file.getAbsolutePath());
        }
    }//GEN-LAST:event_jButtonExaminarActionPerformed

    JProgressBar jProgressBar = new JProgressBar(1, 100);
    
    private void jButtonProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcesarActionPerformed
        
//        Thread hilo = new Thread() {  
//            public void run() {
//                jProgressBar.setMaximum(30000);
//                //JProgressBar jProgressBar = new JProgressBar(1, 100);
//                for (int i = 0; i < 30000; i++) {
//                    System.out.println("numero: " + i);
//                    jProgressBar.setValue(i);
//                }
//                jProgressBar.setValue(0);
//            }
//        };
//        hilo.start();
//        
//        JFrame frame = new JFrame("MessageDialog");
//    JOptionPane pane = new JOptionPane();
//    pane.setMessage("procesando...");
//        JProgressBar jProgressBar = new JProgressBar(1, 100);
//    jProgressBar.setValue(15);
//    pane.add(jProgressBar,1);
//    JDialog dialog = pane.createDialog(frame, "Info");
//    dialog.setVisible(true);
//    dialog.dispose();
//    
    
    
        if (jTextFieldPrefijoDelPDF.getText().equals("") || jTextFieldNuevoNombrePDF.getText().equals("")) {
            if (jTextFieldPrefijoDelPDF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Favor ingrese el prefijo del PDF");
                jTextFieldPrefijoDelPDF.requestFocusInWindow();
            }else {
                if (jTextFieldNuevoNombrePDF.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Favor ingrese el nuevo nombre del PDF");
                    jTextFieldNuevoNombrePDF.requestFocusInWindow();
                }
            }
        } else {

            if (!existsNombrePDF() && existsPDFInicial()) {

                String pdfInicial = jTextFieldPDFInicial.getText();
                String prefijoDelPdf = jTextFieldPrefijoDelPDF.getText();
                String nuevoNombrePdf = jTextFieldNuevoNombrePDF.getText().toUpperCase();
                String numeracionPdf = "";
                int numeracionPrimerDoc = 0;
                List<String> list = new ArrayList<String>();
                int posicion = 0;

                /**
                 * Se le contatena la extensión del archivo (pdf)
                 */
                if (!pdfInicial.equals("")) {
                    if (!pdfInicial.contains(".pdf")) {
                        pdfInicial = pdfInicial.concat(".pdf");
                    }
                    numeracionPdf = pdfInicial.substring(prefijoDelPdf.length(), pdfInicial.indexOf("."));
//                    if (!numeracionPdf.equals("")) {
//                        posicion = Integer.parseInt(numeracionPdf);
//                        numeracionPrimerDoc = posicion;
//                        list.add(pdfInicial);
//                    }
                    posicion = Integer.parseInt(numeracionPdf);
                    numeracionPrimerDoc = posicion;
                    list.add(pdfInicial);
                    jProgressBar.setValue(30);
                } else {
                    for (File archivo : file.listFiles()) {
                        if (archivo.isFile()) {
                            String archivoPdf = archivo.getName();
                            numeracionPdf = archivoPdf.substring(prefijoDelPdf.length(), archivoPdf.indexOf("."));
                            posicion = Integer.parseInt(numeracionPdf);
                            if (numeracionPrimerDoc == 0) {
                                numeracionPrimerDoc = posicion;
                                pdfInicial = prefijoDelPdf + numeracionPrimerDoc + ".pdf";
                            }
                            if (posicion < numeracionPrimerDoc) {
                                numeracionPrimerDoc = posicion;
                                pdfInicial = prefijoDelPdf + numeracionPrimerDoc + ".pdf";
                            }
                        }
                    }
                    list.add(pdfInicial);
                }
                /**
                 * obtiene la numeración de archivos
                 */
                try {
                    jSpinnerInicioNum.commitEdit();
                } catch (ParseException ex) {
                    Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

                int inicioNum = (Integer) jSpinnerInicioNum.getValue();

                /**
                 * obtiene la cantidad de bonos
                 */
                try {
                    jSpinnerCantidad.commitEdit();
                } catch (ParseException ex) {
                    Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                int cantidad = (Integer) jSpinnerCantidad.getValue();

                for (int i = numeracionPrimerDoc + 1; i < cantidad + (numeracionPrimerDoc + 1); i++) {
                    if (i < 10) {
                        list.add(prefijoDelPdf + "00" + i + ".pdf");
                    }
                    if (i >= 10 && i < 100) {
                        list.add(prefijoDelPdf + "0" + i + ".pdf");
                    }
                    if (i >= 100) {
                        list.add(prefijoDelPdf + i + ".pdf");
                    }
                }

                String carpetaContenedora = file.getAbsolutePath();
                /**
                 * crea la carpeta 'Procesados' donde se almacenan los pdf's
                 * originales
                 */
                File folderProcesados = new File(carpetaContenedora + "\\Procesados");
                if (!folderProcesados.exists()) {
                    folderProcesados.mkdir();
                }
                /**
                 * crea una subcarpeta nombrada con la fecha actual
                 */
                Calendar fechaActual = Calendar.getInstance();
                StringBuilder fecha = new StringBuilder();
                fecha.append(fechaActual.get(Calendar.DAY_OF_MONTH) < 10 ? "0" + (fechaActual.get(Calendar.DAY_OF_MONTH)) : (fechaActual.get(Calendar.DAY_OF_MONTH)));
                fecha.append(fechaActual.get(Calendar.MONTH) < 9 ? "0" + (fechaActual.get(Calendar.MONTH) + 1) : (fechaActual.get(Calendar.MONTH) + 1));
                fecha.append(fechaActual.get(Calendar.YEAR));
                File folderFecha = new File(folderProcesados.getAbsolutePath() + "\\" + fecha.toString());
                if (!folderFecha.exists()) {
                    folderFecha.mkdir();
                }
                /**
                 * crea la carpeta con nombre de la hora actual
                 */
                fecha = new StringBuilder();
                fecha.append(fechaActual.get(Calendar.HOUR_OF_DAY) < 10 ? "0" + (fechaActual.get(Calendar.HOUR_OF_DAY)) : fechaActual.get(Calendar.HOUR_OF_DAY));
                fecha.append(fechaActual.get(Calendar.MINUTE) < 10 ? "0" + (fechaActual.get(Calendar.MINUTE)) : fechaActual.get(Calendar.MINUTE));
                fecha.append(fechaActual.get(Calendar.SECOND) < 10 ? "0" + (fechaActual.get(Calendar.SECOND)) : fechaActual.get(Calendar.SECOND));
                File folderHora = new File(folderFecha.getAbsolutePath() + "\\" + fecha.toString());
                if (!folderHora.exists()) {
                    folderHora.mkdir();
                }
                /**
                 * crea la carpeta donde se almacenan los pdf's renombrados
                 */
                File folder = new File(carpetaContenedora + "\\" + nuevoNombrePdf);
                if (!folder.exists()) {
                    folder.mkdir();
                }

                for (String archivoPdf : list) {
                    
                    if (existsFile(archivoPdf)) {
                    
                        Path source = Paths.get(carpetaContenedora + "\\" + archivoPdf);
                        Path target = Paths.get(folderHora.getAbsolutePath()); // destino
                        /**
                         * copia a la carpeta procesados el pdf
                         */
                        try {
                            Files.copy(source, target.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException ex) {
                            Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        /**
                         * renombra el archivo original con el valor del campo de
                         * texto 'nuevo nombre pdf'
                         */

                        String concatNumeracionPrimerDoc = "";
                        if (numeracionPrimerDoc < 10) {
                            concatNumeracionPrimerDoc = "00" + numeracionPrimerDoc;
                        }
                        if (numeracionPrimerDoc >= 10 && numeracionPrimerDoc < 100) {
                            concatNumeracionPrimerDoc = "0" + numeracionPrimerDoc;
                        }
                        if (numeracionPrimerDoc >= 100) {
                            concatNumeracionPrimerDoc = String.valueOf(numeracionPrimerDoc);
                        }

                        if (archivoPdf.substring(prefijoDelPdf.length(), archivoPdf.indexOf(".")).equals(String.valueOf(concatNumeracionPrimerDoc))) {
                            File archivo = new File(carpetaContenedora + "\\" + archivoPdf);
                            File archivoRenombrado = new File(carpetaContenedora + "\\" + nuevoNombrePdf + ".pdf");
                            archivo.renameTo(archivoRenombrado.getAbsoluteFile());
                            source = Paths.get(archivoRenombrado.getAbsolutePath()); // origen de los archivos a procesar
                            target = Paths.get(folder.getAbsolutePath()); // destino
                        } else {
                            File archivo = new File(carpetaContenedora + "\\" + archivoPdf);
                            File archivoRenombrado = new File(carpetaContenedora + "\\" + nuevoNombrePdf + "-" + inicioNum + ".pdf");
                            archivo.renameTo(archivoRenombrado.getAbsoluteFile());
                            inicioNum += 1;
                            source = Paths.get(archivoRenombrado.getAbsolutePath()); // origen de los archivos a procesar
                            target = Paths.get(folder.getAbsolutePath()); // destino
                        }
                        jProgressBar.setValue(90);
                        /**
                         * se mueven el archivo principal renombrado
                         */
                        try {
                            Files.move(source, target.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException ex) {
                            Logger.getLogger(InicioJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        jProgressBar.setValue(100);
                    }
                }
                JOptionPane.showMessageDialog(null, "Procesado correctamente", "RenamePDF", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }       
    }//GEN-LAST:event_jButtonProcesarActionPerformed

    private void jTextFieldNuevoNombrePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNuevoNombrePDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNuevoNombrePDFActionPerformed

    private void jTextFieldPDFInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPDFInicialMouseClicked
        // TODO add your handling code here:
        jTextFieldPDFInicial.enable();
    }//GEN-LAST:event_jTextFieldPDFInicialMouseClicked

    private void jTextFieldPDFInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPDFInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPDFInicialActionPerformed

    private void jTextFieldPrefijoDelPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrefijoDelPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrefijoDelPDFActionPerformed

    private void jTextFieldPrefijoDelPDFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrefijoDelPDFKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            jTextFieldPDFInicial.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldPrefijoDelPDFKeyPressed

    private void jTextFieldPDFInicialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPDFInicialKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            jTextFieldNuevoNombrePDF.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldPDFInicialKeyPressed

    private void jTextFieldNuevoNombrePDFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNuevoNombrePDFKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            jSpinnerInicioNum.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTextFieldNuevoNombrePDFKeyPressed

    private void jSpinnerInicioNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinnerInicioNumKeyPressed
        // TODO add your handling code here:
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            jSpinnerCantidad.requestFocusInWindow();
        }
    }//GEN-LAST:event_jSpinnerInicioNumKeyPressed

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
            java.util.logging.Logger.getLogger(InicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonExaminar;
    private javax.swing.JButton jButtonProcesar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLogoCavapy;
    private javax.swing.JLabel jLabelPrefijoDelPDF;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JSpinner jSpinnerInicioNum;
    private javax.swing.JTextField jTextFieldCarpetaContenedora;
    private javax.swing.JTextField jTextFieldNuevoNombrePDF;
    private javax.swing.JTextField jTextFieldPDFInicial;
    private javax.swing.JTextField jTextFieldPrefijoDelPDF;
    // End of variables declaration//GEN-END:variables

    private boolean existsNombrePDF() {
        boolean resp = false;
        for (File carpeta : file.listFiles()) {
            if (carpeta.isDirectory()) {
                if (carpeta.getName().equalsIgnoreCase(jTextFieldNuevoNombrePDF.getText())) {
                    JOptionPane.showMessageDialog(null, "Ya existe el archivo " + carpeta.getName());
                    jTextFieldNuevoNombrePDF.setText("");
                    jTextFieldNuevoNombrePDF.requestFocusInWindow();
                    resp = true;
                }
            }
        }
        return resp;
    }

    private boolean existsPDFInicial() {
        boolean resp = false;
        for (File archivo : file.listFiles()) {
            if (archivo.isFile()) {
                if (!jTextFieldPDFInicial.getText().contains(".pdf")) {
                    jTextFieldPDFInicial.setText(jTextFieldPDFInicial.getText() + ".pdf");
                }
                if (archivo.getName().equals(jTextFieldPDFInicial.getText())) {
                    return true;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "No existe el archivo " + jTextFieldPDFInicial.getText() + " indicado como PDF Inicial");
         jTextFieldPDFInicial.setText("");
         jTextFieldPDFInicial.requestFocusInWindow();
        return resp;
    }

    private boolean existsFile(String archivoPdf) {
        for (File archivo : file.listFiles()) {
            if (archivo.isFile()) {
                if (!archivoPdf.contains(".pdf")) {
                    archivoPdf = archivoPdf + ".pdf";
                }
                if (archivo.getName().equals(archivoPdf)) {
                    return true;
                }
            }
        }
        return false;
    }
}
