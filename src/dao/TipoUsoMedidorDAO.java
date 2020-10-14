package dao;

import model.TipoUsoMedidor;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * interface para el manejo de datos de la tabla TipoUsoMedidor
 */
public interface TipoUsoMedidorDAO {
    // Create tipoUsoMedidor
    boolean insertTipoUsoMedidor(TipoUsoMedidor tipoUsoMedidor) throws SQLException;

    // Read tipoUsoMedidor by idTipoUso
    public TipoUsoMedidor selectTipoUsoMedidor(int idTipoUso) throws SQLException;

    // Read all tipoUsoMedidor
    public ArrayList<TipoUsoMedidor> selectAllTipoUsoMedidor() throws SQLException;

    // Update tipoUsoMedidor
    public boolean updateTipoUsoMedidor(TipoUsoMedidor tipoUsoMedidor) throws SQLException;

    // Delete tipoUsoMedidor by idTipoUso
    public boolean deleteTipoUsoMedidor(int idTipoUso) throws SQLException;    
}
