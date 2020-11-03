package dao;

import model.Transformador;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * interface para el manejo de datos de la tabla Transformador
 */
public interface TransformadorDAO {
    // Create nuevo transformador
    boolean insertTransformador(Transformador transformador) throws SQLException;

    // Read Transformador by idTransformador
    public Transformador selectTransformador(int idTransformador) throws SQLException;

    // Read all transformadores
    public ArrayList<Transformador> selectAllTransformadores() throws SQLException;

    // Update transformador
    public boolean updateTransformador(Transformador transformador) throws SQLException;

    // Delete Transformador by idTransformador
    public boolean deleteTransformador(int idTransformador) throws SQLException;    

}
