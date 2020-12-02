package dao;

import ConnectDB.ConnectionBridge;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import model.Reporte;

/**
 *
 * @author Milton Lenis
 */
public class ReporteDAOImp implements ReporteDAO {

    @Override
    public ArrayList<Reporte> selectAllPagos() throws SQLException {
        ArrayList<Reporte> listaReporte = new ArrayList<>();
        
        Connection con = ConnectionBridge.getConnection();
        String sq = "select 	fa.cedula_cliente, \n" +
                    "		(fa.valor_unitario * me.consumo_actual - fa.subsidio) total,\n" +
                    "		me.fecha_medicion\n" +
                    "from factura fa join medidor me\n" +
                    "on fa.medidor = me.id\n" +
                    "group by fa.id, me.consumo_actual, me.fecha_medicion\n" +
                    "order by fa.id, me.fecha_medicion";
        PreparedStatement pstm = con.prepareStatement(sq);
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            Reporte reporte = this.getReporte(rs);
            listaReporte.add(reporte);
        }
        
        for (int i = 0; i < listaReporte.size(); i++) {
            float total = listaReporte.get(i).getTotal();
            try {
                if (listaReporte.get(i).getCedula() == listaReporte.get(i+1).getCedula()) {
                    Date fecha1 = listaReporte.get(i).getFecha();
                    Date fecha2 = listaReporte.get(i + 1).getFecha();
                    long dd = -1*(fecha1.getTime() - fecha2.getTime());
                    long diferencia = TimeUnit.DAYS.convert(dd, TimeUnit.MILLISECONDS) - 31;
                    float interes = 0;

                    if (diferencia > 30) {
                        interes = 0.30f;
                    } else {
                        interes = diferencia/100f;
                    }
                    listaReporte.get(i+1).setInteres(interes);
                    listaReporte.get(i+1).setTotalxmora((interes * total) + total);
                } else {
                    listaReporte.get(i+1).setInteres(0);
                    listaReporte.get(i+1).setTotalxmora(total);
                }
            } catch (IndexOutOfBoundsException ex) {
                listaReporte.get(0).setInteres(0);
                listaReporte.get(0).setTotalxmora(total);
            }
        }
        
        return listaReporte;
    }
    
    private Reporte getReporte(ResultSet rs) throws SQLException {
        long cedula = rs.getLong("cedula_cliente");
        float total = rs.getFloat("total");
        Date fecha = rs.getDate("fecha_medicion");
        Reporte reporte = new Reporte(cedula, total, fecha);
        return reporte;
    }
}
