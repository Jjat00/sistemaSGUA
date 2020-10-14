package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Factura;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla Factura
 */
public class FacturaDAOImp implements FacturaDAO {

    @Override
    public boolean insertFactura(Factura factura) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Factura selectFactura(long NoCuenta) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Factura> selectAllFacturas() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updateFactura(Factura factura) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteFactura(long NoCuenta) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
