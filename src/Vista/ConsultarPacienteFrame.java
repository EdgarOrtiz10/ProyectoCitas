/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elfos
 */
public class ConsultarPacienteFrame extends javax.swing.JInternalFrame {
    
    public Controlador.GestorPacienteController gestorPacienteController;
    private DefaultTableModel tabla;
    /**
     * Creates new form ConsPacienteFrame
     */
    public ConsPacienteFrame() {
        initComponents();
        gestorPacienteController = new Controlador.GestorPacienteController(this);
        String [] titulosTabla = {
            "identificacion",
            "nombre1",
            "nombre2",
            "apellido1",
            "apellido2",
            "fechaNacimiento",
            "sexo"
        };
        tabla = new DefaultTableModel(null,titulosTabla);
        tableData.setModel(tabla);
        btn_buscar.addActionListener(gestorPacienteController);
        btn_cerrar.addActionListener(gestorPacienteController);
        
    }
    
    public DefaultTableModel getTableModel(){
        return tabla;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        valorABuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        btn_cerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rdbIdentificacion = new javax.swing.JRadioButton();
        rdbNombre = new javax.swing.JRadioButton();
        rdbApellido = new javax.swing.JRadioButton();

        setResizable(true);
        setTitle("Consultar paciente");

        jLabel2.setText("Buscar:");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Identificacion", "Nombres", "Apellidos", "Fecha de nacimiento", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(tableData);

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbIdentificacion);
        rdbIdentificacion.setSelected(true);
        rdbIdentificacion.setText("Identificación");
        rdbIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbIdentificacionActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbNombre);
        rdbNombre.setText("Nombre");

        buttonGroup1.add(rdbApellido);
        rdbApellido.setText("Apellido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbIdentificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbApellido)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbIdentificacion)
                    .addComponent(rdbNombre)
                    .addComponent(rdbApellido))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cerrar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(valorABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_buscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btn_buscar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cerrar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbIdentificacionActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_cerrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rdbApellido;
    public javax.swing.JRadioButton rdbIdentificacion;
    public javax.swing.JRadioButton rdbNombre;
    public javax.swing.JTable tableData;
    public javax.swing.JTextField valorABuscar;
    // End of variables declaration//GEN-END:variables
}