package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Transformador;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla Transformador
 */
public class TransformadorDAOImp implements TransformadorDAO {

    @Override
    public boolean insertTransformador(Transformador trans) throws SQLException {
        boolean registrar = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO transformador VALUES (NULL,"+trans.getIdTransformador()+","+trans.getActividad()+","
                     +trans.getMarca()+","+trans.getIdFase()+","+trans.getSnom()+","+trans.getV1nom()+","+trans.getV2nom()+
                     ","+trans.getFrecuencia()+",)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        registrar = true;
        
        return registrar;
    }

    @Override
    public Transformador selectTransformador(long idTransformador) throws SQLException {
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM transformador WHERE UC_transformador = ?"; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        Transformador trans = null;
        
        pstm.setLong(1, idTransformador);
        rs = pstm.executeQuery();
        if (rs.next()) {
            trans = getTransformador(rs);
        }
        
        return trans;
    }

    @Override
    public ArrayList<Transformador> selectAllTransformadores() throws SQLException {
        ArrayList<Transformador> listaTransformadores = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT FROM transformador ORDER BY UC_transformador";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        rs = pstm.executeQuery(sql);
        while(rs.next()){
            Transformador trans = getTransformador(rs);
            listaTransformadores.add(trans);
        }
        
        return listaTransformadores;
    }

    @Override
    public boolean updateTransformador(Transformador trans) throws SQLException {
        boolean update = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE transformador SET actividad="+trans.getActividad()+", marca="+trans.getMarca()+", fases="+trans.getIdFase()+
                     ", snom="+trans.getSnom()+", v1nom="+trans.getV1nom()+", v2nom="+trans.getV2nom()+", frecuencia="+trans.getFrecuencia()+
                     ","+"WHERE UC_transformador="+trans.getIdTransformador();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteTransformador(long idTransformador) throws SQLException {
        boolean delete = false;
        Transformador trans = selectTransformador(idTransformador);
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM transformador WHERE UC_transformador="+trans.getIdTransformador();
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.execute(sql);
        delete = true;
        
        return delete;
    }
    
    private Transformador getTransformador(ResultSet rs) throws SQLException {
        long idTransformador = rs.getLong("UC_transformador");
        boolean actividad = rs.getBoolean("actividad");
        String marca = rs.getString("marca");
        int idFase = rs.getInt("fases");
        float snom = rs.getFloat("snom");
        float v1nom = rs.getFloat("v1nom");
        float v2nom = rs.getFloat("v2nomm");
        float frecuencia = rs.getFloat("frecuencia");
        Transformador trans = new Transformador(idTransformador,actividad,marca,idFase,snom,v1nom,v2nom,frecuencia);
        return trans;
    }
}
