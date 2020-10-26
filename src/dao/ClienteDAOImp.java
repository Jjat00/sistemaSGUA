package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * implementacion de la interface para el manejo de datos de la tabla cliente
 */
public class ClienteDAOImp implements ClienteDAO{

    @Override
    public boolean insertCliente(Cliente cliente) throws SQLException {
        boolean registrar = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO cliente VALUES (NULL,"+cliente.getCedula()+","+cliente.getNombre()+","
                     +cliente.getApellido()+","+cliente.getCelular()+","+cliente.getEmail()+",)"+cliente.getActividad()+",";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        registrar = true;
        
        return registrar;
    }

    @Override
    public Cliente selectCliente(long cedula) throws SQLException {
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM cliente WHERE cedula = ?"; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        Cliente cliente = null;
        
        pstm.setLong(1, cedula);
        rs = pstm.executeQuery();
        if (rs.next()) {
            cliente = getCliente(rs);
        }
        
        return cliente;
    }

    @Override
    public ArrayList<Cliente> selectAllClientes() throws SQLException {
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT FROM cliente ORDER BY cedula";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        rs = pstm.executeQuery(sql);
        while(rs.next()){
            Cliente cliente = getCliente(rs);
            listaCliente.add(cliente);
        }
        
        return listaCliente;
    }

    @Override
    public boolean updateCliente(Cliente cliente) throws SQLException {
        boolean update = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE cliente SET nombre="+cliente.getNombre()+", apellido="+cliente.getApellido()+", celular="
                    +cliente.getCelular()+", email="+cliente.getEmail()+", actividad="+cliente.getActividad()+","+"WHERE cedula="+cliente.getCedula();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteCliente(long cedula) throws SQLException {
        boolean delete = false;
        Cliente cliente = selectCliente(cedula);
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM cliente WHERE cedula="+cliente.getCedula();
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.execute(sql);
        delete = true;
        
        return delete;
    }
    
    private Cliente getCliente(ResultSet rs) throws SQLException {
        long cedula = rs.getLong("cedula");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        long celular = rs.getLong("celular");
        String email = rs.getString("email");
        boolean actividad = rs.getBoolean("actividad");
        Cliente cliente = new Cliente(cedula,nombre, apellido,celular, email,actividad);
        return cliente;
    }
}
