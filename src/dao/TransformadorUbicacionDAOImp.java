package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.TransformadorUbicacion;

/**
 *
 * implemetancion de la interface para el manejo de datos de la tabla TransformadorUbicacion
 */
public class TransformadorUbicacionDAOImp implements TransformadorUbicacionDAO{

    @Override
    public boolean insertTransformadorUbicacion(TransformadorUbicacion transformadorUbicacion) throws SQLException {
        boolean registrar = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO transformador_ubicacion VALUES ("+transformadorUbicacion.getIdTransformador()+
                     ","+transformadorUbicacion.getGeoreferencia()+","+transformadorUbicacion.getBarrio()+","
                     +transformadorUbicacion.getComuna()+")";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        registrar = true;
        
        return registrar;
    }

    @Override
    public TransformadorUbicacion selectTransformadorUbicacion(int idTransformador) throws SQLException {
        TransformadorUbicacion transformadorUbicacion = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM transformador_ubicacion WHERE id = " + idTransformador; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            transformadorUbicacion = getTransformadorUbicacion(rs);
        }
        
        return transformadorUbicacion;
    }

    @Override
    public ArrayList<TransformadorUbicacion> selectAllTransformadores() throws SQLException {
        ArrayList<TransformadorUbicacion> listaUbicacion = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM transformador_ubicacion ORDER BY id";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            TransformadorUbicacion transformadorUbicacion = getTransformadorUbicacion(rs);
            listaUbicacion.add(transformadorUbicacion);
        }
        
        return listaUbicacion;
    }

    @Override
    public boolean updateTransformadorUbicacion(TransformadorUbicacion transformadorUbicacion) throws SQLException {
        boolean update = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE transformador_ubicacion SET georeferenciacion="+transformadorUbicacion.getGeoreferencia()+", barrio="+transformadorUbicacion.getBarrio()+
                     ", comuna="+transformadorUbicacion.getComuna()+" WHERE id="+transformadorUbicacion.getIdTransformador();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.executeQuery();
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteTransformadorUbicacion(int idTransformador) throws SQLException {
        boolean delete = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE * FROM transformador_ubicacion WHERE id=" + idTransformador;
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.executeQuery();
        delete = true;
        
        return delete;
    }
    

    private TransformadorUbicacion getTransformadorUbicacion(ResultSet rs) throws SQLException {
        int idTransformador = rs.getInt("id");
        String georeferencia = rs.getString("georeferenciacion");
        String barrio = rs.getString("barrio");
        short comuna = rs.getShort("comuna");
        TransformadorUbicacion transformadorUbicacion = new TransformadorUbicacion(idTransformador,georeferencia,barrio,comuna);
        return transformadorUbicacion;
    }
}