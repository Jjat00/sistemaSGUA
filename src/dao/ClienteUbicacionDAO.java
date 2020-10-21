package dao;

import model.ClienteUbicacion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * interface para el manejo de datos de la tabla ClienteUbicacion
 */
public interface ClienteUbicacionDAO {
    // Create clienteUbicacion
    boolean insertClienteUbicacion(ClienteUbicacion clienteUbicacion) throws SQLException;

    // Read clienteUbicacion by cedula
    public ClienteUbicacion selectClienteUbicacion(long cedula) throws SQLException;

    // Read all clienteUbicacion
    public ArrayList<ClienteUbicacion> selectAllClienteUbicacion() throws SQLException;

    // Update clienteUbicacion
    public boolean updateClienteUbicacion(ClienteUbicacion ClienteUbicacion) throws SQLException;

    // Delete clienteUbicacion by cedula
    public boolean deleteClienteUbicacion(long cedula) throws SQLException;    
}
