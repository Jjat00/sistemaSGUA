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
    public boolean insertTipoUsoMedidor(TipoUsoMedidor tipoUsoMedidor) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO uso VALUES ('" + tipoUsoMedidor.getIdTipoUso() + "','" + tipoUsoMedidor.getTipo()+  "')";
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
        
    }

    @Override
    public TipoUsoMedidor selectTipoUsoMedidor(int idTipoUso) throws SQLException {
        
        TipoUsoMedidor tipoUsoMedidor = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM uso WHERE id = " + idTipoUso; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            tipoUsoMedidor = getTipoUsoMedidor(rs);
        }
        
        return tipoUsoMedidor;
        
    }

    @Override
    public ArrayList<TipoUsoMedidor> selectAllTipoUsoMedidor() throws SQLException {
        
        ArrayList<TipoUsoMedidor> listaTipoUsoMedidor = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM uso ORDER BY id";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs =  pstm.executeQuery();
        while(rs.next()){
            TipoUsoMedidor tipoUsoMedidor = getTipoUsoMedidor(rs);
            listaTipoUsoMedidor.add(tipoUsoMedidor);
        }
        
        return listaTipoUsoMedidor;
        
    }

    @Override
    public boolean updateTipoUsoMedidor(TipoUsoMedidor tipoUsoMedidor) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE uso SET tipo = '" + tipoUsoMedidor.getTipo()+ "' WHERE id = " + tipoUsoMedidor.getIdTipoUso();
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
        
    }

    @Override
    public boolean deleteTipoUsoMedidor(int idTipoUso) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM uso WHERE id = " + idTipoUso;
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
        
    }
    
    private TipoUsoMedidor getTipoUsoMedidor(ResultSet rs) throws SQLException {
        int idTipoUso = rs.getInt("id");
        String tipo = rs.getString("tipo");
        
        TipoUsoMedidor tipoUsoMedidor = new TipoUsoMedidor(idTipoUso, tipo);
        return tipoUsoMedidor;
    }
    
}
