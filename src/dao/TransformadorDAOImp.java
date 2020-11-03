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
        String sql = "INSERT INTO transformador VALUES ("+trans.getIdTransformador()+","+trans.getActividad()+","
                     +trans.getMarca()+","+trans.getIdFase()+","+trans.getSnom()+","+trans.getV1nom()+","+trans.getV2nom()+
                     ","+trans.getFrecuencia()+")";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        registrar = true;
        
        return registrar;
    }

    @Override
    public Transformador selectTransformador(int idTransformador) throws SQLException {
        Transformador trans = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM transformador WHERE UC_transformador = " + idTransformador; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            trans = getTransformador(rs);
        }
        
        return trans;
    }

    @Override
    public ArrayList<Transformador> selectAllTransformadores() throws SQLException {
        ArrayList<Transformador> listaTransformadores = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM transformador ORDER BY UC_transformador";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery(sql);
        
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
                     " WHERE UC_transformador="+trans.getIdTransformador();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteTransformador(int idTransformador) throws SQLException {
        boolean delete = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE * FROM transformador WHERE UC_transformador=" + idTransformador;
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.executeQuery();
        delete = true;
        
        return delete;
    }
    
    private Transformador getTransformador(ResultSet rs) throws SQLException {
        int idTransformador = rs.getInt("id");
        boolean actividad = rs.getBoolean("actividad");
        String marca = rs.getString("marca");
        short idFase = rs.getShort("fases");
        float snom = rs.getFloat("snom");
        float v1nom = rs.getFloat("v1nom");
        float v2nom = rs.getFloat("v2nom");
        float frecuencia = rs.getFloat("frecuencia");
        Transformador trans = new Transformador(idTransformador,actividad,marca,idFase,snom,v1nom,v2nom,frecuencia);
        return trans;
    }
}
