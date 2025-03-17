package biblioteca.demo.run;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class LibroView {

protected JFrame frmLibro;
private JTable table;
	
	
	public LibroView() {
		initialice();
	}

	private void initialice() {

		frmLibro = new JFrame();
		frmLibro.getContentPane().setBackground(SystemColor.controlHighlight);
		frmLibro.setTitle("LIBRERIA");
		frmLibro.setBounds(0, 0, 900, 400);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Edicion", "ISBN", "Autor", "Libro"
			}
		));
		table.setToolTipText("LIBROS");
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Añadir Libro");
		btnNewButton.setToolTipText("");
		
		JButton btnNewButton_1 = new JButton("Borrar Libro");
		
		JButton btnNewButton_2 = new JButton("Modificar Libro");
		
		JTextPane textPane_2 = new JTextPane();
		
		JLabel lblNewLabel = new JLabel("ISBN");
		
		JLabel lblNewLabel_1 = new JLabel("Titulo");
		
		JLabel lblNewLabel_2 = new JLabel("Autor");
		
		JLabel lblNewLabel_3 = new JLabel("Edicion");
		
		JButton btnNewButton_4 = new JButton("Sailr");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			BibliotecaView BibliotecaViewVista = new BibliotecaView();
			}
		});
		
		JTextPane textPane_2_1 = new JTextPane();
		
		JTextPane textPane_2_2 = new JTextPane();
		
		JTextPane textPane_2_3 = new JTextPane();
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollPane.setColumnHeaderView(scrollBar_1);
		frmLibro.getContentPane().setLayout(new MigLayout("", "[53px][42px][46px][267px]", "[37px][11px][23px][11px][23px][20px][20px][20px][23px]"));
		frmLibro.getContentPane().add(btnNewButton_1, "cell 0 2 3 1,alignx center,aligny top");
		frmLibro.getContentPane().add(btnNewButton_2, "cell 0 4 3 1,alignx center,aligny top");
		frmLibro.getContentPane().add(btnNewButton, "cell 0 0 3 1,alignx center,aligny bottom");
		frmLibro.getContentPane().add(lblNewLabel, "cell 2 5,growx,aligny bottom");
		frmLibro.getContentPane().add(lblNewLabel_1, "cell 2 6,growx,aligny bottom");
		frmLibro.getContentPane().add(btnNewButton_4, "cell 0 8,alignx left,aligny top");
		frmLibro.getContentPane().add(lblNewLabel_3, "cell 2 8,growx,aligny center");
		frmLibro.getContentPane().add(lblNewLabel_2, "cell 2 7,growx,aligny bottom");
		frmLibro.getContentPane().add(scrollPane, "cell 3 0 1 5,grow");
		frmLibro.getContentPane().add(textPane_2_2, "cell 3 6,growx,aligny top");
		frmLibro.getContentPane().add(textPane_2_1, "cell 3 5,growx,aligny top");
		frmLibro.getContentPane().add(textPane_2_3, "cell 3 7,growx,aligny top");
		frmLibro.getContentPane().add(textPane_2, "cell 3 8,growx,aligny top");
		frmLibro.setVisible(true);
	}
}