package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.TransformadorUbicacion;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla TransformadorUbicacion
 */
public class TransformadorUbicacionDAOImp implements TransformadorUbicacionDAO{

    @Override
    public boolean insertTransformadorUbicacion(TransformadorUbicacion transformadorUbicacion) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TransformadorUbicacion selectTransformadorUbicacion(long idTransformador) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<TransformadorUbicacion> selectAllTransformadores() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updateTransformadorUbicacion(TransformadorUbicacion transformadorUbicacion) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteTransformadorUbicacion(long idTransformador) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
