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
        String sql = "INSERT INTO factura VALUES (NULL,"+factura.getNoCuenta()+","+factura.getCedulaCliente()+","
                     +factura.getNoMedidor()+","+factura.getEstadoPago()+","+factura.getTipoUso()+","
                     +factura.getValorUnitario()+","+factura.getSubsidio()+","+factura.getAjustePeso()+",)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        registrar = true;
        
        return registrar;
    }

    @Override
    public Factura selectFactura(long NoCuenta) throws SQLException {
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM factura WHERE cuenta = ?"; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        Factura factura = null;
        
        pstm.setLong(1, NoCuenta);
        rs = pstm.executeQuery();
        if (rs.next()) {
            factura = getFactura(rs);
        }
        
        return factura;
    }

    @Override
    public ArrayList<Factura> selectAllFacturas() throws SQLException {
        ArrayList<Factura> listaFactura = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT FROM factura ORDER BY cuenta";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        rs = pstm.executeQuery(sql);
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
                     ", subsidio="+factura.getSubsidio()+", ajuste_peso="+factura.getAjustePeso()+","+"WHERE cuenta="+factura.getNoCuenta();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteFactura(long NoCuenta) throws SQLException {
        boolean delete = false;
        Factura factura = selectFactura(NoCuenta);
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM factura WHERE cuenta="+factura.getNoCuenta();
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.execute(sql);
        delete = true;
        
        return delete;
    }
    
    private Factura getFactura(ResultSet rs) throws SQLException {
        long NoCuenta = rs.getLong("cuenta");
        long cedulaCliente = rs.getLong("cedula_cliente");
        long NoMedidor = rs.getLong("no_medidor_m1");
        boolean estadoPago = rs.getBoolean("pago");
        int tipoUso = rs.getInt("uso");
        float valorUnitario = rs.getFloat("valor_unitario");
        float subsidio = rs.getFloat("subsidio");
        float ajustePeso = rs.getFloat("ajuste_peso");
        Factura factura = new Factura(NoCuenta,cedulaCliente,NoMedidor,estadoPago,tipoUso,valorUnitario,subsidio,ajustePeso);
        return factura;
    }
}
