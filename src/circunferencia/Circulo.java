package circunferencia;
//AUTHOR LEON JUNIO MARTINS
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Circulo extends javax.swing.JFrame {
    public Circulo() {
        initComponents(); 
        
    }
    Integer X;
    Integer Y ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        raio = new javax.swing.JLabel();
        diametro = new javax.swing.JLabel();
        area = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Desenhar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        Coordenadas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CIRCUNFERENCIA");
        setBackground(new java.awt.Color(0, 204, 204));
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        raio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        raio.setForeground(new java.awt.Color(255, 0, 0));
        raio.setText("Raio da circunferencia");

        diametro.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        diametro.setForeground(new java.awt.Color(255, 0, 0));
        diametro.setText("Diametro da circunferencia");

        area.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        area.setForeground(new java.awt.Color(255, 0, 0));
        area.setText("Area do circulo ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(raio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(diametro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raio)
                    .addComponent(diametro)
                    .addComponent(area))
                .addGap(0, 721, Short.MAX_VALUE))
        );

        jLabel1.setText("DESENHANDO CIRCULO");

        Desenhar.setText("Desenhar");
        Desenhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesenharActionPerformed(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        Coordenadas.setText("Coordenadas");
        Coordenadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoordenadasActionPerformed(evt);
            }
        });

        jLabel2.setText("Developer by Leon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Desenhar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Coordenadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(Desenhar)
                .addGap(18, 18, 18)
                .addComponent(Limpar)
                .addGap(18, 18, 18)
                .addComponent(Coordenadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
            Graphics g = getGraphics();
            g.drawLine(30,450,1000,450);//Horizontal
            g.drawLine(450,30,450,1000);//Vertical
    }//GEN-LAST:event_LimparActionPerformed

    private void DesenharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesenharActionPerformed
        desenhar();
    }//GEN-LAST:event_DesenharActionPerformed

    private void CoordenadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoordenadasActionPerformed
        Coordenadas();
        Graphics g = getGraphics();
          g.drawLine(30,450,1000,450);//Horizontal
          g.drawLine(450,30,450,1000);//Vertical
    }//GEN-LAST:event_CoordenadasActionPerformed
        public void Coordenadas(){
            String x = JOptionPane.showInputDialog(null,"Digite o X");
            String y = JOptionPane.showInputDialog(null,"Digite o Y");
           X = Integer.parseInt(x);
           Y = Integer.parseInt(y);
            
        }
        public void grafico(Graphics g){
            //DESENHANDO AS LINHAS DO GRAFICO
            g.drawLine(30,450,1000,450);//Horizontal
            g.drawLine(450,30,450,1000);//Vertical
        }
        public void desenhar(){
            String r = JOptionPane.showInputDialog("DIGITE O RAIO DA CIRCUNFERENCIA",null);
            Integer R = Integer.parseInt(r);
            int d;
            String circulo;
            d=R*2;
            double a=3.14*(R*R);
            area.setText("area do circulo "+a);
            raio.setText("Raio da circunferencia "+R);
            diametro.setText("Diametro da circunferencia "+d);
            Coordenadas();
            X=(X+450)+R;
            Y=(Y+250)+R;
            Graphics g = getGraphics();
            grafico(g);
            //desenhando pontos no grafico
            g.setColor(Color.blue);
            g.drawOval(X,Y,d,d);
            
        }
       
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
            java.util.logging.Logger.getLogger(Circulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Circulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Circulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Circulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Circulo().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Coordenadas;
    private javax.swing.JButton Desenhar;
    private javax.swing.JButton Limpar;
    private javax.swing.JLabel area;
    private javax.swing.JLabel diametro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel raio;
    // End of variables declaration//GEN-END:variables
}
