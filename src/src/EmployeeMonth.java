package src;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeMonth extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton_2_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeMonth frame = new EmployeeMonth();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeMonth() {
		setTitle("Mes");
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
		
		JButton btnNewButton_1 = new JButton("Mostrar Empleado por Mes");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListHour lh = new ListHour();
				lh.setVisible(true);
				lh.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1.setBounds(33, 140, 369, 43);
		contentPane_1.add(btnNewButton_1);
		
		JButton button = new JButton("New button");
		button.setBounds(0, 11, 36, -3);
		contentPane_1.add(button);
		
		JButton btnNewButton_2 = new JButton("⬅");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal p = new Principal();
				p.setVisible(true);
				p.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_2.setBounds(10, 11, 55, 23);
		contentPane_1.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Agregar Empleado por Mes");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataMonth dm = new DataMonth();
				dm.setVisible(true);
				dm.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(33, 60, 369, 43);
		contentPane_1.add(btnNewButton_1_1);
		
		btnNewButton_2_1 = new JButton("Salir");
		btnNewButton_2_1.addActionListener(this);
		btnNewButton_2_1.setBounds(361, 227, 63, 23);
		contentPane_1.add(btnNewButton_2_1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2_1) {
			handleBtnNewButton_2_1ActionPerformed(e);
		}
	}
	protected void handleBtnNewButton_2_1ActionPerformed(ActionEvent e) {
		System.exit(EXIT_ON_CLOSE);
	}
}
