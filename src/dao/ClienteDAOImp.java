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
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO cliente VALUES ('"+cliente.getCedula()+
                "', '"+cliente.getNombre()+"', '"
                     +cliente.getApellido()+"', "+cliente.getCelular()+
                ", "+cliente.getActividad()+", '"+cliente.getEmail()+"','" + 
                    cliente.getDireccion() + "' , " + cliente.getEstrato() + ")";
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
    }

    @Override
    public Cliente selectCliente(long cedula) throws SQLException {
        Cliente cliente = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM cliente WHERE cedula = " + cedula; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            cliente = getCliente(rs);
        }
        
        return cliente;
    }

    @Override
    public ArrayList<Cliente> selectAllClientes() throws SQLException {
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM cliente ORDER BY cedula";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            Cliente cliente = getCliente(rs);
            listaCliente.add(cliente);
        }
        
        return listaCliente;
    }

    @Override
    public boolean updateCliente(Cliente cliente) throws SQLException {
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE cliente SET nombre='"+cliente.getNombre()+"', apellido='"+cliente.getApellido()+"', celular="
                    +cliente.getCelular()+", email='"+cliente.getEmail()+"', actividad="+cliente.getActividad()+" WHERE cedula="+cliente.getCedula();
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
    }

    @Override
    public boolean deleteCliente(long cedula) throws SQLException {
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM cliente WHERE cedula=" + cedula;
        PreparedStatement pstm = con.prepareStatement(sql);  
        int result = pstm.executeUpdate();
        
        return (result == 1);
    }
    
    private Cliente getCliente(ResultSet rs) throws SQLException {
        long cedula = rs.getLong("cedula");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        long celular = rs.getLong("celular");
        String email = rs.getString("email");
        boolean actividad = rs.getBoolean("actividad");
        String direccion = rs.getString("direccion");
        int estrato = rs.getInt("estrato");
        Cliente cliente = new Cliente(cedula,nombre, apellido,celular, email,actividad, direccion, estrato);
        return cliente;
    }
}
