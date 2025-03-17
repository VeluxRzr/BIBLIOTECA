package biblioteca.demo.run;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class PrestamoView {

protected JFrame frmPrestamo;
private JTable table;
private JTable table_1;
	
	
	public PrestamoView() {
		initialice();
	}

	private void initialice() {

		frmPrestamo = new JFrame();
		frmPrestamo.setTitle("PRESTAMO LIBROS");
		frmPrestamo.setBounds(0, 0, 900, 400);
		frmPrestamo.getContentPane().setLayout(new MigLayout("", "[][grow][grow][][][][][][111.00,grow][][grow][][][][][][]", "[][grow][][grow][][grow][][][][][][grow][][]"));
		frmPrestamo.setLocationRelativeTo(null);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		frmPrestamo.getContentPane().add(lblIsbn, "cell 2 0");
		
		JLabel lblNewLabel = new JLabel("Num. Socio:");
		frmPrestamo.getContentPane().add(lblNewLabel, "cell 8 0");
		
		JButton btnNewButton = new JButton("Nuevo Prestamo");
		frmPrestamo.getContentPane().add(btnNewButton, "cell 0 1");
		
		JTextPane textPane = new JTextPane();
		frmPrestamo.getContentPane().add(textPane, "cell 2 1 3 1,grow");
		
		JTextPane textPane_1 = new JTextPane();
		frmPrestamo.getContentPane().add(textPane_1, "cell 8 1 3 1,grow");
		
		JButton btnNewButton_1 = new JButton("Baja Prestamo");
		frmPrestamo.getContentPane().add(btnNewButton_1, "cell 0 2");
		
		JLabel lblNewLabel_1 = new JLabel("SELECCIONE LIBRO");
		frmPrestamo.getContentPane().add(lblNewLabel_1, "cell 0 4");
		
		JLabel lblNewLabel_2 = new JLabel("SELECCIONE SOCIO");
		frmPrestamo.getContentPane().add(lblNewLabel_2, "cell 8 4");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		frmPrestamo.getContentPane().add(scrollPane_1, "cell 8 5 9 6,grow");
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Num. Socio", "Nombre", "Apellidos", "DNI"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(147);
		scrollPane_1.setViewportView(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		frmPrestamo.getContentPane().add(scrollPane, "cell 0 5 7 6,grow");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				    "ISBN", "Titulo", "Autor", "Edicion"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_2 = new JButton("Buscar...");
		frmPrestamo.getContentPane().add(btnNewButton_2, "cell 0 11,alignx left");
		
		JTextPane textPane_2 = new JTextPane();
		frmPrestamo.getContentPane().add(textPane_2, "cell 1 11 3 1,grow");
		
		JButton btnNewButton_4 = new JButton("Buscar...");
		frmPrestamo.getContentPane().add(btnNewButton_4, "cell 8 11,alignx left");
		
		JTextPane textPane_3 = new JTextPane();
		frmPrestamo.getContentPane().add(textPane_3, "cell 9 11 5 1,grow");
		
		JButton btnNewButton_3 = new JButton("Volver a Menu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frmPrestamo.dispose();
				BibliotecaView BibliotecaViewVista = new BibliotecaView();
			}
		});
		frmPrestamo.getContentPane().add(btnNewButton_3, "cell 0 13");
		{
		frmPrestamo.setVisible(true);	
		}		
	}
}