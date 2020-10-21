package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Banco;

/**
 *
 * implementacion de la interface para el manejo de datos del banco
 */
public class BancoDAOImp implements BancoDAO {

    @Override
    public boolean insertBanco(Banco banco) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Banco selectBanco(int idBanco) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Banco> selectAllBancos() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updateBanco(Banco banco) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteBanco(int idBanco) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
