package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class DataMonth extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataMonth frame = new DataMonth();
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
	public DataMonth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(155, 45, 238, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(155, 94, 238, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(155, 140, 238, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(155, 185, 238, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(22, 48, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(22, 97, 92, 14);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(22, 143, 92, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblSalariomin = new JLabel("Salario Minimo");
		lblSalariomin.setBounds(22, 188, 92, 14);
		contentPane.add(lblSalariomin);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(345, 238, 89, 23);
		contentPane.add(btnNewButton);
	}
}
