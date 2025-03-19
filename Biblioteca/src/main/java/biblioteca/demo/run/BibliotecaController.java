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
	
	//a partir de aqui, implementamos los metodos de las funcionalidades correspondientes
	
	public void AniadirArticulosPedido(int i) {
		
		//metodo para rellenar la tabla de articulos y pedidos
		
		List<Object[]> lista=model.prestamoLibro(i);
		for (int j=0; i<lista.size();j++) {
		view.rellenaListaArticulos(lista.get(j));
		}
		
	//};
	

	public BibliotecaView getView() {
		return view;
	}

	public void setView(BibliotecaView view) {
		this.view = view;
	}

	public BibliotecaModel getModel() {
		return model;
	}

	public void setModel(BibliotecaModel model) {
		this.model = model;
	}

}



