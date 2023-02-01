package src;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Login;

public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_2_1;

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
		
		JButton btnNewButton_1 = new JButton(" Empleado por Mes");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeMonth em = new EmployeeMonth();
				em.setVisible(true);
				em.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1.setBounds(33, 140, 369, 43);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("New button");
		button.setBounds(0, 11, 36, -3);
		contentPane.add(button);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		btnNewButton_2.setBounds(361, 227, 63, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_1_1 = new JButton("Empleado por Hora");
		btnNewButton_1_1.addActionListener(this);
		btnNewButton_1_1.setBounds(33, 60, 369, 43);
		contentPane.add(btnNewButton_1_1);
		
		btnNewButton_2_1 = new JButton("⬅");
		btnNewButton_2_1.addActionListener(this);
		btnNewButton_2_1.setBounds(10, 11, 55, 23);
		contentPane.add(btnNewButton_2_1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2_1) {
			handleBtnNewButton_2_1ActionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1_1) {
			handleBtnNewButton_1_1ActionPerformed(e);
		}
	}
	protected void handleBtnNewButton_1_1ActionPerformed(ActionEvent e) {
		EmployeeHour eh = new EmployeeHour();
		eh.setVisible(true);
		eh.setLocationRelativeTo(null);
		dispose();
	}

	protected void handleBtnNewButton_2_1ActionPerformed(ActionEvent e) {
		Login l = new Login();
		l.setVisible(true);
		l.setLocationRelativeTo(null);
		dispose();
	}
}
