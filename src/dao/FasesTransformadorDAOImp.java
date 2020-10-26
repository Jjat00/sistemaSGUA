package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FasesTransformador;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla FasesTransformador
 */
public class FasesTransformadorDAOImp implements FasesTransformadorDAO {

    @Override
    public boolean insertFasesTransformador(FasesTransformador fase) throws SQLException {
        boolean registrar = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO fases VALUES (NULL,"+fase.getIdFase()+","+fase.getTipo()+",)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        registrar = true;
        
        return registrar;
    }

    @Override
    public FasesTransformador selectFasesTransformador(int idFase) throws SQLException {
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM fases WHERE id = ?"; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        FasesTransformador fase = null;
        
        pstm.setLong(1, idFase);
        rs = pstm.executeQuery();
        if (rs.next()) {
            fase = getFasesTransformador(rs);
        }
        
        return fase;
    }

    @Override
    public ArrayList<FasesTransformador> selectAllFasesTransformador() throws SQLException {
        ArrayList<FasesTransformador> listaFasesTransformador = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT FROM fases ORDER BY id";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        rs = pstm.executeQuery(sql);
        while(rs.next()){
            FasesTransformador fase = getFasesTransformador(rs);
            listaFasesTransformador.add(fase);
        }
        
        return listaFasesTransformador;
    }

    @Override
    public boolean updateFasesTransformador(FasesTransformador fase) throws SQLException {
        boolean update = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE fases SET tipo="+fase.getTipo()+","+"WHERE id="+fase.getIdFase();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteFasesTransformador(int idFase) throws SQLException {
        boolean delete = false;
        FasesTransformador fase = selectFasesTransformador(idFase);
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM fases WHERE id="+fase.getIdFase();
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.execute(sql);
        delete = true;
        
        return delete;
    }
    
    private FasesTransformador getFasesTransformador(ResultSet rs) throws SQLException {
        int idFase = rs.getInt("id");
        String tipo = rs.getString("tipo");
        FasesTransformador fase = new FasesTransformador(idFase,tipo);
        return fase;
    }
}
