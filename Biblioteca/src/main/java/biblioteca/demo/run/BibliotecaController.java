package biblioteca.demo.run;

import java.util.List;


public class BibliotecaController {

	private BibliotecaModel model;
	private BibliotecaView view;
	
	
	public void setVistaModel( BibliotecaView v , BibliotecaModel m) {
		this.model = m;
		this.view = v;
		//no hay inicializacion especifica del modelo, solo de la vista
		this.view.getFrame().setVisible(true);
	}
}
	
