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
        String sql = "INSERT INTO transformador_ubicacion VALUES (NULL,"+transformadorUbicacion.getIdTransformador()+
                     ","+transformadorUbicacion.getGeoreferencia()+","+transformadorUbicacion.getBarrio()+","
                     +transformadorUbicacion.getComuna()+",)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        registrar = true;
        
        return registrar;
    }

    @Override
    public TransformadorUbicacion selectTransformadorUbicacion(long idTransformador) throws SQLException {
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM transformador_ubicacion WHERE id = ?"; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        TransformadorUbicacion transformadorUbicacion = null;
        
        pstm.setLong(1, idTransformador);
        rs = pstm.executeQuery();
        if (rs.next()) {
            transformadorUbicacion = getTransformadorUbicacion(rs);
        }
        
        return transformadorUbicacion;
    }

    @Override
    public ArrayList<TransformadorUbicacion> selectAllTransformadores() throws SQLException {
        ArrayList<TransformadorUbicacion> listaUbicacion = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT FROM transformador_ubicacion ORDER BY id";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        rs = pstm.executeQuery(sql);
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
                     ", comuna="+transformadorUbicacion.getComuna()+","+"WHERE id="+transformadorUbicacion.getIdTransformador();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteTransformadorUbicacion(long idTransformador) throws SQLException {
        boolean delete = false;
        TransformadorUbicacion tranformadorUbicacion = selectTransformadorUbicacion(idTransformador);
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM transformador_ubicacion WHERE id="+tranformadorUbicacion.getIdTransformador();
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.execute(sql);
        delete = true;
        
        return delete;
    }
    

    private TransformadorUbicacion getTransformadorUbicacion(ResultSet rs) throws SQLException {
        long idTransformador = rs.getLong("id");
        String georeferencia = rs.getString("georeferenciacion");
        String barrio = rs.getString("barrio");
        int comuna = rs.getInt("comuna");
        TransformadorUbicacion transformadorUbicacion = new TransformadorUbicacion(idTransformador,georeferencia,barrio,comuna);
        return transformadorUbicacion;
    }
}