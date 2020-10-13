package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;

/**
 * This class provides CRUD database operations for the table usuario in the
 * database.
 */
public class UserDAOImpl implements UserDAO{

    @Override
    public boolean insertUser(Usuario user) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Usuario selectUser(long cedula) throws SQLException {
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM usuario WHERE cedula = ?"; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        Usuario user = null;
        
        pstm.setLong(1, cedula);
        rs = pstm.executeQuery();
        if (rs.next()) {
            user = getUser(rs);
        }
        
        return user;
    }

    @Override
    public ArrayList<Usuario> selectAllUsers() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updateUser(Usuario user) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteUser(long cedula) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private Usuario getUser(ResultSet rs) throws SQLException {
        long cedula = rs.getLong("cedula");
        int rol = rs.getInt("rol");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        boolean actividad = rs.getBoolean("actividad");
        long celular = rs.getLong("celular");
        String email = rs.getString("email");
        String password = rs.getString("password");
        Usuario user = new Usuario(cedula, rol, nombre, apellido, actividad, celular, email, password);
        return user;
    }
}