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
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class ListMonth extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable monthTable;
	private JButton btnNewButton;
	private JButton btnAgregarALa;
	private JButton btnNewButton_2;
	private JTextField idTxt;
	private JTextField namesTxt;
	private JTextField snamesTxt;
	private JTextField minimunWage;
	private JButton guardarBtn;
	DefaultTableModel model;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListMonth frame = new ListMonth();
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
	public ListMonth() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1242, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 175, 1200, 263);
		contentPane.add(scrollPane);
		
		monthTable = new JTable();
		model = new DefaultTableModel();
		monthTable.setModel(model);
		model.addColumn("ID");
		model.addColumn("Nombres");
		model.addColumn("Apellidos");
		model.addColumn("Salario Minimo");
		model.addColumn("INSS");
		model.addColumn("IR");
		model.addColumn("Deducciones");
		model.addColumn("Salario Neto");
		
		/**monthTable.getColumnModel().getColumn(0).setPreferredWidth(20);
		monthTable.getColumnModel().getColumn(1).setResizable(false);
		monthTable.getColumnModel().getColumn(1).setPreferredWidth(120);
		monthTable.getColumnModel().getColumn(2).setResizable(false);
		monthTable.getColumnModel().getColumn(2).setPreferredWidth(120);
		monthTable.getColumnModel().getColumn(3).setPreferredWidth(85);
		monthTable.getColumnModel().getColumn(4).setPreferredWidth(65);
		monthTable.getColumnModel().getColumn(5).setPreferredWidth(65);
		monthTable.getColumnModel().getColumn(6).setPreferredWidth(80);**/
		scrollPane.setViewportView(monthTable);
		
		JLabel lblNewLabel = new JLabel("Lista de Empleados por Mes");
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
		
		btnAgregarALa = new JButton("Agregar a la lista");
		btnAgregarALa.addActionListener(this);
		btnAgregarALa.setBounds(821, 447, 145, 23);
		contentPane.add(btnAgregarALa);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(10, 62, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(10, 87, 92, 14);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 119, 92, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblHorasDeTrabajo = new JLabel("Salario Minimo");
		lblHorasDeTrabajo.setBounds(10, 144, 92, 14);
		contentPane.add(lblHorasDeTrabajo);
		
		idTxt = new JTextField();
		idTxt.setColumns(10);
		idTxt.setBounds(80, 59, 48, 20);
		contentPane.add(idTxt);
		
		namesTxt = new JTextField();
		namesTxt.setColumns(10);
		namesTxt.setBounds(80, 87, 365, 20);
		contentPane.add(namesTxt);
		
		snamesTxt = new JTextField();
		snamesTxt.setColumns(10);
		snamesTxt.setBounds(80, 112, 365, 20);
		contentPane.add(snamesTxt);
		
		minimunWage = new JTextField();
		minimunWage.setColumns(10);
		minimunWage.setBounds(80, 144, 92, 20);
		contentPane.add(minimunWage);
		
		guardarBtn = new JButton("Guardar");
		guardarBtn.addActionListener(this);
		guardarBtn.setBounds(501, 83, 89, 23);
		contentPane.add(guardarBtn);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == guardarBtn) {
			handleBtnNewButton_1ActionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			handleBtnNewButton_2_1ActionPerformed(e);
		}
		if (e.getSource() == btnAgregarALa) {
			handleBtnAgregarALaActionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			handleBtnNewButton_2ActionPerformed(e);
		}
	}
	protected void handleBtnNewButton_2ActionPerformed(ActionEvent e) {
		EmployeeMonth em = new EmployeeMonth();
		em.setVisible(true);
		em.setLocationRelativeTo(null);
		dispose();
	}
	protected void handleBtnAgregarALaActionPerformed(ActionEvent e) {
		DataMonth em = new DataMonth();
		em.setVisible(true);
		em.setLocationRelativeTo(null);
		dispose();
	}
	protected void handleBtnNewButton_2_1ActionPerformed(ActionEvent e) {
		System.exit(EXIT_ON_CLOSE);
	}
	protected void handleBtnNewButton_1ActionPerformed(ActionEvent e) {
		double SmD, IrM = 0, pApli,Dedud = 0, netSalry = 0, IA, INSS, BImpo, SAnual;
		String ID = idTxt.getText();
		String Name = namesTxt.getText();
		String sName = snamesTxt.getText();
		int Wage = Integer.parseInt(minimunWage.getText());	
			
		
		INSS = Wage * 0.07;
		 BImpo = Wage - INSS;
		 SAnual = BImpo * 12;
		if(SAnual <  199999  ) {
			 SmD = SAnual - 100000;
			 pApli = SmD * 0.15;
			 IrM = pApli/12;
			  Dedud = INSS +IrM;
			     netSalry = Wage -Dedud;
		}
		else if(SAnual < 349999 ) {
			 SmD = SAnual - 200000;
			 pApli = SmD * 0.20;
			 IA = pApli + 15000;
			 IrM = IA /12 ;
			  Dedud = INSS + IrM;
			     netSalry = Wage -Dedud;
		}else if(SAnual  < 499999 ) {
			 SmD = SAnual - 350000;
			 pApli = SmD * 0.25;
			 IA = pApli + 45000;
			 IrM = IA /12 ;	
			  Dedud = INSS + IrM;
			     netSalry = Wage -Dedud;
		}else if(SAnual > 500000) {
			 SmD = SAnual - 500000;
			 pApli = SmD * 0.30;
			 IA = pApli + 82000;
			 IrM = IA /12 ;
			  Dedud = INSS  + IrM;
			     netSalry = Wage -Dedud;
			     
			  Object[] fila=new Object[8];
			  fila[0]=ID;
			  fila[1]=Name;
			  fila[2]=sName;
			  fila[3]=Wage;
			  fila[4]=INSS;
			  fila[5]=IrM;
			  fila[6]=Dedud;
			  fila[7]=netSalry;
			 
			  
			  model.addRow(fila);
			     
		}   
			   
		}
	
	}

