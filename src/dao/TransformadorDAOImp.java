package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Transformador;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla Transformador
 */
public class TransformadorDAOImp implements TransformadorDAO {

    @Override
    public boolean insertTransformador(Transformador transformador) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Transformador selectTransformador(long idTransformador) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Transformador> selectAllTransformadores() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updateTransformador(Transformador transformador) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteTransformador(long idTransformador) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
