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
import javax.swing.ImageIcon;
import java.awt.Color;

public class ListMonth extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable monthTable;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JTextField idTxt;
	private JTextField namesTxt;
	private JTextField snamesTxt;
	private JTextField minimunWage;
	private JButton guardarBtn;
	DefaultTableModel model;
	private JButton brrT;
	private JButton brrBtn;
	private final JLabel lblNewLabel_2 = new JLabel("");
	

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
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(344, 11, 671, 41);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("⬅");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(10, 11, 55, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(976, 447, 63, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 62, 105, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setForeground(Color.WHITE);
		lblNombres.setBounds(10, 87, 105, 14);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setBounds(10, 119, 105, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblHorasDeTrabajo = new JLabel("Salario Minimo");
		lblHorasDeTrabajo.setForeground(Color.WHITE);
		lblHorasDeTrabajo.setBounds(10, 144, 105, 14);
		contentPane.add(lblHorasDeTrabajo);
		
		idTxt = new JTextField();
		idTxt.setColumns(10);
		idTxt.setBounds(125, 59, 48, 20);
		contentPane.add(idTxt);
		
		namesTxt = new JTextField();
		namesTxt.setColumns(10);
		namesTxt.setBounds(125, 87, 365, 20);
		contentPane.add(namesTxt);
		
		snamesTxt = new JTextField();
		snamesTxt.setColumns(10);
		snamesTxt.setBounds(125, 112, 365, 20);
		contentPane.add(snamesTxt);
		
		minimunWage = new JTextField();
		minimunWage.setColumns(10);
		minimunWage.setBounds(125, 144, 92, 20);
		contentPane.add(minimunWage);
		
		guardarBtn = new JButton("Guardar");
		guardarBtn.setForeground(Color.WHITE);
		guardarBtn.setBackground(Color.DARK_GRAY);
		guardarBtn.addActionListener(this);
		guardarBtn.setBounds(625, 83, 128, 23);
		contentPane.add(guardarBtn);
		
		brrT = new JButton("Borrar Todo");
		brrT.setBackground(Color.DARK_GRAY);
		brrT.setForeground(Color.WHITE);
		brrT.addActionListener(this);
		brrT.setBounds(625, 141, 128, 23);
		contentPane.add(brrT);
		
		brrBtn = new JButton("Borrar Datos");
		brrBtn.setForeground(Color.WHITE);
		brrBtn.setBackground(Color.DARK_GRAY);
		brrBtn.addActionListener(this);
		brrBtn.setBounds(625, 115, 128, 23);
		contentPane.add(brrBtn);
		lblNewLabel_2.setIcon(new ImageIcon(ListMonth.class.getResource("/themes/List1.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1226, 481);
		contentPane.add(lblNewLabel_2);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == brrBtn) {
			brrAction(e);
		}
		if (e.getSource() == brrT) {
			brrTAction(e);
		}
		if (e.getSource() == guardarBtn) {
			handleBtnNewButton_1ActionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			handleBtnNewButton_2_1ActionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			handleBtnNewButton_2ActionPerformed(e);
		}
	}
	private void brrTAction(ActionEvent e) {
		
		int borrarT = monthTable.getRowCount();
		
		for(int j=borrarT-1;j>=0; j--) {
			model.removeRow(j);
		}
		
	}

	private void brrAction(ActionEvent e) {
		
		int fila=monthTable.getSelectedRow();
		if(fila>=0)
		{
			model.removeRow(fila);
			JOptionPane.showMessageDialog(null, "Borrado de forma exitosa");
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error");
		}
		
	}

	protected void handleBtnNewButton_2ActionPerformed(ActionEvent e) {
		Principal p = new Principal();
		p.setVisible(true);
		p.setLocationRelativeTo(null);
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

