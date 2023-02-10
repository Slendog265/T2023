package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class ListHour extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable HourTable;
	private JButton btnNewButton;
	private JButton btnAgregarALa;
	private JTextField idText;
	private JTextField namesTxt;
	private JTextField snamesTxt;
	private JTextField hrTxt;
	private JTextField xtrhTxt;
	private JTextField tarTxt;
	private JTextField xtrataTxt;
	DefaultTableModel model;
	private JButton borrarLinea;
	private JButton borrarTodo;
	private JButton btnNewButton_2;
	

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
		scrollPane.setBounds(10, 241, 1029, 197);
		contentPane.add(scrollPane);
		
		HourTable = new JTable();
		model = new DefaultTableModel();
		HourTable.setModel(model);
		model.addColumn("ID");
		model.addColumn("Nombres");
		model.addColumn("Apellidos");
		model.addColumn("Horas de Trabajo");
		model.addColumn("Tarifa");
		model.addColumn("Horas Extras");
		model.addColumn("Tarifas Extras");
		model.addColumn("Salario Minimo");
		model.addColumn("INSS");
		model.addColumn("IR");
		model.addColumn("Deducciones");
		model.addColumn("Salario Neto");
		
			
		scrollPane.setViewportView(HourTable);
		
		JLabel lblNewLabel = new JLabel("Lista de Empleados por Hora");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(344, 11, 671, 41);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("⬅");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(10, 11, 55, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(976, 447, 63, 23);
		contentPane.add(btnNewButton_2);
		
		btnAgregarALa = new JButton("Guardar");
		btnAgregarALa.addActionListener(this);
		btnAgregarALa.setBounds(569, 136, 145, 23);
		contentPane.add(btnAgregarALa);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(37, 59, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setBounds(37, 99, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setBounds(37, 140, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Horas de Trabajo");
		lblNewLabel_4.setBounds(19, 176, 83, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Horas Extras");
		lblNewLabel_5.setBounds(19, 216, 83, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tarifa");
		lblNewLabel_6.setBounds(331, 176, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Tarifa Extra");
		lblNewLabel_7.setBounds(331, 216, 74, 14);
		contentPane.add(lblNewLabel_7);
		
		idText = new JTextField();
		idText.setBounds(93, 56, 68, 20);
		contentPane.add(idText);
		idText.setColumns(10);
		
		namesTxt = new JTextField();
		namesTxt.setBounds(93, 96, 225, 20);
		contentPane.add(namesTxt);
		namesTxt.setColumns(10);
		
		snamesTxt = new JTextField();
		snamesTxt.setBounds(93, 137, 225, 20);
		contentPane.add(snamesTxt);
		snamesTxt.setColumns(10);
		
		hrTxt = new JTextField();
		hrTxt.setBounds(112, 173, 125, 20);
		contentPane.add(hrTxt);
		hrTxt.setColumns(10);
		
		xtrhTxt = new JTextField();
		xtrhTxt.setBounds(112, 213, 125, 20);
		contentPane.add(xtrhTxt);
		xtrhTxt.setColumns(10);
		
		tarTxt = new JTextField();
		tarTxt.setBounds(401, 173, 125, 20);
		contentPane.add(tarTxt);
		tarTxt.setColumns(10);
		
		xtrataTxt = new JTextField();
		xtrataTxt.setBounds(401, 210, 125, 20);
		contentPane.add(xtrataTxt);
		xtrataTxt.setColumns(10);
		
		borrarLinea = new JButton("Borrar Datos");
		borrarLinea.addActionListener(this);
		borrarLinea.setBounds(569, 167, 145, 23);
		contentPane.add(borrarLinea);
		
		borrarTodo = new JButton("Borrar Todo");
		borrarTodo.addActionListener(this);
		borrarTodo.setBounds(569, 194, 145, 23);
		contentPane.add(borrarTodo);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			handleBtnNewButton_2_1ActionPerformed(e);
		}
		if (e.getSource() == borrarTodo) {
			handleBorrarTodoActionPerformed(e);
		}
		if (e.getSource() == borrarLinea) {
			handleBorrarLineaActionPerformed(e);
		}
		if (e.getSource() == btnAgregarALa) {
			
			handleBtnAgregarALaActionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			handleBtnNewButton_2ActionPerformed(e);
		}
	}
	private void handleBtnAgregarALaActionPerformed(ActionEvent e) {
		
		double Tar, numb, SmD, INSS, inss, BImpo, SAnual, IrM, pApli, Dedud, netSalry, IA;
		int hrsT, Total1, Total2, Brute;
		String ID = idText.getText();
		String Name = namesTxt.getText();
		String sName = snamesTxt.getText();
		hrsT = Integer.parseInt(hrTxt.getText());
		Tar = Double.parseDouble(tarTxt.getText());
		int hrsXtr = Integer.parseInt(xtrhTxt.getText());
		int XtrTar = Integer.parseInt(xtrataTxt.getText());
		
		 Total1 = (int) (hrsT * Tar);
		 Total2 = (int) (hrsXtr * XtrTar);
		Brute = Total1 + Total2;
		 numb = Total1;
		 INSS = numb * 0.07;
		inss = INSS;
		 BImpo = numb - INSS;
		 SAnual = BImpo * 12;
		if(SAnual <  199999.50  ) {
			 SmD = SAnual - 100000;
			 pApli = SmD * 0.15;
			 IrM = pApli/12;
			  Dedud = INSS +IrM;
			     netSalry = numb -Dedud;
		}else if(SAnual < 349999.50 ) {
			 SmD = SAnual - 200000;
			 pApli = SmD * 0.20;
			 IA = pApli + 15000;
			 IrM = IA /12 ;
			  Dedud = INSS + IrM;
			     netSalry = numb -Dedud;
		}else if(SAnual  < 499999.50 ) {
			 SmD = SAnual - 350000;
			 pApli = SmD * 0.25;
			 IA = pApli + 45000;
			 IrM = IA /12 ;
			  Dedud = INSS + IrM;
			     netSalry = numb -Dedud;
		}else if(SAnual > 500000.50) {
			 SmD = SAnual - 500000;
			 pApli = SmD * 0.30;
			 IA = pApli + 82000;
			 IrM = IA /12 ;
			  Dedud = INSS  + IrM;
			     netSalry = numb -Dedud;
			     
			    final Object[] fila=new Object[12];
			     fila[0]=ID;
				  fila[1]=Name;
				  fila[2]=sName;
				  fila[3]=hrsT;
				  fila[4]=Tar;
				  fila[5]=hrsXtr;
				  fila[6]=XtrTar;
				  fila[7]=Brute;
				  fila[8]=inss;
				  fila[9]=IrM;
				  fila[10]=Dedud;
				  fila[11]=netSalry;
				  model.addRow(fila);
				 
				  
		  
			    
		}
		
	}

	protected void handleBtnNewButton_2ActionPerformed(ActionEvent e) {
		Principal p = new Principal();
		p.setVisible(true);
		p.setLocationRelativeTo(null);
		dispose();
	}
	protected void handleBorrarLineaActionPerformed(ActionEvent e) {
		
		int fila=HourTable.getSelectedRow();
		if(fila>=0)
		{
			model.removeRow(fila);
			JOptionPane.showMessageDialog(null, "Borrado de forma exitosa");
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error, selccione una fila");
		}
		
	}
	protected void handleBorrarTodoActionPerformed(ActionEvent e) {
		int borrarT = HourTable.getRowCount();
		
		for(int j=borrarT-1;j>=0; j--) {
			model.removeRow(j);
		}
		
	}
	protected void handleBtnNewButton_2_1ActionPerformed(ActionEvent e) {
		System.exit(EXIT_ON_CLOSE);
	}
}
