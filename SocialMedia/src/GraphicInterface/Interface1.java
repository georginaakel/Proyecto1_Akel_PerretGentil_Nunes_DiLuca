/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicInterface;

import Classes.Edge;
import Classes.Util;
import Classes.Vperson;
import DataStructures.Graph;
import DataStructures.List;

/**
 *
 * @author Juan
 */
public class Interface1 extends javax.swing.JFrame {
    private String fileRoute; 
    private Graph graph; 
    
    /**
     * Creates new form Interface1
     */
    public Interface1() {
        setVisible(true);
        initComponents();
        this.graph = new Graph();
    }
    
    public void getFileRoute(){       
        Util u = new Util();  
        fileRoute = u.ObtenerRutaTXT();
        if(fileRoute.endsWith("txt")){
            System.out.println(fileRoute);
        }
        
    }
    
    public void loadTXT(){       
        Util u = new Util();
        List newAllPerson = u.read_users(fileRoute);       
        List allEdge = u.read_relations(newAllPerson, fileRoute);
              
        for(int x = 0; x < allEdge.len(); x++){
            Edge edge = (Edge) allEdge.get(x);
            for(int y = 0; y < newAllPerson.len(); y++){
                Vperson person = (Vperson) newAllPerson.get(y);
                if(edge.getStart() == person.getVnum()){
                    List adyList = person.getAdyList();
                    adyList.append(edge);
                    person.setAdyList(adyList);
                    newAllPerson.replace(y, person);
                }
            }
        }              
        graph.setAllPerson(newAllPerson);       
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
        loadFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadFile.setText("Cargar Archivo");
        loadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(loadFile)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(loadFile)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileActionPerformed
        getFileRoute();
        loadTXT();
    }//GEN-LAST:event_loadFileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loadFile;
    // End of variables declaration//GEN-END:variables
}
