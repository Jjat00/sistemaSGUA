package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;

public interface UserDAO {
    
    // Create user
    boolean insertUser(Usuario user) throws SQLException;
    
    // Read user by cedula
    public Usuario selectUser(long cedula) throws SQLException;
    
    // Read users
    public ArrayList<Usuario> selectAllUsers() throws SQLException;
    
    // Update user
    public boolean updateUser(Usuario user) throws SQLException;
    
    // Delete user by cedula
    public boolean deleteUser(long cedula) throws SQLException;
}
