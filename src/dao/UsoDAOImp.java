package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Uso;

/**
 *
 * @author Milton Lenis
 */
public class UsoDAOImp implements UsoDAO {

    @Override
    public Uso selectUsoByID(short id) throws SQLException {
        Uso uso = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM uso WHERE id = " + id; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            uso = getUso(rs);
        }
        
        return uso;
    }

    @Override
    public ArrayList<Uso> selectAllUso() throws SQLException {
        ArrayList<Uso> listaUso = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM uso ORDER BY id";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        rs = pstm.executeQuery();
        while(rs.next()){
            Uso uso = getUso(rs);
            listaUso.add(uso);
        }
        
        return listaUso;
    }
    
    private Uso getUso(ResultSet rs) throws SQLException {
        short id = rs.getShort("id");
        String nombre = rs.getString("tipo");
        Uso uso = new Uso(id,nombre);
        return uso;
    }
}