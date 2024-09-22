package GUI;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;

class Proceso {
    String nombre;
    int bitRef;
    
    public Proceso(String nombre, int bitRef) {
        this.nombre = nombre;
        this.bitRef = bitRef;
    }
}

public class Fifo extends javax.swing.JFrame {
    
    List<Proceso> procesos = new ArrayList<>(); // Memoria con los procesos
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Fifo(int tamanio) {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo.addColumn("DIRECCIÓN");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("Bit Ref");
        rellenarProcesos(tamanio);
        refrescarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcesos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CLOCK");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        tblProcesos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProcesos.setRowHeight(30);
        tblProcesos.setShowHorizontalLines(true);
        tblProcesos.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblProcesos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo proceso");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setToolTipText("nombre");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Iniciar proceso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel3.setText("FIFO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("MEMORIA");

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem1.setText("Select Algorithm");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("btnIniciar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombreProceso = txtNombre.getText();
        actualizarListaProcesos(nombreProceso);
        refrescarTabla();
        txtNombre.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false); //Instanciar el Formulario.
        MiVentana mv = new MiVentana(); //Instanciar el Formulario.
        mv.setVisible(true); //Volver visible la ventana.
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void refrescarTabla() {
        int tamanio = procesos.size();
        
        while (modelo.getRowCount()>0) {
            modelo.removeRow(0);
        }
        
        for (int i = 0; i < tamanio; i++) {
            Object [] o = new Object[5];
            o[0] = i+1;
            o[1] = procesos.get(i).nombre;
            o[2] = procesos.get(i).bitRef;
            modelo.addRow(o);
        }
        tblProcesos.setModel(modelo);
    }
    
    private void rellenarProcesos (int tamanio) {
        for (int i = 0; i < tamanio; i++) {
            procesos.add(i, new Proceso("<empty>", 0));
        }
    }
    
    //Actualizar lista de procesos y referencias
    public void actualizarListaProcesos (String nombreProceso) {
        for (Proceso proceso: procesos) { // Revisar si la memoria está vacía o el proceso ya está referenciado
            if (proceso.nombre.compareTo("<empty>") == 0) { // Si el espacio actual está vacío
                proceso.nombre = nombreProceso;
                proceso.bitRef = 1;
                return;
            } else if (proceso.nombre.compareTo(nombreProceso) == 0) { // Si el proceso ya está referenciado
                proceso.bitRef = 1;
                return;
            }
        }
        // Agregar proceso en caso que la memoria esté llena
        while (true) {
            for (Proceso proceso: procesos) {
                if (proceso.bitRef == 0) { // Si el bit de referencia es 0 se reemplaza por el nuevo proceso
                    proceso.nombre = nombreProceso;
                    proceso.bitRef = 1;
                    return;
                } else { // Si el bit de referencia es 1 se cambia a 0
                    proceso.bitRef = 0;
                }
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProcesos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
