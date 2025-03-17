package biblioteca.demo.util;

import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import biblioteca.demo.run.*;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Dimension;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;


/**
 * Punto de entrada principal que incluye botones para la ejecucion de las pantallas 
 * de las aplicaciones de ejemplo
 * y acciones de inicializacion de la base de datos.
 * No sigue MVC pues es solamente temporal para que durante el desarrollo se tenga posibilidad
 * de realizar acciones de inicializacion
 */
public class SwingMain {

	private JFrame frmGestorDeBiblioteca;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //NOSONAR codigo autogenerado
			public void run() {
				try {
					SwingMain window = new SwingMain();
					window.frmGestorDeBiblioteca.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); //NOSONAR codigo autogenerado
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestorDeBiblioteca = new JFrame();
		frmGestorDeBiblioteca.setTitle("Login Biblioteca");
		frmGestorDeBiblioteca.setBounds(0, 0, 287, 185);
		frmGestorDeBiblioteca.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		frmGestorDeBiblioteca.setBounds(0, 0, 900, 400);
		frmGestorDeBiblioteca.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		
		JTextPane textPane = new JTextPane();
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		
		passwordField = new JPasswordField();
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frmGestorDeBiblioteca.dispose();
			BibliotecaView bibliotecaViewVista = new BibliotecaView();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmGestorDeBiblioteca.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(127)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(117)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(117)
							.addComponent(lblNewLabel_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(117)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(btnNewButton)))
					.addContainerGap(679, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addComponent(lblNewLabel)
					.addGap(9)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(73)
					.addComponent(lblNewLabel_1)
					.addGap(7)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(121)
					.addComponent(btnNewButton)
					.addGap(21))
		);
		frmGestorDeBiblioteca.getContentPane().setLayout(groupLayout);
		
		//Database db = new Database(); //creo la base de datos de prueba
		
		//db.createDatabase(false); //le paso el valor falso porque considero que no esta creada aun
		//db.loadDatabase(); //cargo datos de prueba
		
	}
		
	public JFrame getFrame() { return this.frmGestorDeBiblioteca; }
	
}
