
import java.util.Random;
import javax.swing.ImageIcon;


public class Dados extends javax.swing.JFrame {

    
    public Dados() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imagendado1 = new javax.swing.JLabel();
        imagendado2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 75));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Purisa", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("JUEGO DE DADOS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(123, 12, 373, 64);

        imagendado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dado6.png"))); // NOI18N
        jPanel1.add(imagendado1);
        imagendado1.setBounds(40, 120, 200, 190);

        imagendado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dado6.png"))); // NOI18N
        jPanel1.add(imagendado2);
        imagendado2.setBounds(310, 130, 214, 187);

        jButton1.setBackground(new java.awt.Color(64, 64, 66));
        jButton1.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("JUGAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 370, 150, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      Random rnd = new Random();
        int dado1 = 0;
        dado1 = ((int)(rnd.nextDouble()*6)); 
        int dado2 = 0;
        dado2 = ((int)(rnd.nextDouble()*6));
        
        switch (dado1) {
            case 0:
                imagendado1.setIcon(new ImageIcon(getClass().getResource("dado1.png")));
                break;
            case 1:
                imagendado1.setIcon(new ImageIcon(getClass().getResource("dado2.png")));
                break;
            case 2:
                imagendado1.setIcon(new ImageIcon(getClass().getResource("dado3.png")));
                break;
            case 3:
                imagendado1.setIcon(new ImageIcon(getClass().getResource("dado4.png")));
                break;
            case 4:
                imagendado1.setIcon(new ImageIcon(getClass().getResource("dado5.png")));
                break;
            case 5:
                imagendado1.setIcon(new ImageIcon(getClass().getResource("dado6.png")));
                break;
            default:
                break;
        }
       
        switch (dado2) {
            case 0:
                imagendado2.setIcon(new ImageIcon(getClass().getResource("dado1.png")));
                break;
            case 1:
                imagendado2.setIcon(new ImageIcon(getClass().getResource("dado2.png")));
                break;
            case 2:
                imagendado2.setIcon(new ImageIcon(getClass().getResource("dado3.png")));
                break;
            case 3:
                imagendado2.setIcon(new ImageIcon(getClass().getResource("dado4.png")));
                break;
            case 4:
                imagendado2.setIcon(new ImageIcon(getClass().getResource("dado5.png")));
                break;
            case 5:
                imagendado2.setIcon(new ImageIcon(getClass().getResource("dado6.png")));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton1MouseClicked

    
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
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()  {
            public void run() {
                new Dados().setVisible(true);
            }    
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagendado1;
    private javax.swing.JLabel imagendado2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
