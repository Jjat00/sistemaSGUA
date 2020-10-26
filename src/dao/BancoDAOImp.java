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
        boolean registrar = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "INSERT INTO banco VALUES (NULL,"+banco.getIdBanco()+","+banco.getNombre()+",)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        registrar = true;
        
        return registrar;
    }

    @Override
    public Banco selectBanco(int idBanco) throws SQLException {
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT * FROM banco WHERE idBanco = ?"; 
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        Banco banco = null;
        
        pstm.setLong(1, idBanco);
        rs = pstm.executeQuery();
        if (rs.next()) {
            banco = getBanco(rs);
        }
        
        return banco;
    }

    @Override
    public ArrayList<Banco> selectAllBancos() throws SQLException {
        ArrayList<Banco> listaBanco = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "SELECT FROM banco ORDER BY idBanco";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = null;
        
        rs = pstm.executeQuery(sql);
        while(rs.next()){
            Banco banco = getBanco(rs);
            listaBanco.add(banco);
        }
        
        return listaBanco;
    }

    @Override
    public boolean updateBanco(Banco banco) throws SQLException {
        boolean update = false;
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "UPDATE banco SET nombre="+banco.getNombre()+","+"WHERE idBanco="+banco.getIdBanco();
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute(sql);
        update = true;
        
        return update;
    }

    @Override
    public boolean deleteBanco(int idBanco) throws SQLException {
        boolean delete = false;
        Banco banco = selectBanco(idBanco);
        
        Connection con = ConnectionBridge.getConnection();
        String sql = "DELETE FROM banco WHERE idBanco="+banco.getIdBanco();
        PreparedStatement pstm = con.prepareStatement(sql);  
        pstm.execute(sql);
        delete = true;
        
        return delete;
    }
    
    private Banco getBanco(ResultSet rs) throws SQLException {
        int idBanco = rs.getInt("idBanco");
        String nombre = rs.getString("nombre");
        Banco banco = new Banco(idBanco,nombre);
        return banco;
    }
}
