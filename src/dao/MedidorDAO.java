package dao;

import model.Medidor;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * interface para el manejo de datos de la tabla Medidor
 */
public interface MedidorDAO {
    // Create medidor
    boolean insertMedidor(Medidor medidor) throws SQLException;

    // Read medidor by NoMedidor
    public Medidor selectMedidor(long NoMedidor) throws SQLException;

    // Read all medidores
    public ArrayList<Medidor> selectAllMedidores() throws SQLException;

    // Update medidor
    public boolean updateMedidor(Medidor medidor) throws SQLException;

    // Delete medidor by NoMedidor
    public boolean deleteMedidor(long NoMedidor) throws SQLException;    
}
