package mypackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class AskDetails extends JFrame {

	public JPanel contentPane;
	public JTextField textField;
    public JTextArea textArea;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
    public java.io.File f ;
	public ImageViewer1 im1;
	public ArrayList<imgs> imlist;
	String s;
	public AskDetails(java.io.File f ,ImageViewer1 im1) {
		this.im1=im1;
		this.f=f;
		this.imlist=im1.imglist;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Enter Title");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblEnterAnnotation = new JLabel("Enter annotation");
		
		JTextArea textArea = new JTextArea();
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnOkActionPerformed(evt);
            }
        });
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEnterAnnotation)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textArea))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(192, Short.MAX_VALUE)
					.addComponent(btnOk)
					.addGap(185))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(56)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(36)
							.addComponent(lblEnterAnnotation))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(btnOk)
					.addGap(23))
		);
		contentPane.setLayout(gl_contentPane);
	}
	private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {                                         
    System.out.println(textField.getText());
    //System.out.println(textArea.getText());
    System.out.println(f.toString());
		imgs i=new imgs(textField.getText(),"j",f.toString());
		   imlist.add(i);
		   im1.list1.addElement(textField.getText().toString());
		   this.dispose(); 
    }                                        
}
