package biblioteca.demo.run;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;

import java.awt.Color;
import java.awt.SystemColor;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollBar; 

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SocioView {

protected JFrame frmSocio;
private JTable table;
private JTextPane textPane, textPane_1, textPane_2, textPane_3, textPane_4;	
	
	public SocioView() {
		initialice();
	}

	private void initialice() {

		frmSocio = new JFrame();
		frmSocio.setTitle("SOCIOS");
		frmSocio.getContentPane().setLayout(new MigLayout("", "[][][][grow]", "[grow][grow][grow][grow][grow][][][][][][][][][][][][][][][][][][][][][grow][][][][][][][][][][][]"));
		frmSocio.setBounds(0, 0, 900, 400);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		frmSocio.getContentPane().add(lblNewLabel, "cell 0 0");
		
	    textPane = new JTextPane();
		frmSocio.getContentPane().add(textPane, "cell 3 0,grow");
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		frmSocio.getContentPane().add(lblNewLabel_1, "cell 0 1");
		
		textPane_1 = new JTextPane();
		frmSocio.getContentPane().add(textPane_1, "cell 3 1,grow");
		
		JLabel lblNewLabel_2 = new JLabel("DNI");
		frmSocio.getContentPane().add(lblNewLabel_2, "cell 0 2");
		
		textPane_2 = new JTextPane();
		frmSocio.getContentPane().add(textPane_2, "cell 3 2,grow");
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de Nacimiento");
		frmSocio.getContentPane().add(lblNewLabel_3, "cell 0 3");
		
		textPane_3 = new JTextPane();
		frmSocio.getContentPane().add(textPane_3, "cell 3 3,grow");
		
		JLabel lblNewLabel_4 = new JLabel("Num. Socio");
		frmSocio.getContentPane().add(lblNewLabel_4, "cell 0 4");
		
		textPane_4 = new JTextPane();
		frmSocio.getContentPane().add(textPane_4, "cell 3 4,grow");
		
		JSeparator separator = new JSeparator();
		frmSocio.getContentPane().add(separator, "cell 0 6 4 1");
		
		// Tabla de socios
		JScrollPane scrollPane = new JScrollPane();
		frmSocio.getContentPane().add(scrollPane, "cell 3 7 1 27,grow");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellidos", "DNI", "Fecha de nacimiento", "Num. Socio", 
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(87);
		scrollPane.setViewportView(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		// Botones
		JButton btnNewButton = new JButton("Añadir Socio");
		frmSocio.getContentPane().add(btnNewButton, "cell 0 8");
		
		JButton btnNewButton_1 = new JButton("Borrar socio");
		frmSocio.getContentPane().add(btnNewButton_1, "cell 0 9");
		
		JButton btnNewButton_2 = new JButton("Modificar");
		frmSocio.getContentPane().add(btnNewButton_2, "cell 0 10");
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			BibliotecaView bibliotecaViewVista = new BibliotecaView();
			}
		});
		frmSocio.getContentPane().add(btnNewButton_3, "cell 0 31");
		
		// Asignación de keybinding para moverse entre campos
        asignarKeyBindings();

		
	     // Hacer visible la ventana
     	frmSocio.setVisible(true);
	}
     	// Método para asignar keybindings para cambiar el foco entre JTextPanes
        private void asignarKeyBindings() {
        	
        	textPane.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "moverAlSiguiente");
            textPane.getActionMap().put("moverAlSiguiente", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textPane_1.requestFocus();
                }
            });
            // Keybinding para textPane_1
            textPane_1.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "moverAlSiguiente");
            textPane_1.getActionMap().put("moverAlSiguiente", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textPane_2.requestFocus();
                }
            });

            // Keybinding para textPane_2
            textPane_2.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "moverAlSiguiente");
            textPane_2.getActionMap().put("moverAlSiguiente", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textPane_3.requestFocus();
                }
            });

            // Keybinding para textPane_3
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
                    textPane.requestFocus();  // Volver al primer campo (textPane)
                }
            });
        }

        public static void main(String[] args) {
            // Iniciar la vista de socios
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new SocioView();  // Crear y mostrar la ventana
                }
            });
        }
    }