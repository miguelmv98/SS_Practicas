package es.unican.ss.franquiciasUCPersitence;

import java.sql.ResultSet;
import java.sql.SQLException;


import es.unican.ss.franquiciasUCCommon.domain.Direccion;
import es.unican.ss.franquiciasUCCommon.domain.Tienda;
import es.unican.ss.franquiciasUCCommon.exceptions.DataAccessException;

/**
 * Clase de utilidad que mapea filas de la base de datos a objetos 
 * de tipo Tienda.
 */
public class TiendaMapper {
	
	
	/**
	 * Recibe un ResultSet de una Tienda y devuelve un
	 * objeto Tienda con los datos del ResultSet
	 * @param results Fila resultado de una consulta en base de datos
	 * @return Tienda
	 */
	public static Tienda toTienda(ResultSet results) throws DataAccessException {

		Tienda t = null;
		try {
			long id = results.getInt("id");
			String nombre = results.getString("nombre");
			String calle = results.getString("calle");
			String localidad = results.getString("localidad");
			String codigoPostal = results.getString("codigoPostal");
			Direccion dire = new Direccion (calle, localidad, codigoPostal);
			t = new Tienda(nombre, dire);
			t.setId(id);
		} catch (SQLException e) {
			throw new DataAccessException();
		}
		
		return t;
	}

}
