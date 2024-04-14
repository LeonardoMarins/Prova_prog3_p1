/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.p1.frontend;

import com.mycompany.p1.backend.Medico;
import com.mycompany.p1.backend.MenuBack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marin
 */
public class ListarMedicos extends javax.swing.JFrame {

    /**
     * Creates new form ListarMedicos
     */
    private ArrayList<Medico> listaMedicos;
    private MenuBack menuB;
    
    public ListarMedicos(MenuBack menu, ArrayList<Medico> lista) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.listaMedicos = lista;
        this.menuB = menu;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int linha = 0; // Inicializa a linha
        
        for (Medico medico : listaMedicos) {
     
        model.addRow(new Object[]{ // Adiciona uma nova linha na tabela
            medico.getNomePessoal(),
            medico.getDataNascimento(),
            medico.getEndereco().getRua(),
            medico.getContato().getTelefone(),
            medico.getGenero().M,
            medico.getNumeroCRM(),
            medico.getAreasEspecialidade(),
            medico.isCirurgiao(),
            medico.getSetor(),
            medico.getChSemanal(),
            "Edit", 
            "Delete" 
            
        });
        linha++; // Incrementa a linha
    }
        jTable1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int column = jTable1.getColumnModel().getColumnIndexAtX(e.getX());
            int row = e.getY() / jTable1.getRowHeight();

        if (row < jTable1.getRowCount() && row >= 0 && column < jTable1.getColumnCount() && column >= 0) {
            if (row < jTable1.getRowCount() && row >= 0 && column < jTable1.getColumnCount() && column >= 0) {
                Object idValue = jTable1.getValueAt(row, 0);
                int id = Integer.parseInt(String.valueOf(idValue));
                System.out.println("ID do paciente na linha " + row + ": " + id);
                
            Object value = jTable1.getValueAt(row, column);
            if (value instanceof String && ((String) value).equals("Edit")) {
                new EditMedico(menuB, row).setVisible(true);
                setVisible(false);
                
                System.out.println("Editar paciente na linha: " + row);
            } else if (value instanceof String && ((String) value).equals("Delete")) {
                menuB.excluirMedico(row);
                setVisible(false);
                System.out.println("Excluir paciente na linha: " + row);
            }
        }
    }
}});
         jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String campo = campoPesquisar.getText();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                for(int i = 0; i < menuB.listaDeMedicos.size(); i++) {
                    if(menuB.listaDeMedicos.get(i).getNomePessoal().toLowerCase().contains(campo)) {
                       model.addRow(new Object[]{ // Adiciona uma nova linha na tabela
                       menuB.listaDeMedicos.get(i).getNomePessoal(),
                        menuB.listaDeMedicos.get(i).getDataNascimento(),
                        menuB.listaDeMedicos.get(i).getEndereco().getRua(),
                        menuB.listaDeMedicos.get(i).getContato().getTelefone(),
                        menuB.listaDeMedicos.get(i).getGenero().M,
                        menuB.listaDeMedicos.get(i).getNumeroCRM(),
                        menuB.listaDeMedicos.get(i).getAreasEspecialidade(),
                        menuB.listaDeMedicos.get(i).isCirurgiao(),
                        menuB.listaDeMedicos.get(i).getSetor(),
                        menuB.listaDeMedicos.get(i).getChSemanal(),
                       "Edit", 
                       "Delete"
            
                        });  
                    }else if(campo.isEmpty()) {
                        model.addRow(new Object[]{ 
                        menuB.listaDeMedicos.get(i).getNomePessoal(),
                        menuB.listaDeMedicos.get(i).getDataNascimento(),
                        menuB.listaDeMedicos.get(i).getEndereco().getRua(),
                        menuB.listaDeMedicos.get(i).getContato().getTelefone(),
                        menuB.listaDeMedicos.get(i).getGenero().M,
                        menuB.listaDeMedicos.get(i).getNumeroCRM(),
                        menuB.listaDeMedicos.get(i).getAreasEspecialidade(),
                        menuB.listaDeMedicos.get(i).isCirurgiao(),
                        menuB.listaDeMedicos.get(i).getSetor(),
                        menuB.listaDeMedicos.get(i).getChSemanal(),
                        "Edit", 
                        "Delete" 
                        });  
                    }
                }
            }
            
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        campoPesquisar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "DATA NASCIMENTO", "ENDEREÇO", "CONTATO",
                "GENERO", "NÚMERO CRM", "AREA ESPECIFICA", "CIRURGIÃO",
                "SETOR", "CHSEMANAL","EDITAR", "DELETAR"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("PESQUISAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ArrayList<Medico> lista = new ArrayList();
        MenuBack menu = new MenuBack();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarMedicos(menu,lista).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
