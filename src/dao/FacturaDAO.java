package dao;

import model.Factura;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * interface para el manejo de datos de la tabla Factura
 */
public interface FacturaDAO {
    // Create factura
    boolean insertFactura(Factura factura) throws SQLException;

    // Read factura by NoCuenta
    public Factura selectFactura(int NoCuenta) throws SQLException;

    // Read all facturas
    public ArrayList<Factura> selectAllFacturas() throws SQLException;

    // Update factura
    public boolean updateFactura(Factura factura) throws SQLException;

    // Update factura
    public boolean updateFacturaByID(int idFactura, boolean estadoPago) throws SQLException;

    // Delete factura by NoCuenta
    public boolean deleteFactura(int NoCuenta) throws SQLException;    
}
