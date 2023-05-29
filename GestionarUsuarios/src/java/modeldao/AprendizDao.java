/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import config.Conexion;
import interfaz.MeAprendiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import model.Aprendiz;



public class AprendizDao implements MeAprendiz {
    Conexion cn = new Conexion();
        Aprendiz ap = new Aprendiz();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
    
    
    @Override
    public Aprendiz list(int ide) {
        String sql ="select * from aprendiz where id="+ide;
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
        ap.setid(rs.getInt("id"));
        ap.setDocu(rs.getInt("Docu"));
        ap.setNombreap(rs.getString("Nombreap"));
         ap.setApellidoap(rs.getString("Apellidoap"));
        ap.setCorreoap(rs.getString("Correoap"));
        ap.setTeleap(rs.getInt("Teleap"));
        }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"No puede traer la informacion");
        }
        return ap;
    }

    @Override
    public List listadoape() {
        ArrayList<Aprendiz> lista= new ArrayList<Aprendiz>();
        String sql="select * from aprendiz";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Aprendiz ap=new Aprendiz();
            ap.setid(rs.getInt("id"));
            ap.setDocu(rs.getInt("Docu"));
            ap.setNombreap(rs.getString("Nombreap"));
            ap.setApellidoap(rs.getString("Apellidoap"));
            ap.setCorreoap(rs.getString("Correoap"));
            ap.setTeleap(rs.getInt("Teleap"));
            lista.add(ap);
            }
        }catch(Exception e){
        
        }
        return lista;
    
    }

    @Override
    public boolean registrarape(Aprendiz ape) {
        String sql="insert into aprendiz(Docu,Nombreap,Apellidoap,Correoap,Teleap)values('"+ape.getDocu()+"','"+ape.getNombreap()+"','"+ape.getApellidoap()+"','"+ape.getCorreoap()+"','"+ape.getTeleap()+"')";
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Aprendiz registrado");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Aprendiz no registrado");
        }
        return false;
    }

    

    @Override
    public boolean actualizarape(Aprendiz ape) {
        String sql=" UPDATE aprendiz SET Docu='"+ape.getDocu()+"',Nombreap='"+ape.getNombreap()+"',Apellidoap='"+ape.getApellidoap()+"',Correoap='"+ape.getCorreoap()+"',Telea='"+ape.getTeleap()+"' WHERE id="+ape.getid();
                try{
                con=cn.getConnection();
                ps=con.prepareStatement(sql);
                ps.executeUpdate();
                }catch(Exception e){
                
                }return false;
    }

    @Override
    public boolean eliminarape(int id) {
       
        String sql="delete from aprendiz where id="+id;
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Aprendiz eliminado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se puede eliminar al Aprendiz");
        }
        return false;
    }
    
    
    
}
