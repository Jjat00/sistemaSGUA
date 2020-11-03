package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteUbicacion;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla ClienteUbicacion
 */
public class ClienteUbicacionDAOImp implements ClienteUbicacionDAO {

    @Override
    public boolean insertClienteUbicacion(ClienteUbicacion clienteUbicacion) throws SQLException {
        boolean registrar = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO cliente_ubicacion VALUES ("+clienteUbicacion.getCedula()+","+clienteUbicacion.getDireccion()+","
                     +clienteUbicacion.getEstrado()+")";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        registrar = true;
        
        return registrar;
    }

    @Override
    public ClienteUbicacion selectClienteUbicacion(long cedulaCliente) throws SQLException {
        ClienteUbicacion clienteUbicacion = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM cliente_ubicacion WHERE cedula = " + cedulaCliente; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            clienteUbicacion = getClienteUbicacion(rs);
        }
        
        return clienteUbicacion;
    }

    @Override
    public ArrayList<ClienteUbicacion> selectAllClienteUbicacion() throws SQLException {
        ArrayList<ClienteUbicacion> listaClienteUbicacion = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM cliente_ubicacion ORDER BY cedula";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()) {
            ClienteUbicacion clienteUbicacion = getClienteUbicacion(rs);
            listaClienteUbicacion.add(clienteUbicacion);
        }
        
        return listaClienteUbicacion;
    }

    @Override
    public boolean updateClienteUbicacion(ClienteUbicacion clienteUbicacion) throws SQLException {
        boolean update = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE cliente_ubicacion SET direccion = "+clienteUbicacion.getDireccion()+", estrato="+clienteUbicacion.getEstrado()
                +" WHERE cedula = "+clienteUbicacion.getCedula();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteClienteUbicacion(long cedulaCliente) throws SQLException {
        boolean delete = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE * FROM cliente_ubicacion WHERE cedula = " + cedulaCliente;
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.executeQuery();
        delete = true;
        
        return delete;
    }
    
    private ClienteUbicacion getClienteUbicacion(ResultSet rs) throws SQLException {
        long cedulaCliente = rs.getLong("cedula");
        String direccion = rs.getString("direccion");
        short estrato = rs.getShort("estrato");
        ClienteUbicacion clienteUbicacion  = new ClienteUbicacion(cedulaCliente,direccion,estrato);
        return clienteUbicacion;
    }
}
