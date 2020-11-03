package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.MetodoPago;

/**
 *
 * implementacion de la interface para el manejo de datos del metodo de pago
 */
public class MetodoPagoDAOImp implements MetodoPagoDAO {

    @Override
    public MetodoPago selectMetodoPagoByID(short idMetodoPago) throws SQLException {
        MetodoPago metodoPago = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM metodo_pago WHERE id = " + idMetodoPago; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            metodoPago = getMetodoPago(rs);
        }
        
        return metodoPago;
    }

    @Override
    public ArrayList<MetodoPago> selectAllMetodoPago() throws SQLException {
        ArrayList<MetodoPago> listaMetodoPago = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM metodo_pago ORDER BY id";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            MetodoPago metodoPago = getMetodoPago(rs);
            listaMetodoPago.add(metodoPago);
        }
        
        return listaMetodoPago;
    }
    
    private MetodoPago getMetodoPago(ResultSet rs) throws SQLException {
        short id = rs.getShort("id");
        String nombre = rs.getString("nombre");
        MetodoPago metodoPago = new MetodoPago(id,nombre);
        return metodoPago;
    }
}
