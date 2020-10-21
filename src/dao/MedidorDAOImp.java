package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Medidor;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla Medidor
 */
public class MedidorDAOImp implements MedidorDAO {

    @Override
    public boolean insertMedidor(Medidor medidor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Medidor selectMedidor(long NoMedidor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Medidor> selectAllMedidores() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updateMedidor(Medidor medidor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteMedidor(long NoMedidor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
