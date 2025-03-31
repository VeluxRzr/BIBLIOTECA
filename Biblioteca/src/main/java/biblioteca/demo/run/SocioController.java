package biblioteca.demo.run;

import java.util.List;

public class SocioController {


	private PrestamoModel model;
	private PrestamoView view;
	
	
	public void setVistaModel( PrestamoView v , PrestamoModel m) {
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
	
	public PrestamoView getView() {
		return view;
	}

	public void setView(PrestamoView view) {
		this.view = view;
	}

	public PrestamoModel getModel() {
		return model;
	}

	public void setModel(PrestamoModel model) {
		this.model = model;
	}

}

