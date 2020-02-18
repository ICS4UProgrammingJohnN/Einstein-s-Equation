import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class einsteinsEquationGUI {

	private JFrame frame;
	private JTextField txtMass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					einsteinsEquationGUI window = new einsteinsEquationGUI();
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
	public einsteinsEquationGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.setBackground(new Color(255, 192, 203));
		frame.setBounds(100, 100, 480, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Please enter the mass of the object");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblTitle.setBounds(10, 54, 369, 45);
		frame.getContentPane().add(lblTitle);
		
		txtMass = new JTextField();
		txtMass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMass.setBounds(20, 110, 130, 38);
		frame.getContentPane().add(txtMass);
		txtMass.setColumns(10);
		
		JLabel lblAnswer = new JLabel("");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAnswer.setBounds(10, 229, 279, 45);
		frame.getContentPane().add(lblAnswer);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalculate.setBounds(20, 174, 211, 31);
		frame.getContentPane().add(btnCalculate);
	}
}
