package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Rol;

/**
 *
 * interface para el manejo de datos de la tabla Rol
 */
public interface RolDAO {

    // Read banco by id
    public Rol selectRolByID(short id) throws SQLException;

    // Read rol
    public ArrayList<Rol> selectAllRol() throws SQLException;
}