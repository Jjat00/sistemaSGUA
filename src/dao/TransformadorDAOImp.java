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
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO transformador VALUES (" + trans.getIdTransformador() + "," + trans.getActividad() + ",'"
                     + trans.getMarca() + "'," + trans.getIdFase() + "," + trans.getSnom() + "," + trans.getV1nom() + "," + trans.getV2nom() +
                     "," + trans.getFrecuencia() + ")";
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
    }

    @Override
    public Transformador selectTransformador(int idTransformador) throws SQLException {
        Transformador trans = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM transformador WHERE id = " + idTransformador; 
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
        String sql = "SELECT * FROM transformador ORDER BY id";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            Transformador trans = getTransformador(rs);
            listaTransformadores.add(trans);
        }
        
        return listaTransformadores;
    }

    @Override
    public boolean updateTransformador(Transformador trans) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE transformador SET actividad = " + trans.getActividad() + ", marca = '" + trans.getMarca() + "', fases=" + trans.getIdFase() +
                     ", snom=" + trans.getSnom() + ", v1nom=" + trans.getV1nom() + ", v2nom=" + trans.getV2nom() + ", frecuencia=" + trans.getFrecuencia() +
                     " WHERE id="+trans.getIdTransformador();
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
    }

    @Override
    public boolean deleteTransformador(int idTransformador) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM transformador WHERE id = " + idTransformador;
        PreparedStatement pstm = con.prepareStatement(sql);  
        int result = pstm.executeUpdate();
        
        return (result == 1);
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
