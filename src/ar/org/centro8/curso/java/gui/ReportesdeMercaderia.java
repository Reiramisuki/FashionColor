package ar.org.centro8.curso.java.gui;

import ar.org.centro8.curso.java.connectors.Connector;
import ar.org.centro8.curso.java.entidades.Ropa;
import ar.org.centro8.curso.java.repositories.interfaces.I_RopaRepository;
import ar.org.centro8.curso.java.repositories.jdbc.RopaRepository;
import ar.org.centro8.curso.java.utils.swing.Table;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportesdeMercaderia extends javax.swing.JInternalFrame implements Printable{
    private I_RopaRepository r=new RopaRepository(Connector.getConnection());
    public ReportesdeMercaderia() {
        super(
                "Reportes de mercaderia",        //title
                false,                          //resizable
                true,                           //closable
                false,                          //maximizable
                true                            //iconable
        );
        initComponents();
        cargarElementos();
        lblOk.setVisible(false);
        lbltilde.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        PANELIMPRIMIR = new javax.swing.JPanel();
        tblRopa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblOk = new javax.swing.JLabel();
        lbltilde = new javax.swing.JLabel();
        Imprimir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtBuscarropa = new javax.swing.JTextField();
        btnBuscarRopa = new javax.swing.JButton();
        txtStock = new javax.swing.JTextField();
        btnBuscarStock = new javax.swing.JButton();
        txtTalle = new javax.swing.JTextField();
        btnBuscarTalle = new javax.swing.JButton();
        txtEstacion = new javax.swing.JTextField();
        btnBuscarEstacion = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtBuscargenero = new javax.swing.JTextField();
        btnBuscarGENERO = new javax.swing.JButton();
        btnCheckVisible = new javax.swing.JButton();
        btnCheckOculto = new javax.swing.JButton();
        btnStockCero = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setOpaque(true);

        PANELIMPRIMIR.setBackground(new java.awt.Color(255, 255, 255));

        tblRopa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tblRopa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblRopa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRopa.setFocusable(false);
        tblRopa.setRowSelectionAllowed(false);
        tblRopa.setSelectionBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Control de mercaderia");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Id");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ropa");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Talle");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Color");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Estacion");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Precio");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Genero");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Stock");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel19)
                .addGap(39, 39, 39)
                .addComponent(jLabel20)
                .addGap(52, 52, 52)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblOk.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOk.setText("ok");
        lblOk.setOpaque(true);

        lbltilde.setBackground(new java.awt.Color(255, 255, 255));
        lbltilde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout PANELIMPRIMIRLayout = new javax.swing.GroupLayout(PANELIMPRIMIR);
        PANELIMPRIMIR.setLayout(PANELIMPRIMIRLayout);
        PANELIMPRIMIRLayout.setHorizontalGroup(
            PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELIMPRIMIRLayout.createSequentialGroup()
                                .addComponent(tblRopa, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbltilde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOk, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)))
                    .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PANELIMPRIMIRLayout.setVerticalGroup(
            PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANELIMPRIMIRLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOk))
                .addGroup(PANELIMPRIMIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbltilde, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PANELIMPRIMIRLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tblRopa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Imprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Imprimir.setText("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscarRopa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarRopa.setText("Buscar ropa");
        btnBuscarRopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRopaActionPerformed(evt);
            }
        });

        btnBuscarStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarStock.setText("Buscar por stock");
        btnBuscarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarStockActionPerformed(evt);
            }
        });

        btnBuscarTalle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarTalle.setText("Buscar por talle");
        btnBuscarTalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTalleActionPerformed(evt);
            }
        });

        btnBuscarEstacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarEstacion.setText("Buscar por estacion");
        btnBuscarEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstacionActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscarGENERO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarGENERO.setText("Buscar por genero");
        btnBuscarGENERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarGENEROActionPerformed(evt);
            }
        });

        btnCheckVisible.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCheckVisible.setText("Agregar check de stock");
        btnCheckVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckVisibleActionPerformed(evt);
            }
        });

        btnCheckOculto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCheckOculto.setText("Quitar check de stock");
        btnCheckOculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOcultoActionPerformed(evt);
            }
        });

        btnStockCero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnStockCero.setText("Pedir");
        btnStockCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockCeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PANELIMPRIMIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscarropa)
                    .addComponent(btnBuscarRopa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStock)
                    .addComponent(btnBuscarStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTalle)
                    .addComponent(btnBuscarTalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEstacion)
                    .addComponent(btnBuscarEstacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarGENERO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscargenero)
                    .addComponent(btnCheckVisible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCheckOculto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStockCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStockCero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarropa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarRopa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarTalle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarEstacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscargenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarGENERO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheckVisible, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheckOculto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Imprimir)
                .addGap(9, 9, 9)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PANELIMPRIMIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarRopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRopaActionPerformed
            new Table().cargar(tblRopa, r.getLikeRopaD(txtBuscarropa.getText()));        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarRopaActionPerformed

    private void btnBuscarGENEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarGENEROActionPerformed
         new Table().cargar(tblRopa, r.getLikeRopaGENERO(txtBuscargenero.getText()));
    }//GEN-LAST:event_btnBuscarGENEROActionPerformed

    private void btnBuscarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarStockActionPerformed
         new Table().cargar(tblRopa,r.getLikeStock(Integer.parseInt(txtStock.getText())));
    }//GEN-LAST:event_btnBuscarStockActionPerformed

    private void btnBuscarTalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTalleActionPerformed
       new Table().cargar(tblRopa,r.getLiketalle(txtTalle.getText()));
    }//GEN-LAST:event_btnBuscarTalleActionPerformed

    private void btnBuscarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstacionActionPerformed
     new Table().cargar(tblRopa,r.getLikeESTACION(txtEstacion.getText()));
    }//GEN-LAST:event_btnBuscarEstacionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      // Evento Salir
       this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
       try {
//             Open printer dialog and pass JPanel to print
                PrinterJob job =PrinterJob.getPrinterJob();
                job.setPrintable(this);
                if (job.printDialog()) job.print();
        } catch (PrinterException ex) {
            Logger.getLogger(ReportesdeMercaderia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImprimirActionPerformed

    private void btnCheckVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckVisibleActionPerformed
        lblOk.setVisible(true);
        lbltilde.setVisible(true);
    }//GEN-LAST:event_btnCheckVisibleActionPerformed

    private void btnCheckOcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOcultoActionPerformed
        lblOk.setVisible(false);
        lbltilde.setVisible(false);
    }//GEN-LAST:event_btnCheckOcultoActionPerformed

    private void btnStockCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockCeroActionPerformed
       new Table<Ropa>().cargar(tblRopa, r.getStockCero());
    }//GEN-LAST:event_btnStockCeroActionPerformed
private void cargarElementos() { 
    new Table<Ropa>().cargar(tblRopa,r.getAll());}
 private void limpiar(){
     
    txtEstacion.setText("");
    txtTalle.setText("");
    txtStock.setText("");
    txtBuscargenero.setText("");
    txtBuscarropa.setText("");
    new Table<Ropa>().cargar(tblRopa,r.getAll());
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imprimir;
    private javax.swing.JPanel PANELIMPRIMIR;
    private javax.swing.JButton btnBuscarEstacion;
    private javax.swing.JButton btnBuscarGENERO;
    private javax.swing.JButton btnBuscarRopa;
    private javax.swing.JButton btnBuscarStock;
    private javax.swing.JButton btnBuscarTalle;
    private javax.swing.JButton btnCheckOculto;
    private javax.swing.JButton btnCheckVisible;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnStockCero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOk;
    private javax.swing.JLabel lbltilde;
    private javax.swing.JTable tblRopa;
    private javax.swing.JTextField txtBuscargenero;
    private javax.swing.JTextField txtBuscarropa;
    private javax.swing.JTextField txtEstacion;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTalle;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
   if (pageIndex > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        PANELIMPRIMIR.printAll(graphics);
        return PAGE_EXISTS;
    }
}
