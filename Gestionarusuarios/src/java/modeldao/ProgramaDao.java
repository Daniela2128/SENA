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
import java.sql.SQLException;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
            Programa usu=new Programa();
            usu.setCodprograma(rs.getInt("codprograma"));
            usu.setnombrepro(rs.getString("nombrepro"));
            
            lista.add(usu);
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminarpro(Programa pro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
