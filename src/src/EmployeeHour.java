package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeHour extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeHour frame = new EmployeeHour();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeHour() {
		setTitle("Mensual");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 434, 261);
		contentPane.add(contentPane_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(33, 145, 369, 43);
		contentPane_1.add(btnNewButton_1);
		
		JButton button = new JButton("New button");
		button.setBounds(0, 11, 36, -3);
		contentPane_1.add(button);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(10, 11, 45, 23);
		contentPane_1.add(btnNewButton_2);
		
		btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.addActionListener(this);
		btnNewButton_1_1.setBounds(33, 56, 369, 43);
		contentPane_1.add(btnNewButton_1_1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1_1) {
			handleBtnNewButton_1_1ActionPerformed(e);
		}
	}
	protected void handleBtnNewButton_1_1ActionPerformed(ActionEvent e) {
		
	}
}
