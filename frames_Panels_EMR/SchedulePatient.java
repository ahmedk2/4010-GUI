package frames_Panels_EMR;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SchedulePatient {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnGoBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchedulePatient window = new SchedulePatient();
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
	public SchedulePatient() {
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
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setBounds(32, 43, 93, 16);
		frame.getContentPane().add(lblPatientName);
		
		textField = new JTextField();
		textField.setBounds(137, 38, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDoctorName = new JLabel("AppointmentID:");
		lblDoctorName.setBounds(25, 98, 100, 21);
		frame.getContentPane().add(lblDoctorName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 95, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDate = new JLabel("Appointment Date:");
		lblDate.setBounds(6, 155, 119, 16);
		frame.getContentPane().add(lblDate);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 150, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame.getComponent(0), "Appointment successfully created.");
			}
		});
		btnConfirm.setBounds(137, 212, 117, 29);
		frame.getContentPane().add(btnConfirm);
		
		btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new Frame2().setVisible(true);
			}
		});
		btnGoBack.setBounds(286, 212, 117, 29);
		frame.getContentPane().add(btnGoBack);
		frame.setVisible(true);
		
	}

	public void setVisible(boolean b) {
		
		
	}

}
