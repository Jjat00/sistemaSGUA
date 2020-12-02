package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Reporte;

/**
 *
 * interface para el manejo del reporte
 */
public interface ReporteDAO {
    
    // Read all Pagos
    public ArrayList<Reporte> selectAllPagos() throws SQLException;
    
}
