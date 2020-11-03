package dao;

import model.Pago;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * interface para el manejo de datos de la tabla Pago
 */
public interface PagoDAO {
    // Create nuevo pago
    boolean insertPago(Pago pago) throws SQLException;

    // Read pago by idPago
    public Pago selectPago(int idPago) throws SQLException;

    // Read all Pagos
    public ArrayList<Pago> selectAllPagos() throws SQLException;

    // Update pago
    public boolean updatePago(Pago pago) throws SQLException;

    // Delete pago by idPago
    public boolean deletePago(int idPago) throws SQLException;    
}
