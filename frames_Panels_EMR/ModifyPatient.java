package frames_Panels_EMR;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyPatient {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyPatient window = new ModifyPatient();
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
	public ModifyPatient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Patient Name:");
		label.setBounds(25, 29, 96, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("PatientID:");
		label_1.setBounds(25, 81, 61, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Date of Birth:");
		label_2.setBounds(25, 129, 83, 16);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(139, 24, 130, 26);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 76, 130, 26);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(139, 124, 130, 26);
		frame.getContentPane().add(textField_2);
		
		JButton button = new JButton("Modify Patient Record");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(frame.getComponent(0), "The patient record was modified.");
			}
		});
		button.setForeground(Color.MAGENTA);
		button.setBounds(84, 187, 148, 38);
		frame.getContentPane().add(button);
		
		btnBack = new JButton("Go Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Frame2().setVisible(true);
			}
		});
		btnBack.setBounds(277, 187, 117, 38);
		frame.getContentPane().add(btnBack);
		frame.setVisible(true);
	}

	public void setVisible(boolean b) {
		
		
	}

}
