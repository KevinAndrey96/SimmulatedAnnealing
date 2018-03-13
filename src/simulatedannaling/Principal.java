/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulatedannaling;

import java.io.FileOutputStream;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import static java.lang.Math.*;
import org.jfree.chart.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.*;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.*;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author MANUEL
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        capa = new javax.swing.JLayeredPane();
        lineas = new javax.swing.JPanel();
        txttemperatura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtxniicial = new javax.swing.JTextField();
        btnsimullated1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(datos);

        capa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout lineasLayout = new javax.swing.GroupLayout(lineas);
        lineas.setLayout(lineasLayout);
        lineasLayout.setHorizontalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        lineasLayout.setVerticalGroup(
            lineasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout capaLayout = new javax.swing.GroupLayout(capa);
        capa.setLayout(capaLayout);
        capaLayout.setHorizontalGroup(
            capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        capaLayout.setVerticalGroup(
            capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lineas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        capa.setLayer(lineas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("Ingrese Temperatura");

        jLabel8.setText("Tabulacion de datos");

        jLabel3.setText("ingrese X inicial");

        btnsimullated1.setText("Simulatted Annaling");
        btnsimullated1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimullated1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txttemperatura))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtxniicial, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(capa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnsimullated1)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtxniicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(btnsimullated1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(capa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimullated1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimullated1ActionPerformed
         double Temperatura=Double.parseDouble(txttemperatura.getText());
        double  x1inicial=Double.parseDouble(txtxniicial.getText());
         double  x2inicial=Double.parseDouble(txtxniicial.getText());
               double x1nuevo =0;double x2nuevo =0;
               double aleatorio1;double aleatorio2;
               HSSFWorkbook libro = new HSSFWorkbook();
        DefaultTableModel modelo=new DefaultTableModel();
        HSSFSheet hoja = libro.createSheet();
        this.datos.setModel(modelo); 
        modelo.addColumn("X1actual");        
        modelo.addColumn("X2actual)");
        modelo.addColumn("F(Xactual)");
        for(int i=1;i<=3000;i++){
             Object[] fila = new Object[3];
             HSSFRow row = hoja.createRow(i);
        for(int j=1;j<=100;j++){
            aleatorio1=Math.random();
            aleatorio2=Math.random();
            if(aleatorio1<=0.5)
        x1nuevo=x1inicial+0.1;
        else
        x1nuevo=x1inicial-0.1;
            if(aleatorio2<=0.5)
        x2nuevo=x2inicial+0.1;
        else
        x2nuevo=x2inicial-0.1;
            
            if(x2nuevo<0)
        x2nuevo=0;
        if(x2nuevo>=10)
        x1nuevo=10;
        if(x1nuevo<0)
        x1nuevo=0; 
        if(r1(x1nuevo,x2nuevo)<=60){
         
        
        if(r2(x1nuevo,x2nuevo)<=44){
        
               if(r3(x1nuevo,x2nuevo)<=18){
         
        double delta =funcion(x1nuevo,x2nuevo)-funcion(x1inicial,x2inicial);   
             if (delta>=0){
            x1inicial=x1nuevo;
             x2inicial=x2nuevo;}
        else {
        double alet1=Math.random();
        double alet2=Math.random();
                if(alet1<Math.exp(delta/Temperatura))
            x1inicial=x1nuevo;  
                 if(alet2<Math.exp(delta/Temperatura))
            x2inicial=x2nuevo;                                      
             }
        }
        }}}
        Temperatura=Temperatura*0.99;
        fila[0]=x1inicial;
        fila[1]=x2inicial;  
        fila[2]=funcion(x1inicial,x2inicial);
        modelo.addRow(fila);
        System.out.println("||"+x1inicial+"||"+fila[1]+"||"+fila[2]+"||"); 
          
        
      
        HSSFCell celdauno = row.createCell((short) 0);
        celdauno.setCellValue(x1inicial);
        HSSFCell celdauno1 = row.createCell((short)1);
        celdauno1.setCellValue(x2inicial);
        HSSFCell celdauno2 = row.createCell((short)2);
        celdauno2.setCellValue(funcion(x1inicial,x2inicial));
      
                    }   
         try{
            String ex = "";
            
            do{
                ex = JOptionPane.showInputDialog(null, "Nombre del Excel",JOptionPane.QUESTION_MESSAGE);
                if(ex == null){
                    JOptionPane.showMessageDialog(null, "Te falto introducir el nombre del Excel", "Error",2);
                }
            }while(ex == null);
            FileOutputStream archivo = new FileOutputStream("F:/"+ ex +".xls");
            libro.write(archivo);
            archivo.close();
            
            JOptionPane.showMessageDialog(null, "Se ha creado el Excel con exito!!!", "Aviso",1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo crear el Excel :(", "Error",2);
        }
            
    }//GEN-LAST:event_btnsimullated1ActionPerformed
public double funcion (double x1,double x2){
    return (2*x1)+x2;
}
public double r1 (double x1,double x2){
    return (2*x1)+(5*x2);
}
public double r2 (double x1,double x2){
    return (3*x1)+x2;
}
public double r3 (double x1,double x2){
    return x1+x2;
}
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsimullated1;
    private javax.swing.JLayeredPane capa;
    private javax.swing.JTable datos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lineas;
    private javax.swing.JTextField txttemperatura;
    private javax.swing.JTextField txtxniicial;
    // End of variables declaration//GEN-END:variables
}
