/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GraphicInterface;


import Classes.Util;
import Classes.Vperson;
import DataStructures.Grafo;
import DataStructures.Node;
import Classes.Edge;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

/**
 * Esta interfaz contiene el menu principal que permite navegar en el programa
 * @authors Georgina Akel, Orveo Di Luca, Juan Nunes, Arianne Perret Gentil
 * @version 03/06/2023
 */
public class InterfaceMain extends javax.swing.JFrame {
    private Util util; 
    private static Grafo graph;
    private static String fileRoute;

    /**
     * Creates new form InterfaceMain
     * @param graph
     * @param fileRoute
     */
    public InterfaceMain(Grafo graph, String fileRoute) {
        initComponents();
        this.util = new Util();
        this.graph = graph;
        this.fileRoute = fileRoute;
        setLocationRelativeTo(null);
    }
    
    /**
     * Esta función obtiene el grafo
     * @return el grafo 
     */
    public Grafo getGraph() {
        return graph;
    }

    /**
     * Esta función cambia el grafo
     * @param graph 
     */
    public void setGraph(Grafo graph) {
        this.graph = graph;
    }
    
    /**
     * función que crea y muestra el grafo mediante la libreria de GraphStream
     */
    public void CrearGraphView(){
        Util u = new Util();
        System.setProperty("org.graphstream.ui", "swing");
        Graph grafoview = new SingleGraph("Tutorial 1");
        grafoview.setAttribute("ui.stylesheet", " graph {fill-color: #EEE; padding: 50px; } node {fill-color: white; size: 20px, 20px; shape: circle; stroke-mode: plain; stroke-color: white; stroke-width: 2px; text-alignment: center; text-color: red; text-style: bold; text-size: 12;} edge {stroke-mode: plain; stroke-color: black; size: 1px; arrow-shape: arrow; arrow-size: 200000; text-alignment: above; text-color: blue; text-style: bold; text-size: 13; text-padding: 20;}");
        Node<Vperson> aux = graph.getAllPerson().getHead();
        for (int x = 0; x < graph.getAllPerson().getSize(); x++){
            grafoview.addNode(Integer.toString(aux.getData().getVnum()));
            grafoview.getNode(Integer.toString(aux.getData().getVnum())).setAttribute("ui.label", aux.getData().getName());          
            aux = aux.getNext();
        }
        
        aux = graph.getAllPerson().getHead();
        
        
        for (int x = 0; x < graph.getAllPerson().getSize(); x++){
            Node<Edge> aux2 = aux.getData().getAdyList().getHead();
            for (int y = 0; y < aux.getData().getAdyList().getSize(); y++){
                int num = u.generateID(graph);
                boolean run = true;
                if(aux2.getData().isRead()){
                    while(run){
                        try{
                            grafoview.addEdge(Integer.toString(num) , Integer.toString(aux2.getData().getStart()) , Integer.toString(aux2.getData().getEnd()));
                            grafoview.getEdge(Integer.toString(num)).setAttribute("ui.label", aux2.getData().getWeight());
                            aux2 = aux2.getNext();
                            run = false;
                        }
                        catch(Exception e){
                            num = u.generateID(graph);
                        }                   
                    }
                }
            }
            aux = aux.getNext();
        }
    
        Viewer viewer = grafoview.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
        
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
        ShowGraph = new javax.swing.JButton();
        BFSyDFS = new javax.swing.JButton();
        AddPerson = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        addRelation = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        deleteEdge = new javax.swing.JButton();
        showBridges = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 66, -1, -1));

        ActualizarPerson.setBackground(new java.awt.Color(255, 204, 0));
        ActualizarPerson.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        ActualizarPerson.setForeground(new java.awt.Color(0, 0, 204));
        ActualizarPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/actualizar.png"))); // NOI18N
        ActualizarPerson.setText("Actualizar repositorio");
        ActualizarPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarPersonActionPerformed(evt);
            }
        });
        getContentPane().add(ActualizarPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        ShowGraph.setBackground(new java.awt.Color(255, 204, 0));
        ShowGraph.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        ShowGraph.setForeground(new java.awt.Color(0, 0, 204));
        ShowGraph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grafo.png"))); // NOI18N
        ShowGraph.setText("Mostrar Grafo");
        ShowGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowGraphActionPerformed(evt);
            }
        });
        getContentPane().add(ShowGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 280, -1));

        BFSyDFS.setBackground(new java.awt.Color(255, 204, 0));
        BFSyDFS.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        BFSyDFS.setForeground(new java.awt.Color(0, 0, 204));
        BFSyDFS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/recorridos.png"))); // NOI18N
        BFSyDFS.setText("Recorridos");
        BFSyDFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFSyDFSActionPerformed(evt);
            }
        });
        getContentPane().add(BFSyDFS, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 280, -1));

        AddPerson.setBackground(new java.awt.Color(255, 204, 0));
        AddPerson.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        AddPerson.setForeground(new java.awt.Color(0, 0, 204));
        AddPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/8.png"))); // NOI18N
        AddPerson.setText("Agregar persona");
        AddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPersonActionPerformed(evt);
            }
        });
        getContentPane().add(AddPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 280, -1));

        deleteUser.setBackground(new java.awt.Color(255, 204, 0));
        deleteUser.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        deleteUser.setForeground(new java.awt.Color(0, 0, 204));
        deleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/9.png"))); // NOI18N
        deleteUser.setText("Borrar persona");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });
        getContentPane().add(deleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 280, -1));

        addRelation.setBackground(new java.awt.Color(255, 204, 0));
        addRelation.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        addRelation.setForeground(new java.awt.Color(0, 0, 204));
        addRelation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/islas.png"))); // NOI18N
        addRelation.setText("Agregar relacion");
        addRelation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRelationActionPerformed(evt);
            }
        });
        getContentPane().add(addRelation, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 280, -1));

        Back.setBackground(new java.awt.Color(255, 204, 0));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Regresar.png"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 60, -1));

        deleteEdge.setBackground(new java.awt.Color(255, 204, 0));
        deleteEdge.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        deleteEdge.setForeground(new java.awt.Color(0, 0, 204));
        deleteEdge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/10.png"))); // NOI18N
        deleteEdge.setText("Borrar relacion");
        deleteEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEdgeActionPerformed(evt);
            }
        });
        getContentPane().add(deleteEdge, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 280, -1));

        showBridges.setBackground(new java.awt.Color(255, 204, 0));
        showBridges.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        showBridges.setForeground(new java.awt.Color(0, 0, 204));
        showBridges.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/11.png"))); // NOI18N
        showBridges.setText("Enseñar puentes");
        showBridges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBridgesActionPerformed(evt);
            }
        });
        getContentPane().add(showBridges, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 280, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Llama a la función de cargar archivo
     * @param evt 
     */
    private void ActualizarPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarPersonActionPerformed
        util.WriteTxt(graph.getAllPerson(),fileRoute);
    }//GEN-LAST:event_ActualizarPersonActionPerformed
    /**
     * Conduce a la interfaz de InputName para agregar un usuario
     * @param evt 
     */
    private void AddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPersonActionPerformed
        InputName inter3 = new InputName(graph, fileRoute, 0);
        inter3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddPersonActionPerformed
    /**
     * Conduce a la interfaz de InputName para eliminar un usuario
     * @param evt 
     */
    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        InputName inter3 = new InputName(graph, fileRoute, 1);
        inter3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteUserActionPerformed
    /**
     * Conduce a la interfaz de InputEdge para agregar una relacion
     * @param evt 
     */
    private void addRelationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRelationActionPerformed
        InputEdge inter4 = new InputEdge(graph, fileRoute);
        this.dispose();
        inter4.setVisible(true);
    }//GEN-LAST:event_addRelationActionPerformed
    /**
     * Conduce a la interfaz de LoadFile
     * @param evt 
     */
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        LoadFile in1 = new LoadFile();
        in1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed
    /**
     * Conduce a la interfaz de los recorridos BFS y DFS
     * @param evt 
     */
    private void BFSyDFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFSyDFSActionPerformed
        ShowBfs_Dfs inter6 = new ShowBfs_Dfs(graph, fileRoute);
        inter6.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BFSyDFSActionPerformed
    /**
     * Conduce a la interfaz a mostrar el grafo
     * @param evt 
     */
    private void ShowGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowGraphActionPerformed
        // TODO add your handling code here:
        try {
            CrearGraphView();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL IMPRIMIR EL GRAFO. \nTipo de error: " + e);
        }
        
        
    }//GEN-LAST:event_ShowGraphActionPerformed
    /**
     * Conduce a la interfaz de eliminar una relacion
     * @param evt 
     */
    private void deleteEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEdgeActionPerformed
        InputDeleteEdge inter7 = new InputDeleteEdge(graph, fileRoute);
        inter7.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteEdgeActionPerformed
    /**
     * Conduce a la interfaz a mostrar los puentes del grafo
     * @param evt 
     */
    private void showBridgesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBridgesActionPerformed
        String str = graph.countBridges();
        JTextArea jta = new JTextArea(15, 30);
        jta.setText(str);
        jta.setEditable(false);
        JScrollPane jsp = new JScrollPane(jta);
        JOptionPane.showMessageDialog(null, jsp, "puentes", 1);
  
    }//GEN-LAST:event_showBridgesActionPerformed

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
    private javax.swing.JButton BFSyDFS;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton ShowGraph;
    private javax.swing.JButton addRelation;
    private javax.swing.JButton deleteEdge;
    private javax.swing.JButton deleteUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton showBridges;
    // End of variables declaration//GEN-END:variables

}
