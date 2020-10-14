package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteUbicacion;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla ClienteUbicacion
 */
public class ClienteUbicacionDAOImp implements ClienteUbicacionDAO {

    @Override
    public boolean insertClienteUbicacion(ClienteUbicacion clienteUbicacion) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ClienteUbicacion selectClienteUbicacion(long cedula) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<ClienteUbicacion> selectAllClienteUbicacion() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updateClienteUbicacion(ClienteUbicacion ClienteUbicacion) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteClienteUbicacion(long cedula) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
