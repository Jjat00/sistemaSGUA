package dao;

import model.MetodoPago;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * interface para el manejo de datos del metodo de pago
 */
public interface MetodoPagoDAO {

    // Read banco by idMetodoPago
    public MetodoPago selectMetodoPagoByID(short metodoPago) throws SQLException;

    // Read metodoPago
    public ArrayList<MetodoPago> selectAllMetodoPago() throws SQLException;
}
