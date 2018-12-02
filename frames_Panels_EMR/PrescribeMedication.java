package frames_Panels_EMR;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrescribeMedication {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrescribeMedication window = new PrescribeMedication();
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
	public PrescribeMedication() {
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
		
		JLabel lblPrescriptionid = new JLabel("PrescriptionID:");
		lblPrescriptionid.setBounds(46, 43, 98, 16);
		frame.getContentPane().add(lblPrescriptionid);
		
		JLabel lblPrescriptionDate = new JLabel("Prescription Date:");
		lblPrescriptionDate.setBounds(22, 96, 112, 24);
		frame.getContentPane().add(lblPrescriptionDate);
		
		textField = new JTextField();
		textField.setBounds(166, 38, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 95, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane.showMessageDialog(frame.getComponent(0), "The patient has been prescribed medication.");
			}
		});
		btnConfirm.setBounds(44, 198, 117, 29);
		frame.getContentPane().add(btnConfirm);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new Frame2().setVisible(true);
			}
		});
		btnGoBack.setBounds(226, 198, 117, 29);
		frame.getContentPane().add(btnGoBack);
		frame.setVisible(true);
	}

	public void setVisible(boolean b) {
	
		
	}

}
