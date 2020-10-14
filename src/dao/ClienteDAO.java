package dao;

import model.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * interface para el manejo de datos de la tabla cliente
 */
public interface ClienteDAO {
    // Create cliente
    boolean insertCliente(Cliente cliente) throws SQLException;

    // Read cliente by cedula
    public Cliente selectCliente(long cedula) throws SQLException;

    // Read clientes
    public ArrayList<Cliente> selectAllClientes() throws SQLException;

    // Update cliente
    public boolean updateCliente(Cliente cliente) throws SQLException;

    // Delete cliente by cedula
    public boolean deleteCliente(long cedula) throws SQLException;
}
