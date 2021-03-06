/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darke.tpfinalagenda.ui.ventanas;

import com.darke.tpfinalagenda.logicaNegocio.controladores.PersonaControlador;
import com.darke.tpfinalagenda.logicaNegocio.objetos.Agenda;
import com.darke.tpfinalagenda.logicaNegocio.objetos.Persona;
import java.util.ArrayList;

/**
 *
 * @author Darkeruz
 */
public class DatosInvitadosFormulario extends javax.swing.JFrame {
    int id_agenda;
    int contadorInvitado=0;
    Agenda agenda = new Agenda();

    /**
     * Creates new form DatosInvitadosFormulario
     */
    public DatosInvitadosFormulario() {
        initComponents();
    }
    
    public DatosInvitadosFormulario(int id_agenda){
        this.id_agenda = id_agenda;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jlApellidoInvitado = new javax.swing.JLabel();
        jlNombreInvitado = new javax.swing.JLabel();
        jbAgregarInvitados = new javax.swing.JButton();
        jtApellidoInvitado = new javax.swing.JTextField();
        jtNombreInvitado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jlInvitadoAgregados = new javax.swing.JLabel();
        jlContadorInvitado = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Invitados"));

        jlApellidoInvitado.setText("Apellido:");

        jlNombreInvitado.setText("Nombre:");

        jbAgregarInvitados.setText("Agregar");
        jbAgregarInvitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarInvitadosActionPerformed(evt);
            }
        });

        jlInvitadoAgregados.setText("Agregados:");

        jlContadorInvitado.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jlApellidoInvitado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtApellidoInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jlNombreInvitado)
                            .addGap(19, 19, 19)
                            .addComponent(jtNombreInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbAgregarInvitados)
                        .addGap(18, 18, 18)
                        .addComponent(jlInvitadoAgregados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlContadorInvitado)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellidoInvitado)
                    .addComponent(jtApellidoInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreInvitado)
                    .addComponent(jtNombreInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregarInvitados)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlInvitadoAgregados)
                        .addComponent(jlContadorInvitado)))
                .addContainerGap())
        );

        jlTitulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jlTitulo.setText("Modifique apellido y nombre");

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlTitulo)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbModificar)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbModificar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarInvitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarInvitadosActionPerformed
        // TODO add your handling code here:
        String apellidoInvitado, nombreInvitado;
        apellidoInvitado = jtApellidoInvitado.getText();
        nombreInvitado = jtNombreInvitado.getText();
        Persona invitado = new Persona(apellidoInvitado, nombreInvitado);
        invitado.setId_agenda(id_agenda);
        agenda.addInvitado(invitado);
        ++contadorInvitado;
        String contadorInvitadoString = String.valueOf(contadorInvitado);
        jlContadorInvitado.setText(contadorInvitadoString);
        jtApellidoInvitado.setText("");
        jtNombreInvitado.setText("");

    }//GEN-LAST:event_jbAgregarInvitadosActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        PersonaControlador invitadoControlador = new PersonaControlador();
        ArrayList<Persona> listadoInvitadoNuevos;
        listadoInvitadoNuevos = agenda.getListaInvitados();
        invitadoControlador.eliminarTodo(id_agenda);

        for(Persona invitados : listadoInvitadoNuevos){
            invitadoControlador.crear(invitados);
        }

    }//GEN-LAST:event_jbModificarActionPerformed

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
            java.util.logging.Logger.getLogger(DatosInvitadosFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosInvitadosFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosInvitadosFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosInvitadosFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosInvitadosFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbAgregarInvitados;
    private javax.swing.JButton jbModificar;
    private javax.swing.JLabel jlApellidoInvitado;
    private javax.swing.JLabel jlContadorInvitado;
    private javax.swing.JLabel jlInvitadoAgregados;
    private javax.swing.JLabel jlNombreInvitado;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtApellidoInvitado;
    private javax.swing.JTextField jtNombreInvitado;
    // End of variables declaration//GEN-END:variables
}
