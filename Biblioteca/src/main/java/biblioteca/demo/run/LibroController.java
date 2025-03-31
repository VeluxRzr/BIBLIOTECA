package biblioteca.demo.run;

import java.util.List;

public class LibroController {


	private LibroModel model;
	private LibroView view;
	
	
	public void setVistaModel( LibroView v , LibroModel m) {
		this.model = m;
		this.view = v;
		//no hay inicializacion especifica del modelo, solo de la vista
		this.view.getFrame().setVisible(true);
	}
	//public void AniadirArticulosPedido(int i) {
	//metodo para rellenar la tabla de articulos y pedidos
	
	//List<Object[]> lista=model.AniadirArticulosPedido(i);
	//for (i=0; i<lista.size();i++) {
		//view.rellenaListaArticulos(lista.get(i));
	//}
	
//};

public LibroView getView() {
	return view;
}

public void setView(LibroView view) {
	this.view = view;
}

public LibroModel getModel() {
	return model;
}

public void setModel(LibroModel model) {
	this.model = model;
}

}
