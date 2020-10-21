package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.TipoUsoMedidor;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla TipoUsoMedidor
 */
public class TipoUsoMedidorDAOImp implements TipoUsoMedidorDAO {

    @Override
    public boolean insertTipoUsoMedidor(TipoUsoMedidor tipoUsoMedidor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TipoUsoMedidor selectTipoUsoMedidor(int idTipoUso) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<TipoUsoMedidor> selectAllTipoUsoMedidor() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updateTipoUsoMedidor(TipoUsoMedidor tipoUsoMedidor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteTipoUsoMedidor(int idTipoUso) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
