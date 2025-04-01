package biblioteca.demo.run;

import java.util.List;

import biblioteca.demo.util.Database;

public class SocioModel {
	
	Database db = new Database();

	public List<Object[]> AniadirSocio(int i) {
		// TODO Auto-generated method stub
		List<Object[]> lista = null;
		
		String sql = "SELECT * FROM ARTICULOPEDIDO WHERE IDPEDIDO = ?";
		lista = db.executeQueryArray(sql, i);
		return lista;
	}
	

//"Num. Socio", "Nombre", "Apellidos", "DNI", "Fecha de nacimiento"
// Método para insertar un nuevo socio en la base de datos
public boolean insertarSocio(int numSocio, String nombre, String apellidos, String dni, java.sql.Date fechaNacimiento) {
    String sql = "INSERT INTO socios (NUMSOCIO, NOMBRE, APELLIDOS, DNI, FECHA_NACIMIENTO) VALUES (?, ?, ?, ?, ?)";
    
    try (Connection connection = Database.getConnection(); 
         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        
        preparedStatement.setInt(1, numSocio);
        preparedStatement.setString(2, nombre);
        preparedStatement.setString(3, apellidos);
        preparedStatement.setString(4, dni);
        preparedStatement.setDate(5, fechaNacimiento); // Asegúrate de que 'fechaNacimiento' es de tipo java.sql.Date
        
        int rowsAffected = preparedStatement.executeUpdate();
        
        // Retorna verdadero si se insertó correctamente
        return rowsAffected > 0;
        
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
}