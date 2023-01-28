package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class DataHour extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnAbrirLista;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataHour frame = new DataHour();
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
	public DataHour() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 41, 238, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 77, 238, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(130, 116, 238, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 152, 238, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(130, 194, 238, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(130, 234, 238, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(130, 272, 238, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(28, 44, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(28, 80, 92, 14);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(28, 119, 92, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblHorasDeTrabajo = new JLabel("Horas de Trabajo");
		lblHorasDeTrabajo.setBounds(28, 155, 92, 14);
		contentPane.add(lblHorasDeTrabajo);
		
		JLabel lblTarifa = new JLabel("Tarifa");
		lblTarifa.setBounds(28, 197, 92, 14);
		contentPane.add(lblTarifa);
		
		JLabel lblHorasExtra = new JLabel("Horas Extra");
		lblHorasExtra.setBounds(28, 237, 92, 14);
		contentPane.add(lblHorasExtra);
		
		JLabel lblTarifaExtra = new JLabel("Tarifa Extra");
		lblTarifaExtra.setBounds(28, 275, 92, 14);
		contentPane.add(lblTarifaExtra);
		
		btnAbrirLista = new JButton("Abrir Lista");
		btnAbrirLista.setBounds(298, 396, 126, 23);
		contentPane.add(btnAbrirLista);
		
		btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBounds(166, 396, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
