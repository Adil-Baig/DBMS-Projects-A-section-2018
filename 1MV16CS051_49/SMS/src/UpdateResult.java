
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class UpdateResult extends javax.swing.JFrame {
    
    static UpdateResult frame;

    public UpdateResult() throws InterruptedException {
        initComponents();

        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);

        jButton1.setVisible(false);

        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox4.setVisible(false);

        String[] tournaments = UpdateResultsDao.getTournaments();
        if (tournaments.length == 0) {
            JOptionPane.showMessageDialog(UpdateResult.this, "All tournament results updated", "", JOptionPane.INFORMATION_MESSAGE);
            jButton1.setText("Back");
            jButton1.setVisible(true);
            jComboBox1.setVisible(false);
            jLabel2.setVisible(false);
            //frame.dispose()
            //Results.main(new String[]{});
        }
        DefaultComboBoxModel model = new DefaultComboBoxModel(tournaments);
        jComboBox1.setModel(model);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
             
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        jLabel1.setForeground(Color.GRAY);

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 12));
        jLabel5.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        jButton1 = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Update Tournament Results");

        //22. jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Select Tournament");

        jLabel3.setText("First");

        jLabel4.setText("Second");

        jLabel5.setText("Third");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (InterruptedException ex) {
                    Logger.getLogger(UpdateResult.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(121, 121, 121)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel3))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jButton1))))
                                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(jButton1)
                                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }//                       

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        
        jButton1.setVisible(true);

        jComboBox2.setVisible(true);
        jComboBox3.setVisible(true);
        jComboBox4.setVisible(true);
        
        String tid = jComboBox1.getSelectedItem().toString().split(":")[0];
        String[] students = UpdateResultsDao.getStudents(tid);
        
        DefaultComboBoxModel model1 = new DefaultComboBoxModel(students);
        jComboBox2.setModel(model1);

        DefaultComboBoxModel model2 = new DefaultComboBoxModel(students);
        jComboBox3.setModel(model2);

        DefaultComboBoxModel model3 = new DefaultComboBoxModel(students);
        jComboBox4.setModel(model3);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws InterruptedException {

        if (jButton1.getText().equals("Back")) {
            frame.dispose();
            EmployeeLoginSuccess.main(new String[]{});
            frame.setVisible(false);
        } else {

            if (UpdateResultsDao.updateTournament(jComboBox1.getSelectedItem().toString().split(":")[0], jComboBox2.getSelectedItem().toString(), jComboBox3.getSelectedItem().toString(), jComboBox4.getSelectedItem().toString()) != 0) {
                jLabel3.setVisible(false);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false);

                jButton1.setVisible(false);

                jComboBox2.setVisible(false);
                jComboBox3.setVisible(false);
                jComboBox4.setVisible(false);
                JOptionPane.showMessageDialog(UpdateResult.this, "Tournament result updated successfully", "", JOptionPane.INFORMATION_MESSAGE);
                String[] tournaments = UpdateResultsDao.getTournaments();
                DefaultComboBoxModel model = new DefaultComboBoxModel(tournaments);
                jComboBox1.setModel(model);
                if (tournaments.length == 0) {
                    JOptionPane.showMessageDialog(UpdateResult.this, "All tournament results updated", "", JOptionPane.INFORMATION_MESSAGE);
                    Results.main(new String[]{});
                    frame.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(UpdateResult.this, "Error! Unable to update tournament", "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //11.
                    frame=new UpdateResult();
                    frame.setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(UpdateResult.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration                   
}
