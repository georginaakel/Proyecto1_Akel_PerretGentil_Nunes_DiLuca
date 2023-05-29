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
        BFS = new javax.swing.JButton();
        DFS = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        AddPerson = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        print = new javax.swing.JButton();
        addRelation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ActualizarPerson.setText("Actualización del repositorio");
        ActualizarPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarPersonActionPerformed(evt);
            }
        });
        jPanel1.add(ActualizarPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        ShowPerson.setText("Mostrar Grafo");
        jPanel1.add(ShowPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, -1));

        BFS.setText("BFS");
        BFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFSActionPerformed(evt);
            }
        });
        jPanel1.add(BFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, -1));

        DFS.setText("DFS");
        DFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DFSActionPerformed(evt);
            }
        });
        jPanel1.add(DFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, -1));

        Back.setText("Regresar");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        AddPerson.setText("Agregar persona");
        AddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPersonActionPerformed(evt);
            }
        });
        jPanel1.add(AddPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        deleteUser.setText("Borrar persona");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });
        jPanel1.add(deleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        print.setText("print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        addRelation.setText("Agregar relacion");
        addRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRelationActionPerformed(evt);
            }
        });
        jPanel1.add(addRelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarPersonActionPerformed
        util.WriteTxt(graph.getAllPerson(),fileRoute);

    }//GEN-LAST:event_ActualizarPersonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        LoadFile in1 = new LoadFile();
        in1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

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

    private void BFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFSActionPerformed
//        ShowBfs_Dfs inter5 = new ShowBfs_Dfs(graph,fileRoute);
//        inter5.setVisible(true);
    }//GEN-LAST:event_BFSActionPerformed

    private void DFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DFSActionPerformed
//        ShowBfs_Dfs inter5 = new ShowBfs_Dfs(graph,fileRoute);
//        inter5.setVisible(true);
    }//GEN-LAST:event_DFSActionPerformed

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
    private javax.swing.JButton BFS;
    private javax.swing.JButton Back;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton DFS;
    private javax.swing.JButton ShowPerson;
    private javax.swing.JButton addRelation;
    private javax.swing.JButton deleteUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
