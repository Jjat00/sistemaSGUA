package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Pago;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla Pago
 */
public class PagoDAOImp implements PagoDAO {

    @Override
    public boolean insertPago(Pago pago) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pago selectPago(long idPago) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Pago> selectAllPagos() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updatePago(Pago pago) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deletePago(long idPago) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
