/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        Conexion cn = new Conexion();
        Ficha fi=new Ficha();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;

    @Override
    public Ficha list(int id) {
        String sql ="select * from ficha where id="+id;
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        fi.setId(rs.getInt("Id"));
        fi.setCodficha(rs.getInt("Codficha"));
        fi.setCantapre(rs.getInt("Cantapre"));
        fi.setCodprod(rs.getInt("Codprod"));
        fi.setCodaprendiz(rs.getInt("Codaprendiz"));
      
        }
        }catch(Exception e){
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
            fi.setId(rs.getInt("Id"));
            fi.setCodficha(rs.getInt("Codficha"));
            fi.setCantapre(rs.getInt("Cantapre"));
            fi.setCodprod(rs.getInt("Codprod"));
            fi.setCodaprendiz(rs.getInt("Codaprendiz"));
            
            lista.add(fi);
            }
        }catch(Exception e){
        
        }
        return lista;
    
    }

    @Override
    public boolean registroficha(Ficha fi) {
        String sql="insert into ficha(codficha,cantapre,codprod,codaprendiz)values('"+fi.getCodficha()+"','"+fi.getCantapre()+"','"+fi.getCodprod()+"','"+fi.getCodaprendiz()+"')";
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null,"Ficha registrada");
        }catch(Exception  e){
       JOptionPane.showMessageDialog(null,"No se puede registrar la ficha");
        }
        return false;
    }

    @Override
    public boolean actualizarficha(Ficha fi) {
        String sql="update ficha set codficha='"+fi.getCodficha()+"',Cantapre='"+fi.getCantapre()+"',Codprod='"+fi.getCodprod()+"',Codaprendiz='"+fi.getCodaprendiz();
                try{
                con=cn.getConnection();
                ps=con.prepareStatement(sql);
                ps.executeUpdate();
                }catch(Exception e){
                
                }return false;
    }

    @Override
    public boolean eliminarficha(int id) {
        String sql="delete from ficha where id="+id;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Ficha eliminada");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se puede eliminar la Ficha");
        }
        return false;
    }
    
    
    
}
