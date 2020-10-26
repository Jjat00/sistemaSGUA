package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Medidor;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla Medidor
 */
public class MedidorDAOImp implements MedidorDAO {

    @Override
    public boolean insertMedidor(Medidor medidor) throws SQLException {
        boolean registrar = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO medidor VALUES (NULL,"+medidor.getNoMedidor()+","+medidor.getLecturaActual()+
                     ","+medidor.getLecturaAnterior()+","+medidor.getConsumoActual()+","+medidor.getFechaMedicion()+",)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        registrar = true;
        
        return registrar;
    }

    @Override
    public Medidor selectMedidor(long NoMedidor) throws SQLException {
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM medidor WHERE numero = ?"; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        Medidor medidor = null;
        
        pstm.setLong(1, NoMedidor);
        rs = pstm.executeQuery();
        if (rs.next()) {
            medidor = getMedidor(rs);
        }
        
        return medidor;
    }

    @Override
    public ArrayList<Medidor> selectAllMedidores() throws SQLException {
        ArrayList<Medidor> listaMedidor = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT FROM medidor ORDER BY numero";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        rs = pstm.executeQuery(sql);
        while(rs.next()){
            Medidor medidor = getMedidor(rs);
            listaMedidor.add(medidor);
        }
        
        return listaMedidor;
    }

    @Override
    public boolean updateMedidor(Medidor medidor) throws SQLException {
        boolean update = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE medidor SET lectura_actual="+medidor.getLecturaActual()+", lectura_anterior="+medidor.getLecturaAnterior()+
                     ", consumo_actual="+medidor.getConsumoActual()+", fecha_medicion="+medidor.getFechaMedicion()+","+"WHERE numero="+medidor.getNoMedidor();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteMedidor(long NoMedidor) throws SQLException {
        boolean delete = false;
        Medidor medidor = selectMedidor(NoMedidor);
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM medidor WHERE numero="+medidor.getNoMedidor();
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.execute(sql);
        delete = true;
        
        return delete;
    }
    
    private Medidor getMedidor(ResultSet rs) throws SQLException {
        long NoMedidor = rs.getLong("numero");
        float lecturaActual = rs.getFloat("lectura_actual");
        float lecturaAnterior = rs.getFloat("lectura_anterior");
        int consumoActual = rs.getInt("consumo_actual");
        String fechaMedicion = rs.getString("fecha_medicion");
        Medidor medidor = new Medidor(NoMedidor,lecturaActual,lecturaAnterior,consumoActual,fechaMedicion);
        return medidor;
    }
}
