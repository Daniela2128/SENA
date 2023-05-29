package modeldao;

import config.Conexion;
import interfaz.MeFicha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Ficha;

/**
 *
 * @author APRENDIZ
 */
public class FichaDao implements MeFicha{
    Ficha fi=new Ficha();
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    

    @Override
    public Ficha list(int idficha) {
        String sql = "select * from ficha where id="+idficha;
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        fi.setId(rs.getInt("id"));
        fi.setCodficha(rs.getInt("codficha"));
        fi.setCantapre(rs.getInt("cantapre"));
        fi.setCodpro(rs.getInt("codpro"));
        fi.setCodaprendiz(rs.getInt("codaprendiz"));
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No puede traer la informacion");
        }
        return fi;
    }
@Override
    public List listadoficha() {
        ArrayList<Ficha> lista= new ArrayList<Ficha>();
        String sql="select * from ficha";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Ficha fi=new Ficha();
            fi.setId(rs.getInt("id"));
            fi.setCodficha(rs.getInt("codficha"));
            fi.setCantapre(rs.getInt("cantapre"));
            fi.setCodpro(rs.getInt("codpro"));
            fi.setCodaprendiz(rs.getInt("codaprendiz"));
            lista.add(fi);
            }
        }catch(Exception e){
        
        }
        return lista;
    }

    @Override
    public boolean registroficha(Ficha fi) {
        String sql="insert into ficha(codficha,cantapre,codpro,codaprendiz)values('"+fi.getCodficha()+"','"+fi.getCantapre()+"','"+fi.getCodpro()+"','"+fi.getCodaprendiz()+"')";
        try{
            
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
       
            JOptionPane.showMessageDialog(null,"Ficha registrada");
        }catch(Exception e)
        {JOptionPane.showMessageDialog(null,"Ficha no registrada");
        } 
        return false;
    }

    @Override
    public boolean actualizarficha(Ficha fi) {
        String sql="update programa set codficha='"+fi.getCodficha()+"',cantapre='"+fi.getCantapre()+"'codpro='"+fi.getCodpro()+"'codaprendiz='"+fi.getCodaprendiz()+"'"; 
          try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
        }
        return false;
    }


  
    @Override
    public boolean eliminarficha(int id) {
        String sql="delete from ficha where id="+id;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.execute();
        }catch(Exception e){
        }
        return false;
    }

   

    
}
