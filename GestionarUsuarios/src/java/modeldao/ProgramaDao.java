/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import config.Conexion;
import interfaz.MePrograma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Programa;

/**
 *
 * @author APRENDIZ
 */
public class ProgramaDao implements MePrograma {
        Conexion cn = new Conexion();
        Programa po = new Programa();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        
        
    @Override
    public Programa list(int id) {
 String sql ="select * from programa where id="+id;
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        po.setId(rs.getInt("id"));
        po.setCodprograma(rs.getInt("codprograma"));
        po.setnombrepro(rs.getString("nombrepro"));
       
        }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"No puede traer la informacion");
        }
        return po;
    
    }

    @Override
    public List listadopro() {
     ArrayList<Programa> lista= new ArrayList<Programa>();
        String sql="select * from programa";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Programa po=new Programa();
            po.setCodprograma(rs.getInt("codprograma"));
            po.setnombrepro(rs.getString("nombrepro"));
            
            lista.add(po);
            }
        }catch(Exception e){
        
        }
        return lista;
    
    }

    @Override
    public boolean registrarpro(Programa pro) {
        String sql="insert into programa(Codprograma,nombrepro)values('"+pro.getCodprograma()+"','"+pro.getnombrepro()+"')";
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Programa registrado");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Programa no registrado");
        }
        return false;
    }

    @Override
    public boolean actualizarpro(Programa pro) {
         String sql="update programa set Codprograma='"+po.getCodprograma()+"',nombrepro='"+po.getnombrepro();
                try{
                con=cn.getConnection();
                ps=con.prepareStatement(sql);
                ps.executeUpdate();
                }catch(Exception e){
                
                }return false;
    }

    

    @Override
    public boolean eliminarpro(int id) {
        
        String sql="delete from programa where id="+id;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Programa eliminado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se puede eliminar al Programa");
        }
        return false;
    
    }
    
}
 