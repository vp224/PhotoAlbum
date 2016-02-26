package mypackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class TempFrame1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	//java.io.File f ;
	ImageViewer1 im1;
	String s;
	public TempFrame1(String s,ImageViewer1 im1/*java.io.File f */) {
		//this.f=f;
		this.s=s;
		this.im1=im1;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 367);
		//this.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle(im1.list.getSelectedValue().toString());
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		JLabel l=new JLabel();
		 l.setIcon(new ImageIcon(s));
         
         //alignment
         l.setHorizontalAlignment(JLabel.CENTER);
         scrollPane.getViewport().add(l);
         
	}

}
