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
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Aprendiz;

/**
 *
 * @author APRENDIZ
 */
public class AprendizDao implements MeAprendiz{

    Conexion co= new Conexion();
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    Aprendiz ape = new Aprendiz();
    
    
    @Override
    public Aprendiz list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadoA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean registrarap(Aprendiz ap) {
        
       String sql="insert into aprendiz(Docu,Nombreap,Apellidoap,Correoap,Teleap)values('"+ap.getDocuap()+"','"+ap.getNombreap()+"','"+ap.getApellidoap()+"','"+ap.getCorreoap()+"','"+ap.getTeleap()+"')";
       try{
       cn =co.getConnection();
        ps = cn.prepareStatement(sql);
        ps.executeUpdate();
      /*  while(rs.next()){
            ape.setId(rs.getInt("id"));
            ape.setDocuap(rs.getInt("Docu"));
            ape.setNombreap(rs.getString("Nombreap"));
            ape.setApellidoap(rs.getString("Apellidoap"));
            ape.setCorreoap(rs.getString("Correoap"));
            ape.setTeleap(rs.getInt("Teleap"));}*/
        JOptionPane.showMessageDialog(null,"Usuario registrado");
       }catch(Exception e)
       {
       }
       return false;
    }

    @Override
    public boolean actualizarap(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarap(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
}
