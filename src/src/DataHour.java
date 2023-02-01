package src;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DataHour extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnNewButton;
	private JButton btnAbrirLista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataHour frame = new DataHour();
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
	public DataHour() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(204, 29, 65, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 60, 365, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(204, 105, 365, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(130, 150, 125, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(444, 150, 125, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(130, 194, 125, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(444, 194, 125, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(163, 32, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(130, 63, 92, 14);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(130, 108, 92, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblHorasDeTrabajo = new JLabel("Horas de Trabajo");
		lblHorasDeTrabajo.setBounds(28, 153, 92, 14);
		contentPane.add(lblHorasDeTrabajo);
		
		JLabel lblTarifa = new JLabel("Tarifa");
		lblTarifa.setBounds(342, 153, 92, 14);
		contentPane.add(lblTarifa);
		
		JLabel lblHorasExtra = new JLabel("Horas Extra");
		lblHorasExtra.setBounds(28, 197, 92, 14);
		contentPane.add(lblHorasExtra);
		
		JLabel lblTarifaExtra = new JLabel("Tarifa Extra");
		lblTarifaExtra.setBounds(342, 197, 92, 14);
		contentPane.add(lblTarifaExtra);
		
		btnNewButton = new JButton("⬅");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeeHour eh = new EmployeeHour();
				eh.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 11, 58, 23);
		contentPane.add(btnNewButton);
		
		btnAbrirLista = new JButton("Abrir Lista");
		btnAbrirLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListHour lh = new ListHour();
				lh.setVisible(true);
				dispose();
			}
		});
		btnAbrirLista.setBounds(260, 238, 126, 23);
		contentPane.add(btnAbrirLista);
		
		btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(130, 238, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBounds(464, 238, 84, 23);
		contentPane.add(btnNewButton_2);
	}

}
