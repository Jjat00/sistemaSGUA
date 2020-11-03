package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Uso;

/**
 *
 * interface para el manejo de datos de la tabla Uso
 */
public interface UsoDAO {

    // Read banco by id
    public Uso selectUsoByID(short id) throws SQLException;

    // Read Uso
    public ArrayList<Uso> selectAllUso() throws SQLException;
    
    
}
