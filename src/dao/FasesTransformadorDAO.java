package dao;

import model.FasesTransformador;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * interface para el manejo de datos de la tabla FasesTransformador
 */
public interface FasesTransformadorDAO {
    // Create fasesTransformador
    boolean insertFasesTransformador(FasesTransformador fasesTransformador) throws SQLException;

    // Read fasesTransformador by idFase
    public FasesTransformador selectFasesTransformador(int idFase) throws SQLException;

    // Read all fasesTransformador
    public ArrayList<FasesTransformador> selectAllFasesTransformador() throws SQLException;

    // Update fasesTransformador
    public boolean updateFasesTransformador(FasesTransformador fasesTransformador) throws SQLException;

    // Delete fasesTransformador by idFase
    public boolean deleteFasesTransformador(int idFase) throws SQLException;    
}
