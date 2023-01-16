
import com.sun.org.apache.bcel.internal.generic.SWAP;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import sun.rmi.server.DeserializationChecker;

public class Odev extends javax.swing.JFrame {

    public int sayac1 = 0, sayac2 = 0, sayac3 = 0;

    public Odev() {
        initComponents();
        //this.sayac1 = sayac1;
       // this.sayac2 = sayac2;
       // this.sayac3 = sayac3;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jtext1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("ÇİZDİR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext1ActionPerformed(evt);
            }
        });

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Bubble Sort", "Selection Sort", "Insertion Sort" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("dizi boyutu:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel2)))
                        .addGap(45, 45, 45)
                        .addComponent(jtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext1ActionPerformed

    }//GEN-LAST:event_jtext1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s = jtext1.getText();
 int diziboyutu = Integer.parseInt(s);
 int dizi[] = new int[diziboyutu];
 System.out.println("DİZİ ELEMANLARI: ");
 for (int i = 0; i < diziboyutu; i++) {
 int sayi = (int) (Math.random() * 1000);
 dizi[i] = sayi;
 System.out.print(dizi[i] + " ");
 }
 System.out.println(" ");
 String selectedOption = (String) jComboBox1.getSelectedItem();
 if (selectedOption.equals("Bubble Sort")) {
 boolean ifade = true;
 while (ifade) {
 ifade = false;
 for (int j = 0; j < diziboyutu - 1; j++) {
 sayac1++;
 if (dizi[j] > dizi[j + 1]) {
 int temp = dizi[j];
 dizi[j] = dizi[j + 1];
 dizi[j + 1] = temp;
 ifade = true;
 }
 }
 }
 System.out.println("************************************************************");
 String a = "SECİLEN ALGORİTMA: " + jComboBox1.getSelectedItem();
 System.out.println(a);
 System.out.println("************************************************************");
 System.out.println("SIRALI DİZİ: ");
 for (int k = 0; k < diziboyutu; k++) {
 System.out.print(dizi[k] + " ");
 }
 System.out.println("SAYAC = " + sayac1);
 } else if (selectedOption.equals("Selection Sort")) {
 System.out.println("************************************************************");
 String a = "SECİLEN ALGORİTMA: " + jComboBox1.getSelectedItem();
 System.out.println(a);
 System.out.println("************************************************************");
 for (int e = 0; e < diziboyutu - 1; e++) {
 int minIndex = e;
 sayac2++;
 for (int d = e + 1; d < diziboyutu; d++) {
 if (dizi[d] < dizi[minIndex]) {
 minIndex = d;
 }
 }
 int temp = dizi[e];
 dizi[e] = dizi[minIndex];
 dizi[minIndex] = temp;
 }
 System.out.println("SIRALI DİZİ: ");
 for (int c = 0; c < diziboyutu; c++) {
 System.out.print(dizi[c] + " ");
 }
 System.out.println("SAYAC = " + sayac2);
 } else if (selectedOption.equals("Insertion Sort")) {
 
System.out.println("***************************************************************");
 String a = "SECİLEN ALGORİTMA: " + jComboBox1.getSelectedItem();
 System.out.println(a);
 
System.out.println("***************************************************************");
 for (int g = 1; g < diziboyutu; g++) {
 int current = dizi[g];
 sayac3++;
 int h = g - 1;
 while (h >= 0 && dizi[h] > current) {
 dizi[h + 1] = dizi[h];
 h--;
 }
 dizi[h + 1] = current;
 }
 System.out.println("SIRALI DİZİ: ");
 for (int y = 0; y < diziboyutu; y++) {
 System.out.print(dizi[y] + " ");
 }
 System.out.println("SAYAC = " + sayac3);
 }
  


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
     
        java.awt.EventQueue.invokeLater(new Runnable() {


            public void run() {
                Grafik grafik = new Grafik(0,0, 0, sayac1, sayac2, sayac3);
                grafik.setVisible(true);
                //grafik.setSize(600,600);
            }
        });


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Odev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Odev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Odev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Odev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Odev().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jtext1;
    // End of variables declaration//GEN-END:variables
}
