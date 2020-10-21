package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * implementacion de la interface para el manejo de datos de la tabla cliente
 */
public class ClienteDAOImp implements ClienteDAO{

    @Override
    public boolean insertCliente(Cliente cliente) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cliente selectCliente(long cedula) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Cliente> selectAllClientes() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updateCliente(Cliente cliente) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteCliente(long cedula) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
