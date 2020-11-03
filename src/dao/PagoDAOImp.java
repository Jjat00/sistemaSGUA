package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Pago;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla Pago
 */
public class PagoDAOImp implements PagoDAO {

    @Override
    public boolean insertPago(Pago pay) throws SQLException {
        boolean registrar = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO pago VALUES ("+pay.getIdPago()+","+pay.getFecha()+","
                     +pay.getIdBanco()+","+pay.getIdFactura()+")";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        registrar = true;
        
        return registrar;
    }

    @Override
    public Pago selectPago(int idPago) throws SQLException {
        Pago pay = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM pago WHERE id = " + idPago; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            pay = getPago(rs);
        }
        
        return pay;
    }

    @Override
    public ArrayList<Pago> selectAllPagos() throws SQLException {
        ArrayList<Pago> listaPago = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM pago ORDER BY id";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            Pago pay = getPago(rs);
            listaPago.add(pay);
        }
        
        return listaPago;
    }

    @Override
    public boolean updatePago(Pago pay) throws SQLException {
        boolean update = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE pago SET fecha="+pay.getFecha()+", id_banco="+pay.getIdBanco()+
                     ", id_factura="+pay.getIdFactura()+" WHERE id="+pay.getIdPago();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        update = true;
        
        return update;
    }

    @Override
    public boolean deletePago(int idPago) throws SQLException {
        boolean delete = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE * FROM pago WHERE id=" + idPago;
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.executeQuery();
        delete = true;
        
        return delete;
    }
    
    private Pago getPago(ResultSet rs) throws SQLException {
        int idPago = rs.getInt("id");
        Date fecha = rs.getDate("fecha");
        short idBanco = rs.getShort("metodo_pago");
        int idFactura = rs.getInt("id_factura");
        Pago pay = new Pago(idPago,fecha,idBanco,idFactura);
        return pay;
    }
}
