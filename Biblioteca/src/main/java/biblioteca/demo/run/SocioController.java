package biblioteca.demo.run;

import java.util.List;

public class SocioController {


	private SocioModel model;
	private SocioView view;
	
	
	public void setVistaModel( SocioView v , SocioModel m) {
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
	
	public SocioView getView() {
		return view;
	}

	public void setView(SocioView view) {
		this.view = view;
	}

	public SocioModel getModel() {
		return model;
	}

	public void setModel(SocioModel model) {
		this.model = model;
	}

}

