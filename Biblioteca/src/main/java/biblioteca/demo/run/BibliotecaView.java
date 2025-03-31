package biblioteca.demo.run;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import biblioteca.demo.util.Database;

import java.awt.Component;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import javax.swing.*;
import java.awt.*;


public class BibliotecaView {

	protected JFrame frmBiblioteca;
	
	 public BibliotecaView() {
		// TODO Auto-generated constructor stub
		initialize();
	} 

	private void initialize() {

	if (frmBiblioteca == null) {
		frmBiblioteca = new JFrame();
		frmBiblioteca.getContentPane().setBackground(SystemColor.controlHighlight);
		frmBiblioteca.setTitle("GESTION DE BIBLIOTECA");
		frmBiblioteca.setBounds(0, 0, 900, 400);
		frmBiblioteca.setLocationRelativeTo(null);
       	JButton btnNewButton = new JButton("PRESTAMO LIBRO ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBiblioteca.dispose();
				PrestamoView prestamoViewVista = new PrestamoView();
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnNewButton_2 = new JButton("GESTION DE SOCIOS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBiblioteca.dispose();
				SocioView socioViewVista = new SocioView();
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnNewButton_3 = new JButton("GESTION DE LIBROS");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBiblioteca.dispose();
				LibroView libroViewVista = new LibroView();
			}
		});
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnNewButton_4 = new JButton("Cerrar Sesion");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBiblioteca.dispose();
				
			}
		});
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		GroupLayout groupLayout = new GroupLayout(frmBiblioteca.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(350)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(362)
							.addComponent(btnNewButton)))
					.addContainerGap(357, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(100)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(122)
					.addComponent(btnNewButton_4)
					.addContainerGap())
		);
		frmBiblioteca.getContentPane().setLayout(groupLayout);
		frmBiblioteca.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnNewButton, btnNewButton_2, btnNewButton_3, btnNewButton_4}));
		frmBiblioteca.setVisible(true);
	
	Database db = new Database(); //creo la base de datos de prueba
		
		db.createDatabase(false); //le paso el valor falso porque considero que no esta creada aun
		db.loadDatabase(); //cargo datos de prueba
	}
	}
	
	public JFrame getFrame() {
	        return frmBiblioteca;
	 }
}
