package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.Date;
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
        String sql = "INSERT INTO medidor VALUES ("+medidor.getNoMedidor()+","+medidor.getLecturaActual()+
                     ","+medidor.getLecturaAnterior()+","+medidor.getConsumoActual()+","+medidor.getFechaMedicion()+")";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        registrar = true;
        
        return registrar;
    }

    @Override
    public Medidor selectMedidor(int NoMedidor) throws SQLException {
        Medidor medidor = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM medidor WHERE numero = " + NoMedidor; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            medidor = getMedidor(rs);
        }
        
        return medidor;
    }

    @Override
    public ArrayList<Medidor> selectAllMedidores() throws SQLException {
        ArrayList<Medidor> listaMedidor = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM medidor ORDER BY numero";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
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
                     ", consumo_actual="+medidor.getConsumoActual()+", fecha_medicion="+medidor.getFechaMedicion()+" WHERE numero="+medidor.getNoMedidor();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteMedidor(int NoMedidor) throws SQLException {
        boolean delete = false;
        Medidor medidor = selectMedidor(NoMedidor);
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE * FROM medidor WHERE numero=" + NoMedidor;
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.executeQuery();
        delete = true;
        
        return delete;
    }
    
    private Medidor getMedidor(ResultSet rs) throws SQLException {
        int NoMedidor = rs.getInt("id");
        float lecturaActual = rs.getFloat("lectura_actual");
        float lecturaAnterior = rs.getFloat("lectura_anterior");
        int consumoActual = rs.getInt("consumo_actual");
        Date fechaMedicion = rs.getDate("fecha_medicion");
        Medidor medidor = new Medidor(NoMedidor,lecturaActual,lecturaAnterior,consumoActual,fechaMedicion);
        return medidor;
    }

}
