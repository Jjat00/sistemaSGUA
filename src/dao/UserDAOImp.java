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
public class UserDAOImp implements UserDAO{

    @Override
    public boolean insertUser(Usuario user) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO usuario VALUES ('" + user.getCedula() + "'," + user.getRol() + ",'"
                     + user.getNombre() + "', '"+user.getApellido() + "','" + user.isActividad() + "','"
                     + user.getCelular() + "','" + user.getEmail() + "','" + user.getPassword() + "')";
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
    }

    @Override
    public Usuario selectUser(long cedula) throws SQLException {
        Usuario user = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM usuario WHERE cedula = " + cedula; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            user = getUser(rs);
        }
        
        return user;
    }

    @Override
    public Usuario selectUser(String email, char[] password) throws SQLException {
        Usuario user = null;
        ResultSet rs = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM usuario WHERE email = ? AND password = ?"; 
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, email);
        pstm.setString(2, String.copyValueOf(password));
        rs = pstm.executeQuery();
        
        if (rs.next()) {
            user = getUser(rs);
        }
        
        return user;
    }

    @Override
    public ArrayList<Usuario> selectAllUsers() throws SQLException {
        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM usuario ORDER BY cedula";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs =  pstm.executeQuery();
        while(rs.next()){
            Usuario user = getUser(rs);
            listaUsuario.add(user);
        }
        
        return listaUsuario;
    }

    @Override
    public boolean updateUser(Usuario user) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE usuario SET rol = " + user.getRol() + ", nombre = '" + user.getNombre() + "', apellido = '"
                    + user.getApellido() + "', actividad = " + user.isActividad() + ", celular = " + user.getCelular() +
                    ", email = '" + user.getEmail() + "', password = '" + user.getPassword() + "' WHERE cedula = " + user.getCedula();
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
    }

    @Override
    public boolean deleteUser(long cedula) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM usuario WHERE cedula = " + cedula;
        PreparedStatement pstm = con.prepareStatement(sql);  
        int result = pstm.executeUpdate();
        
        return (result == 1);
    }
    
    private Usuario getUser(ResultSet rs) throws SQLException {
        long cedula = rs.getLong("cedula");
        short rol = rs.getShort("rol");
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