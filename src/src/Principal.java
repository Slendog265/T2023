package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(33, 145, 369, 43);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("New button");
		button.setBounds(0, 11, 36, -3);
		contentPane.add(button);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(10, 11, 45, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.addActionListener(this);
		btnNewButton_1_1.setBounds(33, 64, 369, 43);
		contentPane.add(btnNewButton_1_1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1_1) {
			handleBtnNewButton_1_1ActionPerformed(e);
		}
	}
	protected void handleBtnNewButton_1_1ActionPerformed(ActionEvent e) {
	}
}
