/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicInterface;

import Classes.Util;
import Classes.Vperson;
import DataStructures.Graph;
import DataStructures.List;
import DataStructures.Queue;

/**
 *
 * @author Juan
 */
public class InterfaceMain extends javax.swing.JFrame {
    private Util util; 
    private static Graph graph;
    private static String fileRoute; 
    private final List<Vperson> vertice; 

    /**
     * Creates new form Inter2
     */
    public InterfaceMain(Graph graph, String fileRoute) {
        initComponents();
        this.util = new Util();
        this.graph = graph;
        this.fileRoute = fileRoute;
        setLocationRelativeTo(null);
        this.vertice = new List<>(); 
    }
    
    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ActualizarPerson = new javax.swing.JButton();
        ShowPerson = new javax.swing.JButton();
        Recorridos = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        AddPerson = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        print = new javax.swing.JButton();
        addRelation = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ActualizarPerson.setBackground(new java.awt.Color(255, 204, 0));
        ActualizarPerson.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        ActualizarPerson.setForeground(new java.awt.Color(0, 102, 204));
        ActualizarPerson.setText("Actualización del repositorio");
        ActualizarPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarPersonActionPerformed(evt);
            }
        });
        jPanel1.add(ActualizarPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 320, 60));

        ShowPerson.setBackground(new java.awt.Color(255, 204, 0));
        ShowPerson.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        ShowPerson.setForeground(new java.awt.Color(0, 102, 204));
        ShowPerson.setText("Mostrar Grafo");
        jPanel1.add(ShowPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 330, 60));

        Recorridos.setBackground(new java.awt.Color(255, 204, 0));
        Recorridos.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        Recorridos.setForeground(new java.awt.Color(0, 102, 204));
        Recorridos.setText("Mostrar Islas");
        Recorridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecorridosActionPerformed(evt);
            }
        });
        jPanel1.add(Recorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 330, 60));

        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, 40));

        AddPerson.setBackground(new java.awt.Color(255, 204, 0));
        AddPerson.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        AddPerson.setForeground(new java.awt.Color(0, 102, 204));
        AddPerson.setText("Agregar persona");
        AddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPersonActionPerformed(evt);
            }
        });
        jPanel1.add(AddPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 330, 60));

        deleteUser.setBackground(new java.awt.Color(255, 204, 0));
        deleteUser.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        deleteUser.setForeground(new java.awt.Color(0, 102, 204));
        deleteUser.setText("Borrar persona");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });
        jPanel1.add(deleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 330, 60));

        print.setBackground(new java.awt.Color(255, 204, 0));
        print.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        print.setForeground(new java.awt.Color(0, 102, 204));
        print.setText("print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 200, -1));

        addRelation.setBackground(new java.awt.Color(255, 204, 0));
        addRelation.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        addRelation.setForeground(new java.awt.Color(0, 102, 204));
        addRelation.setText("Agregar relacion");
        addRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRelationActionPerformed(evt);
            }
        });
        jPanel1.add(addRelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 340, 60));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 700, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarPersonActionPerformed
        util.WriteTxt(graph.getAllPerson(),fileRoute);

    }//GEN-LAST:event_ActualizarPersonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void AddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPersonActionPerformed
        InputName inter3 = new InputName(graph, fileRoute, 0);
        inter3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddPersonActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        graph.printGraph();
        System.out.println(" ");
    }//GEN-LAST:event_printActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        InputName inter3 = new InputName(graph, fileRoute, 1);
        inter3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteUserActionPerformed

    private void addRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRelationActionPerformed
        InputEdge inter4 = new InputEdge(graph, fileRoute);
        this.dispose();
        inter4.setVisible(true);
    }//GEN-LAST:event_addRelationActionPerformed

    private void RecorridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecorridosActionPerformed
//        ShowBfs_Dfs inter5 = new ShowBfs_Dfs(graph,fileRoute);
//        inter5.setVisible(true);
    }//GEN-LAST:event_RecorridosActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceMain(graph, fileRoute).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarPerson;
    private javax.swing.JButton AddPerson;
    private javax.swing.JButton CloseButton;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Recorridos;
    private javax.swing.JButton ShowPerson;
    private javax.swing.JButton addRelation;
    private javax.swing.JButton deleteUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
