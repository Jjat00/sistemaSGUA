package dao;

import model.TransformadorUbicacion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * interface para el manejo de datos de la tabla TransformadorUbicacion
 */
public interface TransformadorUbicacionDAO {
    // Create nuevo transformadorUbicacion
    boolean insertTransformadorUbicacion(TransformadorUbicacion transformadorUbicacion) throws SQLException;

    // Read transformadorUbicacion by idTransformador
    public TransformadorUbicacion selectTransformadorUbicacion(long idTransformador) throws SQLException;

    // Read all transformadorUbicacion
    public ArrayList<TransformadorUbicacion> selectAllTransformadores() throws SQLException;

    // Update transformadorUbicacion
    public boolean updateTransformadorUbicacion(TransformadorUbicacion transformadorUbicacion) throws SQLException;

    // Delete transformadorUbicacion by idTransformador
    public boolean deleteTransformadorUbicacion(long idTransformador) throws SQLException;    
}
