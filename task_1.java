package lab_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class task_1{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	double pX1;
	double pX2,pY1,pY2;
	String px1,px2,py1,py2;
	double distance;;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					task_1 window = new task_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public task_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X1 :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(29, 64, 22, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(66, 61, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 92, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(276, 61, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_3.setBounds(276, 89, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("X2 :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(29, 95, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Y1 :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(235, 64, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Y2 :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(235, 95, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CALCULATION");
		lblNewLabel_4.setFont(new Font("Segoe Script", Font.BOLD, 18));
		lblNewLabel_4.setBounds(144, 20, 200, 30);
		frame.getContentPane().add(lblNewLabel_4);
		JButton btnNewButton = new JButton("DISTANCE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				py1=textField.getText();
				pY1=Double.parseDouble(py1);
				px1=textField_1.getText();
				pX1=Double.parseDouble(px1);
				px2=textField_2.getText();
				pX2=Double.parseDouble(px2);
				py2=textField_3.getText();
				pY2=Double.parseDouble(py2);
				System.out.println(pY2);
				String d;
				
				distance=Math.sqrt(((pX2-pX1)*(pX2-pX1))+((pY2-pY1)*(pY2-pY1)));
				d=String.valueOf(distance);
				JOptionPane.showMessageDialog(frame, d);
			}
		});
		
		JButton btnNewButton_1 = new JButton("RADIUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String d;
				py1=textField.getText();
				pY1=Double.parseDouble(py1);
				px1=textField_1.getText();
				pX1=Double.parseDouble(px1);
				px2=textField_2.getText();
				pX2=Double.parseDouble(px2);
				py2=textField_3.getText();
				pY2=Double.parseDouble(py2);
				
				distance=Math.sqrt(((pX2-pX1)*(pX2-pX1))+((pY2-pY1)*(pY2-pY1)));
				double radius=distance;
				d=String.valueOf(radius);
				JOptionPane.showMessageDialog(frame, d);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(128, 147, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DIAGNOL");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d;
				py1=textField.getText();
				pY1=Double.parseDouble(py1);
				px1=textField_1.getText();
				pX1=Double.parseDouble(px1);
				px2=textField_2.getText();
				pX2=Double.parseDouble(px2);
				py2=textField_3.getText();
				pY2=Double.parseDouble(py2);
				
				distance=Math.sqrt(((pX2-pX1)*(pX2-pX1))+((pY2-pY1)*(pY2-pY1)));
				double radius=distance;
				double diagnol=2*radius;
				d=String.valueOf(diagnol);
				JOptionPane.showMessageDialog(frame, d);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(224, 147, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CIRCUMFERENCE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d;
				py1=textField.getText();
				pY1=Double.parseDouble(py1);
				px1=textField_1.getText();
				pX1=Double.parseDouble(px1);
				px2=textField_2.getText();
				pX2=Double.parseDouble(px2);
				py2=textField_3.getText();
				pY2=Double.parseDouble(py2);
				
				distance=Math.sqrt(((pX2-pX1)*(pX2-pX1))+((pY2-pY1)*(pY2-pY1)));
				double radius=distance;
				double diagnol=2*radius*3.147;
				d=String.valueOf(diagnol);
				JOptionPane.showMessageDialog(frame, d);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(323, 147, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("AREA");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d;
				py1=textField.getText();
				pY1=Double.parseDouble(py1);
				px1=textField_1.getText();
				pX1=Double.parseDouble(px1);
				px2=textField_2.getText();
				pX2=Double.parseDouble(px2);
				py2=textField_3.getText();
				pY2=Double.parseDouble(py2);
				
				distance=Math.sqrt(((pX2-pX1)*(pX2-pX1))+((pY2-pY1)*(pY2-pY1)));
				double radius=distance;
				double diagnol=2*radius*3.147;
				d=String.valueOf(diagnol);
				JOptionPane.showMessageDialog(frame, d);
				
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_4.setBounds(158, 181, 123, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(29, 147, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
	
}
