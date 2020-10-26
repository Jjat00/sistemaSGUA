package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.TipoUsoMedidor;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla TipoUsoMedidor
 */
public class TipoUsoMedidorDAOImp implements TipoUsoMedidorDAO {

    @Override
    public boolean insertTipoUsoMedidor(TipoUsoMedidor tipoUso) throws SQLException {
        boolean registrar = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO uso VALUES (NULL,"+tipoUso.getIdTipoUso()+","+tipoUso.getTipo()+",";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        registrar = true;
        
        return registrar;
    }

    @Override
    public TipoUsoMedidor selectTipoUsoMedidor(int idTipoUso) throws SQLException {
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM uso WHERE id = ?"; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        TipoUsoMedidor tipoUso = null;
        
        pstm.setLong(1, idTipoUso);
        rs = pstm.executeQuery();
        if (rs.next()) {
            tipoUso = getTipoUso(rs);
        }
        
        return tipoUso;
    }

    @Override
    public ArrayList<TipoUsoMedidor> selectAllTipoUsoMedidor() throws SQLException {
        ArrayList<TipoUsoMedidor> listaTipoUso = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT FROM uso ORDER BY id";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        rs = pstm.executeQuery(sql);
        while(rs.next()){
            TipoUsoMedidor tipoUso = getTipoUso(rs);
            listaTipoUso.add(tipoUso);
        }
        
        return listaTipoUso;
    }

    @Override
    public boolean updateTipoUsoMedidor(TipoUsoMedidor tipoUso) throws SQLException {
        boolean update = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE uso SET tipo="+tipoUso.getTipo()+","+"WHERE id="+tipoUso.getIdTipoUso();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteTipoUsoMedidor(int idTipoUso) throws SQLException {
        boolean delete = false;
        TipoUsoMedidor tipoUso = selectTipoUsoMedidor(idTipoUso);
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM uso WHERE id="+tipoUso.getIdTipoUso();
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.execute(sql);
        delete = true;
        
        return delete;
    }
    
    private TipoUsoMedidor getTipoUso(ResultSet rs) throws SQLException {
        int idTipoUso = rs.getInt("id");
        String tipo = rs.getString("tipo");
        TipoUsoMedidor tipoUso = new TipoUsoMedidor(idTipoUso,tipo);
        return tipoUso;
    }
}
