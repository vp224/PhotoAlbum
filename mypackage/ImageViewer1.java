package mypackage;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import java.util.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author YUSUF SHAKEEL
 */
public class ImageViewer1 extends javax.swing.JFrame {

    /**
     * Creates new form ImageViewer
     */
	public ArrayList<String> select=new ArrayList<>();
	public DefaultListModel<String> list1=new DefaultListModel<>();
	public ArrayList<imgs> imglist=new ArrayList<imgs>();
    public ImageViewer1() {
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

        jSP = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMI_Open = new javax.swing.JMenuItem();
        jMI_Clear = new javax.swing.JMenuItem();
       
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        jMI_Open.setText("Open");
        jMI_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_OpenActionPerformed(evt);
            }
        });
        jMenu1.add(jMI_Open);

        jMI_Clear.setText("Clear");
        jMI_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_ClearActionPerformed(evt);
            }
        });
        jMenu1.add(jMI_Clear);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);
        
        btnView = new JButton("View");
        btnView.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		view(arg0);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jSP, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(btnView)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jSP, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(112)
        			.addComponent(btnView)
        			.addContainerGap(144, Short.MAX_VALUE))
        );
        
        list = new JList(list1);
        //list1.addElement();
        jSP.setViewportView(list);
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //create a label
  //  JLabel jlab = new JLabel();
    private void view(java.awt.event.ActionEvent evt)
    {
    	TempFrame1 tf=new TempFrame1(imglist.get(list.getSelectedIndex()).str3,this);
    	tf.setVisible(true);
    }
    private void jMI_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_OpenActionPerformed
        // TODO add your handling code here:
        //create file chooser
        JFileChooser jfc = new JFileChooser();
        
        //select file and display
        if(jfc.showOpenDialog(jMenu1) == JFileChooser.APPROVE_OPTION){
            //get selected file name [i.e., complete file path]
            java.io.File f = jfc.getSelectedFile();
            AskDetails ad=new AskDetails(f,this);
            ad.setVisible(true);
            
            //TempFrame1 tf=new TempFrame1(f);
            //select.add(f.toString());
            //tf.setVisible(true);
            //set icon
           /* jlab.setIcon(new ImageIcon(f.toString()));
            
            //alignment
            jlab.setHorizontalAlignment(JLabel.CENTER);
            
            //add jLabel to scroll pane
            jSP.getViewport().add(jlab);*/
        }
    }//GEN-LAST:event_jMI_OpenActionPerformed

    private void jMI_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_ClearActionPerformed
        // TODO add your handling code here:
        
        //remove image from jlabel jlab
     //   jlab.setIcon(null);
    }//GEN-LAST:event_jMI_ClearActionPerformed
   
   
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
            java.util.logging.Logger.getLogger(ImageViewer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageViewer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageViewer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageViewer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageViewer1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem jMI_Clear;
    public javax.swing.JMenuItem jMI_Open;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JScrollPane jSP;
    public JList list;
    private JButton btnView;
    // End of variables declaration//GEN-END:variables
}
class imgs
{
	
	String str1;
	String str2;
    String str3;
    
	public imgs(String str1,String str2,String str3)
	{
	  this.str1=str1;
	  this.str2=str2;
	  this.str3=str3;
	  
	}
	
}