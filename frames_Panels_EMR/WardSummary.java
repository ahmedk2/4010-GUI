package frames_Panels_EMR;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WardSummary {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WardSummary window = new WardSummary();
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
	public WardSummary() {
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
		
		JLabel lblWardid = new JLabel("WardID:");
		lblWardid.setBounds(40, 38, 61, 16);
		frame.getContentPane().add(lblWardid);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setBounds(40, 96, 61, 16);
		frame.getContentPane().add(lblLocation);
		
		JLabel lblCapacity = new JLabel("Capacity:");
		lblCapacity.setBounds(40, 154, 61, 16);
		frame.getContentPane().add(lblCapacity);
		
		textField = new JTextField();
		textField.setBounds(141, 33, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 91, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 149, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnProduceSummary = new JButton("Produce Summary");
		btnProduceSummary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(frame.getComponent(0), "The Ward Summary is as follows: ");
			}
		});
		btnProduceSummary.setBounds(40, 215, 151, 29);
		frame.getContentPane().add(btnProduceSummary);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				new Frame2().setVisible(true);
			}
		});
		btnGoBack.setBounds(244, 215, 117, 29);
		frame.getContentPane().add(btnGoBack);
		frame.setVisible(true);
		
		
	}

	public void setVisible(boolean b) {

		
	}

}
