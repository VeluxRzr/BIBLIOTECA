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
	 
	public class Controller {

	    // Método para agregar el socio a la base de datos
	    public void aniadirSocio(int numeroSocio, String nombre, String apellidos, String dni, String fechaNacimiento) {
	        // URL de la base de datos SQLite
	        String url = "jdbc:sqlite:socios.db"; // Asegúrate de que la base de datos "socios.db" exista o se cree automáticamente

	        // Consulta SQL para insertar un nuevo socio
	        String query = "INSERT INTO socios (numeroSocio, nombre, apellidos, dni, fechaNacimiento) VALUES (?, ?, ?, ?, ?)";

	        try (Connection conn = DriverManager.getConnection(url);
	             PreparedStatement pstmt = conn.prepareStatement(query)) {

	            // Establecer los parámetros de la consulta
	            pstmt.setInt(1, numeroSocio);
	            pstmt.setString(2, nombre);
	            pstmt.setString(3, apellidos);
	            pstmt.setString(4, dni);
	            pstmt.setString(5, fechaNacimiento); // La fecha debe estar en formato "yyyy-MM-dd"

	            // Ejecutar la inserción
	            int rowsAffected = pstmt.executeUpdate();

	            if (rowsAffected > 0) {
	                System.out.println("Socio agregado correctamente.");
	            } else {
	                System.out.println("No se pudo agregar el socio.");
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("Error al agregar el socio: " + e.getMessage());
	        }
	    }
	}
	
	
	
	
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

