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
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO factura VALUES ('" + factura.getNoCuenta() + "','" + factura.getCedulaCliente() + "','"
                     + factura.getEstadoPago() + "','" + factura.getTipoUso() + "','" + factura.getNoMedidor()+ "','"
                     + factura.getValorUnitario() + "','" + factura.getSubsidio() + "')";
        
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
    }

    @Override
    public Factura selectFactura(int NoCuenta) throws SQLException {
        
        Factura factura = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM factura WHERE id = " + NoCuenta; 
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
        String sql = "SELECT * FROM factura ORDER BY id";
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
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE factura SET cedula_cliente = '" + factura.getCedulaCliente() +
                     "', pago = '" + factura.getEstadoPago() + "', uso = '" + factura.getTipoUso() + "', medidor = '" + factura.getNoMedidor() + 
                     "', valor_unitario = '" + factura.getValorUnitario() +
                     "', subsidio = '" + factura.getSubsidio() + "' WHERE id = " + factura.getNoCuenta();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        int result = pstm.executeUpdate();
        
        return (result == 1);
    }

    @Override
    public boolean deleteFactura(int NoCuenta) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM factura WHERE id = " + NoCuenta;
        PreparedStatement pstm = con.prepareStatement(sql);  
        int result = pstm.executeUpdate();
        
        return (result == 1);
    }
    
    private Factura getFactura(ResultSet rs) throws SQLException {
        int NoCuenta = rs.getInt("id");
        long cedulaCliente = rs.getLong("cedula_cliente");
        boolean estadoPago = rs.getBoolean("pago");
        int tipoUso = rs.getInt("uso");
        int NoMedidor = rs.getInt("medidor");
        float valorUnitario = rs.getFloat("valor_unitario");
        float subsidio = rs.getFloat("subsidio");
        Factura factura = new Factura(NoCuenta,cedulaCliente,estadoPago,tipoUso,NoMedidor,valorUnitario,subsidio);
        return factura;
    }
}
