package dao;

import model.Banco;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * interface para el manejo de datos del banco
 */
public interface BancoDAO {
    // Create banco
    boolean insertBanco(Banco banco) throws SQLException;

    // Read banco by idBanco
    public Banco selectBanco(int idBanco) throws SQLException;

    // Read Bancos
    public ArrayList<Banco> selectAllBancos() throws SQLException;

    // Update banco
    public boolean updateBanco(Banco banco) throws SQLException;

    // Delete banco by idBanco
    public boolean deleteBanco(int idBanco) throws SQLException;    
}
