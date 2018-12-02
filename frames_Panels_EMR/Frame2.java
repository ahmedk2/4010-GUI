package frames_Panels_EMR;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
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
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane();
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the EMR");
		lblWelcomeToThe.setForeground(Color.MAGENTA);
		lblWelcomeToThe.setBounds(156, 17, 135, 16);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JButton btnNewButton = new JButton("Add Patient Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new AddPatient().setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(140, 45, 168, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modify Patient Record");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new ModifyPatient().setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(140, 85, 168, 29);
		frame.getContentPane().add(btnNewButton_1);	
		
		JButton btnNewButton_2 = new JButton("Ward Summary");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new WardSummary().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(140, 126, 168, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Search Patient Record");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new SearchPatient().setVisible(true);
			}
		});
		btnNewButton_3.setBounds(140, 167, 168, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Schedule Appointment");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new SchedulePatient().setVisible(true);
			}
		});
		btnNewButton_4.setBounds(140, 208, 168, 29);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Patient Prescription");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new PrescribeMedication().setVisible(true);
			}
		});
		btnNewButton_5.setBounds(140, 243, 168, 29);
		frame.getContentPane().add(btnNewButton_5);
		frame.setVisible(true);
		

	}

	public void setVisible(boolean b) {

		
	}
}
