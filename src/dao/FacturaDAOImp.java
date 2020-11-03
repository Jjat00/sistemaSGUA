package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Factura;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla Factura
 */
public class FacturaDAOImp implements FacturaDAO {

    @Override
    public boolean insertFactura(Factura factura) throws SQLException {
        boolean registrar = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO factura VALUES ("+factura.getNoCuenta()+","+factura.getCedulaCliente()+","
                     +factura.getNoMedidor()+","+factura.getEstadoPago()+","+factura.getTipoUso()+","
                     +factura.getValorUnitario()+","+factura.getSubsidio()+")";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        registrar = true;
        
        return registrar;
    }

    @Override
    public Factura selectFactura(int NoCuenta) throws SQLException {
        Factura factura = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM factura WHERE cuenta = " + NoCuenta; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            factura = getFactura(rs);
        }
        
        return factura;
    }

    @Override
    public ArrayList<Factura> selectAllFacturas() throws SQLException {
        ArrayList<Factura> listaFactura = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM factura ORDER BY cuenta";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            Factura factura = getFactura(rs);
            listaFactura.add(factura);
        }
        
        return listaFactura;
    }

    @Override
    public boolean updateFactura(Factura factura) throws SQLException {
        boolean update = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE factura SET cedula_cliente="+factura.getCedulaCliente()+", no_medidor_m1="+factura.getNoMedidor()+
                     ", pago="+factura.getEstadoPago()+", uso="+factura.getTipoUso()+", valor_unitario="+factura.getValorUnitario()+
                     ", subsidio="+factura.getSubsidio()+" WHERE cuenta="+factura.getNoCuenta();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteFactura(int NoCuenta) throws SQLException {
        boolean delete = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE * FROM factura WHERE cuenta=" + NoCuenta;
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.executeQuery();
        delete = true;
        
        return delete;
    }
    
    private Factura getFactura(ResultSet rs) throws SQLException {
        int NoCuenta = rs.getInt("id");
        long cedulaCliente = rs.getLong("cedula_cliente");
        int NoMedidor = rs.getInt("medidor");
        boolean estadoPago = rs.getBoolean("pago");
        int tipoUso = rs.getInt("uso");
        float valorUnitario = rs.getFloat("valor_unitario");
        float subsidio = rs.getFloat("subsidio");
        Factura factura = new Factura(NoCuenta,cedulaCliente,NoMedidor,estadoPago,tipoUso,valorUnitario,subsidio);
        return factura;
    }
}
