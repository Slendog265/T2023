package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ListHour extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnAgregarALa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListHour frame = new ListHour();
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
	public ListHour() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1065, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 63, 1029, 375);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, "", null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Nombres", "Apellidos", "Horas de Trabajo", "Tarifa", "Horas Extra", "Tarifa Extra", "Salario Minimo", "INSS", "IR", "Deducciones", "Salario Neto"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(45);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(105);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(70);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(7).setPreferredWidth(85);
		table.getColumnModel().getColumn(8).setPreferredWidth(65);
		table.getColumnModel().getColumn(9).setPreferredWidth(65);
		table.getColumnModel().getColumn(10).setPreferredWidth(80);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Lista de Empleados por Hora");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(344, 11, 671, 41);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("⬅");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(10, 11, 55, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2_1 = new JButton("Salir");
		btnNewButton_2_1.setBounds(976, 447, 63, 23);
		contentPane.add(btnNewButton_2_1);
		
		btnAgregarALa = new JButton("Agregar a la lista");
		btnAgregarALa.addActionListener(this);
		btnAgregarALa.setBounds(821, 447, 145, 23);
		contentPane.add(btnAgregarALa);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAgregarALa) {
			handleBtnAgregarALaActionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			handleBtnNewButton_2ActionPerformed(e);
		}
	}
	protected void handleBtnNewButton_2ActionPerformed(ActionEvent e) {
		EmployeeHour em = new EmployeeHour();
		em.setVisible(true);
		em.setLocationRelativeTo(null);
		dispose();
	}
	protected void handleBtnAgregarALaActionPerformed(ActionEvent e) {
		DataHour em = new DataHour();
		em.setVisible(true);
		em.setLocationRelativeTo(null);
		dispose();
	}
}
