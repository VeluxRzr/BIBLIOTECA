package biblioteca.demo.run;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractAction;
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
private LibroController controller;
private JTable table;
private JTextPane textPane, textPane_1, textPane_2, textPane_3, textPane_4;	
private DefaultTableModel listadoDeSocios;
	
	public LibroView(LibroController controller) {
		initialice(controller);
	}

	private void initialice(LibroController controller) {

		listadoDeSocios = new DefaultTableModel(new Object[][] {
				},
				new String[] {
					"New column", "New column", "Edicion", "ISBM", "Autor", "Titulo"
				}
			);
		
		frmLibro = new JFrame();
		frmLibro.getContentPane().setBackground(SystemColor.controlHighlight);
		frmLibro.setTitle("LIBRERIA");
		frmLibro.setBounds(0, 0, 900, 400);
		frmLibro.setLocationRelativeTo(null);
		
		JButton btnNewButton_4 = new JButton("Volver a Menu");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frmLibro.dispose();
				BibliotecaView BibliotecaViewVista = new BibliotecaView();
			}
		});
		frmLibro.getContentPane().setLayout(new MigLayout("", "[53px][][][42px,grow][46px,grow][][][][][][60.00][]", "[][grow][][11px][23px][][11px][grow][23px][20px][20px][][20px][23px]"));
		
		JButton btnNewButton = new JButton("Añadir Libro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setToolTipText("");
		frmLibro.getContentPane().add(btnNewButton, "cell 0 0,alignx center,aligny bottom");
		
		JScrollPane scrollPane = new JScrollPane();
		frmLibro.getContentPane().add(scrollPane, "cell 2 0 9 7,grow");
		
		table = new JTable();
		table.setModel(listadoDeSocios);
		table.getColumnModel().getColumn(2).setPreferredWidth(147);
		scrollPane.setRowHeaderView(table);
		
		JButton btnNewButton_1 = new JButton("Borrar Libro");
		frmLibro.getContentPane().add(btnNewButton_1, "cell 0 1,alignx center,aligny top");
		
		JButton btnNewButton_2 = new JButton("Modificar Libro");
		frmLibro.getContentPane().add(btnNewButton_2, "cell 0 2,alignx center,aligny top");
		
		JButton btnNewButton_3 = new JButton("Buscar...");
		frmLibro.getContentPane().add(btnNewButton_3, "cell 2 7");
		
		textPane = new JTextPane();
		frmLibro.getContentPane().add(textPane, "cell 3 7 2 1,grow");
		
		JLabel lblNewLabel = new JLabel("ISBN");
		frmLibro.getContentPane().add(lblNewLabel, "cell 2 9,growx,aligny bottom");
		
		textPane_1 = new JTextPane();
		frmLibro.getContentPane().add(textPane_1, "cell 3 9 2 1,growx,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("Titulo");
		frmLibro.getContentPane().add(lblNewLabel_1, "cell 2 10,growx,aligny bottom");
		
		textPane_2 = new JTextPane();
		frmLibro.getContentPane().add(textPane_2, "cell 3 10 2 1,growx,aligny top");
		
		JLabel lblNewLabel_2 = new JLabel("Autor");
		frmLibro.getContentPane().add(lblNewLabel_2, "cell 2 11,growx,aligny bottom");
		
		textPane_3 = new JTextPane();
		frmLibro.getContentPane().add(textPane_3, "cell 3 11 2 1,growx,aligny top");
		
		JLabel lblNewLabel_3 = new JLabel("Edicion");
		frmLibro.getContentPane().add(lblNewLabel_3, "cell 2 12,growx,aligny center");
		
		textPane_4 = new JTextPane();
		frmLibro.getContentPane().add(textPane_4, "cell 3 12 2 1,growx,aligny top");
		frmLibro.getContentPane().add(btnNewButton_4, "cell 0 13,alignx left,aligny top");
		frmLibro.setVisible(true);
		
		asignarKeyBindings();
	}
		/**
		 * @wbp.parser.entryPoint
		 */
		private void asignarKeyBindings() {
    	
    	textPane_1.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "moverAlSiguiente");
        textPane_1.getActionMap().put("moverAlSiguiente", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane_2.requestFocus();
            }
        });
        // Keybinding para textPane_1
        textPane_2.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "moverAlSiguiente");
        textPane_2.getActionMap().put("moverAlSiguiente", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane_3.requestFocus();
            }
        });

        // Keybinding para textPane_2
        textPane_3.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "moverAlSiguiente");
        textPane_3.getActionMap().put("moverAlSiguiente", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane_4.requestFocus();
            }
        });

        // Keybinding para textPane_4
        textPane_4.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "moverAlSiguiente");
        textPane_4.getActionMap().put("moverAlSiguiente", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	textPane_1.requestFocus(); // Volver al primer campo (textPane)
            }
        });
        //frmLibro.getContentPane().add(btnEnvioAlmacen, "cell 0 5");
		frmLibro.setVisible(true);
	}
	
	public JFrame getFrame() {
		return this.frmLibro;
	}
	
	public void rellenaListaArticulos(Object[] rowArticulo) {
		
		//this.modeloArticulo.addRow(rowArticulo);	
		//this.table.setModel(modeloArticulo);
		
		
		
		}
}
