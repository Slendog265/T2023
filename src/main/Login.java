package main;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import src.Principal;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton_1;
	
	themePanel fondo = new themePanel();
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Login frame = new Login();
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
	public Login() {
		
		setResizable(false);
		setTitle("Inicio de Sesion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(101, 28, 230, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(81, 129, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de Usuario");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(47, 82, 134, 14);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Iniciar Sesion");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(178, 174, 112, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(178, 79, 199, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(178, 126, 199, 20);
		contentPane.add(passwordField);
		
		btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(361, 227, 63, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/themes/Login.jpg")));
		lblNewLabel_3.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_3);
		btnNewButton.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			handleBtnNewButton_1ActionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			handleBtnNewButtonActionPerformed(e);
		}
	}
	protected void handleBtnNewButtonActionPerformed(ActionEvent e) {
		char[] clave = passwordField.getPassword();
		String cFinal = new String (clave);
		
		if (textField.getText().equals("Alvaro") && cFinal.equals("Docente")) {
			dispose();
			//JOptionPane.showMessageDialog(null, "Bienvenido al Sistema","Bienvenido", JOptionPane.INFORMATION_MESSAGE);
			Principal p = new Principal();
			p.setVisible(true);
			p.setLocationRelativeTo(null);
			
		}else{
			JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos","Error",
			JOptionPane.ERROR_MESSAGE);
		}
	}

	protected void handleBtnNewButton_1ActionPerformed(ActionEvent e) {
		System.exit(EXIT_ON_CLOSE);
	}
	
	class themePanel extends JPanel{
		
		private Image imagen;
		
		public void paint (Graphics g) {
			imagen = new ImageIcon(getClass().getResource("/themes/Login.jpg")).getImage();
			g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			
			setOpaque(false);
			
			super.paint(g);
		}
		
	}
}
