package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Banco;

/**
 *
 * implementacion de la interface para el manejo de datos del banco
 */
public class BancoDAOImp implements BancoDAO {

    @Override
    public boolean insertBanco(Banco banco) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO metodo_pago VALUES ('" + banco.getIdBanco() + "','" + banco.getNombre() + "')";
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
        
    }

    @Override
    public Banco selectBanco(int idBanco) throws SQLException {
        
        Banco banco = null;
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM metodo_pago WHERE id = " + idBanco; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        
        if (rs.next()) {
            banco = getBanco(rs);
        }
        
        return banco;
    }

    @Override
    public ArrayList<Banco> selectAllBancos() throws SQLException {
        ArrayList<Banco> listaBanco = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM metodo_pago ORDER BY id";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs =  pstm.executeQuery();
        while(rs.next()){
            Banco banco = getBanco(rs);
            listaBanco.add(banco);
        }
        
        return listaBanco;
        
    }

    @Override
    public boolean updateBanco(Banco banco) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE metodo_pago SET nombre = '" + banco.getNombre() + "' WHERE id = " + banco.getIdBanco();
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
        
    }

    @Override
    public boolean deleteBanco(int idBanco) throws SQLException {
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM metodo_pago WHERE id = " + idBanco;
        PreparedStatement pstm = con.prepareStatement(sql);
        int result = pstm.executeUpdate();
        
        return (result == 1);
        
    }
    
    private Banco getBanco(ResultSet rs) throws SQLException {
        int idBanco = rs.getInt("id");
        String nombre = rs.getString("nombre");
        
        Banco banco = new Banco(idBanco, nombre);
        return banco;
    }
    
}