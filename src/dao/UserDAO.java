package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.User;

public interface UserDAO {
    
    // Create user
    boolean insertUser(User user) throws SQLException;
    
    // Read user by cedula
    public User selectUser(long cedula) throws SQLException;
    
    // Read users
    public ArrayList<User> selectAllUsers() throws SQLException;
    
    // Update user
    public boolean updateUser(User user) throws SQLException;
    
    // Delete user by cedula
    public boolean deleteUser(long cedula) throws SQLException;
}
