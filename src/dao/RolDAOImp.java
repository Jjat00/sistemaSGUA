package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Rol;

/**
 *
 * implementacion de la interface para el manejo de datos del rol
 */
public class RolDAOImp implements RolDAO {

    @Override
    public Rol selectRolByID(short id) throws SQLException {
        Rol rol = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM rol WHERE id = " + id; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            rol = getRol(rs);
        }
        
        return rol;
    }

    @Override
    public ArrayList<Rol> selectAllRol() throws SQLException {
        ArrayList<Rol> listaRol = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM rol ORDER BY id";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        rs = pstm.executeQuery();
        while(rs.next()){
            Rol rol = getRol(rs);
            listaRol.add(rol);
        }
        
        return listaRol;
    }
    
    private Rol getRol(ResultSet rs) throws SQLException {
        short id = rs.getShort("id");
        String nombre = rs.getString("tipo");
        Rol rol = new Rol(id,nombre);
        return rol;
    }
}
